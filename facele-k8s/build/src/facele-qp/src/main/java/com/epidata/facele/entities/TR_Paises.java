/**
ORM table row class for: Paises
Generated: 2025-10-21 15:27:38
CRDETR un país, o estado soberano.
La enumeración se obtiene invocando el WS "FEParamGetTiposPaises"
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class TR_Paises extends AbstractRecord implements SinglePkRecord<Integer> {

    public TR_Paises() {
        m_IdPais = new com.epidata.facele.entities.D_IdPais();
        m_Descripcion = new com.epidata.facele.entities.D_Descripcion();
    }

    public TR_Paises(ResultSet p_rs) throws Exception {
        this();
        serializeFrom(p_rs);
    }

    /** Valor del campo: IdPais
    */
    private com.epidata.facele.entities.D_IdPais  m_IdPais;

    /**
    */
    public Integer getIdPais() {
        return m_IdPais.get();
    }
    /**
    */
    public void setIdPais(Integer p_value) {
        m_IdPais.set(p_value);
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
        Integer l_valueIdPais = p_rs.getInt("IdPais");
        if (!p_rs.wasNull()) {
            setIdPais(l_valueIdPais);
        } else {
            setIdPais(null);
        } // end if
        String l_valueDescripcion = p_rs.getString("Descripcion");
        if (!p_rs.wasNull()) {
            setDescripcion(l_valueDescripcion);
        } else {
            setDescripcion(null);
        } // end if
    }

    public void serializeFrom(TR_Paises p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar Paises desde un registro origen = null");
    }
        setIdPais(p_src.getIdPais());
        setDescripcion(p_src.getDescripcion());
    }

    public Integer getId() {
        return getIdPais();
    }

}
