/**
ORM view row class for: rp_Comprobante
Generated: 2025-10-21 15:27:38
Relación de base para la cabecera de los reportes de comprobantes
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class VR_rp_Comprobante extends AbstractRecord implements SinglePkRecord<Integer> {

    public VR_rp_Comprobante() {
        m_IdDocumentoFE = new com.epidata.facele.entities.D_IdDocumentoFE();
        m_IdPtoVta = new com.epidata.facele.entities.D_IdPtoVta();
        m_CbteTipo = new com.epidata.facele.entities.D_CbteTipo();
        m_cbtedesde = new com.epidata.facele.entities.D_CbteNumero();
        m_cbtehasta = new com.epidata.facele.entities.D_CbteNumero();
        m_Concepto = new com.epidata.facele.entities.D_Concepto();
        m_DocTipo = new com.epidata.facele.entities.D_DocTipo();
        m_DocNro = new com.epidata.facele.entities.D_DocNro();
        m_cbtefch = new com.epidata.facele.entities.D_Fecha();
        m_imptotal = new com.epidata.facele.entities.D_Monto();
        m_imptotconc = new com.epidata.facele.entities.D_Monto();
        m_impneto = new com.epidata.facele.entities.D_Monto();
        m_impopex = new com.epidata.facele.entities.D_Monto();
        m_imptrib = new com.epidata.facele.entities.D_Monto();
        m_impiva = new com.epidata.facele.entities.D_Monto();
        m_fchservdesde = new com.epidata.facele.entities.D_Fecha();
        m_fchservhasta = new com.epidata.facele.entities.D_Fecha();
        m_fchvtopago = new com.epidata.facele.entities.D_Fecha();
        m_MonId = new com.epidata.facele.entities.D_MonId();
        m_MonCotiz = new com.epidata.facele.entities.D_MonCotiz();
        m_Resultado = new com.epidata.facele.entities.D_Resultado();
        m_CodAutorizacion = new com.epidata.facele.entities.D_CodAutorizacion();
        m_caefchvto = new com.epidata.facele.entities.D_Fecha();
        m_HashLink = new com.epidata.facele.entities.D_HashLink();
        m_barcode = new com.epidata.facele.entities.D_BarCode42();
        m_razonsocial = new com.epidata.facele.entities.D_Descripcion();
        m_domicilio1 = new com.epidata.facele.entities.D_Descripcion();
        m_domicilio2 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacab1 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacab2 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacab3 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacab4 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacab5 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacab6 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacab7 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacab8 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacab9 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacab10 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacab11 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacab12 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacab13 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacab14 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacab15 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacab16 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacab17 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacab18 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacab19 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacab20 = new com.epidata.facele.entities.D_Descripcion();
        m_fchproceso = new com.epidata.facele.entities.D_FechaHora();
        m_pdffilename = new com.epidata.facele.entities.D_FullFileName();
        m_Cuit = new com.epidata.facele.entities.D_Cuit();
        m_Descripcion = new com.epidata.facele.entities.D_Descripcion();
        m_lineacomprobante1 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacomprobante2 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacomprobante3 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacomprobante4 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacomprobante5 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacomprobante6 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacomprobante7 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacomprobante8 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacomprobante9 = new com.epidata.facele.entities.D_Descripcion();
        m_lineacomprobante10 = new com.epidata.facele.entities.D_Descripcion();
        m_PtoVta = new com.epidata.facele.entities.D_PtoVta();
        m_LetraFiscal = new com.epidata.facele.entities.D_LetraFiscal();
        m_sintetico = new com.epidata.facele.entities.D_Descripcion();
        m_doctipodescripcion = new com.epidata.facele.entities.D_Descripcion();
        m_modelo = new com.epidata.facele.entities.D_Descripcion();
        m_copia = new com.epidata.facele.entities.D_Descripcion();
        m_observacionescopia = new com.epidata.facele.entities.D_Observaciones();
        m_msgerrs = new com.epidata.facele.entities.D_Observaciones();
        m_CodCondIva = new com.epidata.facele.entities.D_CodCondIva();
        m_ivacliente = new com.epidata.facele.entities.D_Descripcion();
        m_obscomerciales = new com.epidata.facele.entities.D_Observaciones();
        m_montoescrito = new com.epidata.facele.entities.D_SqlText();
        m_SimboloMoneda = new com.epidata.facele.entities.D_SimboloMoneda();
    }

    public VR_rp_Comprobante(ResultSet p_rs) throws Exception {
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

    /** Valor del campo: cbtedesde
    */
    private com.epidata.facele.entities.D_CbteNumero  m_cbtedesde;

    /**
    */
    public Integer getCbtedesde() {
        return m_cbtedesde.get();
    }
    /**
    */
    public void setCbtedesde(Integer p_value) {
        m_cbtedesde.set(p_value);
    }

    /** Valor del campo: cbtehasta
    */
    private com.epidata.facele.entities.D_CbteNumero  m_cbtehasta;

    /**
    */
    public Integer getCbtehasta() {
        return m_cbtehasta.get();
    }
    /**
    */
    public void setCbtehasta(Integer p_value) {
        m_cbtehasta.set(p_value);
    }

    /** Valor del campo: Concepto
    */
    private com.epidata.facele.entities.D_Concepto  m_Concepto;

    /**
    */
    public Integer getConcepto() {
        return m_Concepto.get();
    }
    /**
    */
    public void setConcepto(Integer p_value) {
        m_Concepto.set(p_value);
    }

    /** Valor del campo: DocTipo
    */
    private com.epidata.facele.entities.D_DocTipo  m_DocTipo;

    /**
    */
    public Integer getDocTipo() {
        return m_DocTipo.get();
    }
    /**
    */
    public void setDocTipo(Integer p_value) {
        m_DocTipo.set(p_value);
    }

    /** Valor del campo: DocNro
    */
    private com.epidata.facele.entities.D_DocNro  m_DocNro;

    /**
    */
    public Long getDocNro() {
        return m_DocNro.get();
    }
    /**
    */
    public void setDocNro(Long p_value) {
        m_DocNro.set(p_value);
    }

    /** Valor del campo: cbtefch
    */
    private com.epidata.facele.entities.D_Fecha  m_cbtefch;

    /**
    */
    public Date getCbtefch() {
        return m_cbtefch.get();
    }
    /**
    */
    public void setCbtefch(Date p_value) {
        m_cbtefch.set(p_value);
    }

    /** Valor del campo: imptotal
    */
    private com.epidata.facele.entities.D_Monto  m_imptotal;

    /**
    */
    public Double getImptotal() {
        return m_imptotal.get();
    }
    /**
    */
    public void setImptotal(Double p_value) {
        m_imptotal.set(p_value);
    }

    /** Valor del campo: imptotconc
    */
    private com.epidata.facele.entities.D_Monto  m_imptotconc;

    /**
    */
    public Double getImptotconc() {
        return m_imptotconc.get();
    }
    /**
    */
    public void setImptotconc(Double p_value) {
        m_imptotconc.set(p_value);
    }

    /** Valor del campo: impneto
    */
    private com.epidata.facele.entities.D_Monto  m_impneto;

    /**
    */
    public Double getImpneto() {
        return m_impneto.get();
    }
    /**
    */
    public void setImpneto(Double p_value) {
        m_impneto.set(p_value);
    }

    /** Valor del campo: impopex
    */
    private com.epidata.facele.entities.D_Monto  m_impopex;

    /**
    */
    public Double getImpopex() {
        return m_impopex.get();
    }
    /**
    */
    public void setImpopex(Double p_value) {
        m_impopex.set(p_value);
    }

    /** Valor del campo: imptrib
    */
    private com.epidata.facele.entities.D_Monto  m_imptrib;

    /**
    */
    public Double getImptrib() {
        return m_imptrib.get();
    }
    /**
    */
    public void setImptrib(Double p_value) {
        m_imptrib.set(p_value);
    }

    /** Valor del campo: impiva
    */
    private com.epidata.facele.entities.D_Monto  m_impiva;

    /**
    */
    public Double getImpiva() {
        return m_impiva.get();
    }
    /**
    */
    public void setImpiva(Double p_value) {
        m_impiva.set(p_value);
    }

    /** Valor del campo: fchservdesde
    */
    private com.epidata.facele.entities.D_Fecha  m_fchservdesde;

    /**
    */
    public Date getFchservdesde() {
        return m_fchservdesde.get();
    }
    /**
    */
    public void setFchservdesde(Date p_value) {
        m_fchservdesde.set(p_value);
    }

    /** Valor del campo: fchservhasta
    */
    private com.epidata.facele.entities.D_Fecha  m_fchservhasta;

    /**
    */
    public Date getFchservhasta() {
        return m_fchservhasta.get();
    }
    /**
    */
    public void setFchservhasta(Date p_value) {
        m_fchservhasta.set(p_value);
    }

    /** Valor del campo: fchvtopago
    */
    private com.epidata.facele.entities.D_Fecha  m_fchvtopago;

    /**
    */
    public Date getFchvtopago() {
        return m_fchvtopago.get();
    }
    /**
    */
    public void setFchvtopago(Date p_value) {
        m_fchvtopago.set(p_value);
    }

    /** Valor del campo: MonId
    */
    private com.epidata.facele.entities.D_MonId  m_MonId;

    /**
    */
    public String getMonId() {
        return m_MonId.get();
    }
    /**
    */
    public void setMonId(String p_value) {
        m_MonId.set(p_value);
    }

    /** Valor del campo: MonCotiz
    */
    private com.epidata.facele.entities.D_MonCotiz  m_MonCotiz;

    /**
    */
    public Double getMonCotiz() {
        return m_MonCotiz.get();
    }
    /**
    */
    public void setMonCotiz(Double p_value) {
        m_MonCotiz.set(p_value);
    }

    /** Valor del campo: Resultado
    */
    private com.epidata.facele.entities.D_Resultado  m_Resultado;

    /**
    */
    public String getResultado() {
        return m_Resultado.get();
    }
    /**
    */
    public void setResultado(String p_value) {
        m_Resultado.set(p_value);
    }

    /** Valor del campo: CodAutorizacion
    */
    private com.epidata.facele.entities.D_CodAutorizacion  m_CodAutorizacion;

    /**
    */
    public String getCodAutorizacion() {
        return m_CodAutorizacion.get();
    }
    /**
    */
    public void setCodAutorizacion(String p_value) {
        m_CodAutorizacion.set(p_value);
    }

    /** Valor del campo: caefchvto
    */
    private com.epidata.facele.entities.D_Fecha  m_caefchvto;

    /**
    */
    public Date getCaefchvto() {
        return m_caefchvto.get();
    }
    /**
    */
    public void setCaefchvto(Date p_value) {
        m_caefchvto.set(p_value);
    }

    /** Valor del campo: HashLink
    */
    private com.epidata.facele.entities.D_HashLink  m_HashLink;

    /**
    */
    public String getHashLink() {
        return m_HashLink.get();
    }
    /**
    */
    public void setHashLink(String p_value) {
        m_HashLink.set(p_value);
    }

    /** Valor del campo: barcode
    */
    private com.epidata.facele.entities.D_BarCode42  m_barcode;

    /**
    */
    public String getBarcode() {
        return m_barcode.get();
    }
    /**
    */
    public void setBarcode(String p_value) {
        m_barcode.set(p_value);
    }

    /** Valor del campo: razonsocial
    */
    private com.epidata.facele.entities.D_Descripcion  m_razonsocial;

    /**
    */
    public String getRazonsocial() {
        return m_razonsocial.get();
    }
    /**
    */
    public void setRazonsocial(String p_value) {
        m_razonsocial.set(p_value);
    }

    /** Valor del campo: domicilio1
    */
    private com.epidata.facele.entities.D_Descripcion  m_domicilio1;

    /**
    */
    public String getDomicilio1() {
        return m_domicilio1.get();
    }
    /**
    */
    public void setDomicilio1(String p_value) {
        m_domicilio1.set(p_value);
    }

    /** Valor del campo: domicilio2
    */
    private com.epidata.facele.entities.D_Descripcion  m_domicilio2;

    /**
    */
    public String getDomicilio2() {
        return m_domicilio2.get();
    }
    /**
    */
    public void setDomicilio2(String p_value) {
        m_domicilio2.set(p_value);
    }

    /** Valor del campo: lineacab1
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacab1;

    /**
    */
    public String getLineacab1() {
        return m_lineacab1.get();
    }
    /**
    */
    public void setLineacab1(String p_value) {
        m_lineacab1.set(p_value);
    }

    /** Valor del campo: lineacab2
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacab2;

    /**
    */
    public String getLineacab2() {
        return m_lineacab2.get();
    }
    /**
    */
    public void setLineacab2(String p_value) {
        m_lineacab2.set(p_value);
    }

    /** Valor del campo: lineacab3
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacab3;

    /**
    */
    public String getLineacab3() {
        return m_lineacab3.get();
    }
    /**
    */
    public void setLineacab3(String p_value) {
        m_lineacab3.set(p_value);
    }

    /** Valor del campo: lineacab4
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacab4;

    /**
    */
    public String getLineacab4() {
        return m_lineacab4.get();
    }
    /**
    */
    public void setLineacab4(String p_value) {
        m_lineacab4.set(p_value);
    }

    /** Valor del campo: lineacab5
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacab5;

    /**
    */
    public String getLineacab5() {
        return m_lineacab5.get();
    }
    /**
    */
    public void setLineacab5(String p_value) {
        m_lineacab5.set(p_value);
    }

    /** Valor del campo: lineacab6
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacab6;

    /**
    */
    public String getLineacab6() {
        return m_lineacab6.get();
    }
    /**
    */
    public void setLineacab6(String p_value) {
        m_lineacab6.set(p_value);
    }

    /** Valor del campo: lineacab7
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacab7;

    /**
    */
    public String getLineacab7() {
        return m_lineacab7.get();
    }
    /**
    */
    public void setLineacab7(String p_value) {
        m_lineacab7.set(p_value);
    }

    /** Valor del campo: lineacab8
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacab8;

    /**
    */
    public String getLineacab8() {
        return m_lineacab8.get();
    }
    /**
    */
    public void setLineacab8(String p_value) {
        m_lineacab8.set(p_value);
    }

    /** Valor del campo: lineacab9
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacab9;

    /**
    */
    public String getLineacab9() {
        return m_lineacab9.get();
    }
    /**
    */
    public void setLineacab9(String p_value) {
        m_lineacab9.set(p_value);
    }

    /** Valor del campo: lineacab10
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacab10;

    /**
    */
    public String getLineacab10() {
        return m_lineacab10.get();
    }
    /**
    */
    public void setLineacab10(String p_value) {
        m_lineacab10.set(p_value);
    }

    /** Valor del campo: lineacab11
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacab11;

    /**
    */
    public String getLineacab11() {
        return m_lineacab11.get();
    }
    /**
    */
    public void setLineacab11(String p_value) {
        m_lineacab11.set(p_value);
    }

    /** Valor del campo: lineacab12
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacab12;

    /**
    */
    public String getLineacab12() {
        return m_lineacab12.get();
    }
    /**
    */
    public void setLineacab12(String p_value) {
        m_lineacab12.set(p_value);
    }

    /** Valor del campo: lineacab13
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacab13;

    /**
    */
    public String getLineacab13() {
        return m_lineacab13.get();
    }
    /**
    */
    public void setLineacab13(String p_value) {
        m_lineacab13.set(p_value);
    }

    /** Valor del campo: lineacab14
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacab14;

    /**
    */
    public String getLineacab14() {
        return m_lineacab14.get();
    }
    /**
    */
    public void setLineacab14(String p_value) {
        m_lineacab14.set(p_value);
    }

    /** Valor del campo: lineacab15
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacab15;

    /**
    */
    public String getLineacab15() {
        return m_lineacab15.get();
    }
    /**
    */
    public void setLineacab15(String p_value) {
        m_lineacab15.set(p_value);
    }

    /** Valor del campo: lineacab16
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacab16;

    /**
    */
    public String getLineacab16() {
        return m_lineacab16.get();
    }
    /**
    */
    public void setLineacab16(String p_value) {
        m_lineacab16.set(p_value);
    }

    /** Valor del campo: lineacab17
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacab17;

    /**
    */
    public String getLineacab17() {
        return m_lineacab17.get();
    }
    /**
    */
    public void setLineacab17(String p_value) {
        m_lineacab17.set(p_value);
    }

    /** Valor del campo: lineacab18
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacab18;

    /**
    */
    public String getLineacab18() {
        return m_lineacab18.get();
    }
    /**
    */
    public void setLineacab18(String p_value) {
        m_lineacab18.set(p_value);
    }

    /** Valor del campo: lineacab19
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacab19;

    /**
    */
    public String getLineacab19() {
        return m_lineacab19.get();
    }
    /**
    */
    public void setLineacab19(String p_value) {
        m_lineacab19.set(p_value);
    }

    /** Valor del campo: lineacab20
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacab20;

    /**
    */
    public String getLineacab20() {
        return m_lineacab20.get();
    }
    /**
    */
    public void setLineacab20(String p_value) {
        m_lineacab20.set(p_value);
    }

    /** Valor del campo: fchproceso
    */
    private com.epidata.facele.entities.D_FechaHora  m_fchproceso;

    /**
    */
    public java.sql.Timestamp getFchproceso() {
        return m_fchproceso.get();
    }
    /**
    */
    public void setFchproceso(java.sql.Timestamp p_value) {
        m_fchproceso.set(p_value);
    }

    /** Valor del campo: pdffilename
    */
    private com.epidata.facele.entities.D_FullFileName  m_pdffilename;

    /**
    */
    public String getPdffilename() {
        return m_pdffilename.get();
    }
    /**
    */
    public void setPdffilename(String p_value) {
        m_pdffilename.set(p_value);
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

    /** Valor del campo: lineacomprobante1
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacomprobante1;

    /**
    */
    public String getLineacomprobante1() {
        return m_lineacomprobante1.get();
    }
    /**
    */
    public void setLineacomprobante1(String p_value) {
        m_lineacomprobante1.set(p_value);
    }

    /** Valor del campo: lineacomprobante2
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacomprobante2;

    /**
    */
    public String getLineacomprobante2() {
        return m_lineacomprobante2.get();
    }
    /**
    */
    public void setLineacomprobante2(String p_value) {
        m_lineacomprobante2.set(p_value);
    }

    /** Valor del campo: lineacomprobante3
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacomprobante3;

    /**
    */
    public String getLineacomprobante3() {
        return m_lineacomprobante3.get();
    }
    /**
    */
    public void setLineacomprobante3(String p_value) {
        m_lineacomprobante3.set(p_value);
    }

    /** Valor del campo: lineacomprobante4
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacomprobante4;

    /**
    */
    public String getLineacomprobante4() {
        return m_lineacomprobante4.get();
    }
    /**
    */
    public void setLineacomprobante4(String p_value) {
        m_lineacomprobante4.set(p_value);
    }

    /** Valor del campo: lineacomprobante5
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacomprobante5;

    /**
    */
    public String getLineacomprobante5() {
        return m_lineacomprobante5.get();
    }
    /**
    */
    public void setLineacomprobante5(String p_value) {
        m_lineacomprobante5.set(p_value);
    }

    /** Valor del campo: lineacomprobante6
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacomprobante6;

    /**
    */
    public String getLineacomprobante6() {
        return m_lineacomprobante6.get();
    }
    /**
    */
    public void setLineacomprobante6(String p_value) {
        m_lineacomprobante6.set(p_value);
    }

    /** Valor del campo: lineacomprobante7
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacomprobante7;

    /**
    */
    public String getLineacomprobante7() {
        return m_lineacomprobante7.get();
    }
    /**
    */
    public void setLineacomprobante7(String p_value) {
        m_lineacomprobante7.set(p_value);
    }

    /** Valor del campo: lineacomprobante8
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacomprobante8;

    /**
    */
    public String getLineacomprobante8() {
        return m_lineacomprobante8.get();
    }
    /**
    */
    public void setLineacomprobante8(String p_value) {
        m_lineacomprobante8.set(p_value);
    }

    /** Valor del campo: lineacomprobante9
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacomprobante9;

    /**
    */
    public String getLineacomprobante9() {
        return m_lineacomprobante9.get();
    }
    /**
    */
    public void setLineacomprobante9(String p_value) {
        m_lineacomprobante9.set(p_value);
    }

    /** Valor del campo: lineacomprobante10
    */
    private com.epidata.facele.entities.D_Descripcion  m_lineacomprobante10;

    /**
    */
    public String getLineacomprobante10() {
        return m_lineacomprobante10.get();
    }
    /**
    */
    public void setLineacomprobante10(String p_value) {
        m_lineacomprobante10.set(p_value);
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

    /** Valor del campo: sintetico
    */
    private com.epidata.facele.entities.D_Descripcion  m_sintetico;

    /**
    */
    public String getSintetico() {
        return m_sintetico.get();
    }
    /**
    */
    public void setSintetico(String p_value) {
        m_sintetico.set(p_value);
    }

    /** Valor del campo: doctipodescripcion
    */
    private com.epidata.facele.entities.D_Descripcion  m_doctipodescripcion;

    /**
    */
    public String getDoctipodescripcion() {
        return m_doctipodescripcion.get();
    }
    /**
    */
    public void setDoctipodescripcion(String p_value) {
        m_doctipodescripcion.set(p_value);
    }

    /** Valor del campo: modelo
    */
    private com.epidata.facele.entities.D_Descripcion  m_modelo;

    /**
    */
    public String getModelo() {
        return m_modelo.get();
    }
    /**
    */
    public void setModelo(String p_value) {
        m_modelo.set(p_value);
    }

    /** Valor del campo: copia
    */
    private com.epidata.facele.entities.D_Descripcion  m_copia;

    /**
    */
    public String getCopia() {
        return m_copia.get();
    }
    /**
    */
    public void setCopia(String p_value) {
        m_copia.set(p_value);
    }

    /** Valor del campo: observacionescopia
    */
    private com.epidata.facele.entities.D_Observaciones  m_observacionescopia;

    /**
    */
    public String getObservacionescopia() {
        return m_observacionescopia.get();
    }
    /**
    */
    public void setObservacionescopia(String p_value) {
        m_observacionescopia.set(p_value);
    }

    /** Valor del campo: msgerrs
    */
    private com.epidata.facele.entities.D_Observaciones  m_msgerrs;

    /**
    */
    public String getMsgerrs() {
        return m_msgerrs.get();
    }
    /**
    */
    public void setMsgerrs(String p_value) {
        m_msgerrs.set(p_value);
    }

    /** Valor del campo: CodCondIva
    */
    private com.epidata.facele.entities.D_CodCondIva  m_CodCondIva;

    /**
    */
    public Integer getCodCondIva() {
        return m_CodCondIva.get();
    }
    /**
    */
    public void setCodCondIva(Integer p_value) {
        m_CodCondIva.set(p_value);
    }

    /** Valor del campo: ivacliente
    */
    private com.epidata.facele.entities.D_Descripcion  m_ivacliente;

    /**
    */
    public String getIvacliente() {
        return m_ivacliente.get();
    }
    /**
    */
    public void setIvacliente(String p_value) {
        m_ivacliente.set(p_value);
    }

    /** Valor del campo: obscomerciales
    */
    private com.epidata.facele.entities.D_Observaciones  m_obscomerciales;

    /**
    */
    public String getObscomerciales() {
        return m_obscomerciales.get();
    }
    /**
    */
    public void setObscomerciales(String p_value) {
        m_obscomerciales.set(p_value);
    }

    /** Valor del campo: montoescrito
    */
    private com.epidata.facele.entities.D_SqlText  m_montoescrito;

    /**
    */
    public String getMontoescrito() {
        return m_montoescrito.get();
    }
    /**
    */
    public void setMontoescrito(String p_value) {
        m_montoescrito.set(p_value);
    }

    /** Valor del campo: SimboloMoneda
    */
    private com.epidata.facele.entities.D_SimboloMoneda  m_SimboloMoneda;

    /**
    */
    public String getSimboloMoneda() {
        return m_SimboloMoneda.get();
    }
    /**
    */
    public void setSimboloMoneda(String p_value) {
        m_SimboloMoneda.set(p_value);
    }

    public void serializeFrom(ResultSet p_rs) throws Exception {
        Integer l_valueIdDocumentoFE = p_rs.getInt("IdDocumentoFE");
        if (!p_rs.wasNull()) {
            setIdDocumentoFE(l_valueIdDocumentoFE);
        } else {
            setIdDocumentoFE(null);
        } // end if
        Integer l_valueIdPtoVta = p_rs.getInt("IdPtoVta");
        if (!p_rs.wasNull()) {
            setIdPtoVta(l_valueIdPtoVta);
        } else {
            setIdPtoVta(null);
        } // end if
        Integer l_valueCbteTipo = p_rs.getInt("CbteTipo");
        if (!p_rs.wasNull()) {
            setCbteTipo(l_valueCbteTipo);
        } else {
            setCbteTipo(null);
        } // end if
        Integer l_valuecbtedesde = p_rs.getInt("cbtedesde");
        if (!p_rs.wasNull()) {
            setCbtedesde(l_valuecbtedesde);
        } else {
            setCbtedesde(null);
        } // end if
        Integer l_valuecbtehasta = p_rs.getInt("cbtehasta");
        if (!p_rs.wasNull()) {
            setCbtehasta(l_valuecbtehasta);
        } else {
            setCbtehasta(null);
        } // end if
        Integer l_valueConcepto = p_rs.getInt("Concepto");
        if (!p_rs.wasNull()) {
            setConcepto(l_valueConcepto);
        } else {
            setConcepto(null);
        } // end if
        Integer l_valueDocTipo = p_rs.getInt("DocTipo");
        if (!p_rs.wasNull()) {
            setDocTipo(l_valueDocTipo);
        } else {
            setDocTipo(null);
        } // end if
        Long l_valueDocNro = p_rs.getLong("DocNro");
        if (!p_rs.wasNull()) {
            setDocNro(l_valueDocNro);
        } else {
            setDocNro(null);
        } // end if
        Date l_valuecbtefch = p_rs.getDate("cbtefch");
        if (!p_rs.wasNull()) {
            setCbtefch(l_valuecbtefch);
        } else {
            setCbtefch(null);
        } // end if
        Double l_valueimptotal = p_rs.getDouble("imptotal");
        if (!p_rs.wasNull()) {
            setImptotal(l_valueimptotal);
        } else {
            setImptotal(null);
        } // end if
        Double l_valueimptotconc = p_rs.getDouble("imptotconc");
        if (!p_rs.wasNull()) {
            setImptotconc(l_valueimptotconc);
        } else {
            setImptotconc(null);
        } // end if
        Double l_valueimpneto = p_rs.getDouble("impneto");
        if (!p_rs.wasNull()) {
            setImpneto(l_valueimpneto);
        } else {
            setImpneto(null);
        } // end if
        Double l_valueimpopex = p_rs.getDouble("impopex");
        if (!p_rs.wasNull()) {
            setImpopex(l_valueimpopex);
        } else {
            setImpopex(null);
        } // end if
        Double l_valueimptrib = p_rs.getDouble("imptrib");
        if (!p_rs.wasNull()) {
            setImptrib(l_valueimptrib);
        } else {
            setImptrib(null);
        } // end if
        Double l_valueimpiva = p_rs.getDouble("impiva");
        if (!p_rs.wasNull()) {
            setImpiva(l_valueimpiva);
        } else {
            setImpiva(null);
        } // end if
        Date l_valuefchservdesde = p_rs.getDate("fchservdesde");
        if (!p_rs.wasNull()) {
            setFchservdesde(l_valuefchservdesde);
        } else {
            setFchservdesde(null);
        } // end if
        Date l_valuefchservhasta = p_rs.getDate("fchservhasta");
        if (!p_rs.wasNull()) {
            setFchservhasta(l_valuefchservhasta);
        } else {
            setFchservhasta(null);
        } // end if
        Date l_valuefchvtopago = p_rs.getDate("fchvtopago");
        if (!p_rs.wasNull()) {
            setFchvtopago(l_valuefchvtopago);
        } else {
            setFchvtopago(null);
        } // end if
        String l_valueMonId = p_rs.getString("MonId");
        if (!p_rs.wasNull()) {
            setMonId(l_valueMonId);
        } else {
            setMonId(null);
        } // end if
        Double l_valueMonCotiz = p_rs.getDouble("MonCotiz");
        if (!p_rs.wasNull()) {
            setMonCotiz(l_valueMonCotiz);
        } else {
            setMonCotiz(null);
        } // end if
        String l_valueResultado = p_rs.getString("Resultado");
        if (!p_rs.wasNull()) {
            setResultado(l_valueResultado);
        } else {
            setResultado(null);
        } // end if
        String l_valueCodAutorizacion = p_rs.getString("CodAutorizacion");
        if (!p_rs.wasNull()) {
            setCodAutorizacion(l_valueCodAutorizacion);
        } else {
            setCodAutorizacion(null);
        } // end if
        Date l_valuecaefchvto = p_rs.getDate("caefchvto");
        if (!p_rs.wasNull()) {
            setCaefchvto(l_valuecaefchvto);
        } else {
            setCaefchvto(null);
        } // end if
        String l_valueHashLink = p_rs.getString("HashLink");
        if (!p_rs.wasNull()) {
            setHashLink(l_valueHashLink);
        } else {
            setHashLink(null);
        } // end if
        String l_valuebarcode = p_rs.getString("barcode");
        if (!p_rs.wasNull()) {
            setBarcode(l_valuebarcode);
        } else {
            setBarcode(null);
        } // end if
        String l_valuerazonsocial = p_rs.getString("razonsocial");
        if (!p_rs.wasNull()) {
            setRazonsocial(l_valuerazonsocial);
        } else {
            setRazonsocial(null);
        } // end if
        String l_valuedomicilio1 = p_rs.getString("domicilio1");
        if (!p_rs.wasNull()) {
            setDomicilio1(l_valuedomicilio1);
        } else {
            setDomicilio1(null);
        } // end if
        String l_valuedomicilio2 = p_rs.getString("domicilio2");
        if (!p_rs.wasNull()) {
            setDomicilio2(l_valuedomicilio2);
        } else {
            setDomicilio2(null);
        } // end if
        String l_valuelineacab1 = p_rs.getString("lineacab1");
        if (!p_rs.wasNull()) {
            setLineacab1(l_valuelineacab1);
        } else {
            setLineacab1(null);
        } // end if
        String l_valuelineacab2 = p_rs.getString("lineacab2");
        if (!p_rs.wasNull()) {
            setLineacab2(l_valuelineacab2);
        } else {
            setLineacab2(null);
        } // end if
        String l_valuelineacab3 = p_rs.getString("lineacab3");
        if (!p_rs.wasNull()) {
            setLineacab3(l_valuelineacab3);
        } else {
            setLineacab3(null);
        } // end if
        String l_valuelineacab4 = p_rs.getString("lineacab4");
        if (!p_rs.wasNull()) {
            setLineacab4(l_valuelineacab4);
        } else {
            setLineacab4(null);
        } // end if
        String l_valuelineacab5 = p_rs.getString("lineacab5");
        if (!p_rs.wasNull()) {
            setLineacab5(l_valuelineacab5);
        } else {
            setLineacab5(null);
        } // end if
        String l_valuelineacab6 = p_rs.getString("lineacab6");
        if (!p_rs.wasNull()) {
            setLineacab6(l_valuelineacab6);
        } else {
            setLineacab6(null);
        } // end if
        String l_valuelineacab7 = p_rs.getString("lineacab7");
        if (!p_rs.wasNull()) {
            setLineacab7(l_valuelineacab7);
        } else {
            setLineacab7(null);
        } // end if
        String l_valuelineacab8 = p_rs.getString("lineacab8");
        if (!p_rs.wasNull()) {
            setLineacab8(l_valuelineacab8);
        } else {
            setLineacab8(null);
        } // end if
        String l_valuelineacab9 = p_rs.getString("lineacab9");
        if (!p_rs.wasNull()) {
            setLineacab9(l_valuelineacab9);
        } else {
            setLineacab9(null);
        } // end if
        String l_valuelineacab10 = p_rs.getString("lineacab10");
        if (!p_rs.wasNull()) {
            setLineacab10(l_valuelineacab10);
        } else {
            setLineacab10(null);
        } // end if
        String l_valuelineacab11 = p_rs.getString("lineacab11");
        if (!p_rs.wasNull()) {
            setLineacab11(l_valuelineacab11);
        } else {
            setLineacab11(null);
        } // end if
        String l_valuelineacab12 = p_rs.getString("lineacab12");
        if (!p_rs.wasNull()) {
            setLineacab12(l_valuelineacab12);
        } else {
            setLineacab12(null);
        } // end if
        String l_valuelineacab13 = p_rs.getString("lineacab13");
        if (!p_rs.wasNull()) {
            setLineacab13(l_valuelineacab13);
        } else {
            setLineacab13(null);
        } // end if
        String l_valuelineacab14 = p_rs.getString("lineacab14");
        if (!p_rs.wasNull()) {
            setLineacab14(l_valuelineacab14);
        } else {
            setLineacab14(null);
        } // end if
        String l_valuelineacab15 = p_rs.getString("lineacab15");
        if (!p_rs.wasNull()) {
            setLineacab15(l_valuelineacab15);
        } else {
            setLineacab15(null);
        } // end if
        String l_valuelineacab16 = p_rs.getString("lineacab16");
        if (!p_rs.wasNull()) {
            setLineacab16(l_valuelineacab16);
        } else {
            setLineacab16(null);
        } // end if
        String l_valuelineacab17 = p_rs.getString("lineacab17");
        if (!p_rs.wasNull()) {
            setLineacab17(l_valuelineacab17);
        } else {
            setLineacab17(null);
        } // end if
        String l_valuelineacab18 = p_rs.getString("lineacab18");
        if (!p_rs.wasNull()) {
            setLineacab18(l_valuelineacab18);
        } else {
            setLineacab18(null);
        } // end if
        String l_valuelineacab19 = p_rs.getString("lineacab19");
        if (!p_rs.wasNull()) {
            setLineacab19(l_valuelineacab19);
        } else {
            setLineacab19(null);
        } // end if
        String l_valuelineacab20 = p_rs.getString("lineacab20");
        if (!p_rs.wasNull()) {
            setLineacab20(l_valuelineacab20);
        } else {
            setLineacab20(null);
        } // end if
        java.sql.Timestamp l_valuefchproceso = p_rs.getTimestamp("fchproceso");
        if (!p_rs.wasNull()) {
            setFchproceso(l_valuefchproceso);
        } else {
            setFchproceso(null);
        } // end if
        String l_valuepdffilename = p_rs.getString("pdffilename");
        if (!p_rs.wasNull()) {
            setPdffilename(l_valuepdffilename);
        } else {
            setPdffilename(null);
        } // end if
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
        String l_valuelineacomprobante1 = p_rs.getString("lineacomprobante1");
        if (!p_rs.wasNull()) {
            setLineacomprobante1(l_valuelineacomprobante1);
        } else {
            setLineacomprobante1(null);
        } // end if
        String l_valuelineacomprobante2 = p_rs.getString("lineacomprobante2");
        if (!p_rs.wasNull()) {
            setLineacomprobante2(l_valuelineacomprobante2);
        } else {
            setLineacomprobante2(null);
        } // end if
        String l_valuelineacomprobante3 = p_rs.getString("lineacomprobante3");
        if (!p_rs.wasNull()) {
            setLineacomprobante3(l_valuelineacomprobante3);
        } else {
            setLineacomprobante3(null);
        } // end if
        String l_valuelineacomprobante4 = p_rs.getString("lineacomprobante4");
        if (!p_rs.wasNull()) {
            setLineacomprobante4(l_valuelineacomprobante4);
        } else {
            setLineacomprobante4(null);
        } // end if
        String l_valuelineacomprobante5 = p_rs.getString("lineacomprobante5");
        if (!p_rs.wasNull()) {
            setLineacomprobante5(l_valuelineacomprobante5);
        } else {
            setLineacomprobante5(null);
        } // end if
        String l_valuelineacomprobante6 = p_rs.getString("lineacomprobante6");
        if (!p_rs.wasNull()) {
            setLineacomprobante6(l_valuelineacomprobante6);
        } else {
            setLineacomprobante6(null);
        } // end if
        String l_valuelineacomprobante7 = p_rs.getString("lineacomprobante7");
        if (!p_rs.wasNull()) {
            setLineacomprobante7(l_valuelineacomprobante7);
        } else {
            setLineacomprobante7(null);
        } // end if
        String l_valuelineacomprobante8 = p_rs.getString("lineacomprobante8");
        if (!p_rs.wasNull()) {
            setLineacomprobante8(l_valuelineacomprobante8);
        } else {
            setLineacomprobante8(null);
        } // end if
        String l_valuelineacomprobante9 = p_rs.getString("lineacomprobante9");
        if (!p_rs.wasNull()) {
            setLineacomprobante9(l_valuelineacomprobante9);
        } else {
            setLineacomprobante9(null);
        } // end if
        String l_valuelineacomprobante10 = p_rs.getString("lineacomprobante10");
        if (!p_rs.wasNull()) {
            setLineacomprobante10(l_valuelineacomprobante10);
        } else {
            setLineacomprobante10(null);
        } // end if
        Integer l_valuePtoVta = p_rs.getInt("PtoVta");
        if (!p_rs.wasNull()) {
            setPtoVta(l_valuePtoVta);
        } else {
            setPtoVta(null);
        } // end if
        String l_valueLetraFiscal = p_rs.getString("LetraFiscal");
        if (!p_rs.wasNull()) {
            setLetraFiscal(l_valueLetraFiscal);
        } else {
            setLetraFiscal(null);
        } // end if
        String l_valuesintetico = p_rs.getString("sintetico");
        if (!p_rs.wasNull()) {
            setSintetico(l_valuesintetico);
        } else {
            setSintetico(null);
        } // end if
        String l_valuedoctipodescripcion = p_rs.getString("doctipodescripcion");
        if (!p_rs.wasNull()) {
            setDoctipodescripcion(l_valuedoctipodescripcion);
        } else {
            setDoctipodescripcion(null);
        } // end if
        String l_valuemodelo = p_rs.getString("modelo");
        if (!p_rs.wasNull()) {
            setModelo(l_valuemodelo);
        } else {
            setModelo(null);
        } // end if
        String l_valuecopia = p_rs.getString("copia");
        if (!p_rs.wasNull()) {
            setCopia(l_valuecopia);
        } else {
            setCopia(null);
        } // end if
        String l_valueobservacionescopia = p_rs.getString("observacionescopia");
        if (!p_rs.wasNull()) {
            setObservacionescopia(l_valueobservacionescopia);
        } else {
            setObservacionescopia(null);
        } // end if
        String l_valuemsgerrs = p_rs.getString("msgerrs");
        if (!p_rs.wasNull()) {
            setMsgerrs(l_valuemsgerrs);
        } else {
            setMsgerrs(null);
        } // end if
        Integer l_valueCodCondIva = p_rs.getInt("CodCondIva");
        if (!p_rs.wasNull()) {
            setCodCondIva(l_valueCodCondIva);
        } else {
            setCodCondIva(null);
        } // end if
        String l_valueivacliente = p_rs.getString("ivacliente");
        if (!p_rs.wasNull()) {
            setIvacliente(l_valueivacliente);
        } else {
            setIvacliente(null);
        } // end if
        String l_valueobscomerciales = p_rs.getString("obscomerciales");
        if (!p_rs.wasNull()) {
            setObscomerciales(l_valueobscomerciales);
        } else {
            setObscomerciales(null);
        } // end if
        String l_valuemontoescrito = p_rs.getString("montoescrito");
        if (!p_rs.wasNull()) {
            setMontoescrito(l_valuemontoescrito);
        } else {
            setMontoescrito(null);
        } // end if
        String l_valueSimboloMoneda = p_rs.getString("SimboloMoneda");
        if (!p_rs.wasNull()) {
            setSimboloMoneda(l_valueSimboloMoneda);
        } else {
            setSimboloMoneda(null);
        } // end if
    }

    public void serializeFrom(VR_rp_Comprobante p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar rp_Comprobante desde un registro origen = null");
    }
        setIdDocumentoFE(p_src.getIdDocumentoFE());
        setIdPtoVta(p_src.getIdPtoVta());
        setCbteTipo(p_src.getCbteTipo());
        setCbtedesde(p_src.getCbtedesde());
        setCbtehasta(p_src.getCbtehasta());
        setConcepto(p_src.getConcepto());
        setDocTipo(p_src.getDocTipo());
        setDocNro(p_src.getDocNro());
        setCbtefch(p_src.getCbtefch());
        setImptotal(p_src.getImptotal());
        setImptotconc(p_src.getImptotconc());
        setImpneto(p_src.getImpneto());
        setImpopex(p_src.getImpopex());
        setImptrib(p_src.getImptrib());
        setImpiva(p_src.getImpiva());
        setFchservdesde(p_src.getFchservdesde());
        setFchservhasta(p_src.getFchservhasta());
        setFchvtopago(p_src.getFchvtopago());
        setMonId(p_src.getMonId());
        setMonCotiz(p_src.getMonCotiz());
        setResultado(p_src.getResultado());
        setCodAutorizacion(p_src.getCodAutorizacion());
        setCaefchvto(p_src.getCaefchvto());
        setHashLink(p_src.getHashLink());
        setBarcode(p_src.getBarcode());
        setRazonsocial(p_src.getRazonsocial());
        setDomicilio1(p_src.getDomicilio1());
        setDomicilio2(p_src.getDomicilio2());
        setLineacab1(p_src.getLineacab1());
        setLineacab2(p_src.getLineacab2());
        setLineacab3(p_src.getLineacab3());
        setLineacab4(p_src.getLineacab4());
        setLineacab5(p_src.getLineacab5());
        setLineacab6(p_src.getLineacab6());
        setLineacab7(p_src.getLineacab7());
        setLineacab8(p_src.getLineacab8());
        setLineacab9(p_src.getLineacab9());
        setLineacab10(p_src.getLineacab10());
        setLineacab11(p_src.getLineacab11());
        setLineacab12(p_src.getLineacab12());
        setLineacab13(p_src.getLineacab13());
        setLineacab14(p_src.getLineacab14());
        setLineacab15(p_src.getLineacab15());
        setLineacab16(p_src.getLineacab16());
        setLineacab17(p_src.getLineacab17());
        setLineacab18(p_src.getLineacab18());
        setLineacab19(p_src.getLineacab19());
        setLineacab20(p_src.getLineacab20());
        setFchproceso(p_src.getFchproceso());
        setPdffilename(p_src.getPdffilename());
        setCuit(p_src.getCuit());
        setDescripcion(p_src.getDescripcion());
        setLineacomprobante1(p_src.getLineacomprobante1());
        setLineacomprobante2(p_src.getLineacomprobante2());
        setLineacomprobante3(p_src.getLineacomprobante3());
        setLineacomprobante4(p_src.getLineacomprobante4());
        setLineacomprobante5(p_src.getLineacomprobante5());
        setLineacomprobante6(p_src.getLineacomprobante6());
        setLineacomprobante7(p_src.getLineacomprobante7());
        setLineacomprobante8(p_src.getLineacomprobante8());
        setLineacomprobante9(p_src.getLineacomprobante9());
        setLineacomprobante10(p_src.getLineacomprobante10());
        setPtoVta(p_src.getPtoVta());
        setLetraFiscal(p_src.getLetraFiscal());
        setSintetico(p_src.getSintetico());
        setDoctipodescripcion(p_src.getDoctipodescripcion());
        setModelo(p_src.getModelo());
        setCopia(p_src.getCopia());
        setObservacionescopia(p_src.getObservacionescopia());
        setMsgerrs(p_src.getMsgerrs());
        setCodCondIva(p_src.getCodCondIva());
        setIvacliente(p_src.getIvacliente());
        setObscomerciales(p_src.getObscomerciales());
        setMontoescrito(p_src.getMontoescrito());
        setSimboloMoneda(p_src.getSimboloMoneda());
    }

    public Integer getId() {
        return getIdDocumentoFE();
    }

}
