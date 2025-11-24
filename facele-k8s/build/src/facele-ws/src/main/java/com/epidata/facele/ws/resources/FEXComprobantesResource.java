package com.epidata.facele.ws.resources;

import com.epidata.facele.conf.GlobalConf;
import static com.epidata.facele.logger.FaceleLogger.log;
import com.epidata.facele.orm.OrmSupport;
import com.epidata.facele.tickets.AccessTicket;
import com.epidata.facele.tickets.AccessTicketMap;
import com.epidata.facele.tickets.WSAALoginProvider.WSType;
import com.epidata.facele.ws.ConnectionProvider;
import com.epidata.facele.ws.arca.ServiceOperations;
import static com.epidata.facele.ws.resources.AbstractResource.errResponse;
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
@Path("fexcomprobantes")
public class FEXComprobantesResource {

    @GET
    @Path("{cuit}/{cbteTipo}/{ptoVta}/{cbteNro}")
    public Response recover(
            @PathParam("cuit") Long p_cuit,
            @PathParam("cbteTipo") Integer p_cbteTipo,
            @PathParam("ptoVta") Integer p_ptoVta,
            @PathParam("cbteNro") Integer p_cbteNro) {

        try (Connection l_dbConn = ConnectionProvider.getConn();) {

            GlobalConf l_conf = GlobalConf.getInstance();

            ServiceOperations l_serviceOperations = new ServiceOperations(l_conf);
            AccessTicket l_wsfexTicket = AccessTicketMap.getValidTicketFor(WSType.wsfex,
                    p_cuit, l_dbConn, l_conf);

            var l_response = l_serviceOperations
                    .execFEXGetCMP(l_wsfexTicket, p_ptoVta, p_cbteTipo, p_cbteNro);

            String l_jsonContent = OrmSupport.asJSON(l_response);
            return Response
                    .ok(l_jsonContent, MediaType.APPLICATION_JSON_TYPE)
                    .build();

        } catch (Exception l_ex) {
            log(l_ex);
            return errResponse(l_ex);
        }

    }

}
