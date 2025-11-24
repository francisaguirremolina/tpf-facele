package com.epidata.facele.ws.resources;

import com.epidata.facele.ws.AbstractReimporter;
import com.epidata.facele.conf.GlobalConf;
import com.epidata.facele.entities.TR_Paises;
import com.epidata.facele.entities.T_Paises;
import static com.epidata.facele.logger.FaceleLogger.log;
import com.epidata.facele.tickets.AccessTicket;
import com.epidata.facele.tickets.AccessTicketMap;
import com.epidata.facele.tickets.WSAALoginProvider.WSType;
import com.epidata.facele.ws.ConnectionProvider;
import com.epidata.facele.ws.arca.ServiceOperations;
import com.epidata.facele.ws.arca.wsfev1.PaisTipo;
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
@Path("paises")
public class FEPaisesResource extends AbstractResource<T_Paises> {

    @GET
    public Response findAll() {
        return super.findAll(new T_Paises(), "IdPais", "paises");
    }

    @GET
    @Path("{id}")
    public Response findOne(@PathParam("id") String p_id) {
        return super.findOne(new T_Paises(), "IdPais", p_id);
    }

    @GET
    @Path("import")
    public Response reimport() {
        try (Connection l_dbConn = ConnectionProvider.getConn();) {

            GlobalConf l_conf = GlobalConf.getInstance();
            AccessTicket l_wsfeTicket = AccessTicketMap.getValidTicketFor(WSType.wsfe,
                    l_conf.m_genericCUIT, l_dbConn, l_conf);

            ServiceOperations l_serviceOperations = new ServiceOperations(l_conf);

            List<PaisTipo> l_arcaList = l_serviceOperations.execFEParamGetTiposPaises(l_wsfeTicket);
            AbstractReimporter<T_Paises, TR_Paises, PaisTipo> l_reimporter
                    = new AbstractReimporter<>("paises") {
                @Override
                public void updateRecord(TR_Paises p_record, PaisTipo p_arca) throws Exception {
                    p_record.setIdPais(Integer.valueOf(p_arca.getId()));
                    p_record.setDescripcion(p_arca.getDesc());
                }
            };

            return l_reimporter.reimport(l_dbConn, l_reimporter.getEntityName(),
                    l_arcaList, new T_Paises(),
                    TR_Paises.class);

        } catch (Exception l_ex) {
            log(l_ex);
            return errResponse(l_ex);
        }
    }

}
