package com.epidata.facele.ws.resources;

import com.epidata.facele.ws.AbstractReimporter;
import com.epidata.facele.conf.GlobalConf;
import com.epidata.facele.entities.TR_FECbteTipos;
import com.epidata.facele.entities.TR_Monedas;
import com.epidata.facele.entities.T_FECbteTipos;
import static com.epidata.facele.logger.FaceleLogger.log;
import com.epidata.facele.orm.OrmSupport;
import com.epidata.facele.tickets.AccessTicket;
import com.epidata.facele.tickets.AccessTicketMap;
import com.epidata.facele.tickets.WSAALoginProvider.WSType;
import com.epidata.facele.ws.ConnectionProvider;
import com.epidata.facele.ws.arca.ServiceOperations;
import com.epidata.facele.ws.arca.wsfev1.CbteTipo;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
@Path("cbtetipos")
public class FECbteTiposResource extends AbstractResource<T_FECbteTipos> {

    @GET
    public Response findAll() {
        return super.findAll(new T_FECbteTipos(), "CbteTipo", "cbtetipos");
    }

    @GET
    @Path("{id}")
    public Response findOne(@PathParam("id") Integer p_id) {

        return super.findOne(new T_FECbteTipos(), "CbteTipo", p_id);
    }

    @GET
    @Path("import")
    public Response reimport() {
        try (Connection l_dbConn = ConnectionProvider.getConn();) {

            GlobalConf l_conf = GlobalConf.getInstance();
            AccessTicket l_wsfeTicket = AccessTicketMap.getValidTicketFor(WSType.wsfe,
                    l_conf.m_genericCUIT, l_dbConn, l_conf);

            ServiceOperations l_serviceOperations = new ServiceOperations(l_conf);

            List<CbteTipo> l_arcaList = l_serviceOperations.execFEParamGetTiposCbte(l_wsfeTicket);

            AbstractReimporter<T_FECbteTipos, TR_FECbteTipos, CbteTipo> l_reimporter
                    = new AbstractReimporter<>("cbtetipos") {
                @Override
                public void updateRecord(TR_FECbteTipos p_record, CbteTipo p_arca) throws Exception {
                    p_record.setCbteTipo(p_arca.getId());
                    p_record.setDescripcion(p_arca.getDesc());
                    p_record.setFchDesde(OrmSupport.xml2Date(p_arca.getFchDesde()));
                    p_record.setFchHasta(OrmSupport.xml2Date(p_arca.getFchHasta()));
                    p_record.setUsoNacional(1);
                    if (p_record.getUsoExportac() == null) {
                        p_record.setUsoExportac(0);
                    } // end if
                }

                @Override
                public boolean canDelete(TR_FECbteTipos p_record) {
                    return p_record.getUsoExportac() != 1;
                }

            };

            return l_reimporter.reimport(l_dbConn, l_reimporter.getEntityName(),
                    l_arcaList, new T_FECbteTipos(),
                    TR_FECbteTipos.class);

        } catch (Exception l_ex) {
            log(l_ex);
            return errResponse(l_ex);
        }
    }

    /**
     * Actualiza un tipo de comprobante, pero solo modifica los campos
     * "sintetico", "reportTemplate", "cbteFam" y "letraFiscal"
     *
     * @param p_input
     * @return
     */
    @PUT
    public Response updateOne(String p_input) {
        try (Connection l_dbConn = ConnectionProvider.getConn();) {
            T_FECbteTipos l_table = new T_FECbteTipos();
            TR_FECbteTipos l_rowJson = (TR_FECbteTipos) OrmSupport.fromJSON(p_input,
                    new TR_FECbteTipos());
            TR_FECbteTipos l_rowOriginal = l_table.getFirstRecord(l_dbConn,
                    "CbteTipo=" + l_rowJson.getId(), null, TR_FECbteTipos.class);

            l_rowOriginal.setSintetico(l_rowJson.getSintetico());
            l_rowOriginal.setReportTemplate(l_rowJson.getReportTemplate());
            l_rowOriginal.setCbteFam(l_rowJson.getCbteFam());
            l_rowOriginal.setLetraFiscal(l_rowJson.getLetraFiscal());

            l_table.executeSPUR(l_dbConn, l_rowOriginal);

            String l_jsonContent = OrmSupport.asJSON(l_rowOriginal);
            return Response
                    .ok(l_jsonContent, MediaType.APPLICATION_JSON_TYPE)
                    .build();

        } catch (Exception l_ex) {
            log(l_ex);
            return errResponse(l_ex);
        }
    }

}
