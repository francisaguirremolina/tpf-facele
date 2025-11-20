package com.epidata.facele.qp;

import com.epidata.facele.entities.TR_FEComprobantes;
import com.epidata.facele.entities.T_FEComprobantes;
import com.epidata.facele.etc.AbstractQueweProcessor;
import com.epidata.facele.etc.QueweResponse;
import static com.epidata.facele.etc.QueweResponse.notifyBatchFinished;
import static com.epidata.facele.logger.FaceleLogger.log;
import static com.epidata.facele.qp.FacEleQP.safeDelay;
import static com.epidata.facele.qp.QPUtils.generateOnePDF;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public class QPQueweProcessor extends AbstractQueweProcessor {

    /**
     *
     * @param p_idPtoVta
     */
    public QPQueweProcessor(int p_idPtoVta) {
        super(p_idPtoVta);
    }

    /**
     *
     */
    @Override
    public void mainLoop() {
        while (true) {
            try {
                // Si no hay conexión, espera...
                if (QPModel.m_conn == null) {
                    safeDelay(INACTIVE_DELAY);
                    continue;
                } // end if

                if (!isActiveQuewe(QPModel.m_conn, "QP")) {
                    // cola inactiva
                    safeDelay(INACTIVE_DELAY);
                    continue;
                } // end if

                // Acepta comprobantes en simulación
                // @since 2025-07-31
                T_FEComprobantes l_table = new T_FEComprobantes(QPModel.m_conn,
                        "EstadoPDF='P' AND Resultado IN ('A', 'S') AND IdPtoVta=" + getIdPtoVta(),
                        "IdDocumentoFE");

                log("Documentos a procesar: " + l_table.getRows().size());

                // Si no hay documentos que generar, demora un segundo antes
                // de reintentar
                if (l_table.getRows().isEmpty()) {
                    safeDelay(INACTIVE_DELAY);
                    continue;
                } // end if

                // Sí hay comprobantes
                m_qResponse = new QueweResponse("qp", l_table.getRows().size(),
                        getIdPtoVta());

                for (TR_FEComprobantes l_row : l_table.getRows()) {
                    // Antes de procesar cada documento, verifica que la
                    // cola siga activa
                    if (!isActiveQuewe(QPModel.m_conn, "QP")) {
                        // cola inactiva
                        break;
                    } // end if

                    try {
                        processOne(l_row);
                    } catch (Throwable l_ex2) {
                        log(l_ex2);
                        l_row.setEstadoPDF("E"); // ERROR
                        (new T_FEComprobantes()).executeSPUR(QPModel.m_conn, l_row);
                    }
                } // end for
                if (!l_table.getRows().isEmpty()) {
                    notifyBatchFinished(
                            QPModel.m_conf.m_batchDoneEndpointQP,
                            m_qResponse);
                } // end if

            } catch (Exception l_ex) {
                log(l_ex);
                safeDelay(2000);
            }
        } // end while
    }

    private void processOne(TR_FEComprobantes p_row) throws Throwable {
        int l_idDocumentoFE = p_row.getIdDocumentoFE();
        log("\tProcesando " + l_idDocumentoFE);
        generateOnePDF(p_row);
        log("\tProcesamiento exitoso");
    }

}
