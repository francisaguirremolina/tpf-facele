/**
ORM table row class for: FECuits
Generated: 2025-10-21 15:27:38
CRDETR un contribuyente que emite comprobantes electrónicos. 
También almacena sus claves, certificados y el último ticket obtenido.
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class TR_FECuits extends AbstractRecord implements SinglePkRecord<Long> {

    public TR_FECuits() {
        m_Cuit = new com.epidata.facele.entities.D_Cuit();
        m_Descripcion = new com.epidata.facele.entities.D_Descripcion();
        m_Certificado = new com.epidata.facele.entities.D_Certificado();
        m_ClavePrivada = new com.epidata.facele.entities.D_ClavePrivada();
        m_TicketLive = new com.epidata.facele.entities.D_Segundos();
        m_Vencimiento = new com.epidata.facele.entities.D_FechaHora();
        m_Token = new com.epidata.facele.entities.D_Token();
        m_Sign = new com.epidata.facele.entities.D_Sign();
        m_VencCert = new com.epidata.facele.entities.D_Fecha();
        m_CBU = new com.epidata.facele.entities.D_CBU();
        m_VencimientoCDC = new com.epidata.facele.entities.D_FechaHora();
        m_TokenCDC = new com.epidata.facele.entities.D_Token();
        m_SignCDC = new com.epidata.facele.entities.D_Sign();
        m_VencimientoFEX = new com.epidata.facele.entities.D_FechaHora();
        m_TokenFEX = new com.epidata.facele.entities.D_Token();
        m_SignFEX = new com.epidata.facele.entities.D_Sign();
    }

    public TR_FECuits(ResultSet p_rs) throws Exception {
        this();
        serializeFrom(p_rs);
    }

    /** Valor del campo: Cuit
    */
    private com.epidata.facele.entities.D_Cuit  m_Cuit;

    /**
    */
    public Long getCuit() {
        return m_Cuit.get();
    }
    /**
    */
    public void setCuit(Long p_value) {
        m_Cuit.set(p_value);
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

    /** Valor del campo: Certificado
    */
    private com.epidata.facele.entities.D_Certificado  m_Certificado;

    /**
    */
    public String getCertificado() {
        return m_Certificado.get();
    }
    /**
    */
    public void setCertificado(String p_value) {
        m_Certificado.set(p_value);
    }

    /** Valor del campo: ClavePrivada
    */
    private com.epidata.facele.entities.D_ClavePrivada  m_ClavePrivada;

    /**
    */
    public String getClavePrivada() {
        return m_ClavePrivada.get();
    }
    /**
    */
    public void setClavePrivada(String p_value) {
        m_ClavePrivada.set(p_value);
    }

    /** Valor del campo: TicketLive
    */
    private com.epidata.facele.entities.D_Segundos  m_TicketLive;

    /**
    */
    public Integer getTicketLive() {
        return m_TicketLive.get();
    }
    /**
    */
    public void setTicketLive(Integer p_value) {
        m_TicketLive.set(p_value);
    }

    /** Valor del campo: Vencimiento
    */
    private com.epidata.facele.entities.D_FechaHora  m_Vencimiento;

    /**
    */
    public java.sql.Timestamp getVencimiento() {
        return m_Vencimiento.get();
    }
    /**
    */
    public void setVencimiento(java.sql.Timestamp p_value) {
        m_Vencimiento.set(p_value);
    }

    /** Valor del campo: Token
    */
    private com.epidata.facele.entities.D_Token  m_Token;

    /**
    */
    public String getToken() {
        return m_Token.get();
    }
    /**
    */
    public void setToken(String p_value) {
        m_Token.set(p_value);
    }

    /** Valor del campo: Sign
    */
    private com.epidata.facele.entities.D_Sign  m_Sign;

    /**
    */
    public String getSign() {
        return m_Sign.get();
    }
    /**
    */
    public void setSign(String p_value) {
        m_Sign.set(p_value);
    }

    /** Valor del campo: VencCert
    */
    private com.epidata.facele.entities.D_Fecha  m_VencCert;

    /**
    */
    public Date getVencCert() {
        return m_VencCert.get();
    }
    /**
    */
    public void setVencCert(Date p_value) {
        m_VencCert.set(p_value);
    }

    /** Valor del campo: CBU
    */
    private com.epidata.facele.entities.D_CBU  m_CBU;

    /**
    */
    public String getCBU() {
        return m_CBU.get();
    }
    /**
    */
    public void setCBU(String p_value) {
        m_CBU.set(p_value);
    }

    /** Valor del campo: VencimientoCDC
    */
    private com.epidata.facele.entities.D_FechaHora  m_VencimientoCDC;

    /**
    */
    public java.sql.Timestamp getVencimientoCDC() {
        return m_VencimientoCDC.get();
    }
    /**
    */
    public void setVencimientoCDC(java.sql.Timestamp p_value) {
        m_VencimientoCDC.set(p_value);
    }

    /** Valor del campo: TokenCDC
    */
    private com.epidata.facele.entities.D_Token  m_TokenCDC;

    /**
    */
    public String getTokenCDC() {
        return m_TokenCDC.get();
    }
    /**
    */
    public void setTokenCDC(String p_value) {
        m_TokenCDC.set(p_value);
    }

    /** Valor del campo: SignCDC
    */
    private com.epidata.facele.entities.D_Sign  m_SignCDC;

    /**
    */
    public String getSignCDC() {
        return m_SignCDC.get();
    }
    /**
    */
    public void setSignCDC(String p_value) {
        m_SignCDC.set(p_value);
    }

    /** Valor del campo: VencimientoFEX
    */
    private com.epidata.facele.entities.D_FechaHora  m_VencimientoFEX;

    /**
    */
    public java.sql.Timestamp getVencimientoFEX() {
        return m_VencimientoFEX.get();
    }
    /**
    */
    public void setVencimientoFEX(java.sql.Timestamp p_value) {
        m_VencimientoFEX.set(p_value);
    }

    /** Valor del campo: TokenFEX
    */
    private com.epidata.facele.entities.D_Token  m_TokenFEX;

    /**
    */
    public String getTokenFEX() {
        return m_TokenFEX.get();
    }
    /**
    */
    public void setTokenFEX(String p_value) {
        m_TokenFEX.set(p_value);
    }

    /** Valor del campo: SignFEX
    */
    private com.epidata.facele.entities.D_Sign  m_SignFEX;

    /**
    */
    public String getSignFEX() {
        return m_SignFEX.get();
    }
    /**
    */
    public void setSignFEX(String p_value) {
        m_SignFEX.set(p_value);
    }

    public void serializeFrom(ResultSet p_rs) throws Exception {
        Long l_valueCuit = p_rs.getLong("Cuit");
        if (!p_rs.wasNull()) {
            setCuit(l_valueCuit);
        } else {
            setCuit(null);
        } // end if
        String l_valueDescripcion = p_rs.getString("Descripcion");
        if (!p_rs.wasNull()) {
            setDescripcion(l_valueDescripcion);
        } else {
            setDescripcion(null);
        } // end if
        String l_valueCertificado = p_rs.getString("Certificado");
        if (!p_rs.wasNull()) {
            setCertificado(l_valueCertificado);
        } else {
            setCertificado(null);
        } // end if
        String l_valueClavePrivada = p_rs.getString("ClavePrivada");
        if (!p_rs.wasNull()) {
            setClavePrivada(l_valueClavePrivada);
        } else {
            setClavePrivada(null);
        } // end if
        Integer l_valueTicketLive = p_rs.getInt("TicketLive");
        if (!p_rs.wasNull()) {
            setTicketLive(l_valueTicketLive);
        } else {
            setTicketLive(null);
        } // end if
        java.sql.Timestamp l_valueVencimiento = p_rs.getTimestamp("Vencimiento");
        if (!p_rs.wasNull()) {
            setVencimiento(l_valueVencimiento);
        } else {
            setVencimiento(null);
        } // end if
        String l_valueToken = p_rs.getString("Token");
        if (!p_rs.wasNull()) {
            setToken(l_valueToken);
        } else {
            setToken(null);
        } // end if
        String l_valueSign = p_rs.getString("Sign");
        if (!p_rs.wasNull()) {
            setSign(l_valueSign);
        } else {
            setSign(null);
        } // end if
        Date l_valueVencCert = p_rs.getDate("VencCert");
        if (!p_rs.wasNull()) {
            setVencCert(l_valueVencCert);
        } else {
            setVencCert(null);
        } // end if
        String l_valueCBU = p_rs.getString("CBU");
        if (!p_rs.wasNull()) {
            setCBU(l_valueCBU);
        } else {
            setCBU(null);
        } // end if
        java.sql.Timestamp l_valueVencimientoCDC = p_rs.getTimestamp("VencimientoCDC");
        if (!p_rs.wasNull()) {
            setVencimientoCDC(l_valueVencimientoCDC);
        } else {
            setVencimientoCDC(null);
        } // end if
        String l_valueTokenCDC = p_rs.getString("TokenCDC");
        if (!p_rs.wasNull()) {
            setTokenCDC(l_valueTokenCDC);
        } else {
            setTokenCDC(null);
        } // end if
        String l_valueSignCDC = p_rs.getString("SignCDC");
        if (!p_rs.wasNull()) {
            setSignCDC(l_valueSignCDC);
        } else {
            setSignCDC(null);
        } // end if
        java.sql.Timestamp l_valueVencimientoFEX = p_rs.getTimestamp("VencimientoFEX");
        if (!p_rs.wasNull()) {
            setVencimientoFEX(l_valueVencimientoFEX);
        } else {
            setVencimientoFEX(null);
        } // end if
        String l_valueTokenFEX = p_rs.getString("TokenFEX");
        if (!p_rs.wasNull()) {
            setTokenFEX(l_valueTokenFEX);
        } else {
            setTokenFEX(null);
        } // end if
        String l_valueSignFEX = p_rs.getString("SignFEX");
        if (!p_rs.wasNull()) {
            setSignFEX(l_valueSignFEX);
        } else {
            setSignFEX(null);
        } // end if
    }

    public void serializeFrom(TR_FECuits p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar FECuits desde un registro origen = null");
    }
        setCuit(p_src.getCuit());
        setDescripcion(p_src.getDescripcion());
        setCertificado(p_src.getCertificado());
        setClavePrivada(p_src.getClavePrivada());
        setTicketLive(p_src.getTicketLive());
        setVencimiento(p_src.getVencimiento());
        setToken(p_src.getToken());
        setSign(p_src.getSign());
        setVencCert(p_src.getVencCert());
        setCBU(p_src.getCBU());
        setVencimientoCDC(p_src.getVencimientoCDC());
        setTokenCDC(p_src.getTokenCDC());
        setSignCDC(p_src.getSignCDC());
        setVencimientoFEX(p_src.getVencimientoFEX());
        setTokenFEX(p_src.getTokenFEX());
        setSignFEX(p_src.getSignFEX());
    }

    public Long getId() {
        return getCuit();
    }

}
