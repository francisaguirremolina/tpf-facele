package com.epidata.facele.ws.resources;

import com.epidata.facele.conf.GlobalConf;
import com.epidata.facele.entities.TR_FECotizMonedas;
import com.epidata.facele.entities.T_FECotizMonedas;
import static com.epidata.facele.logger.FaceleLogger.log;
import com.epidata.facele.orm.OrmSupport;
import com.epidata.facele.tickets.AccessTicket;
import com.epidata.facele.tickets.AccessTicketMap;
import com.epidata.facele.tickets.WSAALoginProvider.WSType;
import com.epidata.facele.ws.ConnectionProvider;
import com.epidata.facele.ws.arca.ServiceOperations;
import com.epidata.facele.ws.arca.wsfev1.Cotizacion;
import static com.epidata.facele.ws.resources.AbstractResource.errResponse;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
@Path("cotizmonedas")
public class FECotizMonedasResource extends AbstractResource<T_FECotizMonedas> {

    @GET
    public Response findAll() {
        return super.findAll(new T_FECotizMonedas(), "IdCotizMoneda", "cotizmonedas");
    }

    @GET
    @Path("{monid}/{fechacotiz}")
    public Response findOne(@PathParam("monid") String p_monId,
            @PathParam("fechacotiz") String p_strFechaCotiz) {
        try (Connection l_dbConn = ConnectionProvider.getConn();) {

            Date l_fechaCotiz = new SimpleDateFormat("yyyy-MM-dd").parse(p_strFechaCotiz);

            String l_sqlWhere = "MonId=" + OrmSupport.sqlQuote(p_monId)
                    + " AND FechaCotiz=" + OrmSupport.sqlQuote(l_fechaCotiz);

            T_FECotizMonedas l_table = new T_FECotizMonedas();
            TR_FECotizMonedas l_rec = l_table.getFirstRecord(l_dbConn,
                    l_sqlWhere, null, TR_FECotizMonedas.class);

            if (l_rec == null) {
                // Cotización no encontrada. Busca en ARCA
                log("Consultando en ARCA la cotización de la moneda " + p_monId + " fecha " + p_strFechaCotiz);
                GlobalConf l_conf = GlobalConf.getInstance();

                ServiceOperations l_serviceOperations = new ServiceOperations(l_conf);
                AccessTicket l_wsfeTicket = AccessTicketMap.getValidTicketFor(WSType.wsfe,
                        l_conf.m_genericCUIT, l_dbConn, l_conf);

                Cotizacion l_cotizacion = l_serviceOperations
                        .execFEParamGetCotizacion(l_wsfeTicket, p_monId, l_fechaCotiz);
                log("Cotización de la moneda " + p_monId + " fecha " + p_strFechaCotiz + ": " + l_cotizacion.getMonCotiz());

                l_rec = new TR_FECotizMonedas();
                l_rec.setMonId(l_cotizacion.getMonId());
                l_rec.setFechaCotiz(l_fechaCotiz);
                l_rec.setMonCotiz(l_cotizacion.getMonCotiz());

                l_table.executeSPIR(l_dbConn, l_rec);
            } // end if

            String l_jsonContent = OrmSupport.asJSON(l_rec);
            return Response
                    .ok(l_jsonContent, MediaType.APPLICATION_JSON_TYPE)
                    .build();

        } catch (Exception l_ex) {
            log(l_ex);
            return errResponse(l_ex);
        }

    }

}
