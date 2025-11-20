package com.epidata.facele.conf;

import java.io.File;
import java.io.FileReader;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Properties;

/**
 *
 * * @author Gustavo Sbrugnera, para EPIDATA
 */
public class GlobalConf {

    /**
     *
     */
    public static final String k_CONFIG_FILE_NAME = "facele.properties";

    /**
     *
     */
    private static String m_fullConfFileName;

    /**
     *
     */
    private static GlobalConf m_me;

    /**
     *
     * @return @throws Exception
     * @throws java.lang.Exception
     */
    public static GlobalConf getInstance() throws Exception {
        if (m_me != null) {
            return m_me;
        } // end if

        Properties l_props = new Properties();
        l_props.load(new FileReader(k_CONFIG_FILE_NAME));
        m_me = new GlobalConf(l_props);
        return m_me;
    }

    /**
     *
     */
    public String m_ProxyHost;
    /**
     *
     */
    public String m_ProxyPort;
    /**
     *
     */
    public String m_WSAAEndpoint;

    /**
     *
     */
    public String m_WSCDCEndpoint;
    /**
     *
     */
    public String m_WSFEEndpoint;
    /**
     *
     */
    public String m_WSFEXEndpoint;
    /**
     *
     */
    public String m_WSName;
    /**
     *
     */
    public int m_WSTimeout;
    /**
     *
     */
    public String m_batchDoneEndpointQP;
    /**
     *
     */
    public String m_batchDoneEndpointQW;
    /**
     *
     */
    public int m_debugLevel;
    /**
     *
     */
    public long m_genericCUIT;

    /**
     * En segundos
     */
    public String m_jdbcDriver;

    /**
     *
     */
    public String m_jdbcPassword;

    /**
     *
     */
    public String m_jdbcUrl;

    /**
     *
     */
    public String m_jdbcUser;

    /**
     *
     */
    public String m_jndiResource;
    /**
     *
     */
    public int m_lockedPortQP;

    /**
     *
     */
    public int m_lockedPortQW;

    /**
     *
     */
    public int m_logSize;
    /**
     *
     */
    public String m_pdfDir;

    /**
     *
     */
    public String m_pdfNameTemplate;
    /**
     *
     */
    public String m_templateDir;

    /**
     *
     */
    public boolean m_s3Support;

    /**
     *
     */
    public String m_s3URL;

    /**
     *
     */
    public String m_s3Bucket;

    /**
     *
     */
    public String m_s3User;

    /**
     *
     */
    public String m_s3Password;

    /**
     *
     */
    private Collection<Integer> m_ptosVtaList;

    /**
     * Cuando es "true", los mensajes de log también se redirigen a stdout
     * Predeterminado: "false"
     */
    public boolean m_logStdout = false;

