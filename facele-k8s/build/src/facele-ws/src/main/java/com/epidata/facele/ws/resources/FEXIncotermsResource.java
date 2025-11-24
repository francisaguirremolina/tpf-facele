package com.epidata.facele.ws.resources;

import com.epidata.facele.ws.AbstractReimporter;
import com.epidata.facele.conf.GlobalConf;
import com.epidata.facele.entities.TR_FEXIncoterms;
import com.epidata.facele.entities.T_FEXIncoterms;
import static com.epidata.facele.logger.FaceleLogger.log;
import com.epidata.facele.orm.OrmSupport;
import com.epidata.facele.tickets.AccessTicket;
import com.epidata.facele.tickets.AccessTicketMap;
import com.epidata.facele.tickets.WSAALoginProvider.WSType;
import com.epidata.facele.ws.ConnectionProvider;
import com.epidata.facele.ws.arca.ServiceOperations;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXResponseInc;
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
@Path("fexincoterms")
public class FEXIncotermsResource extends AbstractResource<T_FEXIncoterms> {

    @GET
    public Response findAll() {
        return super.findAll(new T_FEXIncoterms(), "IdFEXIncoterm", "fexincoterms");
    }

    @GET
    @Path("{id}")
    public Response findOne(@PathParam("id") String p_id) {
        return super.findOne(new T_FEXIncoterms(), "IdFEXIncoterm", p_id);
    }
    
    @GET
    @Path("import")
    public Response reimport() {
        try (Connection l_dbConn = ConnectionProvider.getConn();) {

            GlobalConf l_conf = GlobalConf.getInstance();
            AccessTicket l_wsfexTicket = AccessTicketMap.getValidTicketFor(WSType.wsfex,
                    l_conf.m_genericCUIT, l_dbConn, l_conf);

            ServiceOperations l_serviceOperations = new ServiceOperations(l_conf);

            var l_arcaList = l_serviceOperations.execFEXGetParamIncoterms(l_wsfexTicket);

            AbstractReimporter<T_FEXIncoterms, TR_FEXIncoterms, ClsFEXResponseInc> l_reimporter
                    = new AbstractReimporter<>("fexincoterms") {
                @Override
                public void updateRecord(TR_FEXIncoterms p_record,
                        ClsFEXResponseInc p_arca) throws Exception {

                    p_record.setIdFEXIncoterm(p_arca.getIncId());
                    p_record.setDescripcion(p_arca.getIncDs());
                    p_record.setFchDesde(OrmSupport.xml2Date(p_arca.getIncVigDesde()));
                    p_record.setFchHasta(OrmSupport.xml2Date(p_arca.getIncVigHasta()));
                    
                }
            };

            return l_reimporter.reimport(l_dbConn, l_reimporter.getEntityName(),
                    l_arcaList, new T_FEXIncoterms(),
                    TR_FEXIncoterms.class);
            
        } catch (Exception l_ex) {
            log(l_ex);
            return Response.ok(l_ex.getMessage(), MediaType.TEXT_PLAIN)
                    .status(500).build();
        }
    }

}
