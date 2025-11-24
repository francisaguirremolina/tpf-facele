package com.epidata.facele.ws.jsonmodel;

import java.util.List;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public class FEComprobantesLoteModel {

    public List<FECompBatchModel> getComprobantes() {
        return m_comprobantes;
    }

    public void setComprobantes(List<FECompBatchModel> p_comprobantes) {
        this.m_comprobantes = p_comprobantes;
    }

    private List<FECompBatchModel> m_comprobantes;

    public FEComprobantesLoteModel() {
    }

}
