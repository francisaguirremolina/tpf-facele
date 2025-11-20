/**
ORM table row class for: FEComprobantesAsoc
Generated: 2025-10-21 15:27:38
CRDETR un comprobante asociado a un comprobante electrónico. 
Por ejemplo, una nota de crédito asociada a una factura del mismo CUIT.
Un registro comprobante asociado ES-PARTE-DE un comprobante electrónico.
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class TR_FEComprobantesAsoc extends AbstractRecord implements SinglePkRecord<Integer> {

    public TR_FEComprobantesAsoc() {
        m_IdComprobAsoc = new com.epidata.facele.entities.D_IdComprobAsoc();
        m_IdDocumentoFE = new com.epidata.facele.entities.D_IdDocumentoFE();
        m_PtoVta = new com.epidata.facele.entities.D_PtoVta();
        m_CbteTipo = new com.epidata.facele.entities.D_CbteTipo();
        m_CbteNumero = new com.epidata.facele.entities.D_CbteNumero();
        m_CbteCuit = new com.epidata.facele.entities.D_Cuit();
    }

    public TR_FEComprobantesAsoc(ResultSet p_rs) throws Exception {
        this();
        serializeFrom(p_rs);
    }

    /** Valor del campo: IdComprobAsoc
    */
    private com.epidata.facele.entities.D_IdComprobAsoc  m_IdComprobAsoc;

    /**
    */
    public Integer getIdComprobAsoc() {
        return m_IdComprobAsoc.get();
    }
    /**
    */
    public void setIdComprobAsoc(Integer p_value) {
        m_IdComprobAsoc.set(p_value);
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

    /** Valor del campo: PtoVta
    */
    private com.epidata.facele.entities.D_PtoVta  m_PtoVta;

    /**
    */
    public Integer getPtoVta() {
        return m_PtoVta.get();
    }
    /**
    */
    public void setPtoVta(Integer p_value) {
        m_PtoVta.set(p_value);
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

    /** Valor del campo: CbteNumero
    */
    private com.epidata.facele.entities.D_CbteNumero  m_CbteNumero;

    /**
    */
    public Integer getCbteNumero() {
        return m_CbteNumero.get();
    }
    /**
    */
    public void setCbteNumero(Integer p_value) {
        m_CbteNumero.set(p_value);
    }

    /** Valor del campo: CbteCuit
    */
    private com.epidata.facele.entities.D_Cuit  m_CbteCuit;

    /**
    */
    public Long getCbteCuit() {
        return m_CbteCuit.get();
    }
    /**
    */
    public void setCbteCuit(Long p_value) {
        m_CbteCuit.set(p_value);
    }

    public void serializeFrom(ResultSet p_rs) throws Exception {
        Integer l_valueIdComprobAsoc = p_rs.getInt("IdComprobAsoc");
        if (!p_rs.wasNull()) {
            setIdComprobAsoc(l_valueIdComprobAsoc);
        } else {
            setIdComprobAsoc(null);
        } // end if
        Integer l_valueIdDocumentoFE = p_rs.getInt("IdDocumentoFE");
        if (!p_rs.wasNull()) {
            setIdDocumentoFE(l_valueIdDocumentoFE);
        } else {
            setIdDocumentoFE(null);
        } // end if
        Integer l_valuePtoVta = p_rs.getInt("PtoVta");
        if (!p_rs.wasNull()) {
            setPtoVta(l_valuePtoVta);
        } else {
            setPtoVta(null);
        } // end if
        Integer l_valueCbteTipo = p_rs.getInt("CbteTipo");
        if (!p_rs.wasNull()) {
            setCbteTipo(l_valueCbteTipo);
        } else {
            setCbteTipo(null);
        } // end if
        Integer l_valueCbteNumero = p_rs.getInt("CbteNumero");
        if (!p_rs.wasNull()) {
            setCbteNumero(l_valueCbteNumero);
        } else {
            setCbteNumero(null);
        } // end if
        Long l_valueCbteCuit = p_rs.getLong("CbteCuit");
        if (!p_rs.wasNull()) {
            setCbteCuit(l_valueCbteCuit);
        } else {
            setCbteCuit(null);
        } // end if
    }

    public void serializeFrom(TR_FEComprobantesAsoc p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar FEComprobantesAsoc desde un registro origen = null");
    }
        setIdComprobAsoc(p_src.getIdComprobAsoc());
        setIdDocumentoFE(p_src.getIdDocumentoFE());
        setPtoVta(p_src.getPtoVta());
        setCbteTipo(p_src.getCbteTipo());
        setCbteNumero(p_src.getCbteNumero());
        setCbteCuit(p_src.getCbteCuit());
    }

    public Integer getId() {
        return getIdComprobAsoc();
    }

}
