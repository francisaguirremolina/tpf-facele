package com.epidata.facele.logger;

import com.epidata.facele.conf.GlobalConf;
import static com.epidata.facele.conf.GlobalConf.k_CONFIG_FILE_NAME;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * * @author Gustavo Sbrugnera, para EPIDATA
 */
public class FaceleLogger {

    /**
     *
     */
    public static final String k_LOG_FILE_NAME = "facele.log";
    /**
     *
     */
    public static final DateFormat k_LOG_PREFIX = new SimpleDateFormat(
            "yyyy-MM-dd HH-mm-ss.SSS: ");

    /**
     *
     */
    public static final String k_VERSION = "2025-10-21a";

    /**
     *
     */
    public static GlobalConf m_conf;
    /**
     *
     */
    public static File m_logFile;
    /**
     *
     */
    public static PrintWriter m_logWriter;

    /**
     *
     */
    private static String m_fullLogFileName;

    /**
     *
     * @param p_th
     */
    public static void log(Throwable p_th) {
        if (p_th == null) {
            log("null");
            return;
        } // end if
        log(p_th.getMessage());
        p_th.printStackTrace(m_logWriter);
        if (p_th.getCause() != null) {
            log("Caused by:");
            log(p_th.getCause());
        } // end if
    }

    /**
     *
     * @param p_msg
     */
    public static void log(String p_msg) {
        try {

            if (m_logFile != null) {
                // Verifica el tamaño para frozar rotación de log

                if (m_conf != null && (m_logFile.length() >= m_conf.m_logSize * 1024l)) {
                    m_logWriter.close();
                    DateFormat l_suffix = new SimpleDateFormat(
                            "yyyy-MM-dd-HH-mm-ss");
                    String l_newFileName = k_LOG_FILE_NAME
                            + l_suffix.format(new Date());
                    m_logFile.renameTo(new File(l_newFileName));
                    m_logFile = null; // Fuerza reapertura
                } // end if
            } //end if

            if (m_logFile == null) {
                m_logFile = new File(k_LOG_FILE_NAME);
                m_logWriter = new PrintWriter(new FileWriter(m_logFile, true),
                        true);
            } // end if

            String l_msg = "FACELE: " + k_LOG_PREFIX.format(new Date()) + p_msg;
            m_logWriter.println(l_msg);

            if (GlobalConf.getInstance().m_logStdout) {
                System.out.println(l_msg);
            } // end if
            
        } catch (Exception l_ex) {
            System.out.println(l_ex.getMessage());
            l_ex.printStackTrace();
        }
    }

    /**
     *
     * @param p_obj
     */
    public static void logIfNotNull(Object p_obj) {
        if (p_obj == null) {
            return;
        } // end if
        log(p_obj.toString());
    }

    /**
     * Inicializa el log de eventos
     */
    public static void openLog() {
        log("---------------------------------------------------------------");
        log("FacEle v" + k_VERSION);
        log("Archivo de log: " + m_logFile.getAbsoluteFile());
        log("Archivo de configuración: " + new File(k_CONFIG_FILE_NAME).getAbsoluteFile());
    }

    /**
     *
     * @return
     */
    public static String getFullLogFileName() {
        if (m_fullLogFileName == null) {
            m_fullLogFileName = new File(k_LOG_FILE_NAME).getAbsoluteFile().toString();
        } // end if

        return m_fullLogFileName;
    }
}
