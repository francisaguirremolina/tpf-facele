/**
ORM table row class for: FEDocTipos
Generated: 2025-10-21 15:27:38
CRDETR un tipo de documento de identificación de un tercero.
La lista puede obtenerse invocando la operación "FEParamGetTiposDoc" del web-service.
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class TR_FEDocTipos extends AbstractRecord implements SinglePkRecord<Integer> {

    public TR_FEDocTipos() {
        m_DocTipo = new com.epidata.facele.entities.D_DocTipo();
        m_Descripcion = new com.epidata.facele.entities.D_Descripcion();
        m_FchDesde = new com.epidata.facele.entities.D_Fecha();
        m_FchHasta = new com.epidata.facele.entities.D_Fecha();
    }

    public TR_FEDocTipos(ResultSet p_rs) throws Exception {
        this();
        serializeFrom(p_rs);
    }

    /** Valor del campo: DocTipo
    */
    private com.epidata.facele.entities.D_DocTipo  m_DocTipo;

    /**
    */
    public Integer getDocTipo() {
        return m_DocTipo.get();
    }
    /**
    */
    public void setDocTipo(Integer p_value) {
        m_DocTipo.set(p_value);
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

    public void serializeFrom(ResultSet p_rs) throws Exception {
        Integer l_valueDocTipo = p_rs.getInt("DocTipo");
        if (!p_rs.wasNull()) {
            setDocTipo(l_valueDocTipo);
        } else {
            setDocTipo(null);
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
    }

    public void serializeFrom(TR_FEDocTipos p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar FEDocTipos desde un registro origen = null");
    }
        setDocTipo(p_src.getDocTipo());
        setDescripcion(p_src.getDescripcion());
        setFchDesde(p_src.getFchDesde());
        setFchHasta(p_src.getFchHasta());
    }

    public Integer getId() {
        return getDocTipo();
    }

}
