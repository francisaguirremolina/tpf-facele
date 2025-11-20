package com.epidata.facele.ws.resources;

import com.epidata.facele.ws.AbstractReimporter;
import com.epidata.facele.conf.GlobalConf;
import com.epidata.facele.entities.TR_FECondIvaReceptores;
import com.epidata.facele.entities.T_FECondIvaReceptores;
import static com.epidata.facele.logger.FaceleLogger.log;
import com.epidata.facele.tickets.AccessTicket;
import com.epidata.facele.tickets.AccessTicketMap;
import com.epidata.facele.tickets.WSAALoginProvider.WSType;
import com.epidata.facele.ws.ConnectionProvider;
import com.epidata.facele.ws.arca.ServiceOperations;
import com.epidata.facele.ws.arca.wsfev1.CondicionIvaReceptor;
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
@Path("ivareceptores")
public class FECondIVAReceptoresResource extends AbstractResource<T_FECondIvaReceptores> {

    @GET
    public Response findAll() {
        return super.findAll(new T_FECondIvaReceptores(), "CodCondIva", "ivareceptores");
    }

    @GET
    @Path("{id}")
    public Response findOne(@PathParam("id") Integer p_id) {
        return super.findOne(new T_FECondIvaReceptores(), "CodCondIva", p_id);

    }

    @GET
    @Path("import")
    public Response reimport() {

        try (Connection l_dbConn = ConnectionProvider.getConn();) {

            GlobalConf l_conf = GlobalConf.getInstance();
            AccessTicket l_wsfeTicket = AccessTicketMap.getValidTicketFor(WSType.wsfe,
                    l_conf.m_genericCUIT, l_dbConn, l_conf);

            ServiceOperations l_serviceOperations = new ServiceOperations(l_conf);

            List<CondicionIvaReceptor> l_arcaList = l_serviceOperations.execFEParamGetCondicionIvaReceptor(l_wsfeTicket);

            AbstractReimporter<T_FECondIvaReceptores, TR_FECondIvaReceptores, CondicionIvaReceptor> l_reimporter
                    = new AbstractReimporter<>("ivareceptores") {
                @Override
                public void updateRecord(TR_FECondIvaReceptores p_record, CondicionIvaReceptor p_arca) throws Exception {
                    p_record.setCmpClase(p_arca.getCmpClase());
                    p_record.setCodCondIva(p_arca.getId());
                    p_record.setDescripcion(p_arca.getDesc());
                }
            };

            return l_reimporter.reimport(l_dbConn, l_reimporter.getEntityName(),
                    l_arcaList, new T_FECondIvaReceptores(),
                    TR_FECondIvaReceptores.class);

        } catch (Exception l_ex) {
            log(l_ex);
            return errResponse(l_ex);
        }

    }

}
