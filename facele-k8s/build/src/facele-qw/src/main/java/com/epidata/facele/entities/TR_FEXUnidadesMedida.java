/**
ORM table row class for: FEXUnidadesMedida
Generated: 2025-10-21 15:27:38
CRDETR una unidad de medida (kilogramo, tonelada, etc.)
La lista se obtiene desde el web-service WSFEX "FEXGetPARAM_Umed".
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class TR_FEXUnidadesMedida extends AbstractRecord implements SinglePkRecord<Integer> {

    public TR_FEXUnidadesMedida() {
        m_IdFEXUnidadMedida = new com.epidata.facele.entities.D_IdFEXUnidadMedida();
        m_Descripcion = new com.epidata.facele.entities.D_Descripcion();
        m_FchDesde = new com.epidata.facele.entities.D_Fecha();
        m_FchHasta = new com.epidata.facele.entities.D_Fecha();
    }

    public TR_FEXUnidadesMedida(ResultSet p_rs) throws Exception {
        this();
        serializeFrom(p_rs);
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
        Integer l_valueIdFEXUnidadMedida = p_rs.getInt("IdFEXUnidadMedida");
        if (!p_rs.wasNull()) {
            setIdFEXUnidadMedida(l_valueIdFEXUnidadMedida);
        } else {
            setIdFEXUnidadMedida(null);
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

    public void serializeFrom(TR_FEXUnidadesMedida p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar FEXUnidadesMedida desde un registro origen = null");
    }
        setIdFEXUnidadMedida(p_src.getIdFEXUnidadMedida());
        setDescripcion(p_src.getDescripcion());
        setFchDesde(p_src.getFchDesde());
        setFchHasta(p_src.getFchHasta());
    }

    public Integer getId() {
        return getIdFEXUnidadMedida();
    }

}
