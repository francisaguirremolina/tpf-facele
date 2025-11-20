package com.epidata.facele.ws.jsonmodel;

import com.epidata.facele.entities.TR_FEComprobantesDet;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public class FEComprobantesDetModel {

    private Double m_Bonificacion;
    private Double m_Cantidad;
    private String m_CodigoProducto;
    private String m_Descripcion;
    private String m_LineaDet1;
    private String m_LineaDet2;
    private Double m_PrecioUnitario;
    private Double m_Subtotal;
    private Double m_Valor1;
    private Double m_Valor2;

    // @since 2025-07-31
    private Integer m_idFEXUnidadMedida;

    public Integer getIdFEXUnidadMedida() {
        return m_idFEXUnidadMedida;
    }

    public void setIdFEXUnidadMedida(Integer p_idFEXUnidadMedida) {
        this.m_idFEXUnidadMedida = p_idFEXUnidadMedida;
    }

    public FEComprobantesDetModel() {
    }

    public FEComprobantesDetModel(TR_FEComprobantesDet p_row) {
        setBonificacion(p_row.getBonificacion());
        setCantidad(p_row.getCantidad());
        setCodigoProducto(p_row.getCodigoProducto());
        setDescripcion(p_row.getDescripcion());
        setLineaDet1(p_row.getLineaDet1());
        setLineaDet2(p_row.getLineaDet2());
        setPrecioUnitario(p_row.getPrecioUnitario());
        setSubtotal(p_row.getSubtotal());
        setValor1(p_row.getValor1());
        setValor2(p_row.getValor2());
        // @since 2025-07-31
        setIdFEXUnidadMedida(p_row.getIdFEXUnidadMedida());
    }

    public Double getBonificacion() {
        return m_Bonificacion;
    }

    public Double getCantidad() {
        return m_Cantidad;
    }

    public String getCodigoProducto() {
        return m_CodigoProducto;
    }

    public String getDescripcion() {
        return m_Descripcion;
    }

    public String getLineaDet1() {
        return m_LineaDet1;
    }

    public String getLineaDet2() {
        return m_LineaDet2;
    }

    public Double getPrecioUnitario() {
        return m_PrecioUnitario;
    }

    public Double getSubtotal() {
        return m_Subtotal;
    }

    public Double getValor1() {
        return m_Valor1;
    }

    public Double getValor2() {
        return m_Valor2;
    }

    public void setBonificacion(Double p_Bonificacion) {
        this.m_Bonificacion = p_Bonificacion;
    }

    public void setCantidad(Double p_Cantidad) {
        this.m_Cantidad = p_Cantidad;
    }

    public void setCodigoProducto(String p_CodigoProducto) {
        this.m_CodigoProducto = p_CodigoProducto;
    }

    public void setDescripcion(String p_Descripcion) {
        this.m_Descripcion = p_Descripcion;
    }

    public void setLineaDet1(String p_LineaDet1) {
        this.m_LineaDet1 = p_LineaDet1;
    }

    public void setLineaDet2(String p_LineaDet2) {
        this.m_LineaDet2 = p_LineaDet2;
    }

    public void setPrecioUnitario(Double p_PrecioUnitario) {
        this.m_PrecioUnitario = p_PrecioUnitario;
    }

    public void setSubtotal(Double p_Subtotal) {
        this.m_Subtotal = p_Subtotal;
    }

    public void setValor1(Double p_Valor1) {
        this.m_Valor1 = p_Valor1;
    }

    public void setValor2(Double p_Valor2) {
        this.m_Valor2 = p_Valor2;
    }

}
