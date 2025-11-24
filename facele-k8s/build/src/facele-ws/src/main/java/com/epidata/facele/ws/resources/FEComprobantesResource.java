package com.epidata.facele.ws.resources;

import com.epidata.facele.ws.jsonmodel.FEComprobantesLoteModel;
import com.epidata.facele.ws.jsonmodel.FEComprobantesPDFModel;
import com.epidata.facele.ws.jsonmodel.FEComprobantesQRModel;
import com.epidata.facele.ws.jsonmodel.FEComprobantesModel;
import com.epidata.facele.conf.GlobalConf;
import com.epidata.facele.entities.TR_FEComprobantes;
import com.epidata.facele.entities.TR_FEComprobantesAsoc;
import com.epidata.facele.entities.TR_FEComprobantesDet;
import com.epidata.facele.entities.TR_FEComprobantesIva;
import com.epidata.facele.entities.TR_FEComprobantesOpc;
import com.epidata.facele.entities.TR_FEComprobantesTrib;
import com.epidata.facele.entities.TR_FEXPermisos;
import com.epidata.facele.entities.T_FEComprobantes;
import com.epidata.facele.entities.T_FEComprobantesAsoc;
import com.epidata.facele.entities.T_FEComprobantesDet;
import com.epidata.facele.entities.T_FEComprobantesIva;
import com.epidata.facele.entities.T_FEComprobantesOpc;
import com.epidata.facele.entities.T_FEComprobantesTrib;
import com.epidata.facele.entities.T_FEXPermisos;
import com.epidata.facele.entities.VW_ComprobantesQuery;
import static com.epidata.facele.logger.FaceleLogger.log;
import com.epidata.facele.orm.OrmSupport;
import com.epidata.facele.repodriver.AbstractRepoDriver;
import com.epidata.facele.repodriver.FilesystemRepoDriver;
import com.epidata.facele.repodriver.MinIORepoDriver;
import com.epidata.facele.tickets.AccessTicket;
import com.epidata.facele.tickets.AccessTicketMap;
import com.epidata.facele.tickets.WSAALoginProvider.WSType;
import com.epidata.facele.ws.ConnectionProvider;
import com.epidata.facele.ws.arca.ServiceOperations;
import com.epidata.facele.ws.arca.wsfev1.FECompConsultaResponse;
import com.epidata.facele.ws.jsonmodel.FECompBatchModel;
import static com.epidata.facele.ws.resources.AbstractResource.errResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
@Path("comprobantes")
public class FEComprobantesResource {

    /**
     *
     */
    private static AbstractRepoDriver m_repoDriver;

    @GET
    public Response findAll(
            @QueryParam("IdMin") Integer p_idMin,
            @QueryParam("IdMax") Integer p_idMax,
            @QueryParam("Cuit") Long p_cuit,
            @QueryParam("PtoVta") Integer p_ptoVta,
            @QueryParam("CbteTipo") Integer p_cbteTipo,
            @QueryParam("CbteNroMin") Long p_cbteNroMin,
            @QueryParam("CbteNroMax") Long p_cbteNroMax,
            @QueryParam("CbteFchMin") String p_cbteFchMin,
            @QueryParam("CbteFchMax") String p_cbteFchMax,
            @QueryParam("Lote") String p_lote,
            @QueryParam("Resultado") String p_resultado
    ) {
        try (Connection l_dbConn = ConnectionProvider.getConn();) {

            StringBuilder l_where = new StringBuilder("true");
            if (p_idMin != null) {
                l_where.append(" AND IdDocumentoFE >= ").append(p_idMin);
            } // end if

            if (p_idMax != null) {
                l_where.append(" AND IdDocumentoFE <= ").append(p_idMax);
            } // end if

            if (p_cuit != null) {
                l_where.append(" AND Cuit = ").append(p_cuit);
            } // end if

            if (p_ptoVta != null) {
                l_where.append(" AND PtoVta = ").append(p_ptoVta);
            } // end if

            if (p_cbteTipo != null) {
                l_where.append(" AND CbteTipo = ").append(p_cbteTipo);
            } // end if

            if (p_cbteNroMin != null) {
                l_where.append(" AND CbteDesde >= ").append(p_cbteNroMin);
            } // end if

            if (p_cbteNroMax != null) {
                l_where.append(" AND CbteDesde <= ").append(p_cbteNroMax);
            } // end if

            if (p_cbteFchMin != null) {
                Date l_fecha = new SimpleDateFormat("yyyyMMdd").parse(p_cbteFchMin);
                String l_strFecha = new SimpleDateFormat("yyyy-MM-dd").format(l_fecha);
                l_where.append(" AND CbteFch >= '").append(l_strFecha).append("'");
            } // end if

            if (p_cbteFchMax != null) {
                Date l_fecha = new SimpleDateFormat("yyyyMMdd").parse(p_cbteFchMax);
                String l_strFecha = new SimpleDateFormat("yyyy-MM-dd").format(l_fecha);
                l_where.append(" AND CbteFch <= '").append(l_strFecha).append("'");
            } // end if

            if (p_lote != null) {
                l_where.append(" AND IdLoteFacturacion = ").append(p_lote);
            } // end if

            if (p_resultado != null) {

                p_resultado = p_resultado.toUpperCase();

                // Evita SQL Injection
                if (!"_P_A_R_T_S_".contains("_" + p_resultado + "_")) {
                    throw new Exception("Resultado solicitado inv&uacute;lido: [" + p_resultado + "]");
                } // end if

                l_where.append(" AND Resultado = '").append(p_resultado).append("'");
            } // end if

            VW_ComprobantesQuery l_view = new VW_ComprobantesQuery();
            l_view.serializeFrom(l_dbConn, l_where.toString(), "IdDocumentoFE");

            String l_jsonContent = OrmSupport.asJSON(l_view.getRows());
            return Response
                    .ok(l_jsonContent, MediaType.APPLICATION_JSON_TYPE)
                    .build();
        } catch (Exception l_ex) {
            log(l_ex);
            return errResponse(l_ex);
        }
    }

