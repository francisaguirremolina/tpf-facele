/**
ORM table row class for: ModeloCopias
Generated: 2025-10-21 15:27:38
CRDETR una copia de un modelo de documento (ORIGINAL en el modelo ORIGINAL+DUPLICADO, DUPLICADO en el modelo ORIGINAL+DUPLICADO, etc.
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class TR_ModeloCopias extends AbstractRecord implements SinglePkRecord<Integer> {

    public TR_ModeloCopias() {
        m_IdCopia = new com.epidata.facele.entities.D_IdCopia();
        m_Modelo = new com.epidata.facele.entities.D_Descripcion();
        m_Copia = new com.epidata.facele.entities.D_Descripcion();
        m_Observaciones = new com.epidata.facele.entities.D_Observaciones();
        m_Predeterminado = new com.epidata.facele.entities.D_SQLBoolean();
    }

    public TR_ModeloCopias(ResultSet p_rs) throws Exception {
        this();
        serializeFrom(p_rs);
    }

    /** Valor del campo: IdCopia
    */
    private com.epidata.facele.entities.D_IdCopia  m_IdCopia;

    /**
    */
    public Integer getIdCopia() {
        return m_IdCopia.get();
    }
    /**
    */
    public void setIdCopia(Integer p_value) {
        m_IdCopia.set(p_value);
    }

    /** Valor del campo: Modelo
    */
    private com.epidata.facele.entities.D_Descripcion  m_Modelo;

    /**
    */
    public String getModelo() {
        return m_Modelo.get();
    }
    /**
    */
    public void setModelo(String p_value) {
        m_Modelo.set(p_value);
    }

    /** Valor del campo: Copia
    */
    private com.epidata.facele.entities.D_Descripcion  m_Copia;

    /**
    */
    public String getCopia() {
        return m_Copia.get();
    }
    /**
    */
    public void setCopia(String p_value) {
        m_Copia.set(p_value);
    }

    /** Valor del campo: Observaciones
    */
    private com.epidata.facele.entities.D_Observaciones  m_Observaciones;

    /**
    */
    public String getObservaciones() {
        return m_Observaciones.get();
    }
    /**
    */
    public void setObservaciones(String p_value) {
        m_Observaciones.set(p_value);
    }

    /** Valor del campo: Predeterminado
    */
    private com.epidata.facele.entities.D_SQLBoolean  m_Predeterminado;

    /**
    */
    public Integer getPredeterminado() {
        return m_Predeterminado.get();
    }
    /**
    */
    public void setPredeterminado(Integer p_value) {
        m_Predeterminado.set(p_value);
    }

    public void serializeFrom(ResultSet p_rs) throws Exception {
        Integer l_valueIdCopia = p_rs.getInt("IdCopia");
        if (!p_rs.wasNull()) {
            setIdCopia(l_valueIdCopia);
        } else {
            setIdCopia(null);
        } // end if
        String l_valueModelo = p_rs.getString("Modelo");
        if (!p_rs.wasNull()) {
            setModelo(l_valueModelo);
        } else {
            setModelo(null);
        } // end if
        String l_valueCopia = p_rs.getString("Copia");
        if (!p_rs.wasNull()) {
            setCopia(l_valueCopia);
        } else {
            setCopia(null);
        } // end if
        String l_valueObservaciones = p_rs.getString("Observaciones");
        if (!p_rs.wasNull()) {
            setObservaciones(l_valueObservaciones);
        } else {
            setObservaciones(null);
        } // end if
        Integer l_valuePredeterminado = p_rs.getInt("Predeterminado");
        if (!p_rs.wasNull()) {
            setPredeterminado(l_valuePredeterminado);
        } else {
            setPredeterminado(null);
        } // end if
    }

    public void serializeFrom(TR_ModeloCopias p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar ModeloCopias desde un registro origen = null");
    }
        setIdCopia(p_src.getIdCopia());
        setModelo(p_src.getModelo());
        setCopia(p_src.getCopia());
        setObservaciones(p_src.getObservaciones());
        setPredeterminado(p_src.getPredeterminado());
    }

    public Integer getId() {
        return getIdCopia();
    }

}
