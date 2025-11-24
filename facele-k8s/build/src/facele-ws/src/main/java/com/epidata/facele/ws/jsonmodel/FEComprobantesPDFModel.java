package com.epidata.facele.ws.jsonmodel;

import com.epidata.facele.entities.TR_FEComprobantes;
import com.epidata.facele.repodriver.AbstractRepoDriver;
import java.io.File;
import java.util.Base64;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public class FEComprobantesPDFModel {

    private Integer m_IdDocumentoFE;
    private String m_HashLink;
    private String m_PDFFileName;
    private String m_ReportTemplate;
    private String m_PDFBinary;

    public Integer getIdDocumentoFE() {
        return m_IdDocumentoFE;
    }

    public void setIdDocumentoFE(Integer p_IdDocumentoFE) {
        this.m_IdDocumentoFE = p_IdDocumentoFE;
    }

    public String getHashLink() {
        return m_HashLink;
    }

    public void setHashLink(String p_HashLink) {
        this.m_HashLink = p_HashLink;
    }

    public String getPDFFileName() {
        return m_PDFFileName;
    }

    public void setPDFFileName(String p_PDFFileName) {
        this.m_PDFFileName = p_PDFFileName;
    }

    public String getReportTemplate() {
        return m_ReportTemplate;
    }

    public void setReportTemplate(String p_ReportTemplate) {
        this.m_ReportTemplate = p_ReportTemplate;
    }

    public String getPDFBinary() {
        return m_PDFBinary;
    }

    public void setPDFBinary(String p_PDFBinary) {
        this.m_PDFBinary = p_PDFBinary;
    }

    public FEComprobantesPDFModel(TR_FEComprobantes p_rec, AbstractRepoDriver p_repo)
            throws Exception {

        if (p_rec.getPDFFileName() == null) {
            throw new Exception("Archivo PDF no especificado");
        } // end if

        //File l_pdfFile = new File(p_rec.getPDFFileName());
        //if (!l_pdfFile.exists()) {
        //    throw new Exception("Archivo PDF inexistente");
        //} // end if

        setIdDocumentoFE(p_rec.getIdDocumentoFE());
        setHashLink(p_rec.getHashLink());
        setPDFFileName(p_rec.getPDFFileName());
        setReportTemplate(p_rec.getReportTemplate());
                
        byte[] l_byteArray = p_repo.downloadFile(p_rec.getPDFFileName());
        if (l_byteArray == null) {
            throw new Exception("Archivo PDF inexistente: " + p_rec.getPDFFileName());
        } // end if
        
        Base64.Encoder l_encoder = Base64.getEncoder();
        String l_base64 = l_encoder.encodeToString(l_byteArray);
        setPDFBinary(l_base64);

    }

}
