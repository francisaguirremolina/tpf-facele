package com.epidata.facele.qw;

import com.epidata.facele.entities.TR_FEComprobantes;
import com.epidata.facele.entities.T_FEComprobantes;
import com.epidata.facele.etc.AbstractQueweProcessor;
import com.epidata.facele.etc.QModel;
import static com.epidata.facele.etc.QModel.m_conf;
import com.epidata.facele.etc.QueweResponse;
import static com.epidata.facele.etc.QueweResponse.notifyBatchFinished;
import static com.epidata.facele.etc.SafeDelayTool.safeDelay;
import static com.epidata.facele.logger.FaceleLogger.log;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public class QWQueweProcessor extends AbstractQueweProcessor {

    /**
     *
     * @param p_idPtoVta
     */
    public QWQueweProcessor(int p_idPtoVta) {
        super(p_idPtoVta);
    }

    private void processOne(TR_FEComprobantes p_row) throws Throwable {
        int l_idDocumentoFE = p_row.getIdDocumentoFE();
        log("\tProcesando " + l_idDocumentoFE);
        QWUtils.solicitaAutorizacion(QModel.m_conn,
                m_conf, p_row);

        log("\tProcesamiento exitoso");
    }

    /**
     *
     */
    @Override
    protected void mainLoop() {
        while (true) {
            try {
                // Si no hay conexión, espera...
                if (QModel.m_conn == null) {
                    safeDelay(INACTIVE_DELAY);
                    continue;
                } // end if

                if (!isActiveQuewe(QModel.m_conn, "QW")) {
                    // cola inactiva
                    safeDelay(INACTIVE_DELAY);
                    continue;
                } // end if

                T_FEComprobantes l_table = new T_FEComprobantes(QModel.m_conn,
                        "Resultado='P' AND IdPtoVta=" + getIdPtoVta(),
                        "IdDocumentoFE");

                log("Documentos a procesar: " + l_table.getRows().size());

                // Si no hay documentos que generar, demora antes
                // de reintentar
                if (l_table.getRows().isEmpty()) {
                    safeDelay(INACTIVE_DELAY);
                    continue;
                } // end if

                // Sí hay comprobantes
                m_qResponse = new QueweResponse("qw", l_table.getRows().size(),
                        getIdPtoVta());

                for (TR_FEComprobantes l_row : l_table.getRows()) {

                    // Antes de procesar cada documento, verifica que la
                    // cola siga activa
                    if (!isActiveQuewe(QModel.m_conn, "QW")) {
                        // cola inactiva
                        break;
                    } // end if

                    try {
                        processOne(l_row);
                        if (l_row.getResultado().equals("A")) { // APROBADO
                            m_qResponse.setBatchApproved(m_qResponse.getBatchApproved() + 1);
                        } else {
                            m_qResponse.setBatchRejected(m_qResponse.getBatchRejected() + 1);
                        } // end if
                    } catch (Exception l_ex2) {
                        log(l_ex2);
                        l_row.setResultado("T"); // ERROR TÉCNICO
                        (new T_FEComprobantes()).executeSPUR(QModel.m_conn, l_row);
                        m_qResponse.setBatchRejected(m_qResponse.getBatchRejected() + 1);
                    }
                } // end for
                if (!l_table.getRows().isEmpty()) {
                    notifyBatchFinished(
                            QModel.m_conf.m_batchDoneEndpointQW,
                            m_qResponse);
                } // end if

            } catch (Throwable l_ex) {
                log(l_ex);
                safeDelay(2000);
            }
        } // end while
    }

}
