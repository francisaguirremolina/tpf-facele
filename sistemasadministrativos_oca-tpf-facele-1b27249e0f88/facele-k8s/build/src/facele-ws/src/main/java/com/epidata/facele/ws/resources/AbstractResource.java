package com.epidata.facele.ws.resources;

import static com.epidata.facele.logger.FaceleLogger.log;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.AbstractRelation;
import com.epidata.facele.orm.AbstractTable;
import com.epidata.facele.orm.OrmSupport;
import com.epidata.facele.ws.ConnectionProvider;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.sql.Connection;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 * @param <TABLE>
 */
public class AbstractResource<TABLE extends AbstractTable> {

    public Response findAll(TABLE p_table, String p_orderBy, String p_publicName) {
        return findAll(p_table, null, p_orderBy, p_publicName);
    }

    public Response findAll(TABLE p_table, String p_whereExpr, String p_orderBy, String p_publicName) {
        try (Connection l_dbConn = ConnectionProvider.getConn();) {

            p_table.serializeFrom(l_dbConn, p_whereExpr, p_orderBy);
            String l_jsonContent = OrmSupport.asJSON(p_publicName, p_table);
            return Response
                    .ok(l_jsonContent, MediaType.APPLICATION_JSON_TYPE)
                    .build();
        } catch (Exception l_ex) {
            log(l_ex);
            return Response.ok(l_ex.getMessage(),
                    MediaType.TEXT_PLAIN).status(500).build();
        }
    }

    public Response findOne(AbstractRelation p_table,
            String p_pkName,
            Object p_id) {
        if (p_id == null) {
            return Response.ok("BAD REQUEST missing Id param",
                    MediaType.TEXT_PLAIN).status(400).build();
        } // end if
        try (Connection l_dbConn = ConnectionProvider.getConn();) {
            p_table.serializeFrom(l_dbConn, p_pkName + "='" + p_id + "'", null);
            if (p_table.getRows().isEmpty()) {
                // No encontrado
                return Response.ok("NOT-FOUND id=" + p_id + " @" + p_table.getSqlName(),
                        MediaType.TEXT_PLAIN).status(404).build();
            } // end if

            AbstractRecord l_rec = (AbstractRecord) (p_table.getRows().getFirst());

            String l_jsonContent = OrmSupport.asJSON(l_rec);
            return Response
                    .ok(l_jsonContent, MediaType.APPLICATION_JSON_TYPE)
                    .build();

        } catch (Exception l_ex) {
            log(l_ex);
            return Response.ok(l_ex.getMessage(), MediaType.TEXT_PLAIN).status(500).build();
        }
    }

    public Response deleteOne(AbstractTable p_table,
            String p_pkName,
            Object p_id) {
        if (p_id == null) {
            return Response.ok("BAD REQUEST missing Id param",
                    MediaType.TEXT_PLAIN).status(400).build();
        } // end if
        try (Connection l_dbConn = ConnectionProvider.getConn();) {
            p_table.serializeFrom(l_dbConn, p_pkName + "='" + p_id + "'", null);
            if (p_table.getRows().isEmpty()) {
                // No encontrado
                return Response.ok("NOT-FOUND id=" + p_id + " @" + p_table.getSqlName(),
                        MediaType.TEXT_PLAIN).status(404).build();
            } // end if

            p_table.executeSPD(l_dbConn, p_id);

            return Response
                    .ok("DELETED " + p_id)
                    .build();

        } catch (Exception l_ex) {
            log(l_ex);
            return Response.ok(l_ex.getMessage(),
                    MediaType.TEXT_PLAIN).status(500).build();
        }
    }

    public Response addOne(
            AbstractTable p_table,
            AbstractRecord p_row,
            String p_input) {
        try (Connection l_dbConn = ConnectionProvider.getConn();) {

            p_row = OrmSupport.fromJSON(p_input, p_row);

            p_table.executeSPIR(l_dbConn, p_row);

            String l_jsonContent = OrmSupport.asJSON(p_row);
            return Response
                    .ok(l_jsonContent, MediaType.APPLICATION_JSON_TYPE)
                    .build();

        } catch (Exception l_ex) {
            log(l_ex);
            return Response.ok(l_ex.getMessage(),
                    MediaType.TEXT_PLAIN).status(500).build();
        }

    }

    public Response updateOne(
            AbstractTable p_table,
            AbstractRecord p_row,
            String p_input) {
        try (Connection l_dbConn = ConnectionProvider.getConn();) {
            p_row = OrmSupport.fromJSON(p_input, p_row);

            p_table.executeSPUR(l_dbConn, p_row);

            String l_jsonContent = OrmSupport.asJSON(p_row);
            return Response
                    .ok(l_jsonContent, MediaType.APPLICATION_JSON_TYPE)
                    .build();

        } catch (Exception l_ex) {
            log(l_ex);
            return Response.ok(l_ex.getMessage(),
                    MediaType.TEXT_PLAIN).status(500).build();
        }

    }

    public static Response errResponse(Exception p_ex) {
        return errResponse(p_ex, 500); // default: internal server error
    }
    
    public static Response errResponse(Exception p_ex, int p_httpCode) {
        return Response.ok(p_ex.getMessage(), MediaType.TEXT_PLAIN)
                .status(p_httpCode).build();
    }
    
}
