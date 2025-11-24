/**
ORM table row class for: FEXDstCuits
Generated: 2025-10-21 15:27:38
CRDETR el CUIT de un país, estado o región administrativa destinataria de una exportación.
La lista se obtiene desde el web-service WSFEX "FEXGetPARAM_DST_CUIT".
Ejemplos:
50000000016: "URUGUAY - Persona Física"
50000000024: "PARAGUAY - Persona Física"
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class TR_FEXDstCuits extends AbstractRecord implements SinglePkRecord<Long> {

    public TR_FEXDstCuits() {
        m_IdFEXDstCuit = new com.epidata.facele.entities.D_IdFEXDstCuit();
        m_Descripcion = new com.epidata.facele.entities.D_Descripcion();
    }

    public TR_FEXDstCuits(ResultSet p_rs) throws Exception {
        this();
        serializeFrom(p_rs);
    }

    /** Valor del campo: IdFEXDstCuit
    */
    private com.epidata.facele.entities.D_IdFEXDstCuit  m_IdFEXDstCuit;

    /**
    */
    public Long getIdFEXDstCuit() {
        return m_IdFEXDstCuit.get();
    }
    /**
    */
    public void setIdFEXDstCuit(Long p_value) {
        m_IdFEXDstCuit.set(p_value);
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
        Long l_valueIdFEXDstCuit = p_rs.getLong("IdFEXDstCuit");
        if (!p_rs.wasNull()) {
            setIdFEXDstCuit(l_valueIdFEXDstCuit);
        } else {
            setIdFEXDstCuit(null);
        } // end if
        String l_valueDescripcion = p_rs.getString("Descripcion");
        if (!p_rs.wasNull()) {
            setDescripcion(l_valueDescripcion);
        } else {
            setDescripcion(null);
        } // end if
    }

    public void serializeFrom(TR_FEXDstCuits p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar FEXDstCuits desde un registro origen = null");
    }
        setIdFEXDstCuit(p_src.getIdFEXDstCuit());
        setDescripcion(p_src.getDescripcion());
    }

    public Long getId() {
        return getIdFEXDstCuit();
    }

}
