package com.epidata.facele.etc;

import com.epidata.facele.conf.GlobalConf;
import static com.epidata.facele.conf.GlobalConf.k_CONFIG_FILE_NAME;
import com.epidata.facele.entities.TR_FECbteTipos;
import com.epidata.facele.entities.TR_FEPtosVta;
import com.epidata.facele.entities.T_FECbteTipos;
import com.epidata.facele.entities.T_FEPtosVta;
import static com.epidata.facele.logger.FaceleLogger.log;
import java.io.File;
import java.io.FileReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public class QModel {

    /**
     *
     * @throws Exception
     */
    public QModel() throws Exception {
    }

    /**
     *
     */
    public static GlobalConf m_conf;
    /**
     *
     */
    public static java.sql.Connection m_conn;

    /**
     *
     */
    public static File m_logFile;

    /**
     * Momento en que se reconstruyó el cache indicado
     */
    private static Map<String, Date> m_lastCached = new HashMap<>();

    /**
     * Cache de puntos de venta
     */
    private static Map<Integer, TR_FEPtosVta> m_ptosVta;

    /**
     * Cache de tipos de comprobantes
     */
    private static Map<Integer, TR_FECbteTipos> m_cbteTipos;

    private synchronized  static boolean mustReload(String p_tableName) {
        Date l_lastCached = m_lastCached.get(p_tableName);
        if (l_lastCached == null) {
            // Nunca se construyó el cache. 
            return true;
        } // end if

        if (l_lastCached.getTime() < new Date().getTime() + 30000) {
            // El cache se construyó hace más de 30 segundos. Relee.
            return true;
        } // end if
        
        return false;
    }

    /**
     *
     * @param p_idPtoVta
     * @return
     * @throws Exception
     */
    public synchronized static TR_FEPtosVta getPtoVta(int p_idPtoVta) throws Exception {
        if (mustReload("TR_FEPtosVta")) {
            // Olvida
            m_ptosVta = null;
        } // end if
        
        if (m_ptosVta == null) {
            log("Reconstruyendo cache de puntos de venta...");
            m_ptosVta = new HashMap<>();
            T_FEPtosVta l_table = new T_FEPtosVta(m_conn,
                    null, null);

            for (TR_FEPtosVta l_row : l_table.getRows()) {
                int l_idPtoVta = l_row.getIdPtoVta();
                m_ptosVta.put(l_idPtoVta, l_row);
            } // end for
            m_lastCached.put("TR_FEPtosVta", new Date());
        } // end if
        return m_ptosVta.get(p_idPtoVta);
    }

    /**
     *
     * @param p_cbteTipo
     * @return @throws Exception
     * @throws java.lang.Exception
     */
    public synchronized  static TR_FECbteTipos getCbteTipo(int p_cbteTipo) throws Exception {
        if (mustReload("TR_FECbteTipos")) {
            // Olvida
            m_cbteTipos = null;
        } // end if
        
        if (m_cbteTipos == null) {
            log("Reconstruyendo cache de tipos de comprobantes...");
            m_cbteTipos = new HashMap<>();
            T_FECbteTipos l_table = new T_FECbteTipos(m_conn,
                    null, null);

            for (TR_FECbteTipos l_row : l_table.getRows()) {
                int l_cbteTipo = l_row.getCbteTipo();
                m_cbteTipos.put(l_cbteTipo, l_row);
            } // end for
            m_lastCached.put("TR_FECbteTipos", new Date());
        } // end if
        return m_cbteTipos.get(p_cbteTipo);
    }

    /**
     *
     * @throws Exception
     */
    public void loadConf() throws Exception {
        File l_propFile = new File(k_CONFIG_FILE_NAME);

        if (!l_propFile.exists()) {
            throw new Exception(
                    "Archivo de configuración general no encontrado: "
                    + l_propFile);
        } // end if
        Properties l_props = new Properties();
        l_props.load(new FileReader(l_propFile));

        m_conf = new GlobalConf(l_props);

    }

}
