package com.epidata.facele.qp;

import com.epidata.facele.entities.TR_FEComprobantes;
import com.epidata.facele.entities.T_FEComprobantes;
import static com.epidata.facele.etc.QModel.m_conf;
import static com.epidata.facele.logger.FaceleLogger.log;
import static com.epidata.facele.qp.QPModel.getCbteTipo;
import com.epidata.facele.repodriver.AbstractRepoDriver;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public class QPUtils {

    private static void fillAndSavePDF(JasperReport p_report, 
            AbstractRepoDriver p_repo,
            String p_outputFileName,
            Map<String, Object> p_params) throws Exception {
        log("\tComponiendo documento " + p_outputFileName);
        try {

            JRDataSource l_emptyDS = new JRDataSource() {
                @Override
                public boolean next() throws JRException {
                    return false;
                }

                @Override
                public Object getFieldValue(JRField jrf) throws JRException {
                    return null;
                }
            };

            JasperPrint l_print = JasperFillManager.fillReport(p_report,
                    p_params, QPModel.m_conn);
            log("\tExportando PDF " + p_outputFileName);

            byte[] l_reportBuffer = JasperExportManager.exportReportToPdf(
                    l_print);
           
            log("\tAlmacenando en repositorio " + p_outputFileName);
            p_repo.uploadFile(l_reportBuffer, p_outputFileName);
            
        } catch (Exception l_ex) {
            throw new Exception("Error al generar el reporte en el archivo "
                    + p_outputFileName, l_ex);
        }

    }

    /**
     *
     * @param p_row
     * @throws Exception
     */
    public static void generateOnePDF(TR_FEComprobantes p_row) throws Exception {
        int l_idDocumentoFE = p_row.getIdDocumentoFE();
        log("\tGenerando documento " + l_idDocumentoFE);
        int l_cbteTipo = p_row.getCbteTipo();

        String l_reportTemplateFQN = p_row.getReportTemplate();
        if (l_reportTemplateFQN == null) {
            // Utiliza la plantilla predeterminada para el tipo de documento
            l_reportTemplateFQN = getCbteTipo(l_cbteTipo).getReportTemplate();
        } // end if

        if (l_reportTemplateFQN == null) {
            String l_msg = "No se indicó la plantilla específica para el comprobante "
                    + l_idDocumentoFE + "; ni tampoco la plantilla "
                    + "predeterminada para el tipo " + l_cbteTipo;
            throw new Exception(l_msg);
        } // end if

        String l_templateDir = m_conf.m_templateDir;
        if (l_templateDir != null) {
            if (!l_templateDir.endsWith("/")) {
                l_templateDir = l_templateDir + "/";
            } // end if
            l_reportTemplateFQN = l_templateDir + l_reportTemplateFQN;
        } // end if

        log("\tAplicando la plantilla " + l_reportTemplateFQN);
        File l_reportTemplateFile = new File(l_reportTemplateFQN);
        if (!l_reportTemplateFile.exists()) {
            String l_msg = "No se encontró el archivo con la plantilla "
                    + l_reportTemplateFQN + " para el comprobante "
                    + l_idDocumentoFE;
            throw new Exception(l_msg);
        } // end if

        // Componiendo el nombre del archivo
        String l_pdfFileName = PDFFileNameFormatter.format(p_row);
        p_row.setPDFFileName(l_pdfFileName);

        log("\tGenerando el archivo PDF " + l_pdfFileName);
        JasperReport l_report = QPModel.getReport(l_reportTemplateFile);
        Map<String, Object> l_reportParams = new HashMap<>();

        l_reportParams.put("IdDocumentoFE", String.valueOf(l_idDocumentoFE));
        l_reportParams.put("SUBREPORT_DIR",
                l_reportTemplateFile.getParentFile().getAbsolutePath() + "/");
        l_reportParams.put("Modelo", "4. DOS COPIAS"); // TO-DO

        AbstractRepoDriver l_repo = QPModel.getRepoDriver();
        fillAndSavePDF(l_report, l_repo, l_pdfFileName, l_reportParams);
    
        p_row.setEstadoPDF("G");
        (new T_FEComprobantes()).executeSPUR(QPModel.m_conn, p_row);
        log("\tGeneración exitosa");
    }

}
