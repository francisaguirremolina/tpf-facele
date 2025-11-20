package com.epidata.facele.repodriver;

/**
 *
 * @author gustavo
 */
public abstract class AbstractRepoDriver {

    /**
     *
     * @param p_pdfDir
     */
    public AbstractRepoDriver(String p_pdfDir) {
        if (p_pdfDir == null) {
            p_pdfDir = "";
        } else {
            p_pdfDir = p_pdfDir.trim();
            if (!p_pdfDir.endsWith("/")) {
                p_pdfDir = p_pdfDir + "/";
            } // end if
        } // end if
        m_pdfDir = p_pdfDir;
    }

    private final String m_pdfDir;

    /**
     * Get the value of pdfDir
     *
     * @return the value of pdfDir
     */
    public String getPdfDir() {
        return m_pdfDir;
    }

    /**
     *
     * @param p_content
     * @param p_fileName
     * @throws Exception
     */
    public abstract void uploadFile(byte[] p_content, String p_fileName) throws Exception;

    /**
     *
     * @param p_fileName
     * @return
     * @throws Exception
     */
    public abstract byte[] downloadFile(String p_fileName) throws Exception;

}
