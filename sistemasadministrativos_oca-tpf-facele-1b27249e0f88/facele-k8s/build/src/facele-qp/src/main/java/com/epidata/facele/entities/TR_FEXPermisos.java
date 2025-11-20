/**
ORM table row class for: FEXPermisos
Generated: 2025-10-21 15:27:38
CRDETR un permiso de exportación asociado a un comprobante de exportación
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class TR_FEXPermisos extends AbstractRecord implements SinglePkRecord<Integer> {

    public TR_FEXPermisos() {
        m_IdFEXPermiso = new com.epidata.facele.entities.D_IdFEXPermiso();
        m_IdDocumentoFE = new com.epidata.facele.entities.D_IdDocumentoFE();
        m_CodDespacho = new com.epidata.facele.entities.D_CodDespacho();
        m_IdFEXDstPais = new com.epidata.facele.entities.D_IdFEXDstPais();
    }

    public TR_FEXPermisos(ResultSet p_rs) throws Exception {
        this();
        serializeFrom(p_rs);
    }

    /** Valor del campo: IdFEXPermiso
    */
    private com.epidata.facele.entities.D_IdFEXPermiso  m_IdFEXPermiso;

    /**
    */
    public Integer getIdFEXPermiso() {
        return m_IdFEXPermiso.get();
    }
    /**
    */
    public void setIdFEXPermiso(Integer p_value) {
        m_IdFEXPermiso.set(p_value);
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

    /** Valor del campo: CodDespacho
    */
    private com.epidata.facele.entities.D_CodDespacho  m_CodDespacho;

    /**
    */
    public String getCodDespacho() {
        return m_CodDespacho.get();
    }
    /**
    */
    public void setCodDespacho(String p_value) {
        m_CodDespacho.set(p_value);
    }

    /** Valor del campo: IdFEXDstPais
    */
    private com.epidata.facele.entities.D_IdFEXDstPais  m_IdFEXDstPais;

    /**
    */
    public String getIdFEXDstPais() {
        return m_IdFEXDstPais.get();
    }
    /**
    */
    public void setIdFEXDstPais(String p_value) {
        m_IdFEXDstPais.set(p_value);
    }

    public void serializeFrom(ResultSet p_rs) throws Exception {
        Integer l_valueIdFEXPermiso = p_rs.getInt("IdFEXPermiso");
        if (!p_rs.wasNull()) {
            setIdFEXPermiso(l_valueIdFEXPermiso);
        } else {
            setIdFEXPermiso(null);
        } // end if
        Integer l_valueIdDocumentoFE = p_rs.getInt("IdDocumentoFE");
        if (!p_rs.wasNull()) {
            setIdDocumentoFE(l_valueIdDocumentoFE);
        } else {
            setIdDocumentoFE(null);
        } // end if
        String l_valueCodDespacho = p_rs.getString("CodDespacho");
        if (!p_rs.wasNull()) {
            setCodDespacho(l_valueCodDespacho);
        } else {
            setCodDespacho(null);
        } // end if
        String l_valueIdFEXDstPais = p_rs.getString("IdFEXDstPais");
        if (!p_rs.wasNull()) {
            setIdFEXDstPais(l_valueIdFEXDstPais);
        } else {
            setIdFEXDstPais(null);
        } // end if
    }

    public void serializeFrom(TR_FEXPermisos p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar FEXPermisos desde un registro origen = null");
    }
        setIdFEXPermiso(p_src.getIdFEXPermiso());
        setIdDocumentoFE(p_src.getIdDocumentoFE());
        setCodDespacho(p_src.getCodDespacho());
        setIdFEXDstPais(p_src.getIdFEXDstPais());
    }

    public Integer getId() {
        return getIdFEXPermiso();
    }

}
