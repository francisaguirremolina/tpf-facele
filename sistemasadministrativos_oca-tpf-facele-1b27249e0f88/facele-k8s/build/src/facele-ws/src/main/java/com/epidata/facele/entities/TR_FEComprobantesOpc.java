/**
ORM table row class for: FEComprobantesOpc
Generated: 2025-10-21 15:27:38
CRDETR un concepto opcional declarado en un comprobante electrónico. 
Los datos opcionales sólo deberán ser incluidos si el emisor pertenece al conjunto de emisores habilitados a informar opcionales. En ese caso podrá incluir el o los datos opcionales que correspondan, especificando el identificador de dato opcional de acuerdo a la situación del emisor.
Un registro de concepto opcional ES-PARTE-DE un comprobante electrónico.
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class TR_FEComprobantesOpc extends AbstractRecord implements SinglePkRecord<Integer> {

    public TR_FEComprobantesOpc() {
        m_IdComprobOpc = new com.epidata.facele.entities.D_IdComprobOpc();
        m_IdDocumentoFE = new com.epidata.facele.entities.D_IdDocumentoFE();
        m_CodOpcional = new com.epidata.facele.entities.D_CodOpcional();
        m_Valor = new com.epidata.facele.entities.D_Descripcion();
    }

    public TR_FEComprobantesOpc(ResultSet p_rs) throws Exception {
        this();
        serializeFrom(p_rs);
    }

    /** Valor del campo: IdComprobOpc
    */
    private com.epidata.facele.entities.D_IdComprobOpc  m_IdComprobOpc;

    /**
    */
    public Integer getIdComprobOpc() {
        return m_IdComprobOpc.get();
    }
    /**
    */
    public void setIdComprobOpc(Integer p_value) {
        m_IdComprobOpc.set(p_value);
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

    /** Valor del campo: CodOpcional
    */
    private com.epidata.facele.entities.D_CodOpcional  m_CodOpcional;

    /**
    */
    public String getCodOpcional() {
        return m_CodOpcional.get();
    }
    /**
    */
    public void setCodOpcional(String p_value) {
        m_CodOpcional.set(p_value);
    }

    /** Valor del campo: Valor
    */
    private com.epidata.facele.entities.D_Descripcion  m_Valor;

    /**
    */
    public String getValor() {
        return m_Valor.get();
    }
    /**
    */
    public void setValor(String p_value) {
        m_Valor.set(p_value);
    }

    public void serializeFrom(ResultSet p_rs) throws Exception {
        Integer l_valueIdComprobOpc = p_rs.getInt("IdComprobOpc");
        if (!p_rs.wasNull()) {
            setIdComprobOpc(l_valueIdComprobOpc);
        } else {
            setIdComprobOpc(null);
        } // end if
        Integer l_valueIdDocumentoFE = p_rs.getInt("IdDocumentoFE");
        if (!p_rs.wasNull()) {
            setIdDocumentoFE(l_valueIdDocumentoFE);
        } else {
            setIdDocumentoFE(null);
        } // end if
        String l_valueCodOpcional = p_rs.getString("CodOpcional");
        if (!p_rs.wasNull()) {
            setCodOpcional(l_valueCodOpcional);
        } else {
            setCodOpcional(null);
        } // end if
        String l_valueValor = p_rs.getString("Valor");
        if (!p_rs.wasNull()) {
            setValor(l_valueValor);
        } else {
            setValor(null);
        } // end if
    }

    public void serializeFrom(TR_FEComprobantesOpc p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar FEComprobantesOpc desde un registro origen = null");
    }
        setIdComprobOpc(p_src.getIdComprobOpc());
        setIdDocumentoFE(p_src.getIdDocumentoFE());
        setCodOpcional(p_src.getCodOpcional());
        setValor(p_src.getValor());
    }

    public Integer getId() {
        return getIdComprobOpc();
    }

}
