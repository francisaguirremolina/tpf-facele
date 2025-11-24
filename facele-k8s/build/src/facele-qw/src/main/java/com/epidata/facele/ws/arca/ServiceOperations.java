package com.epidata.facele.ws.arca;

import com.epidata.facele.conf.GlobalConf;
import static com.epidata.facele.logger.FaceleLogger.logIfNotNull;
import com.epidata.facele.tickets.AccessTicket;
import com.epidata.facele.ws.arca.wscdc.CmpDatos;
import com.epidata.facele.ws.arca.wscdc.CmpResponse;
import com.epidata.facele.ws.arca.wsfev1.ActividadesTipo;
import com.epidata.facele.ws.arca.wsfev1.ArrayOfActividadesTipo;
import com.epidata.facele.ws.arca.wsfev1.ArrayOfCbteTipo;
import com.epidata.facele.ws.arca.wsfev1.ArrayOfConceptoTipo;
import com.epidata.facele.ws.arca.wsfev1.ArrayOfCondicionIvaReceptor;
import com.epidata.facele.ws.arca.wsfev1.ArrayOfDocTipo;
import com.epidata.facele.ws.arca.wsfev1.ArrayOfErr;
import com.epidata.facele.ws.arca.wsfev1.ArrayOfEvt;
import com.epidata.facele.ws.arca.wsfev1.ArrayOfIvaTipo;
import com.epidata.facele.ws.arca.wsfev1.ArrayOfMoneda;
import com.epidata.facele.ws.arca.wsfev1.ArrayOfObs;
import com.epidata.facele.ws.arca.wsfev1.ArrayOfOpcionalTipo;
import com.epidata.facele.ws.arca.wsfev1.ArrayOfPaisTipo;
import com.epidata.facele.ws.arca.wsfev1.ArrayOfPtoVenta;
import com.epidata.facele.ws.arca.wsfev1.ArrayOfTributoTipo;
import com.epidata.facele.ws.arca.wsfev1.CbteTipo;
import com.epidata.facele.ws.arca.wsfev1.CbteTipoResponse;
import com.epidata.facele.ws.arca.wsfev1.ConceptoTipo;
import com.epidata.facele.ws.arca.wsfev1.ConceptoTipoResponse;
import com.epidata.facele.ws.arca.wsfev1.CondicionIvaReceptor;
import com.epidata.facele.ws.arca.wsfev1.CondicionIvaReceptorResponse;
import com.epidata.facele.ws.arca.wsfev1.Cotizacion;
import com.epidata.facele.ws.arca.wsfev1.DocTipo;
import com.epidata.facele.ws.arca.wsfev1.DocTipoResponse;
import com.epidata.facele.ws.arca.wsfev1.DummyResponse;
import com.epidata.facele.ws.arca.wsfev1.Err;
import com.epidata.facele.ws.arca.wsfev1.Evt;
import com.epidata.facele.ws.arca.wsfev1.FEActividadesResponse;
import com.epidata.facele.ws.arca.wsfev1.FECompConsultaReq;
import com.epidata.facele.ws.arca.wsfev1.FECompConsultaResponse;
import com.epidata.facele.ws.arca.wsfev1.FECotizacionResponse;
import com.epidata.facele.ws.arca.wsfev1.FEPaisResponse;
import com.epidata.facele.ws.arca.wsfev1.FEPtoVentaResponse;
import com.epidata.facele.ws.arca.wsfev1.FERecuperaLastCbteResponse;
import com.epidata.facele.ws.arca.wsfev1.FETributoResponse;
import com.epidata.facele.ws.arca.wsfev1.IvaTipo;
import com.epidata.facele.ws.arca.wsfev1.IvaTipoResponse;
import com.epidata.facele.ws.arca.wsfev1.Moneda;
import com.epidata.facele.ws.arca.wsfev1.MonedaResponse;
import com.epidata.facele.ws.arca.wsfev1.ObjectFactory;
import com.epidata.facele.ws.arca.wsfev1.Obs;
import com.epidata.facele.ws.arca.wsfev1.OpcionalTipo;
import com.epidata.facele.ws.arca.wsfev1.OpcionalTipoResponse;
import com.epidata.facele.ws.arca.wsfev1.PaisTipo;
import com.epidata.facele.ws.arca.wsfev1.PtoVenta;
import com.epidata.facele.ws.arca.wsfev1.Service;
import com.epidata.facele.ws.arca.wsfev1.ServiceSoap;
import com.epidata.facele.ws.arca.wsfev1.TributoTipo;
import com.epidata.facele.ws.arca.wsfexv1.ArrayOfClsFEXResponseActividadTipo;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXErr;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXEvents;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXGetCMP;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXGetCMPR;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXLastCMP;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXLastCMPResponse;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXResponseActividadTipo;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXResponseCbteTipo;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXResponseCheckPermiso;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXResponseCtz;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXResponseDSTCuit;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXResponseDSTPais;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXResponseIdi;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXResponseInc;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXResponseMon;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXResponseOpc;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXResponsePtoVenta;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXResponseTex;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXResponseUMed;
import com.epidata.facele.ws.arca.wsfexv1.FEXResponsePtoVenta;
import jakarta.xml.ws.BindingProvider;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA Sbrugnera, para EPIDATA
 */
public class ServiceOperations {

    /**
     *
     */
    private static final String m_HASH_CHARS
            = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    /**
     *
     */
    private static final int m_HASH_LEN = 20;

    /**
     *
     */
    public final static DateFormat m_YYYYMMDDFormatter = new SimpleDateFormat(
            "yyyyMMdd");

    /**
     *
     */
    public final static DateFormat m_YYYYMMDDHHMMSSFormatter
            = new SimpleDateFormat("yyyyMMddHHmmss");

