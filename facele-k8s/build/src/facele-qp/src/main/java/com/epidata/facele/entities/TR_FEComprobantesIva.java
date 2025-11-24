/**
ORM table row class for: FEComprobantesIva
Generated: 2025-10-21 15:27:38
CRDETR una alícuota de IVA declarada en un comprobante electrónico.
Un registro de IVA ES-PARTE-DE un comprobante electrónico.
Se utiliza en comprobantes "A", "B", o "M".
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class TR_FEComprobantesIva extends AbstractRecord implements SinglePkRecord<Integer> {

    public TR_FEComprobantesIva() {
        m_IdComprobIVA = new com.epidata.facele.entities.D_IdComprobIVA();
        m_IdDocumentoFE = new com.epidata.facele.entities.D_IdDocumentoFE();
        m_CodAlicIVA = new com.epidata.facele.entities.D_CodAlicIVA();
        m_BaseImp = new com.epidata.facele.entities.D_Monto();
        m_Importe = new com.epidata.facele.entities.D_Monto();
    }

    public TR_FEComprobantesIva(ResultSet p_rs) throws Exception {
        this();
        serializeFrom(p_rs);
    }

    /** Valor del campo: IdComprobIVA
    */
    private com.epidata.facele.entities.D_IdComprobIVA  m_IdComprobIVA;

    /**
    */
    public Integer getIdComprobIVA() {
        return m_IdComprobIVA.get();
    }
    /**
    */
    public void setIdComprobIVA(Integer p_value) {
        m_IdComprobIVA.set(p_value);
    }

    /** Valor del campo: IdDocumentoFE
    */
    private com.epidata.facele.entities.D_IdDocumentoFE  m_IdDocumentoFE;

    /**
    */
    public Integer getIdDocumentoFE() {
        return m_IdDocumentoFE.get();
    }
    /**
    */
    public void setIdDocumentoFE(Integer p_value) {
        m_IdDocumentoFE.set(p_value);
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

    /** Valor del campo: BaseImp
    */
    private com.epidata.facele.entities.D_Monto  m_BaseImp;

    /**
    */
    public Double getBaseImp() {
        return m_BaseImp.get();
    }
    /**
    */
    public void setBaseImp(Double p_value) {
        m_BaseImp.set(p_value);
    }

    /** Valor del campo: Importe
    */
    private com.epidata.facele.entities.D_Monto  m_Importe;

    /**
    */
    public Double getImporte() {
        return m_Importe.get();
    }
    /**
    */
    public void setImporte(Double p_value) {
        m_Importe.set(p_value);
    }

    public void serializeFrom(ResultSet p_rs) throws Exception {
        Integer l_valueIdComprobIVA = p_rs.getInt("IdComprobIVA");
        if (!p_rs.wasNull()) {
            setIdComprobIVA(l_valueIdComprobIVA);
        } else {
            setIdComprobIVA(null);
        } // end if
        Integer l_valueIdDocumentoFE = p_rs.getInt("IdDocumentoFE");
        if (!p_rs.wasNull()) {
            setIdDocumentoFE(l_valueIdDocumentoFE);
        } else {
            setIdDocumentoFE(null);
        } // end if
        Integer l_valueCodAlicIVA = p_rs.getInt("CodAlicIVA");
        if (!p_rs.wasNull()) {
            setCodAlicIVA(l_valueCodAlicIVA);
        } else {
            setCodAlicIVA(null);
        } // end if
        Double l_valueBaseImp = p_rs.getDouble("BaseImp");
        if (!p_rs.wasNull()) {
            setBaseImp(l_valueBaseImp);
        } else {
            setBaseImp(null);
        } // end if
        Double l_valueImporte = p_rs.getDouble("Importe");
        if (!p_rs.wasNull()) {
            setImporte(l_valueImporte);
        } else {
            setImporte(null);
        } // end if
    }

    public void serializeFrom(TR_FEComprobantesIva p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar FEComprobantesIva desde un registro origen = null");
    }
        setIdComprobIVA(p_src.getIdComprobIVA());
        setIdDocumentoFE(p_src.getIdDocumentoFE());
        setCodAlicIVA(p_src.getCodAlicIVA());
        setBaseImp(p_src.getBaseImp());
        setImporte(p_src.getImporte());
    }

    public Integer getId() {
        return getIdComprobIVA();
    }

}
