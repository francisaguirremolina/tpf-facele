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
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXResponseMon;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.sql.Connection;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
@Path("fexmonedas")
public class FEXMonedasResource extends AbstractResource<T_Monedas> {

    @GET
    public Response findAll() {
        return super.findAll(new T_Monedas(), "UsoExportac=1", "MonId", "fexmonedas");
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
            AccessTicket l_wsfexTicket = AccessTicketMap.getValidTicketFor(WSType.wsfex,
                    l_conf.m_genericCUIT, l_dbConn, l_conf);

            ServiceOperations l_serviceOperations = new ServiceOperations(l_conf);

            var l_arcaList = l_serviceOperations.execFEXGetParamMon(l_wsfexTicket);
            AbstractReimporter<T_Monedas, TR_Monedas, ClsFEXResponseMon> l_reimporter
                    = new AbstractReimporter<>("fexmonedas") {
                @Override
                public void updateRecord(TR_Monedas p_record, ClsFEXResponseMon p_arca) throws Exception {

                    p_record.setMonId(p_arca.getMonId());
                    p_record.setDescripcion(p_arca.getMonDs());
                    p_record.setFchDesde(OrmSupport.xml2Date(p_arca.getMonVigDesde()));
                    p_record.setFchHasta(OrmSupport.xml2Date(p_arca.getMonVigHasta()));
                    if (p_record.getUsoNacional() == null) {
                        p_record.setUsoNacional(0);
                    } // end if
                    p_record.setUsoExportac(1);
                }

                @Override
                public boolean canDelete(TR_Monedas p_record) {
                    return p_record.getUsoNacional() != 1;
                }

            };

            return l_reimporter.reimport(l_dbConn, l_reimporter.getEntityName(),
                    l_arcaList, new T_Monedas(),
                    TR_Monedas.class);

        } catch (Exception l_ex) {
            log(l_ex);
            return Response.ok(l_ex.getMessage(), MediaType.TEXT_PLAIN)
                    .status(500).build();
        }
    }

}
