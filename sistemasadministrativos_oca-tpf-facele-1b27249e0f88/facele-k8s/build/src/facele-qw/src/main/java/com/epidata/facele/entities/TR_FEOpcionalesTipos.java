/**
ORM table row class for: FEOpcionalesTipos
Generated: 2025-10-21 15:27:38
CRDETR un tipo de atributo opcional de un documento.
La lista puede obtenerse invocando la operación "FEParamGetTiposOpcional" del web-service WSFE,
y la operación "FEXGetPARAM_Opcionales" del web-service WSFEX.
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class TR_FEOpcionalesTipos extends AbstractRecord implements SinglePkRecord<String> {

    public TR_FEOpcionalesTipos() {
        m_CodOpcional = new com.epidata.facele.entities.D_CodOpcional();
        m_Descripcion = new com.epidata.facele.entities.D_Descripcion250();
        m_FchDesde = new com.epidata.facele.entities.D_Fecha();
        m_FchHasta = new com.epidata.facele.entities.D_Fecha();
        m_UsoNacional = new com.epidata.facele.entities.D_UsoNacional();
        m_UsoExportac = new com.epidata.facele.entities.D_UsoExportac();
    }

    public TR_FEOpcionalesTipos(ResultSet p_rs) throws Exception {
        this();
        serializeFrom(p_rs);
    }

    /** Valor del campo: CodOpcional
    */
    private com.epidata.facele.entities.D_CodOpcional  m_CodOpcional;

    /**
    */
    public String getCodOpcional() {
        return m_CodOpcional.get();
    }
    /**
    */
    public void setCodOpcional(String p_value) {
        m_CodOpcional.set(p_value);
    }

    /** Valor del campo: Descripcion
    */
    private com.epidata.facele.entities.D_Descripcion250  m_Descripcion;

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

    /** Valor del campo: FchDesde
    */
    private com.epidata.facele.entities.D_Fecha  m_FchDesde;

    /**
    */
    public Date getFchDesde() {
        return m_FchDesde.get();
    }
    /**
    */
    public void setFchDesde(Date p_value) {
        m_FchDesde.set(p_value);
    }

    /** Valor del campo: FchHasta
    */
    private com.epidata.facele.entities.D_Fecha  m_FchHasta;

    /**
    */
    public Date getFchHasta() {
        return m_FchHasta.get();
    }
    /**
    */
    public void setFchHasta(Date p_value) {
        m_FchHasta.set(p_value);
    }

    /** Valor del campo: UsoNacional
    */
    private com.epidata.facele.entities.D_UsoNacional  m_UsoNacional;

    /**
    */
    public Integer getUsoNacional() {
        return m_UsoNacional.get();
    }
    /**
    */
    public void setUsoNacional(Integer p_value) {
        m_UsoNacional.set(p_value);
    }

    /** Valor del campo: UsoExportac
    */
    private com.epidata.facele.entities.D_UsoExportac  m_UsoExportac;

    /**
    */
    public Integer getUsoExportac() {
        return m_UsoExportac.get();
    }
    /**
    */
    public void setUsoExportac(Integer p_value) {
        m_UsoExportac.set(p_value);
    }

    public void serializeFrom(ResultSet p_rs) throws Exception {
        String l_valueCodOpcional = p_rs.getString("CodOpcional");
        if (!p_rs.wasNull()) {
            setCodOpcional(l_valueCodOpcional);
        } else {
            setCodOpcional(null);
        } // end if
        String l_valueDescripcion = p_rs.getString("Descripcion");
        if (!p_rs.wasNull()) {
            setDescripcion(l_valueDescripcion);
        } else {
            setDescripcion(null);
        } // end if
        Date l_valueFchDesde = p_rs.getDate("FchDesde");
        if (!p_rs.wasNull()) {
            setFchDesde(l_valueFchDesde);
        } else {
            setFchDesde(null);
        } // end if
        Date l_valueFchHasta = p_rs.getDate("FchHasta");
        if (!p_rs.wasNull()) {
            setFchHasta(l_valueFchHasta);
        } else {
            setFchHasta(null);
        } // end if
        Integer l_valueUsoNacional = p_rs.getInt("UsoNacional");
        if (!p_rs.wasNull()) {
            setUsoNacional(l_valueUsoNacional);
        } else {
            setUsoNacional(null);
        } // end if
        Integer l_valueUsoExportac = p_rs.getInt("UsoExportac");
        if (!p_rs.wasNull()) {
            setUsoExportac(l_valueUsoExportac);
        } else {
            setUsoExportac(null);
        } // end if
    }

    public void serializeFrom(TR_FEOpcionalesTipos p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar FEOpcionalesTipos desde un registro origen = null");
    }
        setCodOpcional(p_src.getCodOpcional());
        setDescripcion(p_src.getDescripcion());
        setFchDesde(p_src.getFchDesde());
        setFchHasta(p_src.getFchHasta());
        setUsoNacional(p_src.getUsoNacional());
        setUsoExportac(p_src.getUsoExportac());
    }

    public String getId() {
        return getCodOpcional();
    }

}
