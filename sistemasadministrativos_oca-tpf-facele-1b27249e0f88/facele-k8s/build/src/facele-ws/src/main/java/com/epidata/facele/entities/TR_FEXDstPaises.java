/**
ORM table row class for: FEXDstPaises
Generated: 2025-10-21 15:27:38
CRDETR un país, zona o región destino de exportación. 
La lista se obtiene desde el web-service WSFEX "FEXGetPARAM_DST_Pais".
Por ejemplo:
101: BURKINA FASO
108: CONGO
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class TR_FEXDstPaises extends AbstractRecord implements SinglePkRecord<String> {

    public TR_FEXDstPaises() {
        m_IdFEXDstPais = new com.epidata.facele.entities.D_IdFEXDstPais();
        m_Descripcion = new com.epidata.facele.entities.D_Descripcion();
    }

    public TR_FEXDstPaises(ResultSet p_rs) throws Exception {
        this();
        serializeFrom(p_rs);
    }

    /** Valor del campo: IdFEXDstPais
    */
    private com.epidata.facele.entities.D_IdFEXDstPais  m_IdFEXDstPais;

    /**
    */
    public String getIdFEXDstPais() {
        return m_IdFEXDstPais.get();
    }
    /**
    */
    public void setIdFEXDstPais(String p_value) {
        m_IdFEXDstPais.set(p_value);
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
        String l_valueIdFEXDstPais = p_rs.getString("IdFEXDstPais");
        if (!p_rs.wasNull()) {
            setIdFEXDstPais(l_valueIdFEXDstPais);
        } else {
            setIdFEXDstPais(null);
        } // end if
        String l_valueDescripcion = p_rs.getString("Descripcion");
        if (!p_rs.wasNull()) {
            setDescripcion(l_valueDescripcion);
        } else {
            setDescripcion(null);
        } // end if
    }

    public void serializeFrom(TR_FEXDstPaises p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar FEXDstPaises desde un registro origen = null");
    }
        setIdFEXDstPais(p_src.getIdFEXDstPais());
        setDescripcion(p_src.getDescripcion());
    }

    public String getId() {
        return getIdFEXDstPais();
    }

}
