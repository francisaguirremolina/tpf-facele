/**
ORM table row class for: IPCColas
Generated: 2025-10-21 15:27:38
CRDETR un registro para la comunicación inter procesos (IPC) entre el application server (WS) y las colas de generación de PDFs (QP) y autorizaciones en ARCA (QW).
Contiene un (y solo un) registro por cada cola; dos en total.
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class TR_IPCColas extends AbstractRecord implements SinglePkRecord<Integer> {

    public TR_IPCColas() {
        m_IdIPCCola = new com.epidata.facele.entities.D_IdIPCCola();
        m_TipoCola = new com.epidata.facele.entities.D_TipoCola();
        m_ColaActiva = new com.epidata.facele.entities.D_SQLBoolean();
        m_MensajeACola = new com.epidata.facele.entities.D_Observaciones();
        m_RespuestaDeCola = new com.epidata.facele.entities.D_Observaciones();
        m_EstadoDeCola = new com.epidata.facele.entities.D_Observaciones();
    }

    public TR_IPCColas(ResultSet p_rs) throws Exception {
        this();
        serializeFrom(p_rs);
    }

    /** Valor del campo: IdIPCCola
    */
    private com.epidata.facele.entities.D_IdIPCCola  m_IdIPCCola;

    /**
    */
    public Integer getIdIPCCola() {
        return m_IdIPCCola.get();
    }
    /**
    */
    public void setIdIPCCola(Integer p_value) {
        m_IdIPCCola.set(p_value);
    }

    /** Valor del campo: TipoCola
    */
    private com.epidata.facele.entities.D_TipoCola  m_TipoCola;

    /**
    */
    public String getTipoCola() {
        return m_TipoCola.get();
    }
    /**
    */
    public void setTipoCola(String p_value) {
        m_TipoCola.set(p_value);
    }

    /** Valor del campo: ColaActiva
    */
    private com.epidata.facele.entities.D_SQLBoolean  m_ColaActiva;

    /**
    */
    public Integer getColaActiva() {
        return m_ColaActiva.get();
    }
    /**
    */
    public void setColaActiva(Integer p_value) {
        m_ColaActiva.set(p_value);
    }

    /** Valor del campo: MensajeACola
    */
    private com.epidata.facele.entities.D_Observaciones  m_MensajeACola;

    /**
    */
    public String getMensajeACola() {
        return m_MensajeACola.get();
    }
    /**
    */
    public void setMensajeACola(String p_value) {
        m_MensajeACola.set(p_value);
    }

    /** Valor del campo: RespuestaDeCola
    */
    private com.epidata.facele.entities.D_Observaciones  m_RespuestaDeCola;

    /**
    */
    public String getRespuestaDeCola() {
        return m_RespuestaDeCola.get();
    }
    /**
    */
    public void setRespuestaDeCola(String p_value) {
        m_RespuestaDeCola.set(p_value);
    }

    /** Valor del campo: EstadoDeCola
    */
    private com.epidata.facele.entities.D_Observaciones  m_EstadoDeCola;

    /**
    */
    public String getEstadoDeCola() {
        return m_EstadoDeCola.get();
    }
    /**
    */
    public void setEstadoDeCola(String p_value) {
        m_EstadoDeCola.set(p_value);
    }

    public void serializeFrom(ResultSet p_rs) throws Exception {
        Integer l_valueIdIPCCola = p_rs.getInt("IdIPCCola");
        if (!p_rs.wasNull()) {
            setIdIPCCola(l_valueIdIPCCola);
        } else {
            setIdIPCCola(null);
        } // end if
        String l_valueTipoCola = p_rs.getString("TipoCola");
        if (!p_rs.wasNull()) {
            setTipoCola(l_valueTipoCola);
        } else {
            setTipoCola(null);
        } // end if
        Integer l_valueColaActiva = p_rs.getInt("ColaActiva");
        if (!p_rs.wasNull()) {
            setColaActiva(l_valueColaActiva);
        } else {
            setColaActiva(null);
        } // end if
        String l_valueMensajeACola = p_rs.getString("MensajeACola");
        if (!p_rs.wasNull()) {
            setMensajeACola(l_valueMensajeACola);
        } else {
            setMensajeACola(null);
        } // end if
        String l_valueRespuestaDeCola = p_rs.getString("RespuestaDeCola");
        if (!p_rs.wasNull()) {
            setRespuestaDeCola(l_valueRespuestaDeCola);
        } else {
            setRespuestaDeCola(null);
        } // end if
        String l_valueEstadoDeCola = p_rs.getString("EstadoDeCola");
        if (!p_rs.wasNull()) {
            setEstadoDeCola(l_valueEstadoDeCola);
        } else {
            setEstadoDeCola(null);
        } // end if
    }

    public void serializeFrom(TR_IPCColas p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar IPCColas desde un registro origen = null");
    }
        setIdIPCCola(p_src.getIdIPCCola());
        setTipoCola(p_src.getTipoCola());
        setColaActiva(p_src.getColaActiva());
        setMensajeACola(p_src.getMensajeACola());
        setRespuestaDeCola(p_src.getRespuestaDeCola());
        setEstadoDeCola(p_src.getEstadoDeCola());
    }

    public Integer getId() {
        return getIdIPCCola();
    }

}
