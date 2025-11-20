package com.epidata.facele.ws.resources;

import com.epidata.facele.entities.TR_IPCColas;
import com.epidata.facele.entities.T_IPCColas;
import static com.epidata.facele.logger.FaceleLogger.log;
import com.epidata.facele.ws.ConnectionProvider;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.sql.Connection;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
@Path("colas")
public class IPCColasResource extends AbstractResource<T_IPCColas> {

    @GET
    public Response findAll() {
        return super.findAll(new T_IPCColas(), "IdIPCCola", "Colas");
    }

    @GET
    @Path("{id}")
    public Response findOne(@PathParam("id") Integer p_id) {
        return super.findOne(new T_IPCColas(), "IdIPCCola", p_id);
    }

    @GET
    @Path("{quewe}/{action}")
    public Response queweAction(@PathParam("quewe") String p_quewe,
            @PathParam("action") String p_action) {

        if (p_quewe == null) {
            return Response.status(400, "No se indicó el tipo de cola").build();
        } //end if
        if (p_action == null) {
            return Response.status(400, "No se indicó la acción").build();
        } //end if

        try (Connection l_dbConn = ConnectionProvider.getConn();) {
            T_IPCColas p_table = new T_IPCColas();
            p_table.serializeFrom(l_dbConn, "TipoCola='" + p_quewe.toUpperCase() + "'", null);
            if (p_table.getRows().isEmpty()) {
                // No encontrado
                return Response.ok("TipoCola=" + p_quewe, MediaType.TEXT_PLAIN).status(404).build();
            } // end if

            TR_IPCColas l_rec = p_table.getRows().getFirst();
            p_action = p_action.toUpperCase();

            if (p_action.equals("PAUSE") && l_rec.getColaActiva() != 0) {
                l_rec.setColaActiva(0);
                (new T_IPCColas()).executeSPUR(l_dbConn, l_rec);
            } else {
                if (p_action.equals("RESUME") && l_rec.getColaActiva() == 0) {
                    l_rec.setColaActiva(1);
                    (new T_IPCColas()).executeSPUR(l_dbConn, l_rec);
                } // end if
            } // end if

            return Response
                    .ok("OK quewe=" + p_quewe + " action=" + p_action)
                    .build();
        } catch (Exception l_ex) {
            log(l_ex);
            return errResponse(l_ex);
        }

    }

    /**
     * Dummy que recibe la notificación de lote finalizado.
     * Este método deberá ser implementado en TPF, no en el mismo FacEle.
     * 
     * @param p_quewe
     * @param p_action
     * @return 
     */
    @POST
    @Path("{quewe}/{action}")
    public Response batchFinished(@PathParam("quewe") String p_quewe,
            @PathParam("action") String p_action) {

        if (p_quewe == null) {
            return Response.status(400, "No se indicó el tipo de cola").build();
        } //end if
        if (p_action == null) {
            return Response.status(400, "No se indicó la acción").build();
        } //end if

        return Response
                .ok("OK quewe=" + p_quewe + " action=" + p_action)
                .build();

    }
}
