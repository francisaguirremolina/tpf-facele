package com.epidata.facele.ws;

import com.epidata.facele.conf.GlobalConf;
import java.sql.Connection;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public class ConnectionProvider {

    public static Connection getConn() throws Exception {
        GlobalConf l_conf = GlobalConf.getInstance();

        Context l_ctx = new InitialContext();
        DataSource l_ds = (DataSource) l_ctx.lookup(l_conf.m_jndiResource);
        return l_ds.getConnection();
    }

    public static void safeClose(Connection p_toClose) {
        if (p_toClose == null) {
            return;
        } // end if
        try {
            p_toClose.close();
        } catch (Exception l_ex) {
            // Nada por hacer.
        }
    }
}