    /**
     *
     */
    public final static DateFormat m_YYYY_MM_DDFormatter = new SimpleDateFormat(
            "yyyy-MM-dd");

    /**
     *
     * @return
     */
    public static String generateHashLink() {
        StringBuilder l_toReturn = new StringBuilder(m_HASH_LEN);
        for (int l_index = 0; l_index < m_HASH_LEN; l_index++) {
            l_toReturn.append(getHashChar());
        } // end for
        return l_toReturn.toString();
    }

    /**
     * Código de barras al pie de un comprobante autorizado. De acuerdo con la
     * R.G. 1702 (2004). Contiene 40 dígitos: - C.U.I.T. (Clave Unica de
     * Identificación Tributaria) del emisor (11 caracteres). - Código de tipo
     * de comprobante (3 caracteres). - Punto de venta (5 caracteres). - Código
     * de Autorización de Impresión (14 caracteres). - Fecha de vencimiento (8
     * caracteres). - Dígito verificador (1 carácter).
     *
     * @param p_cuit
     * @param p_cbteTipo
     * @param p_ptoVta
     * @param p_cae
     * @param p_vencimiento
     * @return
     * @throws Exception
     */
    public static String getBarCode(long p_cuit, int p_cbteTipo, int p_ptoVta,
            String p_cae, Date p_vencimiento) throws Exception {
        StringBuilder l_toReturn = new StringBuilder(50);
        String l_strVenc = new SimpleDateFormat("yyyyMMdd").
                format(p_vencimiento);
        String l_strBase = String.format("%011d%03d%05d%14s%8s",
                p_cuit, p_cbteTipo, p_ptoVta, p_cae, l_strVenc);

        if (l_strBase.length() != 41) {
            throw new Exception(
                    "Error en la concatenación del código de barras "
                    + l_strBase + ": longitud inválida");
        } // end if
        int l_verificationDigit = getVerificationDigit(l_strBase);
        l_toReturn.append(l_strBase);
        l_toReturn.append(l_verificationDigit);

        return l_toReturn.toString();
    }

    /**
     * @return
     */
    private static char getHashChar() {
        int l_charIndex = (int) (Math.random() * m_HASH_CHARS.length());
        return m_HASH_CHARS.charAt(l_charIndex);
    }

    /**
     * @return
     */
    public ServiceSoap getWSFESoap() {

        Service l_service = new Service();
        ServiceSoap l_soap = l_service.getServiceSoap12();
        ((BindingProvider) l_soap).getRequestContext()
                .put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                        m_conf.m_WSFEEndpoint);

