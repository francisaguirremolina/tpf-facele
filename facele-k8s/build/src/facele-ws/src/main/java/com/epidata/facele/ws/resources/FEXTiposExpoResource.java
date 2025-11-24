package com.epidata.facele.ws.resources;

import com.epidata.facele.ws.AbstractReimporter;
import com.epidata.facele.conf.GlobalConf;
import com.epidata.facele.entities.TR_FEXTiposExpo;
import com.epidata.facele.entities.T_Conceptos;
import com.epidata.facele.entities.T_FEXTiposExpo;
import static com.epidata.facele.logger.FaceleLogger.log;
import com.epidata.facele.orm.OrmSupport;
import com.epidata.facele.tickets.AccessTicket;
import com.epidata.facele.tickets.AccessTicketMap;
import com.epidata.facele.tickets.WSAALoginProvider.WSType;
import com.epidata.facele.ws.ConnectionProvider;
import com.epidata.facele.ws.arca.ServiceOperations;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXResponseTex;
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
@Path("fextiposexpo")
public class FEXTiposExpoResource extends AbstractResource<T_FEXTiposExpo> {

    @GET
    public Response findAll() {
        return super.findAll(new T_FEXTiposExpo(), "IdFEXTipoExpo", "fextiposexpo");
    }

    @GET
    @Path("{id}")
    public Response findOne(@PathParam("id") String p_id) {
        return super.findOne(new T_FEXTiposExpo(), "IdFEXTipoExpo", p_id);
    }
    
    @GET
    @Path("import")
    public Response reimport() {
        try (Connection l_dbConn = ConnectionProvider.getConn();) {

            GlobalConf l_conf = GlobalConf.getInstance();
            AccessTicket l_wsfexTicket = AccessTicketMap.getValidTicketFor(WSType.wsfex,
                    l_conf.m_genericCUIT, l_dbConn, l_conf);

            ServiceOperations l_serviceOperations = new ServiceOperations(l_conf);

            var l_arcaList = l_serviceOperations.execFEXGetParamTipoExpo(l_wsfexTicket);
            
            AbstractReimporter<T_FEXTiposExpo, TR_FEXTiposExpo, ClsFEXResponseTex> l_reimporter
                    = new AbstractReimporter<>("fextiposexpo") {
                @Override
                public void updateRecord(TR_FEXTiposExpo p_record, ClsFEXResponseTex p_arca) throws Exception {
                    
                    p_record.setIdFEXTipoExpo((int)p_arca.getTexId());
                    p_record.setDescripcion(p_arca.getTexDs());
                    p_record.setFchDesde(OrmSupport.xml2Date(p_arca.getTexVigDesde()));
                    p_record.setFchHasta(OrmSupport.xml2Date(p_arca.getTexVigHasta()));
                    
                }
            };

            return l_reimporter.reimport(l_dbConn, l_reimporter.getEntityName(),
                    l_arcaList, new T_FEXTiposExpo(),
                    TR_FEXTiposExpo.class);
            
        } catch (Exception l_ex) {
            log(l_ex);
            return Response.ok(l_ex.getMessage(), MediaType.TEXT_PLAIN)
                    .status(500).build();
        }
    }

}
