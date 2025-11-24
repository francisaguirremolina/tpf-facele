package com.epidata.facele.etc;

import static com.epidata.facele.logger.FaceleLogger.log;
import java.net.ServerSocket;

/**
 * Bloquea un puerto TCP para garantizar la instancia única.
 */
public class LockPortThread extends Thread {

    /**
     *
     */
    private static ServerSocket m_lockServer;

    private static boolean m_mustClose = false;
    private static int m_lockedPort;

    /**
     *
     * @param p_lockedPort
     */
    public LockPortThread(int p_lockedPort) {
        m_lockedPort = p_lockedPort;
    }

    /**
     *
     */
    @Override
    public void run() {
        m_lockServer = null;
        try {
            m_lockServer = new ServerSocket(m_lockedPort);
            log("Bloqueando puerto TCP " + m_lockedPort + "...");
            m_lockServer.accept();
        } catch (Exception l_ex) {
            if (m_mustClose) {
                return;
            } // end if
            log("Error al intentar bloquear el puerto TCP "
                    + m_lockedPort);
            log(l_ex);
            System.exit(3);
        }
    }

    /**
     *
     */
    public static void unlockPort() {
        m_mustClose = true;
        try {
            if (m_lockServer == null) {
                return;
            } // end if
            m_lockServer.close();
            m_lockServer = null;
        } catch (Exception l_ex) {
            // Nada por hacer.
        }
    }

}
