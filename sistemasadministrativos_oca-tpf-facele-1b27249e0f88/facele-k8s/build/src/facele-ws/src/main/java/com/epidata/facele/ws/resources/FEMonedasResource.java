package com.epidata.facele.ws.resources;

import com.epidata.facele.ws.AbstractReimporter;
import com.epidata.facele.conf.GlobalConf;
import com.epidata.facele.entities.TR_Monedas;
import com.epidata.facele.entities.T_Monedas;
import static com.epidata.facele.logger.FaceleLogger.log;
import com.epidata.facele.orm.OrmSupport;
import com.epidata.facele.tickets.AccessTicket;
import com.epidata.facele.tickets.AccessTicketMap;
import com.epidata.facele.tickets.WSAALoginProvider.WSType;
import com.epidata.facele.ws.ConnectionProvider;
import com.epidata.facele.ws.arca.ServiceOperations;
import com.epidata.facele.ws.arca.wsfev1.Moneda;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
@Path("monedas")
public class FEMonedasResource extends AbstractResource<T_Monedas> {

    @GET
    public Response findAll() {
        return super.findAll(new T_Monedas(), "MonId", "monedas");
    }

    @GET
    @Path("{id}")
    public Response findOne(@PathParam("id") String p_id) {
        return super.findOne(new T_Monedas(), "MonId", p_id);
    }

    @GET
    @Path("import")
    public Response reimport() {
        try (Connection l_dbConn = ConnectionProvider.getConn();) {

            GlobalConf l_conf = GlobalConf.getInstance();
            AccessTicket l_wsfeTicket = AccessTicketMap.getValidTicketFor(WSType.wsfe,
                    l_conf.m_genericCUIT, l_dbConn, l_conf);

            ServiceOperations l_serviceOperations = new ServiceOperations(l_conf);

            List<Moneda> l_arcaList = l_serviceOperations.execFEParamGetTiposMonedas(l_wsfeTicket);
            AbstractReimporter<T_Monedas, TR_Monedas, Moneda> l_reimporter
                    = new AbstractReimporter<>("monedas") {
                @Override
                public void updateRecord(TR_Monedas p_record, Moneda p_arca) throws Exception {

                    p_record.setMonId(p_arca.getId());
                    p_record.setDescripcion(p_arca.getDesc());
                    p_record.setFchDesde(OrmSupport.xml2Date(p_arca.getFchDesde()));
                    p_record.setFchHasta(OrmSupport.xml2Date(p_arca.getFchHasta()));
                    p_record.setUsoNacional(1);
                    if (p_record.getUsoExportac() == null) {
                        p_record.setUsoExportac(0);
                    } // end if
                }

                @Override
                public boolean canDelete(TR_Monedas p_record) {
                    return p_record.getUsoExportac() != 1;
                }
            };

            return l_reimporter.reimport(l_dbConn, l_reimporter.getEntityName(),
                    l_arcaList, new T_Monedas(),
                    TR_Monedas.class);

        } catch (Exception l_ex) {
            log(l_ex);
            return errResponse(l_ex);
        }
    }

}
