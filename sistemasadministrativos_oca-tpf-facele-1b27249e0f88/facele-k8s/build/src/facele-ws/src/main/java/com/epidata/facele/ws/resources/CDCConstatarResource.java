package com.epidata.facele.ws.resources;

import com.epidata.facele.conf.GlobalConf;
import static com.epidata.facele.logger.FaceleLogger.log;
import com.epidata.facele.orm.OrmSupport;
import com.epidata.facele.tickets.AccessTicket;
import com.epidata.facele.tickets.AccessTicketMap;
import com.epidata.facele.tickets.WSAALoginProvider.WSType;
import com.epidata.facele.ws.ConnectionProvider;
import com.epidata.facele.ws.arca.ServiceOperations;
import com.epidata.facele.ws.arca.wscdc.CmpResponse;
import static com.epidata.facele.ws.resources.AbstractResource.errResponse;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.sql.Connection;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
@Path("cdc")
public class CDCConstatarResource {

    @GET
    @Path("constatar")
    public Response constatar(
            @QueryParam("CbteModo") String p_cbteModo,
            @QueryParam("CuitEmisor") long p_cuitEmisor,
            @QueryParam("PtoVta") int p_ptoVta,
            @QueryParam("CbteTipo") int p_cbteTipo,
            @QueryParam("CbteNro") long p_cbteNro,
            @QueryParam("CbteFch") String p_cbteFch,
            @QueryParam("ImpTotal") double p_impTotal,
            @QueryParam("CodAutorizacion") String p_codAutorizacion,
            @QueryParam("DocTipoReceptor") int p_docTipoReceptor,
            @QueryParam("DocNroReceptor") long p_docNroReceptor
    ) {
        try (Connection l_dbConn = ConnectionProvider.getConn();) {

            GlobalConf l_conf = GlobalConf.getInstance();

            ServiceOperations l_serviceOperations = new ServiceOperations(l_conf);
            AccessTicket l_wsfeTicket = AccessTicketMap.getValidTicketFor(WSType.wscdc,
                    l_conf.getGenericCuit(), l_dbConn, l_conf);

            CmpResponse l_response = l_serviceOperations.execCDCConstatar(
                    l_wsfeTicket, p_cbteModo, p_cuitEmisor, p_ptoVta, 
                    p_cbteTipo, p_cbteNro, p_cbteFch, p_impTotal, 
                    p_codAutorizacion, p_docTipoReceptor, 
                    p_docNroReceptor);
            
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
