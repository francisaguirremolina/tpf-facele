package com.epidata.facele.ws.resources;

import com.epidata.facele.entities.TR_FEPtosVta;
import com.epidata.facele.entities.T_FEPtosVta;
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
@Path("puntosventa")
public class FEPtosVtaResource extends AbstractResource<T_FEPtosVta> {

    @GET
    public Response findAll() {
        return super.findAll(new T_FEPtosVta(), "IdPtoVta", "puntosventa");
    }

    @GET
    @Path("{id}")
    public Response findOne(@PathParam("id") Integer p_id) {
        return super.findOne(new T_FEPtosVta(), "IdPtoVta", p_id);
    }
    
    @DELETE
    @Path("{id}")
    public Response deleteOne(@PathParam("id") Integer p_id) {
        return super.deleteOne(new T_FEPtosVta(), "IdPtoVta", p_id);
    }
    
    @POST
    public Response addOne(String p_input) {
        return super.addOne(new T_FEPtosVta(), new TR_FEPtosVta(), p_input);
    }

    @PUT
    public Response updateOne(String p_input) {
        return super.addOne(new T_FEPtosVta(), new TR_FEPtosVta(), p_input);
    }
    
}
