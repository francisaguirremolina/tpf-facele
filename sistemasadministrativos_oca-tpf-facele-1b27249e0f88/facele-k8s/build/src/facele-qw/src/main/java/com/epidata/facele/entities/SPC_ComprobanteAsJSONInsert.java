/**
ORM function class for: ComprobanteAsJSONInsert
Generated: 2025-10-21 15:27:38
Convierte un comprobante a su representación JSON para ser insertado desde un lote
*/
package com.epidata.facele.entities;

import static com.epidata.facele.orm.OrmSupport.sqlQuote;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Date;
import com.epidata.facele.orm.AbstractFunction;

import com.epidata.facele.orm.ModelException;

public class SPC_ComprobanteAsJSONInsert extends AbstractFunction {

    public static ResultSet execute(Connection p_conn,
            Integer p_IdDocumentoFE) throws Exception {
        String l_IdDocumentoFE = sqlQuote(p_IdDocumentoFE);

            String l_sql = "select * from facele.spc_ComprobanteAsJSONInsert(" + l_IdDocumentoFE + ")";
            if (isDebug()) {
                System.out.println("ORM-DEBUG: " + l_sql);
            } // end if
            try {
            Statement l_stmt = p_conn.createStatement();
            ResultSet l_rs = l_stmt.executeQuery(l_sql);
            return l_rs;
    } catch(Exception l_ex) {
         String l_msg = ModelException.extractUserMsg(l_ex);
         if (l_msg != null) {
             throw new ModelException(l_ex);
         } // end if
         throw l_ex;
    } // end try-catch
    } // end function execute
} // end class
