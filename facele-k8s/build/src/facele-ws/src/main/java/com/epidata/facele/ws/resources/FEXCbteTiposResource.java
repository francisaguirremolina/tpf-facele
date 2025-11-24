package com.epidata.facele.ws.resources;

import com.epidata.facele.ws.AbstractReimporter;
import com.epidata.facele.conf.GlobalConf;
import com.epidata.facele.entities.TR_FECbteTipos;
import com.epidata.facele.entities.T_FECbteTipos;
import static com.epidata.facele.logger.FaceleLogger.log;
import com.epidata.facele.orm.OrmSupport;
import com.epidata.facele.tickets.AccessTicket;
import com.epidata.facele.tickets.AccessTicketMap;
import com.epidata.facele.tickets.WSAALoginProvider.WSType;
import com.epidata.facele.ws.ConnectionProvider;
import com.epidata.facele.ws.arca.ServiceOperations;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXResponseCbteTipo;
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
@Path("fexcbtetipos")
public class FEXCbteTiposResource extends AbstractResource<T_FECbteTipos> {

    @GET
    public Response findAll() {
        return super.findAll(new T_FECbteTipos(), "UsoExportac=1", "CbteTipo", "fexcbtetipos");
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
            AccessTicket l_wsfexTicket = AccessTicketMap.getValidTicketFor(WSType.wsfex,
                    l_conf.m_genericCUIT, l_dbConn, l_conf);

            ServiceOperations l_serviceOperations = new ServiceOperations(l_conf);

            var l_arcaList = l_serviceOperations.execFEXGetParamCbteTipo(l_wsfexTicket);
            
            AbstractReimporter<T_FECbteTipos, TR_FECbteTipos, ClsFEXResponseCbteTipo> l_reimporter
                    = new AbstractReimporter<>("fexcbtetipos") {
                @Override
                public void updateRecord(TR_FECbteTipos p_record, ClsFEXResponseCbteTipo p_arca) throws Exception {
                    p_record.setCbteTipo((int)p_arca.getCbteId());
                    p_record.setDescripcion(p_arca.getCbteDs());
                    p_record.setFchDesde(OrmSupport.xml2Date(p_arca.getCbteVigDesde()));
                    p_record.setFchHasta(OrmSupport.xml2Date(p_arca.getCbteVigHasta()));
                    if (p_record.getUsoNacional() == null) {
                        p_record.setUsoNacional(0);
                    } // end if
                    p_record.setUsoExportac(1);
                }

                @Override
                public boolean canDelete(TR_FECbteTipos p_record) {
                    return p_record.getUsoNacional() != 1;
                }

            };

            return l_reimporter.reimport(l_dbConn, l_reimporter.getEntityName(),
                    l_arcaList, new T_FECbteTipos(),
                    TR_FECbteTipos.class);


        } catch (Exception l_ex) {
            log(l_ex);
            return Response.ok(l_ex.getMessage(), MediaType.TEXT_PLAIN)
                    .status(500).build();
        }
    }

}
