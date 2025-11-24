package com.epidata.facele.ws.resources;

import com.epidata.facele.ws.AbstractReimporter;
import com.epidata.facele.conf.GlobalConf;
import com.epidata.facele.entities.TR_FEXDstPaises;
import com.epidata.facele.entities.T_FEXDstPaises;
import com.epidata.facele.entities.T_FEXIdiomas;
import static com.epidata.facele.logger.FaceleLogger.log;
import com.epidata.facele.tickets.AccessTicket;
import com.epidata.facele.tickets.AccessTicketMap;
import com.epidata.facele.tickets.WSAALoginProvider.WSType;
import com.epidata.facele.ws.ConnectionProvider;
import com.epidata.facele.ws.arca.ServiceOperations;
import com.epidata.facele.ws.arca.wsfexv1.ClsFEXResponseDSTPais;
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
@Path("fexdstpaises")
public class FEXDestPaisesResource extends AbstractResource<T_FEXDstPaises> {

    @GET
    public Response findAll() {
        return super.findAll(new T_FEXDstPaises(), "IdFEXDstPais", "fexdstpaises");
    }

    @GET
    @Path("{id}")
    public Response findOne(@PathParam("id") String p_id) {
        return super.findOne(new T_FEXDstPaises(), "IdFEXDstPais", p_id);
    }

    @GET
    @Path("import")
    public Response reimport() {
        try (Connection l_dbConn = ConnectionProvider.getConn();) {

            GlobalConf l_conf = GlobalConf.getInstance();
            AccessTicket l_wsfexTicket = AccessTicketMap.getValidTicketFor(WSType.wsfex,
                    l_conf.m_genericCUIT, l_dbConn, l_conf);

            ServiceOperations l_serviceOperations = new ServiceOperations(l_conf);

            var l_arcaList = l_serviceOperations.execFEXGetParamDstPais(l_wsfexTicket);

            AbstractReimporter<T_FEXDstPaises, TR_FEXDstPaises, ClsFEXResponseDSTPais> l_reimporter
                    = new AbstractReimporter<>("fexdstpaises") {
                @Override
                public void updateRecord(TR_FEXDstPaises p_record,
                        ClsFEXResponseDSTPais p_arca) throws Exception {

                    p_record.setIdFEXDstPais(p_arca.getDSTCodigo());
                    p_record.setDescripcion(p_arca.getDSTDs() + " (" 
                            + p_arca.getDSTCodigo() + ")");
                }
            };

            return l_reimporter.reimport(l_dbConn, l_reimporter.getEntityName(),
                    l_arcaList, new T_FEXDstPaises(),
                    TR_FEXDstPaises.class);

        } catch (Exception l_ex) {
            log(l_ex);
            return Response.ok(l_ex.getMessage(), MediaType.TEXT_PLAIN)
                    .status(500).build();
        }
    }

}
