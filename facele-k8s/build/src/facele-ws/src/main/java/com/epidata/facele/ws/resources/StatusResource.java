package com.epidata.facele.ws.resources;

import com.epidata.facele.conf.GlobalConf;
import static com.epidata.facele.logger.FaceleLogger.log;
import static com.epidata.facele.ws.resources.AbstractResource.errResponse;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.io.File;
import java.nio.charset.Charset;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
@Path("status")
public class StatusResource {

    @GET
    @Path("config")
    public Response config() {
        try {
            File l_confFile = new File(GlobalConf.k_CONFIG_FILE_NAME);
            String l_fileContent = FileUtils.readFileToString(l_confFile, Charset.defaultCharset());
            return Response.ok(l_fileContent,
                    MediaType.TEXT_PLAIN).status(200).build();

        } catch (Exception l_ex) {
            log(l_ex);
            return errResponse(l_ex);
        }
    }

    @GET
    @Path("gflog")
    public Response glassfishLog() {
        try {
            File l_confFile = new File("../logs/server.log");
            String l_fileContent = FileUtils.readFileToString(l_confFile, Charset.defaultCharset());
            return Response.ok(l_fileContent,
                    MediaType.TEXT_PLAIN).status(200).build();

        } catch (Exception l_ex) {
            log(l_ex);
            return errResponse(l_ex);
        }
    }

    @GET
    @Path("facelelog")
    public Response faceleLog() {
        try {
            File l_confFile = new File("facele.log");
            String l_fileContent = FileUtils.readFileToString(l_confFile, Charset.defaultCharset());
            return Response.ok(l_fileContent,
                    MediaType.TEXT_PLAIN).status(200).build();

        } catch (Exception l_ex) {
            log(l_ex);
            return errResponse(l_ex);
        }
    }

}
