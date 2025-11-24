package com.epidata.facele.ws.jsonmodel;

import com.epidata.facele.entities.TR_FEComprobantesIva;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public class FEComprobantesIvaModel {

    private Double m_BaseImp;
    private Integer m_CodAlicIVA;
    private Double m_Importe;

    public FEComprobantesIvaModel() {
    }

    public FEComprobantesIvaModel(TR_FEComprobantesIva p_rec) {
        setBaseImp(p_rec.getBaseImp());
        setCodAlicIVA(p_rec.getCodAlicIVA());
        setImporte(p_rec.getImporte());
    }

    public Double getBaseImp() {
        return m_BaseImp;
    }

    public Integer getCodAlicIVA() {
        return m_CodAlicIVA;
    }

    public Double getImporte() {
        return m_Importe;
    }

    public void setBaseImp(Double p_BaseImp) {
        this.m_BaseImp = p_BaseImp;
    }

    public void setCodAlicIVA(Integer p_CodAlicIVA) {
        this.m_CodAlicIVA = p_CodAlicIVA;
    }

    public void setImporte(Double p_Importe) {
        this.m_Importe = p_Importe;
    }

}
