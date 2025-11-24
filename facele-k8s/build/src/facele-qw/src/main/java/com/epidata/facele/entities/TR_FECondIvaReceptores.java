/**
ORM table row class for: FECondIvaReceptores
Generated: 2025-10-21 15:27:38
CRDETR una condición de IVA de un receptor de un comprobante fiscal.
La enumeración se obtiene invocando el WS "FEParamGetCondicionIvaReceptor"
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class TR_FECondIvaReceptores extends AbstractRecord implements SinglePkRecord<Integer> {

    public TR_FECondIvaReceptores() {
        m_CodCondIva = new com.epidata.facele.entities.D_CodCondIva();
        m_CmpClase = new com.epidata.facele.entities.D_CmpClase();
        m_Descripcion = new com.epidata.facele.entities.D_Descripcion();
    }

    public TR_FECondIvaReceptores(ResultSet p_rs) throws Exception {
        this();
        serializeFrom(p_rs);
    }

    /** Valor del campo: CodCondIva
    */
    private com.epidata.facele.entities.D_CodCondIva  m_CodCondIva;

    /**
    */
    public Integer getCodCondIva() {
        return m_CodCondIva.get();
    }
    /**
    */
    public void setCodCondIva(Integer p_value) {
        m_CodCondIva.set(p_value);
    }

    /** Valor del campo: CmpClase
    */
    private com.epidata.facele.entities.D_CmpClase  m_CmpClase;

    /**
    */
    public String getCmpClase() {
        return m_CmpClase.get();
    }
    /**
    */
    public void setCmpClase(String p_value) {
        m_CmpClase.set(p_value);
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

    public void serializeFrom(ResultSet p_rs) throws Exception {
        Integer l_valueCodCondIva = p_rs.getInt("CodCondIva");
        if (!p_rs.wasNull()) {
            setCodCondIva(l_valueCodCondIva);
        } else {
            setCodCondIva(null);
        } // end if
        String l_valueCmpClase = p_rs.getString("CmpClase");
        if (!p_rs.wasNull()) {
            setCmpClase(l_valueCmpClase);
        } else {
            setCmpClase(null);
        } // end if
        String l_valueDescripcion = p_rs.getString("Descripcion");
        if (!p_rs.wasNull()) {
            setDescripcion(l_valueDescripcion);
        } else {
            setDescripcion(null);
        } // end if
    }

    public void serializeFrom(TR_FECondIvaReceptores p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar FECondIvaReceptores desde un registro origen = null");
    }
        setCodCondIva(p_src.getCodCondIva());
        setCmpClase(p_src.getCmpClase());
        setDescripcion(p_src.getDescripcion());
    }

    public Integer getId() {
        return getCodCondIva();
    }

}
