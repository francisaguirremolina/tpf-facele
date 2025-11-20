package com.epidata.facele.ws.resources;

import com.epidata.facele.conf.GlobalConf;
import static com.epidata.facele.logger.FaceleLogger.log;
import com.epidata.facele.ws.arca.ServiceOperations;
import com.epidata.facele.ws.arca.wsfev1.DummyResponse;
import static com.epidata.facele.ws.resources.AbstractResource.errResponse;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
@Path("dummy")
public class FEDummyResource {

    @GET
    public Response dummy() {
        log("WSFE Dummy...");
        try {
            GlobalConf l_conf = GlobalConf.getInstance();

            ServiceOperations l_serviceOperations = new ServiceOperations(l_conf);
            DummyResponse l_resp = l_serviceOperations.execFEDummy();

            log("WSFE Dummy APP=" + l_resp.getAppServer() + ", AUTH="
                    + l_resp.getAuthServer() + ", DB=" + l_resp.getDbServer());

            return Response
                    .ok(l_resp)
                    .build();
        } catch (Exception l_ex) {
            log(l_ex);
            return errResponse(l_ex);
        }
    }

}
