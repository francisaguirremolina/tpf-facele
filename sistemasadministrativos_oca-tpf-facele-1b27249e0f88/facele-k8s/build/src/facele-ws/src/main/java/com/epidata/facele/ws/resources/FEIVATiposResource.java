package com.epidata.facele.ws.resources;

import com.epidata.facele.ws.AbstractReimporter;
import com.epidata.facele.conf.GlobalConf;
import com.epidata.facele.entities.TR_FEIVATipos;
import com.epidata.facele.entities.T_FEIVATipos;
import static com.epidata.facele.logger.FaceleLogger.log;
import com.epidata.facele.orm.OrmSupport;
import com.epidata.facele.tickets.AccessTicket;
import com.epidata.facele.tickets.AccessTicketMap;
import com.epidata.facele.tickets.WSAALoginProvider.WSType;
import com.epidata.facele.ws.ConnectionProvider;
import com.epidata.facele.ws.arca.ServiceOperations;
import com.epidata.facele.ws.arca.wsfev1.IvaTipo;
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
@Path("ivatipos")
public class FEIVATiposResource extends AbstractResource<T_FEIVATipos> {

    @GET
    public Response findAll() {
        return super.findAll(new T_FEIVATipos(), "CodAlicIVA", "ivatipos");
    }

    @GET
    @Path("{id}")
    public Response findOne(@PathParam("id") Integer p_id) {
        return super.findOne(new T_FEIVATipos(), "CodAlicIVA", p_id);
        
    }

    @GET
    @Path("import")
    public Response reimport() {
        try (Connection l_dbConn = ConnectionProvider.getConn();) {
            
            GlobalConf l_conf = GlobalConf.getInstance();
            AccessTicket l_wsfeTicket = AccessTicketMap.getValidTicketFor(WSType.wsfe,
                    l_conf.m_genericCUIT, l_dbConn, l_conf);

            ServiceOperations l_serviceOperations = new ServiceOperations(l_conf);

            List<IvaTipo> l_arcaList = l_serviceOperations.execFEParamGetTiposIva(l_wsfeTicket);

            AbstractReimporter<T_FEIVATipos, TR_FEIVATipos, IvaTipo> l_reimporter
                    = new AbstractReimporter<>("ivatipos") {
                @Override
                public void updateRecord(TR_FEIVATipos p_record, IvaTipo p_arca) throws Exception {
                    p_record.setCodAlicIVA(Integer.valueOf(p_arca.getId()));
                    String l_alic = p_arca.getDesc().replace("%", "");
                    p_record.setAlicuota(Double.valueOf(l_alic));
                    p_record.setDescripcion(p_arca.getDesc());
                    p_record.setFchDesde(OrmSupport.xml2Date(p_arca.getFchDesde()));
                    p_record.setFchHasta(OrmSupport.xml2Date(p_arca.getFchHasta()));
                }
            };

            return l_reimporter.reimport(l_dbConn, l_reimporter.getEntityName(),
                    l_arcaList, new T_FEIVATipos(),
                    TR_FEIVATipos.class);
            
        } catch (Exception l_ex) {
            log(l_ex);
            return errResponse(l_ex);
        }
    }

}
