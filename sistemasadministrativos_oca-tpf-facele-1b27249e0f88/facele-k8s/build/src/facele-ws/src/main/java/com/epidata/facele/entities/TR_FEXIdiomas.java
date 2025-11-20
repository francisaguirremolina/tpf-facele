/**
ORM table row class for: FEXIdiomas
Generated: 2025-10-21 15:27:38
CRDETR un idioma - requerido en los comprobantes de exportación:
1: Español; 2: Inglés; etc.
La lista se obtiene desde el web-service WSFEX "FEXGetPARAM_Idiomas".
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class TR_FEXIdiomas extends AbstractRecord implements SinglePkRecord<Integer> {

    public TR_FEXIdiomas() {
        m_IdFEXIdioma = new com.epidata.facele.entities.D_IdFEXIdioma();
        m_Descripcion = new com.epidata.facele.entities.D_Descripcion();
        m_FchDesde = new com.epidata.facele.entities.D_Fecha();
        m_FchHasta = new com.epidata.facele.entities.D_Fecha();
    }

    public TR_FEXIdiomas(ResultSet p_rs) throws Exception {
        this();
        serializeFrom(p_rs);
    }

    /** Valor del campo: IdFEXIdioma
    */
    private com.epidata.facele.entities.D_IdFEXIdioma  m_IdFEXIdioma;

    /**
    */
    public Integer getIdFEXIdioma() {
        return m_IdFEXIdioma.get();
    }
    /**
    */
    public void setIdFEXIdioma(Integer p_value) {
        m_IdFEXIdioma.set(p_value);
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
        Integer l_valueIdFEXIdioma = p_rs.getInt("IdFEXIdioma");
        if (!p_rs.wasNull()) {
            setIdFEXIdioma(l_valueIdFEXIdioma);
        } else {
            setIdFEXIdioma(null);
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

    public void serializeFrom(TR_FEXIdiomas p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar FEXIdiomas desde un registro origen = null");
    }
        setIdFEXIdioma(p_src.getIdFEXIdioma());
        setDescripcion(p_src.getDescripcion());
        setFchDesde(p_src.getFchDesde());
        setFchHasta(p_src.getFchHasta());
    }

    public Integer getId() {
        return getIdFEXIdioma();
    }

}
