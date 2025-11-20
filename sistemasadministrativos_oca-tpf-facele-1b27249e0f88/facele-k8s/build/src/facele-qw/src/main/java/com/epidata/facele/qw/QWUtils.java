package com.epidata.facele.qw;

import com.epidata.facele.conf.GlobalConf;
import com.epidata.facele.entities.TR_FECbteTipos;
import com.epidata.facele.entities.TR_FEComprobantes;
import com.epidata.facele.entities.TR_FEComprobantesAsoc;
import com.epidata.facele.entities.TR_FEComprobantesIva;
import com.epidata.facele.entities.TR_FEComprobantesOpc;
import com.epidata.facele.entities.TR_FEComprobantesTrib;
import com.epidata.facele.entities.TR_FEPtosVta;
import com.epidata.facele.entities.T_FEComprobantes;
import com.epidata.facele.entities.T_FEComprobantesAsoc;
import com.epidata.facele.entities.T_FEComprobantesDet;
import com.epidata.facele.entities.T_FEComprobantesIva;
import com.epidata.facele.entities.T_FEComprobantesOpc;
import com.epidata.facele.entities.T_FEComprobantesTrib;
import com.epidata.facele.entities.T_FEXPermisos;
import com.epidata.facele.entities.SPC_CompletaYValidaComp;
import com.epidata.facele.etc.QModel;
import static com.epidata.facele.logger.FaceleLogger.log;
import com.epidata.facele.orm.OrmSupport;
import com.epidata.facele.tickets.AccessTicket;
import com.epidata.facele.tickets.AccessTicketMap;
import com.epidata.facele.tickets.WSAALoginProvider.WSType;
import com.epidata.facele.ws.arca.ServiceOperations;
import static com.epidata.facele.ws.arca.ServiceOperations.serializeArrays;
import com.epidata.facele.ws.arca.wsfev1.Actividad;
import com.epidata.facele.ws.arca.wsfev1.AlicIva;
import com.epidata.facele.ws.arca.wsfev1.ArrayOfActividad;
import com.epidata.facele.ws.arca.wsfev1.ArrayOfAlicIva;
import com.epidata.facele.ws.arca.wsfev1.ArrayOfCbteAsoc;
import com.epidata.facele.ws.arca.wsfev1.ArrayOfFECAEDetRequest;
import com.epidata.facele.ws.arca.wsfev1.ArrayOfOpcional;
import com.epidata.facele.ws.arca.wsfev1.ArrayOfTributo;
import com.epidata.facele.ws.arca.wsfev1.CbteAsoc;
import com.epidata.facele.ws.arca.wsfev1.FECAECabRequest;
import com.epidata.facele.ws.arca.wsfev1.FECAECabResponse;
import com.epidata.facele.ws.arca.wsfev1.FECAEDetRequest;
import com.epidata.facele.ws.arca.wsfev1.FECAEDetResponse;
import com.epidata.facele.ws.arca.wsfev1.FECAERequest;
import com.epidata.facele.ws.arca.wsfev1.FECAEResponse;
import com.epidata.facele.ws.arca.wsfev1.FERecuperaLastCbteResponse;
import com.epidata.facele.ws.arca.wsfev1.ObjectFactory;
import com.epidata.facele.ws.arca.wsfev1.Opcional;
import com.epidata.facele.ws.arca.wsfev1.Tributo;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXAuthRequest;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXLastCMP;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXRequest;
import com.epidata.facele.ws.arca.wsfexv1.FEXResponseAuthorize;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public class QWUtils {

    /**
     *
     * @param p_date
     * @return
     */
    public static String date2YYYYMMDD(Date p_date) {
        if (p_date == null) {
            return null;
        } // end if
        return ServiceOperations.m_YYYYMMDDFormatter.format(p_date);
    }

    /**
     *
     * @param p_value
     * @return
     */
    public static double redondea2d(double p_value) {
        return Math.round(p_value * 100.0) / 100.0; // evita defectos de redondeo
    }

    /**
     *
     * @param p_conn
     * @param p_conf
     * @param p_row
     * @throws Exception
     */
    public static void solicitaAutorizacion(
            Connection p_conn,
            GlobalConf p_conf,
            TR_FEComprobantes p_row) throws Exception {
        try {

            ejecutaValidacionEnMotor(p_conn, p_row);

            TR_FECbteTipos l_recCbteTipo = QModel.getCbteTipo(p_row.getCbteTipo());
            if (l_recCbteTipo.getUsoNacional() == 1) {

                solicitaAutorizacionNacional(p_conn, p_conf, p_row);

            } else {
                if (l_recCbteTipo.getUsoExportac() == 1) {
                    solicitaAutorizacionExportacion(p_conn, p_conf, p_row);
                } else {
                    throw new Exception("Inconsistencia interna: el tipo de comprobante "
                            + p_row.getCbteTipo() + " no se usa en el ámbito "
                            + "nacional, ni para exportaciones");
                } // end if
            } // end if

        } catch (Exception l_ex) {

            informaRespuestaTecnica(p_conn, p_row, l_ex);

            // Filtra la excepción por timeout, o deja pasar si es una excepción
            // de otra clase
            ServiceOperations l_serOp = new ServiceOperations(p_conf);
            l_serOp.throwByTimeout(l_ex);
        }

    }

    /**
     * Ejecuta en el motor, el SP de validación. Una vez ejecutado, actualiza
     * todos los campos en p_row, porque probablemente fueron modificados dentro
     * del SP.
     *
     * Si el resultado es "R", produce una excepción
     *
     * @param p_conn
     * @param p_row
     * @throws Exception
     */
    private static void ejecutaValidacionEnMotor(Connection p_conn,
            TR_FEComprobantes p_row) throws Exception {

        // Ejecuta el SP de validación
        SPC_CompletaYValidaComp.execute(p_conn, p_row.getIdDocumentoFE());

        T_FEComprobantes.setDebug(true);
        T_FEComprobantes l_tab = new T_FEComprobantes();
        TR_FEComprobantes l_newRow = l_tab.getFirstRecord(p_conn, 
                "IdDocumentoFE=" + p_row.getIdDocumentoFE(), null,
                TR_FEComprobantes.class);
        p_row.serializeFrom(l_newRow);

        if ("R".equals(p_row.getEstadoPDF())) {
            throw new Exception(p_row.getMsgErrs());
        } // end if

    }

    /**
     *
     * Se ejecuta fuera del EDT. Agrega en p_params la entrada "Resultado", con
     * los valores "A" o "R"
     *
     * @param p_idDocumentoFE
     * @param p_cuit
     * @param p_ptoVta
     * @param p_cbteTipo
     * @param p_cbteDesde
     * @param p_response
     * @param p_params
     * @throws Exception
     */
    private static void informaRespuestaTecnica(Connection p_conn,
            TR_FEComprobantes p_row,
            Throwable p_th) throws Exception {

        p_row.setResultado("T");
        StringBuilder l_msgErrs = new StringBuilder();

        while (p_th != null) {
            String l_msg = p_th.getMessage();
            if (l_msg == null) {
                l_msg = "null";
            } // end if

            int l_firstBrace = l_msg.indexOf('{');
            if (l_firstBrace >= 0) {
                int l_lastBrace = l_msg.lastIndexOf('}');
                if (l_lastBrace > l_firstBrace) {
                    l_msg = l_msg.substring(l_firstBrace + 1, l_lastBrace).
                            trim();
                } // end if
            } // end if

            l_msgErrs.append(l_msg).append("\n");
            p_th = p_th.getCause();
        } // end while

        // Informa el resultado a la base de datos
        p_row.setMsgErrs(l_msgErrs.toString());
        p_row.setFchProceso(new Timestamp(new Date().getTime()));
        (new T_FEComprobantes()).executeSPUR(p_conn, p_row);
    }

    /**
     * @throws Exception
     */
    private static void procesaRespuestaExportacion(Connection p_conn,
            TR_FEComprobantes p_row,
            FEXResponseAuthorize p_response,
            long p_cuit, int p_ptoVta) throws Exception {

        String l_errCode = null;
        String l_errMsg = null;
        p_row.setCodeErrs(null);

        Date l_fchProceso = new Date();
        p_row.setFchProceso(new Timestamp(l_fchProceso.getTime()));

        if (p_response.getFEXErr() != null) {
            l_errCode = String.valueOf(p_response.getFEXErr().getErrCode());
            l_errMsg = p_response.getFEXErr().getErrMsg();
            p_row.setMsgErrs("ERR" + l_errCode + ": " + l_errMsg + ";");

            if (p_response.getFEXErr().getErrCode() != 0) {
                p_row.setResultado("R");
                (new T_FEComprobantes()).executeSPUR(p_conn, p_row);
                return;
            } // end if
        } // end if

        var l_resultAuth = p_response.getFEXResultAuth();
        if (l_resultAuth == null) {
            p_row.setResultado("T");
            String l_json = OrmSupport.asJSON(p_response);
            p_row.setMsgErrs("No puede procesarse la respuesta porque no tiene cabecera");
            log("No puede procesarse la respuesta porque no tiene cabecera - JSON=" + l_json);
            (new T_FEComprobantes()).executeSPUR(p_conn, p_row);
            return;
        } // end if

        p_row.setResultado(l_resultAuth.getResultado());
        p_row.setCodAutorizacion(l_resultAuth.getCae());
        p_row.setCAEFchVto(
                ServiceOperations.xml2DateFormat(
                        l_resultAuth.getFchVencCae()));
        String l_hashLink = ServiceOperations.generateHashLink();
        String l_barCode = ServiceOperations.getBarCode(
                p_cuit,
                p_row.getCbteTipo(),
                p_ptoVta,
                p_row.getCodAutorizacion(),
                p_row.getCAEFchVto());
        p_row.setHashLink(l_hashLink);
        p_row.setBarCode(l_barCode);
        p_row.setMsgErrs(l_resultAuth.getMotivosObs());

        // Informa el resultado a la base de datos
        (new T_FEComprobantes()).executeSPUR(p_conn, p_row);
    }

    /**
     * @throws Exception
     */
    private static void procesaRespuestaNacional(Connection p_conn,
            TR_FEComprobantes p_row,
            FECAEResponse p_response,
            long p_cuit, int p_ptoVta) throws Exception {

        String l_json = OrmSupport.asJSON(p_response);
        FECAECabResponse l_cabResp = p_response.getFeCabResp();
        if (l_cabResp == null) {
            throw new Exception("No puede procesarse la respuesta porque no tiene cabecera - JSON=" + l_json);
        } // end if
        p_row.setResultado(l_cabResp.getResultado());

        String l_strFchProceso = l_cabResp.getFchProceso();
        Date l_fchProceso = ServiceOperations.xml2DateTimeFormat(l_strFchProceso);
        p_row.setFchProceso(new Timestamp(l_fchProceso.getTime()));

        // Serializa todos los mensajes juntos, sin importar el resultado
        StringBuilder l_codeErrs = new StringBuilder();
        StringBuilder l_msgErrs = new StringBuilder();

        serializeArrays(p_response.getErrors(),
                p_response.getEvents(), l_codeErrs, l_msgErrs);

        if (p_response.getFeDetResp() != null) {
            List<FECAEDetResponse> l_detRespList
                    = p_response.getFeDetResp().getFECAEDetResponse();
            if (l_detRespList != null && !l_detRespList.isEmpty()) {
                FECAEDetResponse l_firstDetResp = l_detRespList.get(0);

                if (l_firstDetResp != null) {

                    serializeArrays(l_firstDetResp.getObservaciones(),
                            l_codeErrs, l_msgErrs);

                    p_row.setResultado(l_firstDetResp.getResultado()); // sobreescribe
                    if (p_row.getResultado().equals("A")) {
                        p_row.setCodAutorizacion(l_firstDetResp.getCAE());
                        p_row.setCAEFchVto(
                                ServiceOperations.xml2DateFormat(
                                        l_firstDetResp.getCAEFchVto()));
                        String l_hashLink = ServiceOperations.generateHashLink();
                        String l_barCode = ServiceOperations.getBarCode(
                                p_cuit,
                                p_row.getCbteTipo(),
                                p_ptoVta,
                                p_row.getCodAutorizacion(),
                                p_row.getCAEFchVto());

                        p_row.setHashLink(l_hashLink);
                        p_row.setBarCode(l_barCode);
                    } else {
                        // Comprobante rechazado. Olvida el número de comprobante
                        p_row.setCbteDesde(null);
                        p_row.setCbteHasta(null);

                    } // end if
                } // end if

            } // end if
        } // end if

        if (!l_codeErrs.isEmpty()) {
            p_row.setCodeErrs(l_codeErrs.toString());
        } // end if
        if (!l_msgErrs.isEmpty()) {
            p_row.setMsgErrs(l_msgErrs.toString());
        } // end if

        // Informa el resultado a la base de datos
        (new T_FEComprobantes()).executeSPUR(p_conn, p_row);
    }

    /**
     *
     * @param p_conn
     * @param p_conf
     * @param p_row
     * @throws Exception
     */
    private static void solicitaAutorizacionExportacion(
            Connection p_conn,
            GlobalConf p_conf,
            TR_FEComprobantes p_row) throws Exception {

        TR_FEPtosVta l_recPtoVta = QModel.getPtoVta(p_row.getIdPtoVta());

        int l_idDocumentoFE = p_row.getIdDocumentoFE();
        long l_cuit = l_recPtoVta.getCuit();
        int l_ptoVta = l_recPtoVta.getPtoVta();

        com.epidata.facele.ws.arca.wsfexv1.ObjectFactory l_fact
                = new com.epidata.facele.ws.arca.wsfexv1.ObjectFactory();
        ServiceOperations l_serOp = new ServiceOperations(p_conf);
        AccessTicket l_ticket = null;
        try {
            l_ticket = AccessTicketMap.getValidTicketFor(WSType.wsfex,
                    l_cuit, p_conn, p_conf);
        } catch (Exception l_ex) {
            throw new Exception(
                    "Error al solicitar un ticket válido para el CUIT "
                    + l_cuit + " en el servidor de AFIP "
                    + p_conf.m_WSAAEndpoint, l_ex);
        } // end catch

        ClsFEXRequest l_cmp = l_fact.createClsFEXRequest();
        l_cmp.setCanMisMonExt(p_row.getCanMisMonExt());
        l_cmp.setCbteTipo(p_row.getCbteTipo().shortValue());
        l_cmp.setCliente(p_row.getRazonSocial());

        if (p_row.getIdFEXDstCuit() != null) {
            l_cmp.setCuitPaisCliente(p_row.getIdFEXDstCuit());
        } // end if

        l_cmp.setDomicilioCliente(p_row.getDomicilio1() + " " + p_row.getDomicilio2());
        l_cmp.setDstCmp(Short.parseShort(p_row.getIdFEXDstPais()));
        String l_cbteFch = date2YYYYMMDD(p_row.getCbteFch());
        l_cmp.setFechaCbte(l_cbteFch);
        String l_fchVtoPago = date2YYYYMMDD(p_row.getFchVtoPago());
        l_cmp.setFechaPago(l_fchVtoPago);
        l_cmp.setFormaPago(p_row.getFormaPago());
        l_cmp.setId(p_row.getId());
        l_cmp.setIdImpositivo(String.valueOf(p_row.getDocNro()));
        l_cmp.setIdiomaCbte(p_row.getIdFEXIdioma().shortValue());
        l_cmp.setImpTotal(new BigDecimal(p_row.getImpTotal()));
        l_cmp.setIncoterms(p_row.getIdFEXIncoterm());
        l_cmp.setIncotermsDs(p_row.getIncotermsDesc());
        l_cmp.setMonedaCtz(new BigDecimal(p_row.getMonCotiz()));
        l_cmp.setMonedaId(p_row.getMonId());
        l_cmp.setObs(p_row.getObservaciones());
        l_cmp.setObsComerciales(p_row.getObsComerciales());
        l_cmp.setPermisoExistente(p_row.getPermisoExistente());
        if (l_cmp.getPermisoExistente() == null) {
            // "errCode":1550,"errMsg":"Campo Permiso_existente madatorio: Debe ser S, N o vacio (debe enviarse tag)"
            l_cmp.setPermisoExistente("");
        } // end if
        l_cmp.setPuntoVta(l_ptoVta);
        l_cmp.setTipoExpo(p_row.getConcepto().shortValue());

        // Establece la actividad
        if (p_row.getCodActividad() != null) {
            var l_activs = l_fact.createArrayOfActividad();
            var l_activ = l_fact.createActividad();
            l_activ.setId(p_row.getCodActividad());
            l_activs.getActividad().add(l_activ);
            l_cmp.setActividades(l_activs);
        } // end if

        // Recupera los permisos -------------------------------------
        {
            T_FEXPermisos l_table = new T_FEXPermisos();
            l_table.serializeFrom(p_conn, "IdDocumentoFE=" + l_idDocumentoFE, null);

            if (!l_table.getRows().isEmpty()) {

                var l_wsArray = l_fact.createArrayOfPermiso();
                for (var l_record : l_table.getRows()) {
                    var l_newElement = l_fact.createPermiso();

                    // Inconsistencia en ARCA: los códigos de países de referencia
                    // podrían ser CHAR(3). En la práctica todos son INT
                    l_newElement.setDstMerc(Integer.parseInt(l_record.getIdFEXDstPais()));
                    l_newElement.setIdPermiso(l_record.getCodDespacho());

                    l_wsArray.getPermiso().add(l_newElement);
                } // end for
                l_cmp.setPermisos(l_wsArray);
            } // end if
        }

        // Recupera los ítems -------------------------------------
        {
            T_FEComprobantesDet l_table = new T_FEComprobantesDet();
            l_table.serializeFrom(p_conn, "IdDocumentoFE=" + l_idDocumentoFE, null);

            if (!l_table.getRows().isEmpty()) {

                var l_wsArray = l_fact.createArrayOfItem();
                for (var l_record : l_table.getRows()) {
                    var l_newElement = l_fact.createItem();
                    if (l_record.getBonificacion() != null) {
                        l_newElement.setProBonificacion(
                                new BigDecimal(l_record.getBonificacion()));
                    } // end if
                    l_newElement.setProCodigo(l_record.getCodigoProducto());
                    l_newElement.setProDs(l_record.getDescripcion());
                    l_newElement.setProPrecioUni(new BigDecimal(l_record.getPrecioUnitario()));
                    l_newElement.setProQty(new BigDecimal(l_record.getCantidad()));
                    l_newElement.setProTotalItem(new BigDecimal(l_record.getSubtotal()));
                    l_newElement.setProUmed(l_record.getIdFEXUnidadMedida());

                    l_wsArray.getItem().add(l_newElement);
                } // end for
                l_cmp.setItems(l_wsArray);
            } // end if
        }
        // Recupera los valores opcionales -------------------------------------
        {
            T_FEComprobantesOpc l_table = new T_FEComprobantesOpc();
            l_table.serializeFrom(p_conn, "IdDocumentoFE=" + l_idDocumentoFE, null);

            if (!l_table.getRows().isEmpty()) {

                var l_wsArray = l_fact.createArrayOfOpcional();
                for (var l_record : l_table.getRows()) {
                    var l_newElement = l_fact.createOpcional();

                    l_newElement.setId(l_record.getCodOpcional());
                    l_newElement.setValor(l_record.getValor());

                    l_wsArray.getOpcional().add(l_newElement);
                } // end for
                l_cmp.setOpcionales(l_wsArray);
            } // end if
        }

        // Recupera los comprobantes asociados ---------------------------------
        {
            T_FEComprobantesAsoc l_table = new T_FEComprobantesAsoc();
            l_table.serializeFrom(p_conn, "IdDocumentoFE=" + l_idDocumentoFE, null);

            if (!l_table.getRows().isEmpty()) {

                var l_wsArray = l_fact.createArrayOfCmpAsoc();
                for (var l_record : l_table.getRows()) {
                    var l_newElement = l_fact.createCmpAsoc();

                    l_newElement.setCbteCuit(l_record.getCbteCuit());
                    l_newElement.setCbteNro(l_record.getCbteNumero());
                    l_newElement.setCbtePuntoVta(l_record.getPtoVta());
                    l_newElement.setCbteTipo(l_record.getCbteTipo().shortValue());
                    l_wsArray.getCmpAsoc().add(l_newElement);
                } // end of
                l_cmp.setCmpsAsoc(l_wsArray);
            } // end if
        }

        if (p_row.getCbteDesde() == null) {

            // Consulta último número
            int l_cbteTipo = p_row.getCbteTipo();
            log("Consultando último autorizado para el CUIT " + l_cuit
                    + " cbteTipo " + l_cbteTipo + " ptoVta " + l_ptoVta);
            // No se informo el numero de comprobante. Consulta ahora

            ClsFEXLastCMP l_lastCmpReq = l_fact.createClsFEXLastCMP();
            l_lastCmpReq.setCbteTipo((short) l_cbteTipo);
            l_lastCmpReq.setCuit(l_cuit);
            l_lastCmpReq.setPtoVenta(l_ptoVta);
            l_lastCmpReq.setSign(l_ticket.getSign());
            l_lastCmpReq.setToken(l_ticket.getToken());

            var l_responseLast
                    = l_serOp.getWSFEXSoap().fexGetLastCMP(l_lastCmpReq);
            var l_lastResponse = l_responseLast.getFEXResultLastCMP();

            long l_ultimo = l_lastResponse.getCbteNro();

            log("Último autorizado: " + l_ultimo);
            p_row.setCbteDesde((int) (l_ultimo + 1));
            p_row.setCbteHasta(p_row.getCbteDesde());

        } // end if
        l_cmp.setCbteNro(p_row.getCbteDesde());

        ClsFEXAuthRequest l_auth = l_fact.createClsFEXAuthRequest();
        l_auth.setCuit(l_cuit);
        l_auth.setSign(l_ticket.getSign());
        l_auth.setToken(l_ticket.getToken());

        ObjectMapper l_mapper = new ObjectMapper();
        DateFormat l_dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        l_mapper.setDateFormat(l_dateFormat);
        String l_jsonString = l_mapper.writeValueAsString(l_cmp);
        log("#### JSON REQUEST: " + l_jsonString);

        // Invoca el web-service -----------------------------------------------
        FEXResponseAuthorize l_response = l_serOp.getWSFEXSoap().fexAuthorize(l_auth, l_cmp);
        procesaRespuestaExportacion(p_conn, p_row, l_response, l_cuit, l_ptoVta);
    }

    /**
     *
     * @param p_conn
     * @param p_conf
     * @param p_row
     * @throws Exception
     */
    private static void solicitaAutorizacionNacional(
            Connection p_conn,
            GlobalConf p_conf,
            TR_FEComprobantes p_row) throws Exception {

        // Recupera los datos de cabecera --------------------------------------
        String l_cbteFch = date2YYYYMMDD(p_row.getCbteFch());
        String l_fchServDesde = date2YYYYMMDD(p_row.getFchServDesde());
        String l_fchServHasta = date2YYYYMMDD(p_row.getFchServHasta());
        String l_fchVtoPago = date2YYYYMMDD(p_row.getFchVtoPago());
        double l_impTrib = 0.00;
        double l_impIVA = 0.00;

        TR_FEPtosVta l_recPtoVta = QModel.getPtoVta(p_row.getIdPtoVta());

        long l_cuit = l_recPtoVta.getCuit();
        int l_ptoVta = l_recPtoVta.getPtoVta();

        ObjectFactory l_fact = new ObjectFactory();

        FECAEDetRequest l_det = l_fact.createFECAEDetRequest();
        l_det.setCbteFch(l_cbteFch);
        l_det.setConcepto(p_row.getConcepto());
        l_det.setDocNro(p_row.getDocNro());
        l_det.setDocTipo(p_row.getDocTipo());
        l_det.setFchServDesde(l_fchServDesde);
        l_det.setFchServHasta(l_fchServHasta);
        l_det.setFchVtoPago(l_fchVtoPago);
        l_det.setImpNeto(redondea2d(p_row.getImpNeto()));
        l_det.setImpOpEx(redondea2d(p_row.getImpOpEx()));
        l_det.setImpTotConc(redondea2d(p_row.getImpTotConc()));
        l_det.setMonCotiz(p_row.getMonCotiz());
        l_det.setMonId(p_row.getMonId());
        l_det.setCondicionIVAReceptorId(p_row.getCodCondIva());
        int l_idDocumentoFE = p_row.getIdDocumentoFE();

        // Recupera los valores de IVA -----------------------------------------
        {
            T_FEComprobantesIva l_table = new T_FEComprobantesIva();
            l_table.serializeFrom(p_conn, "IdDocumentoFE=" + l_idDocumentoFE, null);

            if (!l_table.getRows().isEmpty()) {

                ArrayOfAlicIva l_wsArray = l_fact.createArrayOfAlicIva();
                for (TR_FEComprobantesIva l_record : l_table.getRows()) {
                    AlicIva l_newElement = l_fact.createAlicIva();
                    l_newElement.setId(l_record.getCodAlicIVA());
                    l_newElement.setBaseImp(l_record.getBaseImp());
                    l_newElement.setImporte(l_record.getImporte());
                    l_wsArray.getAlicIva().add(l_newElement);
                    l_impIVA += l_newElement.getImporte();
                } // end of
                l_det.setIva(l_wsArray);
            } // end if
        }
        // Recupera los otros tributos -----------------------------------------
        {
            T_FEComprobantesTrib l_table = new T_FEComprobantesTrib();
            l_table.serializeFrom(p_conn, "IdDocumentoFE=" + l_idDocumentoFE, null);

            if (!l_table.getRows().isEmpty()) {

                ArrayOfTributo l_wsArray = l_fact.createArrayOfTributo();
                for (TR_FEComprobantesTrib l_record : l_table.getRows()) {
                    Tributo l_newElement = l_fact.createTributo();
                    //
                    int l_codTributo = l_record.getCodTributo();
                    l_newElement.setId((short) l_codTributo);
                    l_newElement.setDesc(l_record.getDescripcion());
                    l_newElement.setAlic(l_record.getAlic());
                    l_newElement.setBaseImp(l_record.getBaseImp() + 0.0);
                    l_newElement.setImporte(l_record.getImporte() + 0.0);

                    l_wsArray.getTributo().add(l_newElement);
                    l_impTrib += l_newElement.getImporte();
                } // end of
                l_det.setTributos(l_wsArray);
            } // end if
        }

        // Recupera los valores opcionales -------------------------------------
        {
            T_FEComprobantesOpc l_table = new T_FEComprobantesOpc();
            l_table.serializeFrom(p_conn, "IdDocumentoFE=" + l_idDocumentoFE, null);

            if (!l_table.getRows().isEmpty()) {

                ArrayOfOpcional l_wsArray = l_fact.createArrayOfOpcional();
                for (TR_FEComprobantesOpc l_record : l_table.getRows()) {
                    Opcional l_newElement = l_fact.createOpcional();

                    l_newElement.setId(l_record.getCodOpcional());
                    l_newElement.setValor(l_record.getValor());

                    l_wsArray.getOpcional().add(l_newElement);
                } // end of
                l_det.setOpcionales(l_wsArray);
            } // end if
        }

        // Recupera los comprobantes asociados ---------------------------------
        {
            T_FEComprobantesAsoc l_table = new T_FEComprobantesAsoc();
            l_table.serializeFrom(p_conn, "IdDocumentoFE=" + l_idDocumentoFE, null);

            if (!l_table.getRows().isEmpty()) {

                ArrayOfCbteAsoc l_wsArray = l_fact.createArrayOfCbteAsoc();
                for (TR_FEComprobantesAsoc l_record : l_table.getRows()) {
                    CbteAsoc l_newElement = l_fact.createCbteAsoc();
                    //
                    l_newElement.setPtoVta(l_record.getPtoVta());
                    l_newElement.setTipo(l_record.getCbteTipo() + 0);
                    l_newElement.setNro(l_record.getCbteNumero() + 0);
                    l_wsArray.getCbteAsoc().add(l_newElement);
                } // end of
                l_det.setCbtesAsoc(l_wsArray);
            } // end if
        }

        l_det.setImpIVA(redondea2d(l_impIVA));
        l_det.setImpTrib(redondea2d(l_impTrib));
        double l_total = redondea2d(
                p_row.getImpNeto()
                + p_row.getImpOpEx()
                + p_row.getImpIVA()
                + p_row.getImpTotConc()
                + p_row.getImpTrib());

        l_det.setImpTotal(l_total);

        AccessTicket l_ticket = null;
        try {
            l_ticket = AccessTicketMap.getValidTicketFor(WSType.wsfe,
                    l_cuit, p_conn, p_conf);
        } catch (Exception l_ex) {
            throw new Exception(
                    "Error al solicitar un ticket válido para el CUIT "
                    + l_cuit + " en el servidor de AFIP "
                    + p_conf.m_WSAAEndpoint, l_ex);
        } // end catch
        ServiceOperations l_serOp = new ServiceOperations(p_conf);

        if (p_row.getCbteDesde() == null) {

            // Consulta último número
            int l_cbteTipo = p_row.getCbteTipo();
            log("Consultando último autorizado para el CUIT " + l_cuit
                    + " cbteTipo " + l_cbteTipo + " ptoVta " + l_ptoVta);
            // No se informo el numero de comprobante. Consulta ahora
            FERecuperaLastCbteResponse l_lastCbtResponse
                    = l_serOp.getWSFESoap()
                            .feCompUltimoAutorizado(l_ticket.
                                    getAuthRequest(),
                                    l_ptoVta, l_cbteTipo);
            int l_ultimo = l_lastCbtResponse.getCbteNro();
            log("Último autorizado: " + l_ultimo);
            p_row.setCbteDesde(l_ultimo + 1);
            p_row.setCbteHasta(p_row.getCbteDesde());

        } // end if
        l_det.setCbteDesde(p_row.getCbteDesde());
        l_det.setCbteHasta(p_row.getCbteHasta());

        // Arma el mensaje de solicitud ----------------------------------------
        FECAECabRequest l_cab = l_fact.createFECAECabRequest();
        l_cab.setCantReg(1);
        l_cab.setCbteTipo(p_row.getCbteTipo());
        l_cab.setPtoVta(l_ptoVta);

        if (p_row.getCodActividad() != null) {
            ArrayOfActividad l_actividadesArray = new ArrayOfActividad();
            Actividad l_actividadUnica = new Actividad();
            l_actividadUnica.setId(p_row.getCodActividad());
            l_actividadesArray.getActividad().add(l_actividadUnica);
            l_det.setActividades(l_actividadesArray);
        } // end if

        ArrayOfFECAEDetRequest l_detArray = l_fact.
                createArrayOfFECAEDetRequest();
        l_detArray.getFECAEDetRequest().add(l_det);

        FECAERequest l_req = l_fact.createFECAERequest();
        l_req.setFeCabReq(l_cab);
        l_req.setFeDetReq(l_detArray);

        /*
        ObjectMapper l_mapper = new ObjectMapper();
        DateFormat l_dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        l_mapper.setDateFormat(l_dateFormat);
        String l_jsonString = l_mapper.writeValueAsString(l_req);
        
        log("#### JSON REQUEST: " + l_jsonString);
         */
        // Invoca el web-service -----------------------------------------------
        FECAEResponse l_response = l_serOp.getWSFESoap()
                .fecaeSolicitar(l_ticket.getAuthRequest(), l_req);

        procesaRespuestaNacional(p_conn, p_row, l_response, l_cuit, l_ptoVta);

    }

}