    @GET
    @Path("{id}")
    public Response findOne(@PathParam("id") Integer p_id) {

        if (p_id == null) {
            return Response.ok("BAD REQUEST missing Id param",
                    MediaType.TEXT_PLAIN).status(400).build();
        } // end if

        try (Connection l_dbConn = ConnectionProvider.getConn();) {
            T_FEComprobantes l_table = new T_FEComprobantes();
            l_table.serializeFrom(l_dbConn, "IdDocumentoFE='" + p_id + "'", null);
            if (l_table.getRows().isEmpty()) {
                // No encontrado
                return Response.ok("NOT-FOUND id=" + p_id + " @" + l_table.getSqlName(),
                        MediaType.TEXT_PLAIN).status(404).build();
            } // end if

            TR_FEComprobantes l_rec = l_table.getRows().getFirst();
            FEComprobantesModel l_model = new FEComprobantesModel(l_rec, l_dbConn);

            String l_jsonContent = OrmSupport.asJSON(l_model);
            return Response
                    .ok(l_jsonContent, MediaType.APPLICATION_JSON_TYPE)
                    .build();

        } catch (Exception l_ex) {
            log(l_ex);
            return errResponse(l_ex);
        }
    }

    @GET
    @Path("{id}/pdf")
    public Response findPDF(@PathParam("id") Integer p_id) {
        if (p_id == null) {
            return Response.ok("BAD REQUEST missing Id param",
                    MediaType.TEXT_PLAIN).status(400).build();
        } // end if

        try (Connection l_dbConn = ConnectionProvider.getConn();) {
            T_FEComprobantes l_table = new T_FEComprobantes();
            l_table.serializeFrom(l_dbConn, "IdDocumentoFE='" + p_id + "'", null);
            if (l_table.getRows().isEmpty()) {
                // No encontrado
                return Response.ok("NOT-FOUND id=" + p_id + " @" + l_table.getSqlName(),
                        MediaType.TEXT_PLAIN).status(404).build();
            } // end if

            TR_FEComprobantes l_rec = l_table.getRows().getFirst();
            FEComprobantesPDFModel l_model = new FEComprobantesPDFModel(l_rec, getRepoDriver());

            String l_jsonContent = OrmSupport.asJSON(l_model);

            return Response
                    .ok(l_jsonContent, MediaType.APPLICATION_JSON_TYPE)
                    .build();
        } catch (Exception l_ex) {

            log(l_ex);
            return errResponse(l_ex);
        }
    }

