/**
ORM table row class for: FEPtosVta
Generated: 2025-10-21 15:27:38
CRDETR un punto de venta de un CUIT, habilitado para la emisión de comprobantes electrónicos.
Un punto de venta ES-PARTE-DE un CUIT.
La lista puede obtenerse invocando la operación "FEParamGetPtosVenta" del web-service.
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class TR_FEPtosVta extends AbstractRecord implements SinglePkRecord<Integer> {

    public TR_FEPtosVta() {
        m_IdPtoVta = new com.epidata.facele.entities.D_IdPtoVta();
        m_Cuit = new com.epidata.facele.entities.D_Cuit();
        m_PtoVta = new com.epidata.facele.entities.D_PtoVta();
        m_Descripcion = new com.epidata.facele.entities.D_Descripcion();
        m_LineaComprobante1 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaComprobante2 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaComprobante3 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaComprobante4 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaComprobante5 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaComprobante6 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaComprobante7 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaComprobante8 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaComprobante9 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaComprobante10 = new com.epidata.facele.entities.D_Descripcion();
        m_CodActividad = new com.epidata.facele.entities.D_CodActividad();
    }

    public TR_FEPtosVta(ResultSet p_rs) throws Exception {
        this();
        serializeFrom(p_rs);
    }

    /** Valor del campo: IdPtoVta
    */
    private com.epidata.facele.entities.D_IdPtoVta  m_IdPtoVta;

    /**
    */
    public Integer getIdPtoVta() {
        return m_IdPtoVta.get();
    }
    /**
    */
    public void setIdPtoVta(Integer p_value) {
        m_IdPtoVta.set(p_value);
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

    /** Valor del campo: LineaComprobante1
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaComprobante1;

    /**
    */
    public String getLineaComprobante1() {
        return m_LineaComprobante1.get();
    }
    /**
    */
    public void setLineaComprobante1(String p_value) {
        m_LineaComprobante1.set(p_value);
    }

    /** Valor del campo: LineaComprobante2
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaComprobante2;

    /**
    */
    public String getLineaComprobante2() {
        return m_LineaComprobante2.get();
    }
    /**
    */
    public void setLineaComprobante2(String p_value) {
        m_LineaComprobante2.set(p_value);
    }

    /** Valor del campo: LineaComprobante3
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaComprobante3;

    /**
    */
    public String getLineaComprobante3() {
        return m_LineaComprobante3.get();
    }
    /**
    */
    public void setLineaComprobante3(String p_value) {
        m_LineaComprobante3.set(p_value);
    }

    /** Valor del campo: LineaComprobante4
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaComprobante4;

    /**
    */
    public String getLineaComprobante4() {
        return m_LineaComprobante4.get();
    }
    /**
    */
    public void setLineaComprobante4(String p_value) {
        m_LineaComprobante4.set(p_value);
    }

    /** Valor del campo: LineaComprobante5
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaComprobante5;

    /**
    */
    public String getLineaComprobante5() {
        return m_LineaComprobante5.get();
    }
    /**
    */
    public void setLineaComprobante5(String p_value) {
        m_LineaComprobante5.set(p_value);
    }

    /** Valor del campo: LineaComprobante6
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaComprobante6;

    /**
    */
    public String getLineaComprobante6() {
        return m_LineaComprobante6.get();
    }
    /**
    */
    public void setLineaComprobante6(String p_value) {
        m_LineaComprobante6.set(p_value);
    }

    /** Valor del campo: LineaComprobante7
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaComprobante7;

    /**
    */
    public String getLineaComprobante7() {
        return m_LineaComprobante7.get();
    }
    /**
    */
    public void setLineaComprobante7(String p_value) {
        m_LineaComprobante7.set(p_value);
    }

    /** Valor del campo: LineaComprobante8
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaComprobante8;

    /**
    */
    public String getLineaComprobante8() {
        return m_LineaComprobante8.get();
    }
    /**
    */
    public void setLineaComprobante8(String p_value) {
        m_LineaComprobante8.set(p_value);
    }

    /** Valor del campo: LineaComprobante9
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaComprobante9;

    /**
    */
    public String getLineaComprobante9() {
        return m_LineaComprobante9.get();
    }
    /**
    */
    public void setLineaComprobante9(String p_value) {
        m_LineaComprobante9.set(p_value);
    }

    /** Valor del campo: LineaComprobante10
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaComprobante10;

    /**
    */
    public String getLineaComprobante10() {
        return m_LineaComprobante10.get();
    }
    /**
    */
    public void setLineaComprobante10(String p_value) {
        m_LineaComprobante10.set(p_value);
    }

    /** Valor del campo: CodActividad
    */
    private com.epidata.facele.entities.D_CodActividad  m_CodActividad;

    /**
    */
    public Long getCodActividad() {
        return m_CodActividad.get();
    }
    /**
    */
    public void setCodActividad(Long p_value) {
        m_CodActividad.set(p_value);
    }

    public void serializeFrom(ResultSet p_rs) throws Exception {
        Integer l_valueIdPtoVta = p_rs.getInt("IdPtoVta");
        if (!p_rs.wasNull()) {
            setIdPtoVta(l_valueIdPtoVta);
        } else {
            setIdPtoVta(null);
        } // end if
        Long l_valueCuit = p_rs.getLong("Cuit");
        if (!p_rs.wasNull()) {
            setCuit(l_valueCuit);
        } else {
            setCuit(null);
        } // end if
        Integer l_valuePtoVta = p_rs.getInt("PtoVta");
        if (!p_rs.wasNull()) {
            setPtoVta(l_valuePtoVta);
        } else {
            setPtoVta(null);
        } // end if
        String l_valueDescripcion = p_rs.getString("Descripcion");
        if (!p_rs.wasNull()) {
            setDescripcion(l_valueDescripcion);
        } else {
            setDescripcion(null);
        } // end if
        String l_valueLineaComprobante1 = p_rs.getString("LineaComprobante1");
        if (!p_rs.wasNull()) {
            setLineaComprobante1(l_valueLineaComprobante1);
        } else {
            setLineaComprobante1(null);
        } // end if
        String l_valueLineaComprobante2 = p_rs.getString("LineaComprobante2");
        if (!p_rs.wasNull()) {
            setLineaComprobante2(l_valueLineaComprobante2);
        } else {
            setLineaComprobante2(null);
        } // end if
        String l_valueLineaComprobante3 = p_rs.getString("LineaComprobante3");
        if (!p_rs.wasNull()) {
            setLineaComprobante3(l_valueLineaComprobante3);
        } else {
            setLineaComprobante3(null);
        } // end if
        String l_valueLineaComprobante4 = p_rs.getString("LineaComprobante4");
        if (!p_rs.wasNull()) {
            setLineaComprobante4(l_valueLineaComprobante4);
        } else {
            setLineaComprobante4(null);
        } // end if
        String l_valueLineaComprobante5 = p_rs.getString("LineaComprobante5");
        if (!p_rs.wasNull()) {
            setLineaComprobante5(l_valueLineaComprobante5);
        } else {
            setLineaComprobante5(null);
        } // end if
        String l_valueLineaComprobante6 = p_rs.getString("LineaComprobante6");
        if (!p_rs.wasNull()) {
            setLineaComprobante6(l_valueLineaComprobante6);
        } else {
            setLineaComprobante6(null);
        } // end if
        String l_valueLineaComprobante7 = p_rs.getString("LineaComprobante7");
        if (!p_rs.wasNull()) {
            setLineaComprobante7(l_valueLineaComprobante7);
        } else {
            setLineaComprobante7(null);
        } // end if
        String l_valueLineaComprobante8 = p_rs.getString("LineaComprobante8");
        if (!p_rs.wasNull()) {
            setLineaComprobante8(l_valueLineaComprobante8);
        } else {
            setLineaComprobante8(null);
        } // end if
        String l_valueLineaComprobante9 = p_rs.getString("LineaComprobante9");
        if (!p_rs.wasNull()) {
            setLineaComprobante9(l_valueLineaComprobante9);
        } else {
            setLineaComprobante9(null);
        } // end if
        String l_valueLineaComprobante10 = p_rs.getString("LineaComprobante10");
        if (!p_rs.wasNull()) {
            setLineaComprobante10(l_valueLineaComprobante10);
        } else {
            setLineaComprobante10(null);
        } // end if
        Long l_valueCodActividad = p_rs.getLong("CodActividad");
        if (!p_rs.wasNull()) {
            setCodActividad(l_valueCodActividad);
        } else {
            setCodActividad(null);
        } // end if
    }

    public void serializeFrom(TR_FEPtosVta p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar FEPtosVta desde un registro origen = null");
    }
        setIdPtoVta(p_src.getIdPtoVta());
        setCuit(p_src.getCuit());
        setPtoVta(p_src.getPtoVta());
        setDescripcion(p_src.getDescripcion());
        setLineaComprobante1(p_src.getLineaComprobante1());
        setLineaComprobante2(p_src.getLineaComprobante2());
        setLineaComprobante3(p_src.getLineaComprobante3());
        setLineaComprobante4(p_src.getLineaComprobante4());
        setLineaComprobante5(p_src.getLineaComprobante5());
        setLineaComprobante6(p_src.getLineaComprobante6());
        setLineaComprobante7(p_src.getLineaComprobante7());
        setLineaComprobante8(p_src.getLineaComprobante8());
        setLineaComprobante9(p_src.getLineaComprobante9());
        setLineaComprobante10(p_src.getLineaComprobante10());
        setCodActividad(p_src.getCodActividad());
    }

    public Integer getId() {
        return getIdPtoVta();
    }

}
