package com.epidata.facele.ws.resources;

import com.epidata.facele.ws.AbstractReimporter;
import com.epidata.facele.conf.GlobalConf;
import com.epidata.facele.entities.TR_FEXDstCuits;
import com.epidata.facele.entities.T_FEXDstCuits;
import static com.epidata.facele.logger.FaceleLogger.log;
import com.epidata.facele.tickets.AccessTicket;
import com.epidata.facele.tickets.AccessTicketMap;
import com.epidata.facele.tickets.WSAALoginProvider.WSType;
import com.epidata.facele.ws.ConnectionProvider;
import com.epidata.facele.ws.arca.ServiceOperations;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXResponseDSTCuit;
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
@Path("fexdstcuits")
public class FEXDestCuitsResource extends AbstractResource<T_FEXDstCuits> {

    @GET
    public Response findAll() {
        return super.findAll(new T_FEXDstCuits(), "IdFEXDstCuit", "fexdstcuits");
    }

    @GET
    @Path("{id}")
    public Response findOne(@PathParam("id") String p_id) {
        return super.findOne(new T_FEXDstCuits(), "IdFEXDstCuit", p_id);
    }

    @GET
    @Path("import")
    public Response reimport() {
        try (Connection l_dbConn = ConnectionProvider.getConn();) {

            GlobalConf l_conf = GlobalConf.getInstance();
            AccessTicket l_wsfexTicket = AccessTicketMap.getValidTicketFor(WSType.wsfex,
                    l_conf.m_genericCUIT, l_dbConn, l_conf);

            ServiceOperations l_serviceOperations = new ServiceOperations(l_conf);

            var l_arcaList = l_serviceOperations.execFEXGetParamDstCuit(l_wsfexTicket);
            AbstractReimporter<T_FEXDstCuits, TR_FEXDstCuits, ClsFEXResponseDSTCuit> l_reimporter
                    = new AbstractReimporter<>("fexdstcuits") {
                @Override
                public void updateRecord(TR_FEXDstCuits p_record,
                        ClsFEXResponseDSTCuit p_arca) throws Exception {

                    p_record.setIdFEXDstCuit(p_arca.getDSTCUIT());
                    p_record.setDescripcion(p_arca.getDSTDs());
                }
            };

            return l_reimporter.reimport(l_dbConn, l_reimporter.getEntityName(),
                    l_arcaList, new T_FEXDstCuits(), TR_FEXDstCuits.class);

        } catch (Exception l_ex) {
            log(l_ex);
            return Response.ok(l_ex.getMessage(), MediaType.TEXT_PLAIN)
                    .status(500).build();
        }
    }

}