    @GET
    @Path("{id}/qr")
    public Response findQR(@PathParam("id") Integer p_id) {
        if (p_id == null) {
            return Response.ok("BAD REQUEST missing Id param",
                    MediaType.TEXT_PLAIN).status(400).build();
        } // end if

        try (Connection l_dbConn = ConnectionProvider.getConn();) {
            T_FEComprobantes l_table = new T_FEComprobantes();
            l_table.serializeFrom(l_dbConn, "IdDocumentoFE='" + p_id + "'", null);
            if (l_table.getRows().isEmpty()) {
                // No encontrado
                return Response.ok("NOT-FOUND id=" + p_id + " @" + l_table.getSqlName(),
                        MediaType.TEXT_PLAIN).status(404).build();
            } // end if

            TR_FEComprobantes l_rec = l_table.getRows().getFirst();
            FEComprobantesQRModel l_model = new FEComprobantesQRModel(l_rec, l_dbConn);

            String l_jsonContent = OrmSupport.asJSON(l_model);
            return Response
                    .ok(l_jsonContent, MediaType.APPLICATION_JSON_TYPE)
                    .build();

        } catch (Exception l_ex) {
            log(l_ex);
            return errResponse(l_ex);
        }
    }

    private void addNewComprobante(Connection p_dbConn,
            FECompBatchModel p_model) throws Exception {

        TR_FEComprobantes l_comp = p_model.asTR_FEComprobantes();

        (new T_FEComprobantes()).executeSPIR(p_dbConn, l_comp);

        for (TR_FEComprobantesAsoc l_toAdd : p_model.asTR_FEComprobantesAsoc()) {
            (new T_FEComprobantesAsoc()).executeSPIR(p_dbConn, l_toAdd);
        } // end for

        for (TR_FEComprobantesDet l_toAdd : p_model.asTR_FEComprobantesDet()) {
            (new T_FEComprobantesDet()).executeSPIR(p_dbConn, l_toAdd);
        } // end for

        for (TR_FEComprobantesIva l_toAdd : p_model.asTR_FEComprobantesIva()) {
            (new T_FEComprobantesIva()).executeSPIR(p_dbConn, l_toAdd);
        } // end for

        for (TR_FEComprobantesOpc l_toAdd : p_model.asTR_FEComprobantesOpc()) {
            (new T_FEComprobantesOpc()).executeSPIR(p_dbConn, l_toAdd);
        } // end for

        for (TR_FEComprobantesTrib l_toAdd : p_model.asTR_FEComprobantesTrib()) {
            (new T_FEComprobantesTrib()).executeSPIR(p_dbConn, l_toAdd);
        } // end for

        for (TR_FEXPermisos l_toAdd : p_model.asTR_FEXPermisos()) {
            (new T_FEXPermisos()).executeSPIR(p_dbConn, l_toAdd);
        } // end for

    }

    @POST
    public Response addBatch(String p_input) {
        log("WSFE POST nuevo lote de comprobantes...");
        Connection l_dbConn = null;
        boolean l_isAutocommit = true; // Predeterminado
        try {
            l_dbConn = ConnectionProvider.getConn();
            // Recuerda el estado actual, para devolverlo
            l_isAutocommit = l_dbConn.getAutoCommit();

            FEComprobantesLoteModel l_lote = new FEComprobantesLoteModel();

            ObjectMapper l_mapper = new ObjectMapper();
            DateFormat l_dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            l_mapper.setDateFormat(l_dateFormat);

            l_lote = l_mapper.readValue(p_input, l_lote.getClass());
            List<FECompBatchModel> l_modelList = l_lote.getComprobantes();
            log("   Cantidad de comprobantes en el lote: " + l_modelList.size());
            // Comienza un nuevo bloque transaccional
            l_dbConn.setAutoCommit(false);
            try {
                for (FECompBatchModel l_model : l_modelList) {
                    addNewComprobante(l_dbConn, l_model);
                } // end for
            } catch (Exception l_ex2) {
                l_dbConn.rollback();
                l_dbConn.setAutoCommit(l_isAutocommit);
                l_dbConn.close(); // no cierra; devuelve al pool
                log(l_ex2);
                return errResponse(l_ex2, 400); // bad request

            }
            l_dbConn.commit(); // Luego de insertar todos los comprobantes, recién publica la transacción

            l_dbConn.setAutoCommit(l_isAutocommit); // Vuelve al estado original
            l_dbConn.close(); // no cierra; devuelve al pool

            return Response
                    .ok("OK")
                    .build();

        } catch (Exception l_ex) {
            if (l_dbConn != null) {
                try {
                    l_dbConn.rollback();
                    l_dbConn.setAutoCommit(l_isAutocommit);
                    l_dbConn.close(); // no cierra; devuelve al pool
                } catch (Exception l_ex2) {
                    // Nada por hacer. Improbable que suceda.
                    log(l_ex2);
                }
            } // end if
            log(l_ex);
            return errResponse(l_ex);
        }

    }

