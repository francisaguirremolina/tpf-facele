/**
ORM table row class for: FEComprobantesTrib
Generated: 2025-10-21 15:27:38
CRDETR un tributo declarado en un comprobante electrónico.
Un registro de tributo ES-PARTE-DE un comprobante electrónico.
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class TR_FEComprobantesTrib extends AbstractRecord implements SinglePkRecord<Integer> {

    public TR_FEComprobantesTrib() {
        m_IdComprobTrib = new com.epidata.facele.entities.D_IdComprobTrib();
        m_IdDocumentoFE = new com.epidata.facele.entities.D_IdDocumentoFE();
        m_CodTributo = new com.epidata.facele.entities.D_CodTributo();
        m_Descripcion = new com.epidata.facele.entities.D_Descripcion();
        m_BaseImp = new com.epidata.facele.entities.D_Monto();
        m_Alic = new com.epidata.facele.entities.D_Monto();
        m_Importe = new com.epidata.facele.entities.D_Monto();
    }

    public TR_FEComprobantesTrib(ResultSet p_rs) throws Exception {
        this();
        serializeFrom(p_rs);
    }

    /** Valor del campo: IdComprobTrib
    */
    private com.epidata.facele.entities.D_IdComprobTrib  m_IdComprobTrib;

    /**
    */
    public Integer getIdComprobTrib() {
        return m_IdComprobTrib.get();
    }
    /**
    */
    public void setIdComprobTrib(Integer p_value) {
        m_IdComprobTrib.set(p_value);
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

    /** Valor del campo: CodTributo
    */
    private com.epidata.facele.entities.D_CodTributo  m_CodTributo;

    /**
    */
    public Integer getCodTributo() {
        return m_CodTributo.get();
    }
    /**
    */
    public void setCodTributo(Integer p_value) {
        m_CodTributo.set(p_value);
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

    /** Valor del campo: BaseImp
    */
    private com.epidata.facele.entities.D_Monto  m_BaseImp;

    /**
    */
    public Double getBaseImp() {
        return m_BaseImp.get();
    }
    /**
    */
    public void setBaseImp(Double p_value) {
        m_BaseImp.set(p_value);
    }

    /** Valor del campo: Alic
    */
    private com.epidata.facele.entities.D_Monto  m_Alic;

    /**
    */
    public Double getAlic() {
        return m_Alic.get();
    }
    /**
    */
    public void setAlic(Double p_value) {
        m_Alic.set(p_value);
    }

    /** Valor del campo: Importe
    */
    private com.epidata.facele.entities.D_Monto  m_Importe;

    /**
    */
    public Double getImporte() {
        return m_Importe.get();
    }
    /**
    */
    public void setImporte(Double p_value) {
        m_Importe.set(p_value);
    }

    public void serializeFrom(ResultSet p_rs) throws Exception {
        Integer l_valueIdComprobTrib = p_rs.getInt("IdComprobTrib");
        if (!p_rs.wasNull()) {
            setIdComprobTrib(l_valueIdComprobTrib);
        } else {
            setIdComprobTrib(null);
        } // end if
        Integer l_valueIdDocumentoFE = p_rs.getInt("IdDocumentoFE");
        if (!p_rs.wasNull()) {
            setIdDocumentoFE(l_valueIdDocumentoFE);
        } else {
            setIdDocumentoFE(null);
        } // end if
        Integer l_valueCodTributo = p_rs.getInt("CodTributo");
        if (!p_rs.wasNull()) {
            setCodTributo(l_valueCodTributo);
        } else {
            setCodTributo(null);
        } // end if
        String l_valueDescripcion = p_rs.getString("Descripcion");
        if (!p_rs.wasNull()) {
            setDescripcion(l_valueDescripcion);
        } else {
            setDescripcion(null);
        } // end if
        Double l_valueBaseImp = p_rs.getDouble("BaseImp");
        if (!p_rs.wasNull()) {
            setBaseImp(l_valueBaseImp);
        } else {
            setBaseImp(null);
        } // end if
        Double l_valueAlic = p_rs.getDouble("Alic");
        if (!p_rs.wasNull()) {
            setAlic(l_valueAlic);
        } else {
            setAlic(null);
        } // end if
        Double l_valueImporte = p_rs.getDouble("Importe");
        if (!p_rs.wasNull()) {
            setImporte(l_valueImporte);
        } else {
            setImporte(null);
        } // end if
    }

    public void serializeFrom(TR_FEComprobantesTrib p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar FEComprobantesTrib desde un registro origen = null");
    }
        setIdComprobTrib(p_src.getIdComprobTrib());
        setIdDocumentoFE(p_src.getIdDocumentoFE());
        setCodTributo(p_src.getCodTributo());
        setDescripcion(p_src.getDescripcion());
        setBaseImp(p_src.getBaseImp());
        setAlic(p_src.getAlic());
        setImporte(p_src.getImporte());
    }

    public Integer getId() {
        return getIdComprobTrib();
    }

}
