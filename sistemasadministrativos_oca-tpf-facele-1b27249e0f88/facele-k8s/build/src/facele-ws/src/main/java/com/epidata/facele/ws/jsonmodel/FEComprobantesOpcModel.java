package com.epidata.facele.ws.jsonmodel;

import com.epidata.facele.entities.TR_FEComprobantesOpc;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public class FEComprobantesOpcModel {

    private String m_CodOpcional;
    private String m_Valor;

    public FEComprobantesOpcModel() {
    }

    public FEComprobantesOpcModel(TR_FEComprobantesOpc p_rec) {
        setCodOpcional(p_rec.getCodOpcional());
        setValor(p_rec.getValor());
    }

    public String getCodOpcional() {
        return m_CodOpcional;
    }

    public String getValor() {
        return m_Valor;
    }

    public void setCodOpcional(String p_CodOpcional) {
        this.m_CodOpcional = p_CodOpcional;
    }

    public void setValor(String p_Valor) {
        this.m_Valor = p_Valor;
    }

}
