package com.epidata.facele.qp;

import com.epidata.facele.entities.TR_FECbteTipos;
import com.epidata.facele.entities.T_FECbteTipos;
import com.epidata.facele.etc.QModel;
import static com.epidata.facele.logger.FaceleLogger.log;
import com.epidata.facele.repodriver.AbstractRepoDriver;
import com.epidata.facele.repodriver.FilesystemRepoDriver;
import com.epidata.facele.repodriver.MinIORepoDriver;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public class QPModel extends QModel {

    /**
     *
     * @throws Exception
     */
    public QPModel() throws Exception {
        super();
    }

    /**
     * Cache de tipos de comprobantes
     */
    private static Map<Integer, TR_FECbteTipos> m_cbteTipos;
    /**
     * Cache de plantillas de reportes
     */
    private static Map<String, JasperReport> m_reports = new HashMap<>();

    /**
     * 
     */
    private static AbstractRepoDriver m_repoDriver;
    
    /**
     *
     * @param p_cbteTipo
     * @return
     * @throws Exception
     */
    public synchronized static TR_FECbteTipos getCbteTipo(int p_cbteTipo) throws Exception {
        if (m_cbteTipos == null) {
            log("Reconstruyendo cache de tipos de documentos...");
            m_cbteTipos = new HashMap<>();
            T_FECbteTipos l_table = new T_FECbteTipos(QModel.m_conn,
                    null, null);

            for (TR_FECbteTipos l_row : l_table.getRows()) {
                int l_cbteTipo = l_row.getCbteTipo();
                m_cbteTipos.put(l_cbteTipo, l_row);

            } // end for
        } // end if
        return m_cbteTipos.get(p_cbteTipo);
    }

    /**
     *
     * @param p_reportFile
     * @return
     * @throws Exception
     */
    public static JasperReport getReport(File p_reportFile) throws Exception {

        JasperReport l_toReturn = m_reports.get(p_reportFile.toString());
        if (l_toReturn == null) {
            l_toReturn = (JasperReport) JRLoader.loadObject(
                    p_reportFile);
            m_reports.put(p_reportFile.toString(), l_toReturn);
        } // end if

        return l_toReturn;
    }

    /**
     *
     * @return
     */
    public static AbstractRepoDriver getRepoDriver() {
        if (m_repoDriver == null) {
            m_repoDriver = makeRepoDriver();
        } // end if
        return m_repoDriver;
        
    }
    private static AbstractRepoDriver makeRepoDriver() {
        if (m_conf.m_s3Support) {
            MinIORepoDriver l_toReturn = new MinIORepoDriver(m_conf.m_pdfDir);
            l_toReturn.setBucket(m_conf.m_s3Bucket);
            l_toReturn.setPass(m_conf.m_s3Password);
            l_toReturn.setUrl(m_conf.m_s3URL);
            l_toReturn.setUser(m_conf.m_s3User);

            return l_toReturn;
        } else {
            FilesystemRepoDriver l_toReturn = new FilesystemRepoDriver(m_conf.m_pdfDir);
            return l_toReturn;
        } // end if
    }
}
