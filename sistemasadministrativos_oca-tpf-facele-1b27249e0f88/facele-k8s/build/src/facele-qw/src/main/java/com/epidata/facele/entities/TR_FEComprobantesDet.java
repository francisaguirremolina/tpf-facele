/**
ORM table row class for: FEComprobantesDet
Generated: 2025-10-21 15:27:38
CRDETR una línea de detalle de un comprobante electrónico. Estas líneas no se necesitan para la solicitud del CAE, pero sí para la impresión autónoma del comprobante, independizando el módulo de Factura Electrónica del resto del sistema de gestión.
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class TR_FEComprobantesDet extends AbstractRecord implements SinglePkRecord<Integer> {

    public TR_FEComprobantesDet() {
        m_IdComprobanteDet = new com.epidata.facele.entities.D_IdComprobanteDet();
        m_IdDocumentoFE = new com.epidata.facele.entities.D_IdDocumentoFE();
        m_Cantidad = new com.epidata.facele.entities.D_Monto();
        m_Descripcion = new com.epidata.facele.entities.D_Descripcion();
        m_PrecioUnitario = new com.epidata.facele.entities.D_Monto();
        m_Valor1 = new com.epidata.facele.entities.D_Monto();
        m_Valor2 = new com.epidata.facele.entities.D_Monto();
        m_Subtotal = new com.epidata.facele.entities.D_Monto();
        m_LineaDet1 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaDet2 = new com.epidata.facele.entities.D_Descripcion();
        m_CodigoProducto = new com.epidata.facele.entities.D_CodigoProducto();
        m_Bonificacion = new com.epidata.facele.entities.D_Bonificacion4D();
        m_IdFEXUnidadMedida = new com.epidata.facele.entities.D_IdFEXUnidadMedida();
    }

    public TR_FEComprobantesDet(ResultSet p_rs) throws Exception {
        this();
        serializeFrom(p_rs);
    }

    /** Valor del campo: IdComprobanteDet
    */
    private com.epidata.facele.entities.D_IdComprobanteDet  m_IdComprobanteDet;

    /**
    */
    public Integer getIdComprobanteDet() {
        return m_IdComprobanteDet.get();
    }
    /**
    */
    public void setIdComprobanteDet(Integer p_value) {
        m_IdComprobanteDet.set(p_value);
    }

    /** Valor del campo: IdDocumentoFE
    */
    private com.epidata.facele.entities.D_IdDocumentoFE  m_IdDocumentoFE;

    /**
    */
    public Integer getIdDocumentoFE() {
        return m_IdDocumentoFE.get();
    }
    /**
    */
    public void setIdDocumentoFE(Integer p_value) {
        m_IdDocumentoFE.set(p_value);
    }

    /** Valor del campo: Cantidad
    */
    private com.epidata.facele.entities.D_Monto  m_Cantidad;

    /**
    */
    public Double getCantidad() {
        return m_Cantidad.get();
    }
    /**
    */
    public void setCantidad(Double p_value) {
        m_Cantidad.set(p_value);
    }

    /** Valor del campo: Descripcion
    */
    private com.epidata.facele.entities.D_Descripcion  m_Descripcion;

    /**
    */
    public String getDescripcion() {
        return m_Descripcion.get();
    }
    /**
    */
    public void setDescripcion(String p_value) {
        m_Descripcion.set(p_value);
    }

    /** Valor del campo: PrecioUnitario
    */
    private com.epidata.facele.entities.D_Monto  m_PrecioUnitario;

    /**
    */
    public Double getPrecioUnitario() {
        return m_PrecioUnitario.get();
    }
    /**
    */
    public void setPrecioUnitario(Double p_value) {
        m_PrecioUnitario.set(p_value);
    }

    /** Valor del campo: Valor1
    */
    private com.epidata.facele.entities.D_Monto  m_Valor1;

    /**
    */
    public Double getValor1() {
        return m_Valor1.get();
    }
    /**
    */
    public void setValor1(Double p_value) {
        m_Valor1.set(p_value);
    }

    /** Valor del campo: Valor2
    */
    private com.epidata.facele.entities.D_Monto  m_Valor2;

    /**
    */
    public Double getValor2() {
        return m_Valor2.get();
    }
    /**
    */
    public void setValor2(Double p_value) {
        m_Valor2.set(p_value);
    }

    /** Valor del campo: Subtotal
    */
    private com.epidata.facele.entities.D_Monto  m_Subtotal;

    /**
    */
    public Double getSubtotal() {
        return m_Subtotal.get();
    }
    /**
    */
    public void setSubtotal(Double p_value) {
        m_Subtotal.set(p_value);
    }

    /** Valor del campo: LineaDet1
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaDet1;

    /**
    */
    public String getLineaDet1() {
        return m_LineaDet1.get();
    }
    /**
    */
    public void setLineaDet1(String p_value) {
        m_LineaDet1.set(p_value);
    }

    /** Valor del campo: LineaDet2
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaDet2;

    /**
    */
    public String getLineaDet2() {
        return m_LineaDet2.get();
    }
    /**
    */
    public void setLineaDet2(String p_value) {
        m_LineaDet2.set(p_value);
    }

    /** Valor del campo: CodigoProducto
    */
    private com.epidata.facele.entities.D_CodigoProducto  m_CodigoProducto;

    /**
    */
    public String getCodigoProducto() {
        return m_CodigoProducto.get();
    }
    /**
    */
    public void setCodigoProducto(String p_value) {
        m_CodigoProducto.set(p_value);
    }

    /** Valor del campo: Bonificacion
    */
    private com.epidata.facele.entities.D_Bonificacion4D  m_Bonificacion;

    /**
    */
    public Double getBonificacion() {
        return m_Bonificacion.get();
    }
    /**
    */
    public void setBonificacion(Double p_value) {
        m_Bonificacion.set(p_value);
    }

    /** Valor del campo: IdFEXUnidadMedida
    */
    private com.epidata.facele.entities.D_IdFEXUnidadMedida  m_IdFEXUnidadMedida;

    /**
    */
    public Integer getIdFEXUnidadMedida() {
        return m_IdFEXUnidadMedida.get();
    }
    /**
    */
    public void setIdFEXUnidadMedida(Integer p_value) {
        m_IdFEXUnidadMedida.set(p_value);
    }

    public void serializeFrom(ResultSet p_rs) throws Exception {
        Integer l_valueIdComprobanteDet = p_rs.getInt("IdComprobanteDet");
        if (!p_rs.wasNull()) {
            setIdComprobanteDet(l_valueIdComprobanteDet);
        } else {
            setIdComprobanteDet(null);
        } // end if
        Integer l_valueIdDocumentoFE = p_rs.getInt("IdDocumentoFE");
        if (!p_rs.wasNull()) {
            setIdDocumentoFE(l_valueIdDocumentoFE);
        } else {
            setIdDocumentoFE(null);
        } // end if
        Double l_valueCantidad = p_rs.getDouble("Cantidad");
        if (!p_rs.wasNull()) {
            setCantidad(l_valueCantidad);
        } else {
            setCantidad(null);
        } // end if
        String l_valueDescripcion = p_rs.getString("Descripcion");
        if (!p_rs.wasNull()) {
            setDescripcion(l_valueDescripcion);
        } else {
            setDescripcion(null);
        } // end if
        Double l_valuePrecioUnitario = p_rs.getDouble("PrecioUnitario");
        if (!p_rs.wasNull()) {
            setPrecioUnitario(l_valuePrecioUnitario);
        } else {
            setPrecioUnitario(null);
        } // end if
        Double l_valueValor1 = p_rs.getDouble("Valor1");
        if (!p_rs.wasNull()) {
            setValor1(l_valueValor1);
        } else {
            setValor1(null);
        } // end if
        Double l_valueValor2 = p_rs.getDouble("Valor2");
        if (!p_rs.wasNull()) {
            setValor2(l_valueValor2);
        } else {
            setValor2(null);
        } // end if
        Double l_valueSubtotal = p_rs.getDouble("Subtotal");
        if (!p_rs.wasNull()) {
            setSubtotal(l_valueSubtotal);
        } else {
            setSubtotal(null);
        } // end if
        String l_valueLineaDet1 = p_rs.getString("LineaDet1");
        if (!p_rs.wasNull()) {
            setLineaDet1(l_valueLineaDet1);
        } else {
            setLineaDet1(null);
        } // end if
        String l_valueLineaDet2 = p_rs.getString("LineaDet2");
        if (!p_rs.wasNull()) {
            setLineaDet2(l_valueLineaDet2);
        } else {
            setLineaDet2(null);
        } // end if
        String l_valueCodigoProducto = p_rs.getString("CodigoProducto");
        if (!p_rs.wasNull()) {
            setCodigoProducto(l_valueCodigoProducto);
        } else {
            setCodigoProducto(null);
        } // end if
        Double l_valueBonificacion = p_rs.getDouble("Bonificacion");
        if (!p_rs.wasNull()) {
            setBonificacion(l_valueBonificacion);
        } else {
            setBonificacion(null);
        } // end if
        Integer l_valueIdFEXUnidadMedida = p_rs.getInt("IdFEXUnidadMedida");
        if (!p_rs.wasNull()) {
            setIdFEXUnidadMedida(l_valueIdFEXUnidadMedida);
        } else {
            setIdFEXUnidadMedida(null);
        } // end if
    }

    public void serializeFrom(TR_FEComprobantesDet p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar FEComprobantesDet desde un registro origen = null");
    }
        setIdComprobanteDet(p_src.getIdComprobanteDet());
        setIdDocumentoFE(p_src.getIdDocumentoFE());
        setCantidad(p_src.getCantidad());
        setDescripcion(p_src.getDescripcion());
        setPrecioUnitario(p_src.getPrecioUnitario());
        setValor1(p_src.getValor1());
        setValor2(p_src.getValor2());
        setSubtotal(p_src.getSubtotal());
        setLineaDet1(p_src.getLineaDet1());
        setLineaDet2(p_src.getLineaDet2());
        setCodigoProducto(p_src.getCodigoProducto());
        setBonificacion(p_src.getBonificacion());
        setIdFEXUnidadMedida(p_src.getIdFEXUnidadMedida());
    }

    public Integer getId() {
        return getIdComprobanteDet();
    }

}
