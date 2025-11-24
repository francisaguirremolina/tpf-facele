package com.epidata.facele.etc;

import com.epidata.facele.entities.TR_IPCColas;
import com.epidata.facele.entities.T_IPCColas;
import java.sql.Connection;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public abstract class AbstractQueweProcessor extends Thread {

    /**
     *
     */
    public static int INACTIVE_DELAY = 2000;

    /**
     * Última vez que se consultó a la base de datos, el estado de la cola
     */
    private static long m_lastActiveQuery = 0;
    private static boolean m_lastActiveResponse = false;

    /**
     *
     * @param p_conn
     * @param p_queweType
     * @return
     * @throws Exception
     */
    protected static synchronized boolean isActiveQuewe(Connection p_conn, String p_queweType) throws Exception {

        if (System.currentTimeMillis() < m_lastActiveQuery + INACTIVE_DELAY) {
            // Demasiado pronto para preguntar de nuevo. Responde la última respuesta.
            return m_lastActiveResponse;
        } // end if

        T_IPCColas l_queweTable = new T_IPCColas();
        TR_IPCColas l_rowTable = l_queweTable
                .getFirstRecord(p_conn, "TipoCola='" + p_queweType + "'",
                        null, TR_IPCColas.class);
        if (l_rowTable == null) {
            throw new Exception("Cola " + p_queweType + " no configurada en la tabla facele.t_IPCColas");
        } // end if
        m_lastActiveQuery = System.currentTimeMillis();
        m_lastActiveResponse = l_rowTable.getColaActiva() != 0;
        return m_lastActiveResponse;
    }

    private final int m_idPtoVta;

    /**
     *
     */
    protected QueweResponse m_qResponse;

    /**
     *
     * @param p_idPtoVta
     */
    public AbstractQueweProcessor(int p_idPtoVta) {
        this.m_idPtoVta = p_idPtoVta;
    }

    /**
     * Get the value of idPtoVta
     *
     * @return the value of idPtoVta
     */
    public int getIdPtoVta() {
        return m_idPtoVta;
    }

    /**
     *
     */
    @Override
    public void run() {
        mainLoop();
    }

    /**
     *
     */
    protected abstract void mainLoop();

}
