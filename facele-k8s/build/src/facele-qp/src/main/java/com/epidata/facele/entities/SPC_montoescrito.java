/**
ORM function class for: montoescrito
Generated: 2025-10-21 15:27:38
null
*/
package com.epidata.facele.entities;

import static com.epidata.facele.orm.OrmSupport.sqlQuote;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Date;
import com.epidata.facele.orm.AbstractFunction;

import com.epidata.facele.orm.ModelException;

public class SPC_montoescrito extends AbstractFunction {

    public static ResultSet execute(Connection p_conn,
            Long p_centavos) throws Exception {
        String l_centavos = sqlQuote(p_centavos);

            String l_sql = "select * from facele.spc_montoescrito(" + l_centavos + ")";
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
