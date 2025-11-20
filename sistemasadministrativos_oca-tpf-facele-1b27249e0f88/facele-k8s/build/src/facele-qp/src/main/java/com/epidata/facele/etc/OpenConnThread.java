package com.epidata.facele.etc;

import static com.epidata.facele.etc.QModel.m_conf;
import static com.epidata.facele.etc.QModel.m_conn;
import static com.epidata.facele.etc.SafeDelayTool.safeDelay;
import static com.epidata.facele.logger.FaceleLogger.log;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public class OpenConnThread extends Thread {
    /**
     *
     */
    public static void closeConn() {
        try {
            if (m_conn == null) {
                return;
            } // end if
            m_conn.close();
        } catch (Exception l_ex) {
            // Nada que reportar
        }
    }

    private static void reopenConn() {
        try {
            if (m_conn != null && !m_conn.isClosed()) {
                return;
            } // end if

            log("Reabriendo conexión " + m_conf.m_jdbcUrl);
            Class.forName(m_conf.m_jdbcDriver);
            m_conn = java.sql.DriverManager.getConnection(m_conf.m_jdbcUrl,
                    m_conf.m_jdbcUser, m_conf.m_jdbcPassword);
        } catch (Exception l_ex) {
            log("Error al intentar abrir la conexión " + m_conf.m_jdbcUrl);
            log(l_ex);
            m_conn = null;
        }
    }
    /**
     *
     */
    @Override
    public void run() {
        while (true) {
            reopenConn();
            safeDelay(2000);
        } // end while
    }
}