        return l_soap;
    }

    /**
     * @return
     */
    public com.epidata.facele.ws.arca.wsfexv1.ServiceSoap getWSFEXSoap() {

        com.epidata.facele.ws.arca.wsfexv1.Service l_service
                = new com.epidata.facele.ws.arca.wsfexv1.Service();

        com.epidata.facele.ws.arca.wsfexv1.ServiceSoap l_soap
                = l_service.getServiceSoap12();

        ((BindingProvider) l_soap).getRequestContext()
                .put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                        m_conf.m_WSFEXEndpoint);

        return l_soap;
    }

    /**
     * @return
     */
    public com.epidata.facele.ws.arca.wscdc.ServiceSoap getWSCDCSoap() {

        com.epidata.facele.ws.arca.wscdc.Service l_service
                = new com.epidata.facele.ws.arca.wscdc.Service();
        com.epidata.facele.ws.arca.wscdc.ServiceSoap l_soap
                = l_service.getServiceSoap12();
        ((BindingProvider) l_soap).getRequestContext()
                .put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                        m_conf.m_WSCDCEndpoint);

        return l_soap;
    }

    /**
     *
     * @param p_toVerify
     * @return
     */
    public static int getVerificationDigit(String p_toVerify) {

        int l_stage1 = 0;
        for (int l_index = 0; l_index < p_toVerify.length(); l_index += 2) {
            l_stage1 += p_toVerify.charAt(l_index) - '0';
        } // end for
        int l_stage2 = 0;
        for (int l_index = 1; l_index < p_toVerify.length(); l_index += 2) {
            l_stage2 += p_toVerify.charAt(l_index) - '0';
        } // end for

        int l_stage3 = l_stage1 * 3 + l_stage2;
        int l_stage4 = l_stage3 % 10;
        if (l_stage4 == 0) {
            return 0;
        } //end if
        return 10 - l_stage4;
    }

    /**
     *
     * @param p_in
     * @return
     * @throws Exception
     */
    public static String reencode(String p_in) throws Exception {
        if (p_in == null) {
            return null;
        } // end if
        if (p_in.contains("Ã")) {
            return new String(p_in.getBytes("ISO-8859-1"), "UTF-8");
        } // end if
        return p_in;
    }

    /**
     *
     * @param p_obs
     * @param p_codeList
     * @param p_msgList
     * @return
     * @throws Exception
     */
    public static String serializeArrays(ArrayOfObs p_obs,
            StringBuilder p_codeList, StringBuilder p_msgList) throws Exception {

        if (p_obs != null) {
            List<Obs> l_list = p_obs.getObs();
            for (Obs l_element : l_list) {
                p_msgList.append("OBS");
                p_msgList.append(l_element.getCode());
                p_msgList.append(": ");
                p_msgList.append(l_element.getMsg());
                p_msgList.append(";");
                if (p_codeList != null) {
                    if (p_codeList.length() > 0) {
                        p_codeList.append(',');
                    } // end if
                    p_codeList.append(l_element.getCode());
                } // end if
            } // end for
        } // end if
        if (p_msgList.isEmpty()) {
            return null;
        } // end if
        return p_msgList.toString();

    }

    /**
     *
     * @param p_errors
     * @param p_events
     * @param p_codeList
     * @param p_msgList
     * @return
     * @throws Exception
     */
    public static String serializeArrays(ArrayOfErr p_errors,
            ArrayOfEvt p_events, StringBuilder p_codeList,
            StringBuilder p_msgList) throws Exception {

        if (p_errors != null) {
            List<Err> l_list = p_errors.getErr();
            for (Err l_element : l_list) {
                p_msgList.append("ERR");
                p_msgList.append(l_element.getCode());
                p_msgList.append(": ");
                p_msgList.append(l_element.getMsg());
                p_msgList.append(";");
                if (p_codeList != null) {
                    if (p_codeList.length() > 0) {
                        p_codeList.append(',');
                    } // end if
                    p_codeList.append(l_element.getCode());
                } // end if
            } // end for
        } // end if

        if (p_events != null) {
            List<Evt> l_list = p_events.getEvt();
            for (Evt l_element : l_list) {
                p_msgList.append("EVT");
                p_msgList.append(l_element.getCode());
                p_msgList.append(": ");
                p_msgList.append(l_element.getMsg());
                p_msgList.append(";");
                if (p_codeList != null) {
                    if (p_codeList.length() > 0) {
                        p_codeList.append(',');
                    } // end if
                    p_codeList.append(l_element.getCode());
                } // end if
            } // end for
        } // end if

        if (p_msgList.isEmpty()) {
            return null;
        } // end if
        return p_msgList.toString();
    }

    /**
     *
     * @param p_error
     * @param p_event
     * @param p_codeList
     * @param p_msgList
     * @return
     * @throws Exception
     */
    public static String serializeArrays(ClsFEXErr p_error,
            ClsFEXEvents p_event, StringBuilder p_codeList,
            StringBuilder p_msgList) throws Exception {

        if (p_error != null && p_error.getErrCode() != 0) {
            p_msgList.append("ERR");
            p_msgList.append(p_error.getErrCode());
            p_msgList.append(": ");
            p_msgList.append(p_error.getErrMsg());
            p_msgList.append(";");
            if (p_codeList != null) {
                if (p_codeList.length() > 0) {
                    p_codeList.append(',');
                } // end if
                p_codeList.append(p_error.getErrCode());
            } // end if
        } // end if

        if (p_event != null && p_event.getEventCode() != 0) {
            p_msgList.append("EVT");
            p_msgList.append(p_event.getEventCode());
            p_msgList.append(": ");
            p_msgList.append(p_event.getEventMsg());
            p_msgList.append(";");
            if (p_codeList != null) {
                if (p_codeList.length() > 0) {
                    p_codeList.append(',');
                } // end if
                p_codeList.append(p_event.getEventCode());
            } // end if
        } // end if

        if (p_msgList.isEmpty()) {
            return null;
        } // end if
        return p_msgList.toString();
    }

    /**
     *
     * @param p_ex
     * @throws Exception
     */
    public void throwByTimeout(Throwable p_ex) throws Exception {
        Throwable l_cause = p_ex;
        while (l_cause != null) {
            if (l_cause instanceof java.net.SocketTimeoutException) {
                throw new Exception("Límite de tiempo ("
                        + (m_conf.m_WSTimeout / 1000.0)
                        + " seg) superado esperando la respuesta",
                        p_ex);
            } // end if
            l_cause = l_cause.getCause();
        } // end while

        // Otro tipo de excepción
        throw new Exception(p_ex);

    }

    /**
     *
     * @param p_xmlDate
     * @return
     * @throws Exception
     */
    public static Date xml2DateFormat(String p_xmlDate) throws Exception {

        if (p_xmlDate == null || p_xmlDate.isEmpty()) {
            return null;
        } // end if
        return m_YYYYMMDDFormatter.parse(p_xmlDate);
    }

    /**
     *
     * @param p_xmlDateTime
     * @return
     * @throws Exception
     */
    public static Date xml2DateTimeFormat(String p_xmlDateTime) throws Exception {

        if (p_xmlDateTime == null || p_xmlDateTime.isEmpty()) {
            return null;
        } // end if
        if (p_xmlDateTime.length() == 8) {
            return m_YYYYMMDDFormatter.parse(p_xmlDateTime);
        }
        return m_YYYYMMDDHHMMSSFormatter.parse(p_xmlDateTime);
    }

    /**
     *
     * @param p_xmlDate
     * @return
     * @throws Exception
     */
    public static String xml2sqlDateFormat(String p_xmlDate) throws Exception {
        if (p_xmlDate == null || p_xmlDate.isEmpty()) {
            return "";
        } // end if
        if (p_xmlDate.equalsIgnoreCase("null")) {
            return "";
        } // end if
        Date l_date = m_YYYYMMDDFormatter.parse(p_xmlDate);
        return m_YYYY_MM_DDFormatter.format(l_date);
    }
    /**
     *
     */
    private GlobalConf m_conf;

    /**
     *
     * @param p_conf
     * @throws Exception
     */
    public ServiceOperations(GlobalConf p_conf)
            throws Exception {
        m_conf = p_conf;
    }

    /**
     *
     * @param p_ticket
     * @throws Exception
     */
    /*
    public void execComprobantesModalidadConsultar(AccessTicket p_ticket)
            throws Exception {

        ar.com.puntosys.facele.wscdcclient.Service l_cdcService
                = new ar.com.puntosys.facele.wscdcclient.Service();

        ar.com.puntosys.facele.wscdcclient.ServiceSoap l_serviceSoap
                = l_cdcService.getServiceSoap12();
        CmpAuthRequest l_authReq = p_ticket.getCDCAuthRequest();

        FacModTipoResponse l_resp
                = l_serviceSoap.comprobantesModalidadConsultar(l_authReq);
        ArrayOfFacModTipo l_array = l_resp.getResultGet();
        List<FacModTipo> l_list = l_array.getFacModTipo();
        for (FacModTipo l_element : l_list) {
            System.out.format("\"%s\",\"%s\",\"%s\",\"%s\"\n",
                    l_element.getCod(),
                    l_element.getDesc(),
                    xml2sqlDateFormat(l_element.getFchDesde()),
                    xml2sqlDateFormat(l_element.getFchHasta()));
        } // end for
    }
     */
    /**
     * @return @throws Exception
     * @throws java.lang.Exception
     */
    public DummyResponse execFEDummy() throws Exception {
        ServiceSoap l_soap = getWSFESoap();
        DummyResponse l_response = l_soap.feDummy();
        return l_response;
    }

    /**
     * @return @throws Exception
     * @throws java.lang.Exception
     */
    public com.epidata.facele.ws.arca.wscdc.DummyResponse execCDCDummy() throws Exception {

        com.epidata.facele.ws.arca.wscdc.ServiceSoap l_soap = getWSCDCSoap();
        com.epidata.facele.ws.arca.wscdc.DummyResponse l_response = l_soap.comprobanteDummy();
        return l_response;
    }

    /**
     * @return @throws Exception
     * @throws java.lang.Exception
     */
    public com.epidata.facele.ws.arca.wsfexv1.DummyResponse execFEXDummy() throws Exception {

        com.epidata.facele.ws.arca.wsfexv1.ServiceSoap l_soap = getWSFEXSoap();
        com.epidata.facele.ws.arca.wsfexv1.DummyResponse l_response = l_soap.fexDummy();

        return l_response;
    }

    /**
     * @param p_ticket
     * @return @throws Exception
     * @throws java.lang.Exception
     */
    public com.epidata.facele.ws.arca.wscdc.CmpResponse execCDCConstatar(
            AccessTicket p_ticket,
            String p_cbteModo,
            long p_cuitEmisor,
            int p_ptoVta,
            int p_cbteTipo,
            long p_cbteNro,
            String p_cbteFch,
            double p_impTotal,
            String p_codAutorizacion,
            int p_docTipoReceptor,
            long p_docNroReceptor
    ) throws Exception {
        com.epidata.facele.ws.arca.wscdc.ServiceSoap l_soap = getWSCDCSoap();
        CmpDatos l_req = (new com.epidata.facele.ws.arca.wscdc.ObjectFactory())
                .createCmpDatos();

        l_req.setCbteModo(p_cbteModo);
        l_req.setCuitEmisor(p_cuitEmisor);
        l_req.setPtoVta(p_ptoVta);
        l_req.setCbteTipo(p_cbteTipo);
        l_req.setCbteNro(p_cbteNro);
        l_req.setCbteFch(p_cbteFch);
        l_req.setImpTotal(p_impTotal);
        l_req.setCodAutorizacion(p_codAutorizacion);
        l_req.setDocTipoReceptor(String.valueOf(p_docTipoReceptor));
        l_req.setDocNroReceptor(String.valueOf(p_docNroReceptor));

        CmpResponse l_response = l_soap.comprobanteConstatar(
                p_ticket.getCDCAuthRequest(), l_req);
        return l_response;
    }

    /**
     * Consulta y devuelve la cotización de una moneda.
     *
     * @param p_ticket
     * @param p_monId
     * @param p_fecha
     * @return Cotización de la moneda solicitada, o null si no hay cotización.
     * @throws Exception Propias: ninguna
     */
    public Cotizacion execFEParamGetCotizacion(AccessTicket p_ticket,
            String p_monId, Date p_fecha) throws Exception {

        String l_strFecha = m_YYYYMMDDFormatter.format(p_fecha);

        FECotizacionResponse l_response = getWSFESoap()
                .feParamGetCotizacion(
                        p_ticket.getAuthRequest(), p_monId, l_strFecha);
        String l_errors = ServiceOperations.serializeArrays(l_response.getErrors(),
                l_response.getEvents(), new StringBuilder(), new StringBuilder());

        if (hasErrors(l_response.getErrors())) {
            throw new Exception(l_errors);
        } //end 
        logIfNotNull(l_errors);

        Cotizacion l_element = l_response.getResultGet();

        if (l_element == null) {
            throw new Exception("Cotización no encontrada para la moneda " + p_monId + " en fecha " + l_strFecha);
        } // end if
        return l_element;
    }

    private static boolean hasErrors(ArrayOfErr p_err) {
        if (p_err == null) {
            return false;
        } // end if
        if (p_err.getErr() == null) {
            return false;
        } // end if

        return !p_err.getErr().isEmpty();

    }

    public FECompConsultaResponse execFECompConsultar(AccessTicket p_ticket,
            int p_ptoVta, int p_cbteTipo, int p_cbteNro) throws Exception {

        FECompConsultaReq l_req = new ObjectFactory().createFECompConsultaReq();
        l_req.setCbteTipo(p_cbteTipo);
        l_req.setPtoVta(p_ptoVta);
        l_req.setCbteNro(p_cbteNro);

        FECompConsultaResponse l_response = getWSFESoap().feCompConsultar(p_ticket.getAuthRequest(),
                l_req);

        String l_errors = ServiceOperations.serializeArrays(l_response.getErrors(),
                l_response.getEvents(), new StringBuilder(), new StringBuilder());

        if (hasErrors(l_response.getErrors())) {
            throw new Exception(l_errors);
        } //end 
        logIfNotNull(l_errors);

        return l_response;
    }

    public FERecuperaLastCbteResponse execFECompUltimoAutorizado(AccessTicket p_ticket,
            int p_ptoVta, int p_cbteTipo) throws Exception {

        FERecuperaLastCbteResponse l_response = getWSFESoap()
                .feCompUltimoAutorizado(p_ticket.getAuthRequest(), p_ptoVta,
                        p_cbteTipo);

        String l_errors = ServiceOperations.serializeArrays(l_response.getErrors(),
                l_response.getEvents(), new StringBuilder(), new StringBuilder());

        if (hasErrors(l_response.getErrors())) {
            throw new Exception(l_errors);
        } //end 
        logIfNotNull(l_errors);

        return l_response;
    }

    /**
     * @param p_ticket
     * @return
     * @throws Exception
     */
    public List<CbteTipo> execFEParamGetTiposCbte(AccessTicket p_ticket) throws
            Exception {

        CbteTipoResponse l_response = getWSFESoap().feParamGetTiposCbte(p_ticket.
                getAuthRequest());
        String l_errors = ServiceOperations.serializeArrays(l_response.getErrors(),
                l_response.getEvents(), new StringBuilder(), new StringBuilder());

        if (hasErrors(l_response.getErrors())) {
            throw new Exception(l_errors);
        } //end 
        logIfNotNull(l_errors);

        ArrayOfCbteTipo l_array = l_response.getResultGet();
        List<CbteTipo> l_list = l_array.getCbteTipo();
        return l_list;

    }

    /**
     * @param p_ticket
     * @return
     * @throws Exception
     */
    public List<ConceptoTipo> execFEParamGetTiposConcepto(AccessTicket p_ticket)
            throws Exception {

        ConceptoTipoResponse l_response = getWSFESoap().feParamGetTiposConcepto(
                p_ticket.getAuthRequest());

        String l_errors = ServiceOperations.serializeArrays(l_response.getErrors(),
                l_response.getEvents(), new StringBuilder(), new StringBuilder());

        if (hasErrors(l_response.getErrors())) {
            throw new Exception(l_errors);
        } //end 
        logIfNotNull(l_errors);

        ArrayOfConceptoTipo l_array = l_response.getResultGet();
        List<ConceptoTipo> l_list = l_array.getConceptoTipo();
        return l_list;

    }

    /**
     * @param p_ticket
     * @return
     * @throws Exception
     */
    public List<DocTipo> execFEParamGetTiposDoc(AccessTicket p_ticket) throws
            Exception {

        DocTipoResponse l_response = getWSFESoap().feParamGetTiposDoc(p_ticket.
                getAuthRequest());
        String l_errors = ServiceOperations.serializeArrays(l_response.getErrors(),
                l_response.getEvents(), new StringBuilder(), new StringBuilder());

        if (hasErrors(l_response.getErrors())) {
            throw new Exception(l_errors);
        } //end 
        logIfNotNull(l_errors);

        ArrayOfDocTipo l_array = l_response.getResultGet();
        List<DocTipo> l_list = l_array.getDocTipo();
        return l_list;
    }

    /**
     * @param p_ticket
     * @return
     * @throws Exception
     */
    public List<IvaTipo> execFEParamGetTiposIva(AccessTicket p_ticket) throws
            Exception {

        IvaTipoResponse l_response = getWSFESoap().feParamGetTiposIva(p_ticket.
                getAuthRequest());
        String l_errors = ServiceOperations.serializeArrays(l_response.getErrors(),
                l_response.getEvents(), new StringBuilder(), new StringBuilder());

        if (hasErrors(l_response.getErrors())) {
            throw new Exception(l_errors);
        } //end 
        logIfNotNull(l_errors);

        ArrayOfIvaTipo l_array = l_response.getResultGet();
        List<IvaTipo> l_list = l_array.getIvaTipo();
        return l_list;
    }

    /**
     * @param p_ticket
     * @return
     * @throws Exception
     */
    public List<Moneda> execFEParamGetTiposMonedas(AccessTicket p_ticket) throws
            Exception {

        MonedaResponse l_response = getWSFESoap().feParamGetTiposMonedas(p_ticket.
                getAuthRequest());
        String l_errors = ServiceOperations.serializeArrays(l_response.getErrors(),
                l_response.getEvents(), new StringBuilder(), new StringBuilder());

        if (hasErrors(l_response.getErrors())) {
            throw new Exception(l_errors);
        } //end 
        logIfNotNull(l_errors);

        ArrayOfMoneda l_array = l_response.getResultGet();
        List<Moneda> l_list = l_array.getMoneda();
        return l_list;

    }

    /**
     * @param p_ticket
     * @return
     * @throws Exception
     */
    public List<OpcionalTipo> execFEParamGetTiposOpcional(AccessTicket p_ticket)
            throws Exception {

        OpcionalTipoResponse l_response = getWSFESoap().feParamGetTiposOpcional(
                p_ticket.getAuthRequest());
        String l_errors = ServiceOperations.serializeArrays(l_response.getErrors(),
                l_response.getEvents(), new StringBuilder(), new StringBuilder());

        if (hasErrors(l_response.getErrors())) {
            throw new Exception(l_errors);
        } //end 
        logIfNotNull(l_errors);

        ArrayOfOpcionalTipo l_array = l_response.getResultGet();
        List<OpcionalTipo> l_list = l_array.getOpcionalTipo();
        return l_list;
    }

    /**
     * @param p_ticket
     * @return
     * @throws Exception
     */
    public List<PaisTipo> execFEParamGetTiposPaises(AccessTicket p_ticket)
            throws Exception {

        FEPaisResponse l_response = getWSFESoap().feParamGetTiposPaises(p_ticket.
                getAuthRequest());
        String l_errors = ServiceOperations.serializeArrays(l_response.getErrors(),
                l_response.getEvents(), new StringBuilder(), new StringBuilder());

        if (hasErrors(l_response.getErrors())) {
            throw new Exception(l_errors);
        } //end 
        logIfNotNull(l_errors);

        ArrayOfPaisTipo l_array = l_response.getResultGet();
        List<PaisTipo> l_list = l_array.getPaisTipo();
        return l_list;
    }

    /**
     *
     * @param p_ticket
     * @return
     * @throws Exception
     */
    public List<ActividadesTipo> execFEParamGetActividades(AccessTicket p_ticket)
            throws Exception {

        FEActividadesResponse l_response = getWSFESoap().feParamGetActividades(p_ticket.
                getAuthRequest());
        String l_errors = ServiceOperations.serializeArrays(l_response.getErrors(),
                l_response.getEvents(), new StringBuilder(), new StringBuilder());

        if (hasErrors(l_response.getErrors())) {
            throw new Exception(l_errors);
        } //end 
        logIfNotNull(l_errors);

        ArrayOfActividadesTipo l_array = l_response.getResultGet();
        List<ActividadesTipo> l_list = l_array.getActividadesTipo();
        return l_list;
    }

    /**
     *
     * @param p_ticket
     * @return
     * @throws Exception
     */
    public List<ClsFEXResponseActividadTipo> execFEParamGetActividadesExp(AccessTicket p_ticket)
            throws Exception {

        var l_response = getWSFEXSoap().fexGetPARAMActividades(p_ticket.getWSFEXAuthRequest());

        String l_errors = ServiceOperations.serializeArrays(l_response.getFEXErr(),
                l_response.getFEXEvents(), new StringBuilder(), new StringBuilder());

        if (l_response.getFEXErr() != null && l_response.getFEXErr().getErrCode() != 0) {
            throw new Exception(l_errors);
        } //end 

        logIfNotNull(l_errors);

        ArrayOfClsFEXResponseActividadTipo l_array = l_response.getFEXResultGet();
        List<ClsFEXResponseActividadTipo> l_list = l_array.getClsFEXResponseActividadTipo();
        return l_list;
    }

    /**
     * @param p_ticket
     * @return
     * @throws Exception
     */
    public List<TributoTipo> execFEParamGetTiposTributos(AccessTicket p_ticket)
            throws Exception {

        FETributoResponse l_response = getWSFESoap().feParamGetTiposTributos(
                p_ticket.getAuthRequest());
        String l_errors = ServiceOperations.serializeArrays(l_response.getErrors(),
                l_response.getEvents(), new StringBuilder(), new StringBuilder());

        if (hasErrors(l_response.getErrors())) {
            throw new Exception(l_errors);
        } //end 
        logIfNotNull(l_errors);

        ArrayOfTributoTipo l_array = l_response.getResultGet();
        List<TributoTipo> l_list = l_array.getTributoTipo();
        return l_list;
    }

    /**
     *
     * @param p_ticket
     * @return
     * @throws Exception
     */
    public List<CondicionIvaReceptor> execFEParamGetCondicionIvaReceptor(AccessTicket p_ticket)
            throws Exception {

        CondicionIvaReceptorResponse l_response = getWSFESoap()
                .feParamGetCondicionIvaReceptor(p_ticket.getAuthRequest(), null);
        String l_errors = ServiceOperations.serializeArrays(l_response.getErrors(),
                l_response.getEvents(), new StringBuilder(), new StringBuilder());

        if (hasErrors(l_response.getErrors())) {
            throw new Exception(l_errors);
        } //end 
        logIfNotNull(l_errors);

        ArrayOfCondicionIvaReceptor l_array = l_response.getResultGet();
        List<CondicionIvaReceptor> l_list = l_array.getCondicionIvaReceptor();
        return l_list;
    }

    /**
     *
     * @param p_ticket
     * @return
     * @throws Exception
     */
    public List<PtoVenta> execFEParamGetPtosVenta(AccessTicket p_ticket)
            throws Exception {

        FEPtoVentaResponse l_response = getWSFESoap()
                .feParamGetPtosVenta(p_ticket.getAuthRequest());

        String l_errors = ServiceOperations.serializeArrays(l_response.getErrors(),
                l_response.getEvents(), new StringBuilder(), new StringBuilder());

        if (hasErrors(l_response.getErrors())) {
            throw new Exception(l_errors);
        } //end 
        logIfNotNull(l_errors);

        ArrayOfPtoVenta l_array = l_response.getResultGet();
        List<PtoVenta> l_list = l_array.getPtoVenta();
        return l_list;
    }

    /**
     *
     * @param p_ticket
     * @return
     * @throws Exception
     */
    public List<ClsFEXResponsePtoVenta> execFEParamGetPtosVentaExp(AccessTicket p_ticket)
            throws Exception {

        FEXResponsePtoVenta l_response = getWSFEXSoap().fexGetPARAMPtoVenta(
                p_ticket.getWSFEXAuthRequest());

        String l_errors = ServiceOperations.serializeArrays(l_response.getFEXErr(),
                l_response.getFEXEvents(), new StringBuilder(), new StringBuilder());
        if (l_response.getFEXErr() != null && l_response.getFEXErr().getErrCode() != 0) {
            throw new Exception(l_errors);
        } //end 
        logIfNotNull(l_errors);

        var l_array = l_response.getFEXResultGet();
        List<ClsFEXResponsePtoVenta> l_list = l_array.getClsFEXResponsePtoVenta();
        return l_list;
    }

    // Tablas de referencia para facturas de exportación --------------------------------------------------
    public List<ClsFEXResponseMon> execFEXGetParamMon(AccessTicket p_ticket)
            throws Exception { // pag 39
        var l_response = getWSFEXSoap()
                .fexGetPARAMMON(p_ticket.getWSFEXAuthRequest());
        String l_errors = ServiceOperations.serializeArrays(l_response.getFEXErr(),
                l_response.getFEXEvents(), new StringBuilder(), new StringBuilder());
        if (l_response.getFEXErr() != null && l_response.getFEXErr().getErrCode() != 0) {
            throw new Exception(l_errors);
        } //end 

        logIfNotNull(l_errors);
        var l_array = l_response.getFEXResultGet();
        var l_list = l_array.getClsFEXResponseMon();
        return l_list;
    }

    public List<ClsFEXResponseCbteTipo> execFEXGetParamCbteTipo(AccessTicket p_ticket)
            throws Exception { // pag 40
        var l_response = getWSFEXSoap()
                .fexGetPARAMCbteTipo(p_ticket.getWSFEXAuthRequest());

        String l_errors = ServiceOperations.serializeArrays(l_response.getFEXErr(),
                l_response.getFEXEvents(), new StringBuilder(), new StringBuilder());

        if (l_response.getFEXErr() != null && l_response.getFEXErr().getErrCode() != 0) {
            throw new Exception(l_errors);
        } //end 

        logIfNotNull(l_errors);
        var l_array = l_response.getFEXResultGet();
        var l_list = l_array.getClsFEXResponseCbteTipo();
        return l_list;
    }

    public List<ClsFEXResponseTex> execFEXGetParamTipoExpo(AccessTicket p_ticket)
            throws Exception { // pag 42
        var l_response = getWSFEXSoap()
                .fexGetPARAMTipoExpo(p_ticket.getWSFEXAuthRequest());

        String l_errors = ServiceOperations.serializeArrays(l_response.getFEXErr(),
                l_response.getFEXEvents(), new StringBuilder(), new StringBuilder());

        if (l_response.getFEXErr() != null && l_response.getFEXErr().getErrCode() != 0) {
            throw new Exception(l_errors);
        } //end 

        logIfNotNull(l_errors);
        var l_array = l_response.getFEXResultGet();
        var l_list = l_array.getClsFEXResponseTex();
        return l_list;
    }

    public List<ClsFEXResponseUMed> execFEXGetParamUmed(AccessTicket p_ticket)
            throws Exception { // pag 43
        var l_response = getWSFEXSoap()
                .fexGetPARAMUMed(p_ticket.getWSFEXAuthRequest());

        String l_errors = ServiceOperations.serializeArrays(l_response.getFEXErr(),
                l_response.getFEXEvents(), new StringBuilder(), new StringBuilder());

        if (l_response.getFEXErr() != null && l_response.getFEXErr().getErrCode() != 0) {
            throw new Exception(l_errors);
        } //end 

        logIfNotNull(l_errors);
        var l_array = l_response.getFEXResultGet();
        var l_list = l_array.getClsFEXResponseUMed();
        return l_list;
    }

    public List<ClsFEXResponseIdi> execFEXGetParamIdiomas(AccessTicket p_ticket)
            throws Exception { // pag 45
        var l_response = getWSFEXSoap()
                .fexGetPARAMIdiomas(p_ticket.getWSFEXAuthRequest());

        String l_errors = ServiceOperations.serializeArrays(l_response.getFEXErr(),
                l_response.getFEXEvents(), new StringBuilder(), new StringBuilder());

        if (l_response.getFEXErr() != null && l_response.getFEXErr().getErrCode() != 0) {
            throw new Exception(l_errors);
        } //end 

        logIfNotNull(l_errors);
        var l_array = l_response.getFEXResultGet();
        var l_list = l_array.getClsFEXResponseIdi();
        return l_list;
    }

    public List<ClsFEXResponseDSTPais> execFEXGetParamDstPais(AccessTicket p_ticket)
            throws Exception { // pag 47
        var l_response = getWSFEXSoap()
                .fexGetPARAMDSTPais(p_ticket.getWSFEXAuthRequest());

        String l_errors = ServiceOperations.serializeArrays(l_response.getFEXErr(),
                l_response.getFEXEvents(), new StringBuilder(), new StringBuilder());

        if (l_response.getFEXErr() != null && l_response.getFEXErr().getErrCode() != 0) {
            throw new Exception(l_errors);
        } //end 

        logIfNotNull(l_errors);
        var l_array = l_response.getFEXResultGet();
        var l_list = l_array.getClsFEXResponseDSTPais();
        return l_list;
    }

    public List<ClsFEXResponseInc> execFEXGetParamIncoterms(AccessTicket p_ticket)
            throws Exception { // pag 48
        var l_response = getWSFEXSoap()
                .fexGetPARAMIncoterms(p_ticket.getWSFEXAuthRequest());

        String l_errors = ServiceOperations.serializeArrays(l_response.getFEXErr(),
                l_response.getFEXEvents(), new StringBuilder(), new StringBuilder());

        if (l_response.getFEXErr() != null && l_response.getFEXErr().getErrCode() != 0) {
            throw new Exception(l_errors);
        } //end 

        logIfNotNull(l_errors);
        var l_array = l_response.getFEXResultGet();
        var l_list = l_array.getClsFEXResponseInc();
        return l_list;
    }

    public List<ClsFEXResponseDSTCuit> execFEXGetParamDstCuit(AccessTicket p_ticket)
            throws Exception { // pag 50
        var l_response = getWSFEXSoap()
                .fexGetPARAMDSTCUIT(p_ticket.getWSFEXAuthRequest());

        String l_errors = ServiceOperations.serializeArrays(l_response.getFEXErr(),
                l_response.getFEXEvents(), new StringBuilder(), new StringBuilder());

        if (l_response.getFEXErr() != null && l_response.getFEXErr().getErrCode() != 0) {
            throw new Exception(l_errors);
        } //end 

        logIfNotNull(l_errors);
        var l_array = l_response.getFEXResultGet();
        var l_list = l_array.getClsFEXResponseDSTCuit();
        return l_list;
    }

    public List<ClsFEXResponseOpc> execFEXGetParamOpcionales(AccessTicket p_ticket)
            throws Exception { // pag 54
        var l_response = getWSFEXSoap()
                .fexGetPARAMOpcionales(p_ticket.getWSFEXAuthRequest());

        String l_errors = ServiceOperations.serializeArrays(l_response.getFEXErr(),
                l_response.getFEXEvents(), new StringBuilder(), new StringBuilder());

        if (l_response.getFEXErr() != null && l_response.getFEXErr().getErrCode() != 0) {
            throw new Exception(l_errors);
        } //end 

        logIfNotNull(l_errors);
        var l_array = l_response.getFEXResultGet();
        var l_list = l_array.getClsFEXResponseOpc();
        return l_list;
    }

    // Consultas con parámetros, de factura de exportación
    public ClsFEXGetCMPR execFEXGetCMP(AccessTicket p_ticket,
            int p_cbteTipo, int p_puntoVta, long p_cbteNro)
            throws Exception { // pag 34

        ClsFEXGetCMP l_cmp = new com.epidata.facele.ws.arca.wsfexv1.ObjectFactory().createClsFEXGetCMP();

        l_cmp.setCbteNro(p_cbteNro);
        l_cmp.setCbteTipo((short) p_cbteTipo);
        l_cmp.setPuntoVta(p_puntoVta);

        var l_response = getWSFEXSoap()
                .fexGetCMP(p_ticket.getWSFEXAuthRequest(),
                        l_cmp);

        String l_errors = ServiceOperations.serializeArrays(l_response.getFEXErr(),
                l_response.getFEXEvents(), new StringBuilder(), new StringBuilder());
        if (l_response.getFEXErr() != null && l_response.getFEXErr().getErrCode() != 0) {
            throw new Exception(l_errors);
        } //end 

        logIfNotNull(l_errors);
        return l_response.getFEXResultGet();
    }

    public long execFEXGetLastId(AccessTicket p_ticket)
            throws Exception { // pag 36

        var l_response = getWSFEXSoap()
                .fexGetLastID(p_ticket.getWSFEXAuthRequest());

        String l_errors = ServiceOperations.serializeArrays(l_response.getFEXErr(),
                l_response.getFEXEvents(), new StringBuilder(), new StringBuilder());
        if (l_response.getFEXErr() != null && l_response.getFEXErr().getErrCode() != 0) {
            throw new Exception(l_errors);
        } //end 

        logIfNotNull(l_errors);
        return l_response.getFEXResultGet().getId();
    }

    public ClsFEXLastCMPResponse execFEXGetLastCMP(AccessTicket p_ticket,
            int p_cbteTipo, int p_puntoVta)
            throws Exception { // pag 37

        ClsFEXLastCMP l_request = new com.epidata.facele.ws.arca.wsfexv1.ObjectFactory().createClsFEXLastCMP();

        l_request.setCuit(p_ticket.getCuit());
        l_request.setSign(p_ticket.getSign());
        l_request.setToken(p_ticket.getToken());

        l_request.setCbteTipo((short) p_cbteTipo);
        l_request.setPtoVenta(p_puntoVta);
        var l_response = getWSFEXSoap().fexGetLastCMP(l_request);

        String l_errors = ServiceOperations.serializeArrays(l_response.getFEXErr(),
                l_response.getFEXEvents(), new StringBuilder(), new StringBuilder());
        if (l_response.getFEXErr() != null && l_response.getFEXErr().getErrCode() != 0) {
            throw new Exception(l_errors);
        } //end 

        logIfNotNull(l_errors);
        return l_response.getFEXResultLastCMP();
    }

    public ClsFEXResponseCtz execFEXGetParamCtz(AccessTicket p_ticket,
            String p_monId, String p_fchCotiz)
            throws Exception { // pag 51

        var l_response = getWSFEXSoap().fexGetPARAMCtz(p_ticket.getWSFEXAuthRequest(),
                p_monId, p_fchCotiz);

        String l_errors = ServiceOperations.serializeArrays(l_response.getFEXErr(),
                l_response.getFEXEvents(), new StringBuilder(), new StringBuilder());
        if (l_response.getFEXErr() != null && l_response.getFEXErr().getErrCode() != 0) {
            throw new Exception(l_errors);
        } //end 

        logIfNotNull(l_errors);
        return l_response.getFEXResultGet();
    }

    public List<ClsFEXResponsePtoVenta> execFEXGetParamPtoVenta(AccessTicket p_ticket)
            throws Exception { // pag 52

        var l_response = getWSFEXSoap().fexGetPARAMPtoVenta(p_ticket.getWSFEXAuthRequest());

        String l_errors = ServiceOperations.serializeArrays(l_response.getFEXErr(),
                l_response.getFEXEvents(), new StringBuilder(), new StringBuilder());
        if (l_response.getFEXErr() != null && l_response.getFEXErr().getErrCode() != 0) {
            throw new Exception(l_errors);
        } //end 

        logIfNotNull(l_errors);
        var l_array = l_response.getFEXResultGet();
        var l_list = l_array.getClsFEXResponsePtoVenta();

        return l_list;
    }

    public ClsFEXResponseCheckPermiso execFEXCheckPermiso(AccessTicket p_ticket,
            String p_idPermiso, int p_dstMerc)
            throws Exception { // pag 55

        var l_response = getWSFEXSoap().fexCheckPermiso(
                p_ticket.getWSFEXAuthRequest(),
                p_idPermiso, p_dstMerc);

        String l_errors = ServiceOperations.serializeArrays(l_response.getFEXErr(),
                l_response.getFEXEvents(), new StringBuilder(), new StringBuilder());
        if (l_response.getFEXErr() != null && l_response.getFEXErr().getErrCode() != 0) {
            throw new Exception(l_errors);
        } //end 

        logIfNotNull(l_errors);
        return l_response.getFEXResultGet();
    }

}
