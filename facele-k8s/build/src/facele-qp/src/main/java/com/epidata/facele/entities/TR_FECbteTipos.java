/**
ORM table row class for: FECbteTipos
Generated: 2025-10-21 15:27:38
CRDETR un tipo de comprobante, según la tipificación establecida por ARCA.
La lista puede obtenerse invocando la operación "FEParamGetTiposCbte" del web-service WSFE,
y la operación "FEXGetPARAM_Cbte_Tipo" del web-service WSFEX.
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class TR_FECbteTipos extends AbstractRecord implements SinglePkRecord<Integer> {

    public TR_FECbteTipos() {
        m_CbteTipo = new com.epidata.facele.entities.D_CbteTipo();
        m_Descripcion = new com.epidata.facele.entities.D_Descripcion();
        m_FchDesde = new com.epidata.facele.entities.D_Fecha();
        m_FchHasta = new com.epidata.facele.entities.D_Fecha();
        m_LetraFiscal = new com.epidata.facele.entities.D_LetraFiscal();
        m_Sintetico = new com.epidata.facele.entities.D_Descripcion();
        m_ReportTemplate = new com.epidata.facele.entities.D_ReportTemplate();
        m_CbteFam = new com.epidata.facele.entities.D_CbteFam();
        m_UsoNacional = new com.epidata.facele.entities.D_UsoNacional();
        m_UsoExportac = new com.epidata.facele.entities.D_UsoExportac();
    }

    public TR_FECbteTipos(ResultSet p_rs) throws Exception {
        this();
        serializeFrom(p_rs);
    }

    /** Valor del campo: CbteTipo
    */
    private com.epidata.facele.entities.D_CbteTipo  m_CbteTipo;

    /**
    */
    public Integer getCbteTipo() {
        return m_CbteTipo.get();
    }
    /**
    */
    public void setCbteTipo(Integer p_value) {
        m_CbteTipo.set(p_value);
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

    /** Valor del campo: LetraFiscal
    */
    private com.epidata.facele.entities.D_LetraFiscal  m_LetraFiscal;

    /**
    */
    public String getLetraFiscal() {
        return m_LetraFiscal.get();
    }
    /**
    */
    public void setLetraFiscal(String p_value) {
        m_LetraFiscal.set(p_value);
    }

    /** Valor del campo: Sintetico
    */
    private com.epidata.facele.entities.D_Descripcion  m_Sintetico;

    /**
    */
    public String getSintetico() {
        return m_Sintetico.get();
    }
    /**
    */
    public void setSintetico(String p_value) {
        m_Sintetico.set(p_value);
    }

    /** Valor del campo: ReportTemplate
    */
    private com.epidata.facele.entities.D_ReportTemplate  m_ReportTemplate;

    /**
    */
    public String getReportTemplate() {
        return m_ReportTemplate.get();
    }
    /**
    */
    public void setReportTemplate(String p_value) {
        m_ReportTemplate.set(p_value);
    }

    /** Valor del campo: CbteFam
    */
    private com.epidata.facele.entities.D_CbteFam  m_CbteFam;

    /**
    */
    public String getCbteFam() {
        return m_CbteFam.get();
    }
    /**
    */
    public void setCbteFam(String p_value) {
        m_CbteFam.set(p_value);
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

    public void serializeFrom(ResultSet p_rs) throws Exception {
        Integer l_valueCbteTipo = p_rs.getInt("CbteTipo");
        if (!p_rs.wasNull()) {
            setCbteTipo(l_valueCbteTipo);
        } else {
            setCbteTipo(null);
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
        String l_valueLetraFiscal = p_rs.getString("LetraFiscal");
        if (!p_rs.wasNull()) {
            setLetraFiscal(l_valueLetraFiscal);
        } else {
            setLetraFiscal(null);
        } // end if
        String l_valueSintetico = p_rs.getString("Sintetico");
        if (!p_rs.wasNull()) {
            setSintetico(l_valueSintetico);
        } else {
            setSintetico(null);
        } // end if
        String l_valueReportTemplate = p_rs.getString("ReportTemplate");
        if (!p_rs.wasNull()) {
            setReportTemplate(l_valueReportTemplate);
        } else {
            setReportTemplate(null);
        } // end if
        String l_valueCbteFam = p_rs.getString("CbteFam");
        if (!p_rs.wasNull()) {
            setCbteFam(l_valueCbteFam);
        } else {
            setCbteFam(null);
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
    }

    public void serializeFrom(TR_FECbteTipos p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar FECbteTipos desde un registro origen = null");
    }
        setCbteTipo(p_src.getCbteTipo());
        setDescripcion(p_src.getDescripcion());
        setFchDesde(p_src.getFchDesde());
        setFchHasta(p_src.getFchHasta());
        setLetraFiscal(p_src.getLetraFiscal());
        setSintetico(p_src.getSintetico());
        setReportTemplate(p_src.getReportTemplate());
        setCbteFam(p_src.getCbteFam());
        setUsoNacional(p_src.getUsoNacional());
        setUsoExportac(p_src.getUsoExportac());
    }

    public Integer getId() {
        return getCbteTipo();
    }

}
