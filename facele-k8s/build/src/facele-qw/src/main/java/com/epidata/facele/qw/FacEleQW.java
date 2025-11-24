package com.epidata.facele.qw;

import com.epidata.facele.etc.OpenConnThread;
import com.epidata.facele.etc.LockPortThread;
import com.epidata.facele.etc.QModel;
import static com.epidata.facele.logger.FaceleLogger.log;
import static com.epidata.facele.logger.FaceleLogger.openLog;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public class FacEleQW {

    private static QModel m_model;

    /**
     *
     */
    public static void close() {
        log("Cierre final del proceso.");
        OpenConnThread.closeConn();
        LockPortThread.unlockPort();
        log("-----------------------------------------------------------");
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // Instala el hook que detecta el cierre de la JVM
        Thread l_shutdownHookThread = new Thread() {
            @Override
            public void run() {
                close();
            }

        };
        Runtime.getRuntime().addShutdownHook(l_shutdownHookThread);

        try {
            m_model = new QModel();
            openLog();
        } catch (Exception l_ex) {
            // Si no puede abrir el log, reporta en stderr y sale
            // Reporta en STERR porque en un docker, no se llega ver el error
            System.err.println(l_ex.getMessage());
            l_ex.printStackTrace(System.err);
            System.exit(1);
        } //end try

        try {
            m_model.loadConf();
            new LockPortThread(m_model.m_conf.m_lockedPortQW).start();
            new OpenConnThread().start();
            for (int l_ptoVta : m_model.m_conf.getPtosVtaList()) {
                new QWQueweProcessor(l_ptoVta).start();
            } // end for
        } catch (Exception l_ex) {
            log(l_ex);
            LockPortThread.unlockPort();
            // Reporta en STERR porque en un docker, no se llega ver el error
            System.err.println(l_ex.getMessage());
            l_ex.printStackTrace(System.err);
            System.exit(2);
        }
    }

}
