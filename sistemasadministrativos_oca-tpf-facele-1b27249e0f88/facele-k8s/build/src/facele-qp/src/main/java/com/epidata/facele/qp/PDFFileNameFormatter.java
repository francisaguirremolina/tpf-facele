package com.epidata.facele.qp;

import static com.epidata.facele.conf.GlobalConf.k_CONFIG_FILE_NAME;
import com.epidata.facele.entities.TR_FECbteTipos;
import com.epidata.facele.entities.TR_FEComprobantes;
import com.epidata.facele.entities.TR_FEPtosVta;
import static com.epidata.facele.etc.QModel.m_conf;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public class PDFFileNameFormatter {

    /**
     *
     */
    public static String[] m_wildcards = {
        "@HASH",
        "@CUIT",
        "@TIPOCOMP",
        "@PTOVTA",
        "@NROCOMP",
        "@SINTETICO",
        "@LETRAFISCAL",
        "@TIPODOC",
        "@NRODOC",
        "@IDDOCUMENTO"
    };

    /**
     *
     * @param p_row
     * @return
     * @throws Exception
     */
    public static String format(TR_FEComprobantes p_row) throws Exception {
        String l_pdfFileName = m_conf.m_pdfNameTemplate;
        if (l_pdfFileName == null || l_pdfFileName.isEmpty()) {
            throw new Exception("El archivo de configuración "
                    + k_CONFIG_FILE_NAME
                    + " no contiene la plantilla del nombre de los archivos PDF");
        } // end if
        for (String l_wildcard : m_wildcards) {
            l_pdfFileName = l_pdfFileName.replace(l_wildcard, renderWilcard(l_wildcard, p_row));
        } // end for

        return l_pdfFileName;
    }

    private static String renderWilcard(String p_wildcard, TR_FEComprobantes p_row)
            throws Exception {
        switch (p_wildcard) {
            case "@HASH": {
                String l_value = p_row.getHashLink();
                if (l_value == null) {
                    return "UNKNOWN_HASH________";
                } // end if
                return l_value; // 20 caracteres
            }
            case "@CUIT": {
                int l_idPtoVta = p_row.getIdPtoVta();
                TR_FEPtosVta l_row = QPModel.getPtoVta(l_idPtoVta);
                return String.format("%011d", l_row.getCuit());
            }
            case "@TIPOCOMP": {
                int l_cbteTipo = p_row.getCbteTipo();
                return String.format("%03d", l_cbteTipo);
            }
            case "@PTOVTA": {
                int l_idPtoVta = p_row.getIdPtoVta();
                TR_FEPtosVta l_row = QPModel.getPtoVta(l_idPtoVta);
                return String.format("%05d", l_row.getPtoVta());
            }
            case "@NROCOMP": {
                Integer l_value = p_row.getCbteDesde();
                if (l_value == null) {
                    l_value = 0;
                } // end if
                return String.format("%08d", l_value);
            }
            case "@SINTETICO": {
                int l_cbteTipo = p_row.getCbteTipo();
                TR_FECbteTipos l_row = QPModel.getCbteTipo(l_cbteTipo);
                return l_row.getSintetico();
            }
            case "@LETRAFISCAL": {
                int l_cbteTipo = p_row.getCbteTipo();
                TR_FECbteTipos l_row = QPModel.getCbteTipo(l_cbteTipo);
                return l_row.getLetraFiscal();
            }
            case "@TIPODOC": {
                int l_value = p_row.getDocTipo();
                return String.format("%03d", l_value);
            }
            case "@NRODOC": {
                Long l_value = p_row.getDocNro();
                if (l_value == null) {
                    return "";
                } // end if
                return String.format("%11d", l_value);
            }
            case "@IDDOCUMENTO": {
                int l_value = p_row.getIdDocumentoFE();
                return String.format("%08d", l_value);
            }
            default:
                throw new Exception("Campo del nombre de archivo desconocido: "
                        + p_wildcard);
        }
    }
}
