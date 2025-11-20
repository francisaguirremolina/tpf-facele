package com.epidata.facele.ws.resources;

import com.epidata.facele.ws.AbstractReimporter;
import com.epidata.facele.conf.GlobalConf;
import com.epidata.facele.entities.TR_FEDocTipos;
import com.epidata.facele.entities.T_FEDocTipos;
import static com.epidata.facele.logger.FaceleLogger.log;
import com.epidata.facele.orm.OrmSupport;
import com.epidata.facele.tickets.AccessTicket;
import com.epidata.facele.tickets.AccessTicketMap;
import com.epidata.facele.tickets.WSAALoginProvider.WSType;
import com.epidata.facele.ws.ConnectionProvider;
import com.epidata.facele.ws.arca.ServiceOperations;
import com.epidata.facele.ws.arca.wsfev1.DocTipo;
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
@Path("doctipos")
public class FEDocTiposResource extends AbstractResource<T_FEDocTipos> {

    @GET
    public Response findAll() {
        return super.findAll(new T_FEDocTipos(), "DocTipo", "doctipos");
    } 

    @GET
    @Path("{id}")
    public Response findOne(@PathParam("id") Integer p_id) {
        return super.findOne(new T_FEDocTipos(), "DocTipo", p_id);
    }

    @GET
    @Path("import")
    public Response reimport() {
        try (Connection l_dbConn = ConnectionProvider.getConn();) {

            GlobalConf l_conf = GlobalConf.getInstance();
            AccessTicket l_wsfeTicket = AccessTicketMap.getValidTicketFor(WSType.wsfe,
                    l_conf.m_genericCUIT, l_dbConn, l_conf);

            ServiceOperations l_serviceOperations = new ServiceOperations(l_conf);

            List<DocTipo> l_arcaList = l_serviceOperations.execFEParamGetTiposDoc(l_wsfeTicket);

            AbstractReimporter<T_FEDocTipos, TR_FEDocTipos, DocTipo> l_reimporter
                    = new AbstractReimporter<>("doctipos") {
                @Override
                public void updateRecord(TR_FEDocTipos p_record, DocTipo p_arca) throws Exception {
                    p_record.setDocTipo(p_arca.getId());
                    p_record.setDescripcion(p_arca.getDesc());
                    p_record.setFchDesde(OrmSupport.xml2Date(p_arca.getFchDesde()));
                    p_record.setFchHasta(OrmSupport.xml2Date(p_arca.getFchHasta()));
                }
            };

            return l_reimporter.reimport(l_dbConn, l_reimporter.getEntityName(),
                    l_arcaList, new T_FEDocTipos(),
                    TR_FEDocTipos.class);

        } catch (Exception l_ex) {
            log(l_ex);
            return errResponse(l_ex);
        }
    }

}