    @GET
    @Path("{cuit}/{cbteTipo}/{ptoVta}/{cbteNro}")
    public Response recover(
            @PathParam("cuit") Long p_cuit,
            @PathParam("cbteTipo") Integer p_cbteTipo,
            @PathParam("ptoVta") Integer p_ptoVta,
            @PathParam("cbteNro") Integer p_cbteNro) {

        try (Connection l_dbConn = ConnectionProvider.getConn();) {

            GlobalConf l_conf = GlobalConf.getInstance();

            ServiceOperations l_serviceOperations = new ServiceOperations(l_conf);
            AccessTicket l_wsfeTicket = AccessTicketMap.getValidTicketFor(WSType.wsfe,
                    p_cuit, l_dbConn, l_conf);

            FECompConsultaResponse l_response = l_serviceOperations
                    .execFECompConsultar(l_wsfeTicket, p_ptoVta, p_cbteTipo, p_cbteNro);

            String l_jsonContent = OrmSupport.asJSON(l_response);
            return Response
                    .ok(l_jsonContent, MediaType.APPLICATION_JSON_TYPE)
                    .build();

        } catch (Exception l_ex) {
            log(l_ex);
            return errResponse(l_ex);
        }

    }

    @DELETE
    @Path("{id}")
    public Response deleteOne(@PathParam("id") Long p_id) {
        if (p_id == null) {
            return Response.ok("BAD REQUEST missing Id param",
                    MediaType.TEXT_PLAIN).status(400).build();
        } // end if

        T_FEComprobantes l_table = new T_FEComprobantes();
        String l_pkName = "IdDocumentoFE";

        try (Connection l_dbConn = ConnectionProvider.getConn();) {
            l_table.serializeFrom(l_dbConn, l_pkName + "='" + p_id + "'", null);
            if (l_table.getRows().isEmpty()) {
                // No encontrado
                return Response.ok("NOT-FOUND id=" + p_id + " @" + l_table.getSqlName(),
                        MediaType.TEXT_PLAIN).status(404).build();
            } // end if

            l_table.executeSPD(l_dbConn, p_id);

            return Response
                    .ok("DELETED " + p_id)
                    .build();

        } catch (Exception l_ex) {
            log(l_ex);
            return Response.ok(l_ex.getMessage(),
                    MediaType.TEXT_PLAIN).status(500).build();
        }
    }

    /**
     * Actualiza un comprobante, pero solo modifica algunos campos
     *
     * @param p_id
     * @param p_cbteFch
     * @param p_cbteDesde
     * @param p_cbteHasta
     * @param p_resultado
     * @param p_estadoPDF
     * @param p_input
     * @return
     */
    @PUT
    @Path("{id}")
    public Response updateOne(
            @PathParam("id") Integer p_id,
            @QueryParam("CbteFch") String p_cbteFch,
            @QueryParam("CbteDesde") Long p_cbteDesde,
            @QueryParam("CbteHasta") Long p_cbteHasta,
            @QueryParam("Resultado") String p_resultado,
            @QueryParam("EstadoPDF") String p_estadoPDF) {

        return Response.ok("Not implemented.",
                MediaType.TEXT_PLAIN).status(500).build();
    }

    public static AbstractRepoDriver getRepoDriver() throws Exception {
        if (m_repoDriver == null) {
            m_repoDriver = makeRepoDriver();
        } // end if
        return m_repoDriver;

    }

    private static AbstractRepoDriver makeRepoDriver() throws Exception {

        GlobalConf l_conf = GlobalConf.getInstance();

        if (l_conf.m_s3Support) {
            MinIORepoDriver l_toReturn = new MinIORepoDriver(l_conf.m_pdfDir);
            l_toReturn.setBucket(l_conf.m_s3Bucket);
            l_toReturn.setPass(l_conf.m_s3Password);
            l_toReturn.setUrl(l_conf.m_s3URL);
            l_toReturn.setUser(l_conf.m_s3User);

            return l_toReturn;
        } else {
            FilesystemRepoDriver l_toReturn = new FilesystemRepoDriver(l_conf.m_pdfDir);
            return l_toReturn;
        } // end if
    }

}
