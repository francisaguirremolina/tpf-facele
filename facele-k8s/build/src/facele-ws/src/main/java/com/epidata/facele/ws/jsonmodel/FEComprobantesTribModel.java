package com.epidata.facele.ws.jsonmodel;

import com.epidata.facele.entities.TR_FEComprobantesTrib;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public class FEComprobantesTribModel {

    private Double m_Alic;
    private Double m_BaseImp;
    private Integer m_CodTributo;
    private String m_Descripcion;
    private Double m_Importe;

    public FEComprobantesTribModel() {
    }

    public FEComprobantesTribModel(TR_FEComprobantesTrib p_rec) {
        setAlic(p_rec.getAlic());
        setBaseImp(p_rec.getBaseImp());
        setCodTributo(p_rec.getCodTributo());
        setDescripcion(p_rec.getDescripcion());
        setImporte(p_rec.getImporte());
    }

    public Double getAlic() {
        return m_Alic;
    }

    public Double getBaseImp() {
        return m_BaseImp;
    }

    public Integer getCodTributo() {
        return m_CodTributo;
    }

    public String getDescripcion() {
        return m_Descripcion;
    }

    public Double getImporte() {
        return m_Importe;
    }

    public void setAlic(Double p_Alic) {
        this.m_Alic = p_Alic;
    }

    public void setBaseImp(Double p_BaseImp) {
        this.m_BaseImp = p_BaseImp;
    }

    public void setCodTributo(Integer p_CodTributo) {
        this.m_CodTributo = p_CodTributo;
    }

    public void setDescripcion(String p_Descripcion) {
        this.m_Descripcion = p_Descripcion;
    }

    public void setImporte(Double p_Importe) {
        this.m_Importe = p_Importe;
    }

}
