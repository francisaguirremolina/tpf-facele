package com.epidata.facele.ws.jsonmodel;

import com.epidata.facele.entities.TR_FEComprobantesAsoc;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public class FEComprobantesAsocModel {

    private Integer m_CbteNumero;
    private Integer m_CbteTipo;
    private Integer m_PtoVta;
    
    // @since 2025-07-31
    private Long m_cbteCuit;

    public Long getCbteCuit() {
        return m_cbteCuit;
    }

    public void setCbteCuit(Long p_cbteCuit) {
        this.m_cbteCuit = p_cbteCuit;
    }

    public FEComprobantesAsocModel() {
    }

    public FEComprobantesAsocModel(TR_FEComprobantesAsoc p_rec) {
        setCbteNumero(p_rec.getCbteNumero());
        setCbteTipo(p_rec.getCbteTipo());
        setPtoVta(p_rec.getPtoVta());
        setCbteCuit(p_rec.getCbteCuit());
    }

    public Integer getCbteNumero() {
        return m_CbteNumero;
    }

    public Integer getCbteTipo() {
        return m_CbteTipo;
    }

    public Integer getPtoVta() {
        return m_PtoVta;
    }

    public void setCbteNumero(Integer p_CbteNumero) {
        this.m_CbteNumero = p_CbteNumero;
    }

    public void setCbteTipo(Integer p_CbteTipo) {
        this.m_CbteTipo = p_CbteTipo;
    }

    public void setPtoVta(Integer p_PtoVta) {
        this.m_PtoVta = p_PtoVta;
    }

}
