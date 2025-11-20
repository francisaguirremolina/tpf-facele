/**
ORM view row class for: rp_ComprobanteQR_b64
Generated: 2025-10-21 15:27:38
null
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class VR_rp_ComprobanteQR_b64 extends AbstractRecord implements SinglePkRecord<Integer> {

    public VR_rp_ComprobanteQR_b64() {
        m_IdDocumentoFE = new com.epidata.facele.entities.D_IdDocumentoFE();
        m_textoqr1 = new com.epidata.facele.entities.D_QR();
        m_textoqr2 = new com.epidata.facele.entities.D_QR();
    }

    public VR_rp_ComprobanteQR_b64(ResultSet p_rs) throws Exception {
        this();
        serializeFrom(p_rs);
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

    /** Valor del campo: textoqr1
    */
    private com.epidata.facele.entities.D_QR  m_textoqr1;

    /**
    */
    public String getTextoqr1() {
        return m_textoqr1.get();
    }
    /**
    */
    public void setTextoqr1(String p_value) {
        m_textoqr1.set(p_value);
    }

    /** Valor del campo: textoqr2
    */
    private com.epidata.facele.entities.D_QR  m_textoqr2;

    /**
    */
    public String getTextoqr2() {
        return m_textoqr2.get();
    }
    /**
    */
    public void setTextoqr2(String p_value) {
        m_textoqr2.set(p_value);
    }

    public void serializeFrom(ResultSet p_rs) throws Exception {
        Integer l_valueIdDocumentoFE = p_rs.getInt("IdDocumentoFE");
        if (!p_rs.wasNull()) {
            setIdDocumentoFE(l_valueIdDocumentoFE);
        } else {
            setIdDocumentoFE(null);
        } // end if
        String l_valuetextoqr1 = p_rs.getString("textoqr1");
        if (!p_rs.wasNull()) {
            setTextoqr1(l_valuetextoqr1);
        } else {
            setTextoqr1(null);
        } // end if
        String l_valuetextoqr2 = p_rs.getString("textoqr2");
        if (!p_rs.wasNull()) {
            setTextoqr2(l_valuetextoqr2);
        } else {
            setTextoqr2(null);
        } // end if
    }

    public void serializeFrom(VR_rp_ComprobanteQR_b64 p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar rp_ComprobanteQR_b64 desde un registro origen = null");
    }
        setIdDocumentoFE(p_src.getIdDocumentoFE());
        setTextoqr1(p_src.getTextoqr1());
        setTextoqr2(p_src.getTextoqr2());
    }

    public Integer getId() {
        return getIdDocumentoFE();
    }

}
