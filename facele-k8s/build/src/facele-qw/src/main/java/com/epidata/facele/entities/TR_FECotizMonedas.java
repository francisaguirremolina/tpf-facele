/**
ORM table row class for: FECotizMonedas
Generated: 2025-10-21 15:27:38
CRDETR una moneda y su cotización vigente.
La lista puede obtenerse invocando la operación "FEParamGetTiposMonedas" del web-service WSFE,
y de la operación execFEXGetParamMon del web-service WSFEX.
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class TR_FECotizMonedas extends AbstractRecord implements SinglePkRecord<Integer> {

    public TR_FECotizMonedas() {
        m_MonId = new com.epidata.facele.entities.D_MonId();
        m_FechaCotiz = new com.epidata.facele.entities.D_Fecha();
        m_MonCotiz = new com.epidata.facele.entities.D_MonCotiz();
        m_IdCotizMoneda = new com.epidata.facele.entities.D_IdCotizMoneda();
    }

    public TR_FECotizMonedas(ResultSet p_rs) throws Exception {
        this();
        serializeFrom(p_rs);
    }

    /** Valor del campo: MonId
    */
    private com.epidata.facele.entities.D_MonId  m_MonId;

    /**
    */
    public String getMonId() {
        return m_MonId.get();
    }
    /**
    */
    public void setMonId(String p_value) {
        m_MonId.set(p_value);
    }

    /** Valor del campo: FechaCotiz
    */
    private com.epidata.facele.entities.D_Fecha  m_FechaCotiz;

    /**
    */
    public Date getFechaCotiz() {
        return m_FechaCotiz.get();
    }
    /**
    */
    public void setFechaCotiz(Date p_value) {
        m_FechaCotiz.set(p_value);
    }

    /** Valor del campo: MonCotiz
    */
    private com.epidata.facele.entities.D_MonCotiz  m_MonCotiz;

    /**
    */
    public Double getMonCotiz() {
        return m_MonCotiz.get();
    }
    /**
    */
    public void setMonCotiz(Double p_value) {
        m_MonCotiz.set(p_value);
    }

    /** Valor del campo: IdCotizMoneda
    */
    private com.epidata.facele.entities.D_IdCotizMoneda  m_IdCotizMoneda;

    /**
    */
    public Integer getIdCotizMoneda() {
        return m_IdCotizMoneda.get();
    }
    /**
    */
    public void setIdCotizMoneda(Integer p_value) {
        m_IdCotizMoneda.set(p_value);
    }

    public void serializeFrom(ResultSet p_rs) throws Exception {
        String l_valueMonId = p_rs.getString("MonId");
        if (!p_rs.wasNull()) {
            setMonId(l_valueMonId);
        } else {
            setMonId(null);
        } // end if
        Date l_valueFechaCotiz = p_rs.getDate("FechaCotiz");
        if (!p_rs.wasNull()) {
            setFechaCotiz(l_valueFechaCotiz);
        } else {
            setFechaCotiz(null);
        } // end if
        Double l_valueMonCotiz = p_rs.getDouble("MonCotiz");
        if (!p_rs.wasNull()) {
            setMonCotiz(l_valueMonCotiz);
        } else {
            setMonCotiz(null);
        } // end if
        Integer l_valueIdCotizMoneda = p_rs.getInt("IdCotizMoneda");
        if (!p_rs.wasNull()) {
            setIdCotizMoneda(l_valueIdCotizMoneda);
        } else {
            setIdCotizMoneda(null);
        } // end if
    }

    public void serializeFrom(TR_FECotizMonedas p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar FECotizMonedas desde un registro origen = null");
    }
        setMonId(p_src.getMonId());
        setFechaCotiz(p_src.getFechaCotiz());
        setMonCotiz(p_src.getMonCotiz());
        setIdCotizMoneda(p_src.getIdCotizMoneda());
    }

    public Integer getId() {
        return getIdCotizMoneda();
    }

}
