/**
ORM table row class for: Monedas
Generated: 2025-10-21 15:27:38
CRDETR una moneda nacional o divisa extranjera (o ambas).
La enumeración se obtiene invocando el web-service WSFE "FEParamGetTiposMonedas"
o al web-service WSFEX "FEXGetPARAM_MON".
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class TR_Monedas extends AbstractRecord implements SinglePkRecord<String> {

    public TR_Monedas() {
        m_MonId = new com.epidata.facele.entities.D_MonId();
        m_Descripcion = new com.epidata.facele.entities.D_Descripcion();
        m_FchDesde = new com.epidata.facele.entities.D_Fecha();
        m_FchHasta = new com.epidata.facele.entities.D_Fecha();
        m_UsoNacional = new com.epidata.facele.entities.D_UsoNacional();
        m_UsoExportac = new com.epidata.facele.entities.D_UsoExportac();
        m_SimboloMoneda = new com.epidata.facele.entities.D_SimboloMoneda();
    }

    public TR_Monedas(ResultSet p_rs) throws Exception {
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

    /** Valor del campo: SimboloMoneda
    */
    private com.epidata.facele.entities.D_SimboloMoneda  m_SimboloMoneda;

    /**
    */
    public String getSimboloMoneda() {
        return m_SimboloMoneda.get();
    }
    /**
    */
    public void setSimboloMoneda(String p_value) {
        m_SimboloMoneda.set(p_value);
    }

    public void serializeFrom(ResultSet p_rs) throws Exception {
        String l_valueMonId = p_rs.getString("MonId");
        if (!p_rs.wasNull()) {
            setMonId(l_valueMonId);
        } else {
            setMonId(null);
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
        String l_valueSimboloMoneda = p_rs.getString("SimboloMoneda");
        if (!p_rs.wasNull()) {
            setSimboloMoneda(l_valueSimboloMoneda);
        } else {
            setSimboloMoneda(null);
        } // end if
    }

    public void serializeFrom(TR_Monedas p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar Monedas desde un registro origen = null");
    }
        setMonId(p_src.getMonId());
        setDescripcion(p_src.getDescripcion());
        setFchDesde(p_src.getFchDesde());
        setFchHasta(p_src.getFchHasta());
        setUsoNacional(p_src.getUsoNacional());
        setUsoExportac(p_src.getUsoExportac());
        setSimboloMoneda(p_src.getSimboloMoneda());
    }

    public String getId() {
        return getMonId();
    }

}
