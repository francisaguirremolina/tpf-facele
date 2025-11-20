package com.epidata.facele.ws.resources;

import com.epidata.facele.entities.TR_ModeloCopias;
import com.epidata.facele.entities.T_ModeloCopias;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
@Path("modelocopias")
public class ModeloCopiasResource extends AbstractResource<T_ModeloCopias> {

    @GET
    public Response findAll() {
        return super.findAll(new T_ModeloCopias(), "IdCopia", "ModeloCopias");
    }

    @GET
    @Path("{id}")
    public Response findOne(@PathParam("id") Integer p_id) {
        return super.findOne(new T_ModeloCopias(), "IdCopia", p_id);
    }

    @DELETE
    @Path("{id}")
    public Response deleteOne(@PathParam("id") Integer p_id) {
        return super.deleteOne(new T_ModeloCopias(), "IdCopia", p_id);
    }

    @POST
    public Response addOne(String p_input) {
        return super.addOne(new T_ModeloCopias(), new TR_ModeloCopias(), p_input);
    }
    
    @PUT
    public Response updateOne(String p_input) {
        return super.updateOne(new T_ModeloCopias(), new TR_ModeloCopias(), p_input);
    }
    
}
