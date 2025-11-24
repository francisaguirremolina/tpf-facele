package com.epidata.facele.ws.resources;

import com.epidata.facele.ws.jsonmodel.TicketResponseModel;
import com.epidata.facele.conf.GlobalConf;
import com.epidata.facele.entities.TR_FECuits;
import com.epidata.facele.entities.T_FECuits;
import static com.epidata.facele.logger.FaceleLogger.log;
import com.epidata.facele.tickets.AccessTicket;
import com.epidata.facele.tickets.AccessTicketMap;
import com.epidata.facele.tickets.WSAALoginProvider.WSType;
import static com.epidata.facele.tickets.WSAALoginProvider.WSType.wscdc;
import com.epidata.facele.ws.ConnectionProvider;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.sql.Connection;
import java.sql.Timestamp;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
@Path("tickets")
public class TicketResource extends AbstractResource<T_FECuits> {

    /**
     * Si encuentra un ticket válido, lo devuelve. Si no encuentra o ticket, o
     * está vencido, solicita y conserva uno nuevo.
     *
     * @param p_cuit
     * @param p_strWSName
     * @return
     */
    @GET
    @Path("{cuit}/{wsname}")
    public Response findOne(@PathParam("cuit") Long p_cuit,
            @PathParam("wsname") String p_strWSName) {

        WSType l_wsType = WSType.valueOf(p_strWSName);

        try (Connection l_dbConn = ConnectionProvider.getConn();) {

            GlobalConf l_conf = GlobalConf.getInstance();
            AccessTicket l_ticket = AccessTicketMap.getValidTicketFor(l_wsType,
                    p_cuit, l_dbConn, l_conf);

            TicketResponseModel l_responseModel = new TicketResponseModel();
            l_responseModel.setWsname(p_strWSName);
            l_responseModel.setSign(l_ticket.getSign());
            l_responseModel.setToken(l_ticket.getToken());
            l_responseModel.setVencimiento(l_ticket.getVencimiento());

            return Response
                    .ok(l_responseModel, MediaType.APPLICATION_JSON_TYPE)
                    .build();

        } catch (Exception l_ex) {
            log(l_ex);
            return errResponse(l_ex);
        }
    }

    /**
     * Si encuentra un ticket válido, lo devuelve. Si no encuentra o ticket, o
     * está vencido, solicita y conserva uno nuevo.
     *
     * @param p_cuit
     * @param p_strWSName
     * @return
     */
    @GET
    @Path("{cuit}/{wsname}/new")
    public Response updateOne(@PathParam("cuit") Long p_cuit,
            @PathParam("wsname") String p_strWSName) {

        // Olvida de memoria y de la base de datos
        WSType l_wsType = WSType.valueOf(p_strWSName);
        AccessTicketMap.forgetTicket(l_wsType, p_cuit);

        try (Connection l_dbConn = ConnectionProvider.getConn();) {

            T_FECuits l_tableCuits = new T_FECuits();
            TR_FECuits l_recCuits = l_tableCuits.getFirstRecord(l_dbConn, "Cuit=" + p_cuit,
                    null, TR_FECuits.class);

            if (l_recCuits == null) {
                // CUIT no encontrado
                throw new Exception("El CUIT " + p_cuit + " no está registrado en la tabla facele.t_FECuits");
            } // end if

            // Borra el ticket anterior
            switch (l_wsType) {
                case wscdc: {
                    l_recCuits.setSignCDC(null);
                    l_recCuits.setTokenCDC(null);
                    l_recCuits.setVencimientoCDC(null);
                }
                break;
                case wsfe: {
                    l_recCuits.setSign(null);
                    l_recCuits.setToken(null);
                    l_recCuits.setVencimiento(null);
                }
                break;
                case wsfex: {
                    l_recCuits.setSignFEX(null);
                    l_recCuits.setTokenFEX(null);
                    l_recCuits.setVencimientoFEX(null);
                }
                break;
            } // end switch
            l_tableCuits.executeSPUR(l_dbConn, l_recCuits);

            Response l_response = findOne(p_cuit, p_strWSName);
            
            return l_response;

        } catch (Exception l_ex) {
            log(l_ex);
            return errResponse(l_ex);
        }
    }

}