    /**
     *
     * @param p_props
     * @throws Exception
     */
    public GlobalConf(Properties p_props) throws Exception {
        m_jdbcDriver = p_props.getProperty("jdbcDriver");
        m_jdbcPassword = p_props.getProperty("jdbcPassword");
        m_jdbcUrl = p_props.getProperty("jdbcUrl");
        m_jdbcUser = p_props.getProperty("jdbcUser");
        m_jndiResource = p_props.getProperty("jndiResource");
        m_lockedPortQP = Integer.parseInt(p_props.getProperty("lockedPortQP"));
        m_lockedPortQW = Integer.parseInt(p_props.getProperty("lockedPortQW"));
        m_logSize = Integer.parseInt(p_props.getProperty("logSize"));
        m_templateDir = p_props.getProperty("templateDir");
        m_pdfDir = p_props.getProperty("pdfDir");
        m_pdfNameTemplate = p_props.getProperty("pdfNameTemplate");
        m_batchDoneEndpointQP = p_props.getProperty("batchDoneEndpointQP");
        m_batchDoneEndpointQW = p_props.getProperty("batchDoneEndpointQW");

        m_ProxyHost = p_props.getProperty("ProxyHost", null);
        m_ProxyPort = p_props.getProperty("ProxyPort", "0");
        m_WSAAEndpoint = p_props.getProperty("WSAAEndpoint");
        m_WSCDCEndpoint = p_props.getProperty("WSCDCEndpoint");
        m_WSFEEndpoint = p_props.getProperty("WSFEEndpoint");
        m_WSFEXEndpoint = p_props.getProperty("WSFEXEndpoint");
        m_WSTimeout = Integer.parseInt(p_props.getProperty("WSTimeout", "20000"));
        m_debugLevel = Integer.parseInt(p_props.getProperty("DebugLevel", "0"));
        m_genericCUIT = Long.parseLong(p_props.getProperty("GenericCUIT"));

        m_s3Support = Boolean.parseBoolean(p_props.getProperty("S3Support"));
        if (m_s3Support) {
            m_s3URL = p_props.getProperty("S3URL");
            m_s3Bucket = p_props.getProperty("S3Bucket");
            m_s3User = p_props.getProperty("S3User");
            m_s3Password = p_props.getProperty("S3Password");
        } // end if

        m_logStdout = Boolean.parseBoolean(p_props.getProperty("LogStdout", "false"));
        
        String l_strPtosVta = p_props.getProperty("PtosVtaList");
        String[] l_arrPtosVta = l_strPtosVta.split(",");
        m_ptosVtaList = new LinkedList<>();
        for (String l_strPtoVta : l_arrPtosVta) {
            int l_newPtoVta = Integer.valueOf(l_strPtoVta.trim());
            m_ptosVtaList.add(l_newPtoVta);
        } // end for
    }

    /**
     *
     * @return
     */
    public String getFullConfFileName() {
        if (m_fullConfFileName == null) {
            m_fullConfFileName = (new File(k_CONFIG_FILE_NAME)).getAbsoluteFile().toString();
        } // end if

        return m_fullConfFileName;
    }

    /**
     *
     * @return
     */
    public Long getGenericCuit() {
        return m_genericCUIT;
    }

    /**
     * Get the value of ptosVtaList
     *
     * @return the value of ptosVtaList
     */
    public Collection<Integer> getPtosVtaList() {
        return m_ptosVtaList;
    }

    /**
     *
     * @return
     */
    public String getWSAAEndpoint() {
        return m_WSAAEndpoint;
    }

    /**
     *
     * @return
     */
    public String getWSCDCEndpoint() {
        return m_WSCDCEndpoint;
    }

    /**
     *
     * @return
     */
    public String getWSFEEndpoint() {
        return m_WSFEEndpoint;
    }

    /**
     *
     * @return
     */
    public String getWSFEXEndpoint() {
        return m_WSFEXEndpoint;
    }

    /**
     * Set the value of ptosVtaList
     *
     * @param p_ptosVtaList new value of ptosVtaList
     */
    public void setPtosVtaList(Collection<Integer> p_ptosVtaList) {
        this.m_ptosVtaList = p_ptosVtaList;
    }

    /**
     *
     * @param p_WSAAEndpoint
     */
    public void setWSAAEndpoint(String p_WSAAEndpoint) {
        this.m_WSAAEndpoint = p_WSAAEndpoint;
    }

    /**
     *
     * @param p_WSCDCEndpoint
     */
    public void setWSCDCEndpoint(String p_WSCDCEndpoint) {
        this.m_WSCDCEndpoint = p_WSCDCEndpoint;
    }

    /**
     *
     * @param p_WSFEEndpoint
     */
    public void setWSFEEndpoint(String p_WSFEEndpoint) {
        this.m_WSFEEndpoint = p_WSFEEndpoint;
    }

    /**
     *
     * @param p_WSFEXEndpoint
     */
    public void setWSFEXEndpoint(String p_WSFEXEndpoint) {
        this.m_WSFEXEndpoint = p_WSFEXEndpoint;
    }

}
