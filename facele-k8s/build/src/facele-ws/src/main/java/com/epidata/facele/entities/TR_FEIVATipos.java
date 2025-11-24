/**
ORM table row class for: FEIVATipos
Generated: 2025-10-21 15:27:38
CRDETR una alícuota de IVA.
La lista puede obtenerse invocando la operación "FEParamGetTiposIva" del web-service.
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class TR_FEIVATipos extends AbstractRecord implements SinglePkRecord<Integer> {

    public TR_FEIVATipos() {
        m_CodAlicIVA = new com.epidata.facele.entities.D_CodAlicIVA();
        m_Descripcion = new com.epidata.facele.entities.D_Descripcion();
        m_FchDesde = new com.epidata.facele.entities.D_Fecha();
        m_FchHasta = new com.epidata.facele.entities.D_Fecha();
        m_Alicuota = new com.epidata.facele.entities.D_Porcentaje();
    }

    public TR_FEIVATipos(ResultSet p_rs) throws Exception {
        this();
        serializeFrom(p_rs);
    }

    /** Valor del campo: CodAlicIVA
    */
    private com.epidata.facele.entities.D_CodAlicIVA  m_CodAlicIVA;

    /**
    */
    public Integer getCodAlicIVA() {
        return m_CodAlicIVA.get();
    }
    /**
    */
    public void setCodAlicIVA(Integer p_value) {
        m_CodAlicIVA.set(p_value);
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

    /** Valor del campo: Alicuota
    */
    private com.epidata.facele.entities.D_Porcentaje  m_Alicuota;

    /**
    */
    public Double getAlicuota() {
        return m_Alicuota.get();
    }
    /**
    */
    public void setAlicuota(Double p_value) {
        m_Alicuota.set(p_value);
    }

    public void serializeFrom(ResultSet p_rs) throws Exception {
        Integer l_valueCodAlicIVA = p_rs.getInt("CodAlicIVA");
        if (!p_rs.wasNull()) {
            setCodAlicIVA(l_valueCodAlicIVA);
        } else {
            setCodAlicIVA(null);
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
        Double l_valueAlicuota = p_rs.getDouble("Alicuota");
        if (!p_rs.wasNull()) {
            setAlicuota(l_valueAlicuota);
        } else {
            setAlicuota(null);
        } // end if
    }

    public void serializeFrom(TR_FEIVATipos p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar FEIVATipos desde un registro origen = null");
    }
        setCodAlicIVA(p_src.getCodAlicIVA());
        setDescripcion(p_src.getDescripcion());
        setFchDesde(p_src.getFchDesde());
        setFchHasta(p_src.getFchHasta());
        setAlicuota(p_src.getAlicuota());
    }

    public Integer getId() {
        return getCodAlicIVA();
    }

}
