package com.epidata.facele.ws.resources;

import com.epidata.facele.conf.GlobalConf;
import com.epidata.facele.entities.TR_FECuits;
import com.epidata.facele.entities.T_FECuits;
import static com.epidata.facele.logger.FaceleLogger.log;
import com.epidata.facele.orm.OrmSupport;
import com.epidata.facele.tickets.AccessTicket;
import com.epidata.facele.tickets.AccessTicketMap;
import com.epidata.facele.tickets.WSAALoginProvider.WSType;
import com.epidata.facele.ws.ConnectionProvider;
import com.epidata.facele.ws.arca.ServiceOperations;
import com.epidata.facele.ws.arca.wsfev1.ActividadesTipo;
import com.epidata.facele.ws.arca.wsfev1.PtoVenta;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXResponseActividadTipo;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXResponsePtoVenta;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
@Path("cuits")
public class FECuitsResource extends AbstractResource<T_FECuits> {

    @GET
    public Response findAll() {
        return super.findAll(new T_FECuits(), "Cuit", "cuits");
    }

    @GET
    @Path("{id}")
    public Response findOne(@PathParam("id") Long p_id) {

        return super.findOne(new T_FECuits(), "Cuit", p_id);
    }

    @GET
    @Path("{id}/actividades")
    public Response findActivities(@PathParam("id") Long p_cuit) {
        try (Connection l_dbConn = ConnectionProvider.getConn();) {

            GlobalConf l_conf = GlobalConf.getInstance();
            AccessTicket l_wsfeTicket = AccessTicketMap.getValidTicketFor(WSType.wsfe,
                    p_cuit, l_dbConn, l_conf);

            ServiceOperations l_serviceOperations = new ServiceOperations(l_conf);
            List<ActividadesTipo> l_arcaList = l_serviceOperations
                    .execFEParamGetActividades(l_wsfeTicket);
            String l_jsonContent = OrmSupport.asJSON(l_arcaList);
            return Response
                    .ok(l_jsonContent, MediaType.APPLICATION_JSON_TYPE)
                    .build();

        } catch (Exception l_ex) {
            log(l_ex);
            return errResponse(l_ex);
        }
    }

    @GET
    @Path("{id}/actividadesexp")
    public Response findActivitiesExp(@PathParam("id") Long p_cuit) {
        try (Connection l_dbConn = ConnectionProvider.getConn();) {

            GlobalConf l_conf = GlobalConf.getInstance();
            AccessTicket l_wsfexTicket = AccessTicketMap.getValidTicketFor(WSType.wsfex,
                    p_cuit, l_dbConn, l_conf);

            
            ServiceOperations l_serviceOperations = new ServiceOperations(l_conf);
            List<ClsFEXResponseActividadTipo> l_arcaList = l_serviceOperations
                    .execFEParamGetActividadesExp(l_wsfexTicket);
            String l_jsonContent = OrmSupport.asJSON(l_arcaList);
            return Response
                    .ok(l_jsonContent, MediaType.APPLICATION_JSON_TYPE)
                    .build();

        } catch (Exception l_ex) {
            log(l_ex);
            return errResponse(l_ex);
        }
    }

    @GET
    @Path("{id}/puntosventa")
    public Response findPuntosVenta(@PathParam("id") Long p_cuit) {
        try (Connection l_dbConn = ConnectionProvider.getConn();) {

            GlobalConf l_conf = GlobalConf.getInstance();
            AccessTicket l_wsfeTicket = AccessTicketMap.getValidTicketFor(WSType.wsfe,
                    p_cuit, l_dbConn, l_conf);

            ServiceOperations l_serviceOperations = new ServiceOperations(l_conf);

            List<PtoVenta> l_arcaList = l_serviceOperations
                    .execFEParamGetPtosVenta(l_wsfeTicket);
            String l_jsonContent = OrmSupport.asJSON(l_arcaList);
            return Response
                    .ok(l_jsonContent, MediaType.APPLICATION_JSON_TYPE)
                    .build();

        } catch (Exception l_ex) {
            log(l_ex);
            return errResponse(l_ex);
        }

    }

    @GET
    @Path("{id}/puntosventaexp")
    public Response findPuntosVentaExp(@PathParam("id") Long p_cuit) {
        try (Connection l_dbConn = ConnectionProvider.getConn();) {

            GlobalConf l_conf = GlobalConf.getInstance();
            AccessTicket l_wsfexTicket = AccessTicketMap.getValidTicketFor(WSType.wsfex,
                    p_cuit, l_dbConn, l_conf);

            ServiceOperations l_serviceOperations = new ServiceOperations(l_conf);

            List<ClsFEXResponsePtoVenta> l_arcaList = l_serviceOperations
                    .execFEParamGetPtosVentaExp(l_wsfexTicket);
            String l_jsonContent = OrmSupport.asJSON(l_arcaList);
            return Response
                    .ok(l_jsonContent, MediaType.APPLICATION_JSON_TYPE)
                    .build();

        } catch (Exception l_ex) {
            log(l_ex);
            return errResponse(l_ex);
        }

    }
    
    @DELETE
    @Path("{id}")
    public Response deleteOne(@PathParam("id") Long p_id) {
        return super.deleteOne(new T_FECuits(), "Cuit", p_id);
    }

    @POST
    public Response addOne(String p_input) {
        return super.addOne(new T_FECuits(), new TR_FECuits(), p_input);
    }

    @PUT
    public Response updateOne(String p_input) {
        return super.updateOne(new T_FECuits(), new TR_FECuits(), p_input);
    }

}
