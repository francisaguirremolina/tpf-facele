package com.epidata.facele.repodriver;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author gustavo
 */
public class FilesystemRepoDriver extends AbstractRepoDriver {

    /**
     *
     * @param p_pdfDir
     */
    public FilesystemRepoDriver(String p_pdfDir) {
        super(p_pdfDir);
    }

    /**
     *
     * @param p_fileName
     * @return
     * @throws Exception
     */
    @Override
    public byte[] downloadFile(String p_fileName) throws Exception {
        File l_pdfFile = new File(getPdfDir() + p_fileName);
        if (!l_pdfFile.exists()) {
            return null;
        } // end if
        byte[] l_byteArray = FileUtils.readFileToByteArray(l_pdfFile);
        return l_byteArray;
    }

    /**
     *
     * @param p_content
     * @param p_fileName
     * @throws Exception
     */
    @Override
    public void uploadFile(byte[] p_content, String p_fileName) throws Exception {

        File l_pdfFile = new File(getPdfDir() + p_fileName);

        File l_pdfDir = l_pdfFile.getParentFile();
        l_pdfDir.mkdirs();

        FileOutputStream l_outStream = new FileOutputStream(l_pdfFile);
        l_outStream.write(p_content);
        l_outStream.close();

    }

}
