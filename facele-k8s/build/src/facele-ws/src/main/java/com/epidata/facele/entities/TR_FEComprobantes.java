/**
ORM table row class for: FEComprobantes
Generated: 2025-10-21 15:27:38
CRDETR un comprobante electrónico, ya autorizado o pendiente de autorización.
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class TR_FEComprobantes extends AbstractRecord implements SinglePkRecord<Integer> {

    public TR_FEComprobantes() {
        m_IdDocumentoFE = new com.epidata.facele.entities.D_IdDocumentoFE();
        m_IdPtoVta = new com.epidata.facele.entities.D_IdPtoVta();
        m_CbteTipo = new com.epidata.facele.entities.D_CbteTipo();
        m_CbteDesde = new com.epidata.facele.entities.D_CbteNumero();
        m_CbteHasta = new com.epidata.facele.entities.D_CbteNumero();
        m_Concepto = new com.epidata.facele.entities.D_Concepto();
        m_DocTipo = new com.epidata.facele.entities.D_DocTipo();
        m_DocNro = new com.epidata.facele.entities.D_DocNro();
        m_CbteFch = new com.epidata.facele.entities.D_Fecha();
        m_ImpTotal = new com.epidata.facele.entities.D_Monto();
        m_ImpTotConc = new com.epidata.facele.entities.D_Monto();
        m_ImpNeto = new com.epidata.facele.entities.D_Monto();
        m_ImpOpEx = new com.epidata.facele.entities.D_Monto();
        m_ImpTrib = new com.epidata.facele.entities.D_Monto();
        m_ImpIVA = new com.epidata.facele.entities.D_Monto();
        m_FchServDesde = new com.epidata.facele.entities.D_Fecha();
        m_FchServHasta = new com.epidata.facele.entities.D_Fecha();
        m_FchVtoPago = new com.epidata.facele.entities.D_Fecha();
        m_MonId = new com.epidata.facele.entities.D_MonId();
        m_MonCotiz = new com.epidata.facele.entities.D_MonCotiz();
        m_Resultado = new com.epidata.facele.entities.D_Resultado();
        m_CodAutorizacion = new com.epidata.facele.entities.D_CodAutorizacion();
        m_CAEFchVto = new com.epidata.facele.entities.D_Fecha();
        m_HashLink = new com.epidata.facele.entities.D_HashLink();
        m_CodeErrs = new com.epidata.facele.entities.D_Descripcion();
        m_MsgErrs = new com.epidata.facele.entities.D_Observaciones();
        m_ReportTemplate = new com.epidata.facele.entities.D_ReportTemplate();
        m_BarCode = new com.epidata.facele.entities.D_BarCode42();
        m_RazonSocial = new com.epidata.facele.entities.D_Descripcion();
        m_Domicilio1 = new com.epidata.facele.entities.D_Descripcion();
        m_Domicilio2 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaCab1 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaCab2 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaCab3 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaCab4 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaCab5 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaCab6 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaCab7 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaCab8 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaCab9 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaCab10 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaCab11 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaCab12 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaCab13 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaCab14 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaCab15 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaCab16 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaCab17 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaCab18 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaCab19 = new com.epidata.facele.entities.D_Descripcion();
        m_LineaCab20 = new com.epidata.facele.entities.D_Descripcion();
        m_FchProceso = new com.epidata.facele.entities.D_FechaHora();
        m_PDFFileName = new com.epidata.facele.entities.D_FullFileName();
        m_ModeloCopias = new com.epidata.facele.entities.D_Descripcion();
        m_EstadoPDF = new com.epidata.facele.entities.D_EstadoPDF();
        m_IdLoteFacturacion = new com.epidata.facele.entities.D_IdLoteFacturacion();
        m_CodActividad = new com.epidata.facele.entities.D_CodActividad();
        m_CodCondIva = new com.epidata.facele.entities.D_CodCondIva();
        m_PermisoExistente = new com.epidata.facele.entities.D_SiNo();
        m_IdFEXDstPais = new com.epidata.facele.entities.D_IdFEXDstPais();
        m_IdFEXDstCuit = new com.epidata.facele.entities.D_IdFEXDstCuit();
        m_CanMisMonExt = new com.epidata.facele.entities.D_SiNo();
        m_ObsComerciales = new com.epidata.facele.entities.D_Observaciones();
        m_Observaciones = new com.epidata.facele.entities.D_Observaciones();
        m_FormaPago = new com.epidata.facele.entities.D_Descripcion();
        m_IdFEXIdioma = new com.epidata.facele.entities.D_IdFEXIdioma();
        m_IdFEXIncoterm = new com.epidata.facele.entities.D_IdFEXIncoterm();
        m_IncotermsDesc = new com.epidata.facele.entities.D_Descripcion();
        m_MontoEscrito = new com.epidata.facele.entities.D_SqlText();
    }

    public TR_FEComprobantes(ResultSet p_rs) throws Exception {
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

    /** Valor del campo: CbteDesde
    */
    private com.epidata.facele.entities.D_CbteNumero  m_CbteDesde;

    /**
    */
    public Integer getCbteDesde() {
        return m_CbteDesde.get();
    }
    /**
    */
    public void setCbteDesde(Integer p_value) {
        m_CbteDesde.set(p_value);
    }

    /** Valor del campo: CbteHasta
    */
    private com.epidata.facele.entities.D_CbteNumero  m_CbteHasta;

    /**
    */
    public Integer getCbteHasta() {
        return m_CbteHasta.get();
    }
    /**
    */
    public void setCbteHasta(Integer p_value) {
        m_CbteHasta.set(p_value);
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

    /** Valor del campo: CbteFch
    */
    private com.epidata.facele.entities.D_Fecha  m_CbteFch;

    /**
    */
    public Date getCbteFch() {
        return m_CbteFch.get();
    }
    /**
    */
    public void setCbteFch(Date p_value) {
        m_CbteFch.set(p_value);
    }

    /** Valor del campo: ImpTotal
    */
    private com.epidata.facele.entities.D_Monto  m_ImpTotal;

    /**
    */
    public Double getImpTotal() {
        return m_ImpTotal.get();
    }
    /**
    */
    public void setImpTotal(Double p_value) {
        m_ImpTotal.set(p_value);
    }

    /** Valor del campo: ImpTotConc
    */
    private com.epidata.facele.entities.D_Monto  m_ImpTotConc;

    /**
    */
    public Double getImpTotConc() {
        return m_ImpTotConc.get();
    }
    /**
    */
    public void setImpTotConc(Double p_value) {
        m_ImpTotConc.set(p_value);
    }

    /** Valor del campo: ImpNeto
    */
    private com.epidata.facele.entities.D_Monto  m_ImpNeto;

    /**
    */
    public Double getImpNeto() {
        return m_ImpNeto.get();
    }
    /**
    */
    public void setImpNeto(Double p_value) {
        m_ImpNeto.set(p_value);
    }

    /** Valor del campo: ImpOpEx
    */
    private com.epidata.facele.entities.D_Monto  m_ImpOpEx;

    /**
    */
    public Double getImpOpEx() {
        return m_ImpOpEx.get();
    }
    /**
    */
    public void setImpOpEx(Double p_value) {
        m_ImpOpEx.set(p_value);
    }

    /** Valor del campo: ImpTrib
    */
    private com.epidata.facele.entities.D_Monto  m_ImpTrib;

    /**
    */
    public Double getImpTrib() {
        return m_ImpTrib.get();
    }
    /**
    */
    public void setImpTrib(Double p_value) {
        m_ImpTrib.set(p_value);
    }

    /** Valor del campo: ImpIVA
    */
    private com.epidata.facele.entities.D_Monto  m_ImpIVA;

    /**
    */
    public Double getImpIVA() {
        return m_ImpIVA.get();
    }
    /**
    */
    public void setImpIVA(Double p_value) {
        m_ImpIVA.set(p_value);
    }

    /** Valor del campo: FchServDesde
    */
    private com.epidata.facele.entities.D_Fecha  m_FchServDesde;

    /**
    */
    public Date getFchServDesde() {
        return m_FchServDesde.get();
    }
    /**
    */
    public void setFchServDesde(Date p_value) {
        m_FchServDesde.set(p_value);
    }

    /** Valor del campo: FchServHasta
    */
    private com.epidata.facele.entities.D_Fecha  m_FchServHasta;

    /**
    */
    public Date getFchServHasta() {
        return m_FchServHasta.get();
    }
    /**
    */
    public void setFchServHasta(Date p_value) {
        m_FchServHasta.set(p_value);
    }

    /** Valor del campo: FchVtoPago
    */
    private com.epidata.facele.entities.D_Fecha  m_FchVtoPago;

    /**
    */
    public Date getFchVtoPago() {
        return m_FchVtoPago.get();
    }
    /**
    */
    public void setFchVtoPago(Date p_value) {
        m_FchVtoPago.set(p_value);
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

    /** Valor del campo: CAEFchVto
    */
    private com.epidata.facele.entities.D_Fecha  m_CAEFchVto;

    /**
    */
    public Date getCAEFchVto() {
        return m_CAEFchVto.get();
    }
    /**
    */
    public void setCAEFchVto(Date p_value) {
        m_CAEFchVto.set(p_value);
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

    /** Valor del campo: CodeErrs
    */
    private com.epidata.facele.entities.D_Descripcion  m_CodeErrs;

    /**
    */
    public String getCodeErrs() {
        return m_CodeErrs.get();
    }
    /**
    */
    public void setCodeErrs(String p_value) {
        m_CodeErrs.set(p_value);
    }

    /** Valor del campo: MsgErrs
    */
    private com.epidata.facele.entities.D_Observaciones  m_MsgErrs;

    /**
    */
    public String getMsgErrs() {
        return m_MsgErrs.get();
    }
    /**
    */
    public void setMsgErrs(String p_value) {
        m_MsgErrs.set(p_value);
    }

    /** Valor del campo: ReportTemplate
    */
    private com.epidata.facele.entities.D_ReportTemplate  m_ReportTemplate;

    /**
    */
    public String getReportTemplate() {
        return m_ReportTemplate.get();
    }
    /**
    */
    public void setReportTemplate(String p_value) {
        m_ReportTemplate.set(p_value);
    }

    /** Valor del campo: BarCode
    */
    private com.epidata.facele.entities.D_BarCode42  m_BarCode;

    /**
    */
    public String getBarCode() {
        return m_BarCode.get();
    }
    /**
    */
    public void setBarCode(String p_value) {
        m_BarCode.set(p_value);
    }

    /** Valor del campo: RazonSocial
    */
    private com.epidata.facele.entities.D_Descripcion  m_RazonSocial;

    /**
    */
    public String getRazonSocial() {
        return m_RazonSocial.get();
    }
    /**
    */
    public void setRazonSocial(String p_value) {
        m_RazonSocial.set(p_value);
    }

    /** Valor del campo: Domicilio1
    */
    private com.epidata.facele.entities.D_Descripcion  m_Domicilio1;

    /**
    */
    public String getDomicilio1() {
        return m_Domicilio1.get();
    }
    /**
    */
    public void setDomicilio1(String p_value) {
        m_Domicilio1.set(p_value);
    }

    /** Valor del campo: Domicilio2
    */
    private com.epidata.facele.entities.D_Descripcion  m_Domicilio2;

    /**
    */
    public String getDomicilio2() {
        return m_Domicilio2.get();
    }
    /**
    */
    public void setDomicilio2(String p_value) {
        m_Domicilio2.set(p_value);
    }

    /** Valor del campo: LineaCab1
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaCab1;

    /**
    */
    public String getLineaCab1() {
        return m_LineaCab1.get();
    }
    /**
    */
    public void setLineaCab1(String p_value) {
        m_LineaCab1.set(p_value);
    }

    /** Valor del campo: LineaCab2
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaCab2;

    /**
    */
    public String getLineaCab2() {
        return m_LineaCab2.get();
    }
    /**
    */
    public void setLineaCab2(String p_value) {
        m_LineaCab2.set(p_value);
    }

    /** Valor del campo: LineaCab3
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaCab3;

    /**
    */
    public String getLineaCab3() {
        return m_LineaCab3.get();
    }
    /**
    */
    public void setLineaCab3(String p_value) {
        m_LineaCab3.set(p_value);
    }

    /** Valor del campo: LineaCab4
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaCab4;

    /**
    */
    public String getLineaCab4() {
        return m_LineaCab4.get();
    }
    /**
    */
    public void setLineaCab4(String p_value) {
        m_LineaCab4.set(p_value);
    }

    /** Valor del campo: LineaCab5
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaCab5;

    /**
    */
    public String getLineaCab5() {
        return m_LineaCab5.get();
    }
    /**
    */
    public void setLineaCab5(String p_value) {
        m_LineaCab5.set(p_value);
    }

    /** Valor del campo: LineaCab6
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaCab6;

    /**
    */
    public String getLineaCab6() {
        return m_LineaCab6.get();
    }
    /**
    */
    public void setLineaCab6(String p_value) {
        m_LineaCab6.set(p_value);
    }

    /** Valor del campo: LineaCab7
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaCab7;

    /**
    */
    public String getLineaCab7() {
        return m_LineaCab7.get();
    }
    /**
    */
    public void setLineaCab7(String p_value) {
        m_LineaCab7.set(p_value);
    }

    /** Valor del campo: LineaCab8
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaCab8;

    /**
    */
    public String getLineaCab8() {
        return m_LineaCab8.get();
    }
    /**
    */
    public void setLineaCab8(String p_value) {
        m_LineaCab8.set(p_value);
    }

    /** Valor del campo: LineaCab9
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaCab9;

    /**
    */
    public String getLineaCab9() {
        return m_LineaCab9.get();
    }
    /**
    */
    public void setLineaCab9(String p_value) {
        m_LineaCab9.set(p_value);
    }

    /** Valor del campo: LineaCab10
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaCab10;

    /**
    */
    public String getLineaCab10() {
        return m_LineaCab10.get();
    }
    /**
    */
    public void setLineaCab10(String p_value) {
        m_LineaCab10.set(p_value);
    }

    /** Valor del campo: LineaCab11
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaCab11;

    /**
    */
    public String getLineaCab11() {
        return m_LineaCab11.get();
    }
    /**
    */
    public void setLineaCab11(String p_value) {
        m_LineaCab11.set(p_value);
    }

    /** Valor del campo: LineaCab12
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaCab12;

    /**
    */
    public String getLineaCab12() {
        return m_LineaCab12.get();
    }
    /**
    */
    public void setLineaCab12(String p_value) {
        m_LineaCab12.set(p_value);
    }

    /** Valor del campo: LineaCab13
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaCab13;

    /**
    */
    public String getLineaCab13() {
        return m_LineaCab13.get();
    }
    /**
    */
    public void setLineaCab13(String p_value) {
        m_LineaCab13.set(p_value);
    }

    /** Valor del campo: LineaCab14
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaCab14;

    /**
    */
    public String getLineaCab14() {
        return m_LineaCab14.get();
    }
    /**
    */
    public void setLineaCab14(String p_value) {
        m_LineaCab14.set(p_value);
    }

    /** Valor del campo: LineaCab15
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaCab15;

    /**
    */
    public String getLineaCab15() {
        return m_LineaCab15.get();
    }
    /**
    */
    public void setLineaCab15(String p_value) {
        m_LineaCab15.set(p_value);
    }

    /** Valor del campo: LineaCab16
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaCab16;

    /**
    */
    public String getLineaCab16() {
        return m_LineaCab16.get();
    }
    /**
    */
    public void setLineaCab16(String p_value) {
        m_LineaCab16.set(p_value);
    }

    /** Valor del campo: LineaCab17
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaCab17;

    /**
    */
    public String getLineaCab17() {
        return m_LineaCab17.get();
    }
    /**
    */
    public void setLineaCab17(String p_value) {
        m_LineaCab17.set(p_value);
    }

    /** Valor del campo: LineaCab18
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaCab18;

    /**
    */
    public String getLineaCab18() {
        return m_LineaCab18.get();
    }
    /**
    */
    public void setLineaCab18(String p_value) {
        m_LineaCab18.set(p_value);
    }

    /** Valor del campo: LineaCab19
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaCab19;

    /**
    */
    public String getLineaCab19() {
        return m_LineaCab19.get();
    }
    /**
    */
    public void setLineaCab19(String p_value) {
        m_LineaCab19.set(p_value);
    }

    /** Valor del campo: LineaCab20
    */
    private com.epidata.facele.entities.D_Descripcion  m_LineaCab20;

    /**
    */
    public String getLineaCab20() {
        return m_LineaCab20.get();
    }
    /**
    */
    public void setLineaCab20(String p_value) {
        m_LineaCab20.set(p_value);
    }

    /** Valor del campo: FchProceso
    */
    private com.epidata.facele.entities.D_FechaHora  m_FchProceso;

    /**
    */
    public java.sql.Timestamp getFchProceso() {
        return m_FchProceso.get();
    }
    /**
    */
    public void setFchProceso(java.sql.Timestamp p_value) {
        m_FchProceso.set(p_value);
    }

    /** Valor del campo: PDFFileName
    */
    private com.epidata.facele.entities.D_FullFileName  m_PDFFileName;

    /**
    */
    public String getPDFFileName() {
        return m_PDFFileName.get();
    }
    /**
    */
    public void setPDFFileName(String p_value) {
        m_PDFFileName.set(p_value);
    }

    /** Valor del campo: ModeloCopias
    */
    private com.epidata.facele.entities.D_Descripcion  m_ModeloCopias;

    /**
    */
    public String getModeloCopias() {
        return m_ModeloCopias.get();
    }
    /**
    */
    public void setModeloCopias(String p_value) {
        m_ModeloCopias.set(p_value);
    }

    /** Valor del campo: EstadoPDF
    */
    private com.epidata.facele.entities.D_EstadoPDF  m_EstadoPDF;

    /**
    */
    public String getEstadoPDF() {
        return m_EstadoPDF.get();
    }
    /**
    */
    public void setEstadoPDF(String p_value) {
        m_EstadoPDF.set(p_value);
    }

    /** Valor del campo: IdLoteFacturacion
    */
    private com.epidata.facele.entities.D_IdLoteFacturacion  m_IdLoteFacturacion;

    /**
    */
    public Integer getIdLoteFacturacion() {
        return m_IdLoteFacturacion.get();
    }
    /**
    */
    public void setIdLoteFacturacion(Integer p_value) {
        m_IdLoteFacturacion.set(p_value);
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

    /** Valor del campo: PermisoExistente
    */
    private com.epidata.facele.entities.D_SiNo  m_PermisoExistente;

    /**
    */
    public String getPermisoExistente() {
        return m_PermisoExistente.get();
    }
    /**
    */
    public void setPermisoExistente(String p_value) {
        m_PermisoExistente.set(p_value);
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

    /** Valor del campo: IdFEXDstCuit
    */
    private com.epidata.facele.entities.D_IdFEXDstCuit  m_IdFEXDstCuit;

    /**
    */
    public Long getIdFEXDstCuit() {
        return m_IdFEXDstCuit.get();
    }
    /**
    */
    public void setIdFEXDstCuit(Long p_value) {
        m_IdFEXDstCuit.set(p_value);
    }

    /** Valor del campo: CanMisMonExt
    */
    private com.epidata.facele.entities.D_SiNo  m_CanMisMonExt;

    /**
    */
    public String getCanMisMonExt() {
        return m_CanMisMonExt.get();
    }
    /**
    */
    public void setCanMisMonExt(String p_value) {
        m_CanMisMonExt.set(p_value);
    }

    /** Valor del campo: ObsComerciales
    */
    private com.epidata.facele.entities.D_Observaciones  m_ObsComerciales;

    /**
    */
    public String getObsComerciales() {
        return m_ObsComerciales.get();
    }
    /**
    */
    public void setObsComerciales(String p_value) {
        m_ObsComerciales.set(p_value);
    }

    /** Valor del campo: Observaciones
    */
    private com.epidata.facele.entities.D_Observaciones  m_Observaciones;

    /**
    */
    public String getObservaciones() {
        return m_Observaciones.get();
    }
    /**
    */
    public void setObservaciones(String p_value) {
        m_Observaciones.set(p_value);
    }

    /** Valor del campo: FormaPago
    */
    private com.epidata.facele.entities.D_Descripcion  m_FormaPago;

    /**
    */
    public String getFormaPago() {
        return m_FormaPago.get();
    }
    /**
    */
    public void setFormaPago(String p_value) {
        m_FormaPago.set(p_value);
    }

    /** Valor del campo: IdFEXIdioma
    */
    private com.epidata.facele.entities.D_IdFEXIdioma  m_IdFEXIdioma;

    /**
    */
    public Integer getIdFEXIdioma() {
        return m_IdFEXIdioma.get();
    }
    /**
    */
    public void setIdFEXIdioma(Integer p_value) {
        m_IdFEXIdioma.set(p_value);
    }

    /** Valor del campo: IdFEXIncoterm
    */
    private com.epidata.facele.entities.D_IdFEXIncoterm  m_IdFEXIncoterm;

    /**
    */
    public String getIdFEXIncoterm() {
        return m_IdFEXIncoterm.get();
    }
    /**
    */
    public void setIdFEXIncoterm(String p_value) {
        m_IdFEXIncoterm.set(p_value);
    }

    /** Valor del campo: IncotermsDesc
    */
    private com.epidata.facele.entities.D_Descripcion  m_IncotermsDesc;

    /**
    */
    public String getIncotermsDesc() {
        return m_IncotermsDesc.get();
    }
    /**
    */
    public void setIncotermsDesc(String p_value) {
        m_IncotermsDesc.set(p_value);
    }

    /** Valor del campo: MontoEscrito
    */
    private com.epidata.facele.entities.D_SqlText  m_MontoEscrito;

    /**
    */
    public String getMontoEscrito() {
        return m_MontoEscrito.get();
    }
    /**
    */
    public void setMontoEscrito(String p_value) {
        m_MontoEscrito.set(p_value);
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
        Integer l_valueCbteDesde = p_rs.getInt("CbteDesde");
        if (!p_rs.wasNull()) {
            setCbteDesde(l_valueCbteDesde);
        } else {
            setCbteDesde(null);
        } // end if
        Integer l_valueCbteHasta = p_rs.getInt("CbteHasta");
        if (!p_rs.wasNull()) {
            setCbteHasta(l_valueCbteHasta);
        } else {
            setCbteHasta(null);
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
        Date l_valueCbteFch = p_rs.getDate("CbteFch");
        if (!p_rs.wasNull()) {
            setCbteFch(l_valueCbteFch);
        } else {
            setCbteFch(null);
        } // end if
        Double l_valueImpTotal = p_rs.getDouble("ImpTotal");
        if (!p_rs.wasNull()) {
            setImpTotal(l_valueImpTotal);
        } else {
            setImpTotal(null);
        } // end if
        Double l_valueImpTotConc = p_rs.getDouble("ImpTotConc");
        if (!p_rs.wasNull()) {
            setImpTotConc(l_valueImpTotConc);
        } else {
            setImpTotConc(null);
        } // end if
        Double l_valueImpNeto = p_rs.getDouble("ImpNeto");
        if (!p_rs.wasNull()) {
            setImpNeto(l_valueImpNeto);
        } else {
            setImpNeto(null);
        } // end if
        Double l_valueImpOpEx = p_rs.getDouble("ImpOpEx");
        if (!p_rs.wasNull()) {
            setImpOpEx(l_valueImpOpEx);
        } else {
            setImpOpEx(null);
        } // end if
        Double l_valueImpTrib = p_rs.getDouble("ImpTrib");
        if (!p_rs.wasNull()) {
            setImpTrib(l_valueImpTrib);
        } else {
            setImpTrib(null);
        } // end if
        Double l_valueImpIVA = p_rs.getDouble("ImpIVA");
        if (!p_rs.wasNull()) {
            setImpIVA(l_valueImpIVA);
        } else {
            setImpIVA(null);
        } // end if
        Date l_valueFchServDesde = p_rs.getDate("FchServDesde");
        if (!p_rs.wasNull()) {
            setFchServDesde(l_valueFchServDesde);
        } else {
            setFchServDesde(null);
        } // end if
        Date l_valueFchServHasta = p_rs.getDate("FchServHasta");
        if (!p_rs.wasNull()) {
            setFchServHasta(l_valueFchServHasta);
        } else {
            setFchServHasta(null);
        } // end if
        Date l_valueFchVtoPago = p_rs.getDate("FchVtoPago");
        if (!p_rs.wasNull()) {
            setFchVtoPago(l_valueFchVtoPago);
        } else {
            setFchVtoPago(null);
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
        Date l_valueCAEFchVto = p_rs.getDate("CAEFchVto");
        if (!p_rs.wasNull()) {
            setCAEFchVto(l_valueCAEFchVto);
        } else {
            setCAEFchVto(null);
        } // end if
        String l_valueHashLink = p_rs.getString("HashLink");
        if (!p_rs.wasNull()) {
            setHashLink(l_valueHashLink);
        } else {
            setHashLink(null);
        } // end if
        String l_valueCodeErrs = p_rs.getString("CodeErrs");
        if (!p_rs.wasNull()) {
            setCodeErrs(l_valueCodeErrs);
        } else {
            setCodeErrs(null);
        } // end if
        String l_valueMsgErrs = p_rs.getString("MsgErrs");
        if (!p_rs.wasNull()) {
            setMsgErrs(l_valueMsgErrs);
        } else {
            setMsgErrs(null);
        } // end if
        String l_valueReportTemplate = p_rs.getString("ReportTemplate");
        if (!p_rs.wasNull()) {
            setReportTemplate(l_valueReportTemplate);
        } else {
            setReportTemplate(null);
        } // end if
        String l_valueBarCode = p_rs.getString("BarCode");
        if (!p_rs.wasNull()) {
            setBarCode(l_valueBarCode);
        } else {
            setBarCode(null);
        } // end if
        String l_valueRazonSocial = p_rs.getString("RazonSocial");
        if (!p_rs.wasNull()) {
            setRazonSocial(l_valueRazonSocial);
        } else {
            setRazonSocial(null);
        } // end if
        String l_valueDomicilio1 = p_rs.getString("Domicilio1");
        if (!p_rs.wasNull()) {
            setDomicilio1(l_valueDomicilio1);
        } else {
            setDomicilio1(null);
        } // end if
        String l_valueDomicilio2 = p_rs.getString("Domicilio2");
        if (!p_rs.wasNull()) {
            setDomicilio2(l_valueDomicilio2);
        } else {
            setDomicilio2(null);
        } // end if
        String l_valueLineaCab1 = p_rs.getString("LineaCab1");
        if (!p_rs.wasNull()) {
            setLineaCab1(l_valueLineaCab1);
        } else {
            setLineaCab1(null);
        } // end if
        String l_valueLineaCab2 = p_rs.getString("LineaCab2");
        if (!p_rs.wasNull()) {
            setLineaCab2(l_valueLineaCab2);
        } else {
            setLineaCab2(null);
        } // end if
        String l_valueLineaCab3 = p_rs.getString("LineaCab3");
        if (!p_rs.wasNull()) {
            setLineaCab3(l_valueLineaCab3);
        } else {
            setLineaCab3(null);
        } // end if
        String l_valueLineaCab4 = p_rs.getString("LineaCab4");
        if (!p_rs.wasNull()) {
            setLineaCab4(l_valueLineaCab4);
        } else {
            setLineaCab4(null);
        } // end if
        String l_valueLineaCab5 = p_rs.getString("LineaCab5");
        if (!p_rs.wasNull()) {
            setLineaCab5(l_valueLineaCab5);
        } else {
            setLineaCab5(null);
        } // end if
        String l_valueLineaCab6 = p_rs.getString("LineaCab6");
        if (!p_rs.wasNull()) {
            setLineaCab6(l_valueLineaCab6);
        } else {
            setLineaCab6(null);
        } // end if
        String l_valueLineaCab7 = p_rs.getString("LineaCab7");
        if (!p_rs.wasNull()) {
            setLineaCab7(l_valueLineaCab7);
        } else {
            setLineaCab7(null);
        } // end if
        String l_valueLineaCab8 = p_rs.getString("LineaCab8");
        if (!p_rs.wasNull()) {
            setLineaCab8(l_valueLineaCab8);
        } else {
            setLineaCab8(null);
        } // end if
        String l_valueLineaCab9 = p_rs.getString("LineaCab9");
        if (!p_rs.wasNull()) {
            setLineaCab9(l_valueLineaCab9);
        } else {
            setLineaCab9(null);
        } // end if
        String l_valueLineaCab10 = p_rs.getString("LineaCab10");
        if (!p_rs.wasNull()) {
            setLineaCab10(l_valueLineaCab10);
        } else {
            setLineaCab10(null);
        } // end if
        String l_valueLineaCab11 = p_rs.getString("LineaCab11");
        if (!p_rs.wasNull()) {
            setLineaCab11(l_valueLineaCab11);
        } else {
            setLineaCab11(null);
        } // end if
        String l_valueLineaCab12 = p_rs.getString("LineaCab12");
        if (!p_rs.wasNull()) {
            setLineaCab12(l_valueLineaCab12);
        } else {
            setLineaCab12(null);
        } // end if
        String l_valueLineaCab13 = p_rs.getString("LineaCab13");
        if (!p_rs.wasNull()) {
            setLineaCab13(l_valueLineaCab13);
        } else {
            setLineaCab13(null);
        } // end if
        String l_valueLineaCab14 = p_rs.getString("LineaCab14");
        if (!p_rs.wasNull()) {
            setLineaCab14(l_valueLineaCab14);
        } else {
            setLineaCab14(null);
        } // end if
        String l_valueLineaCab15 = p_rs.getString("LineaCab15");
        if (!p_rs.wasNull()) {
            setLineaCab15(l_valueLineaCab15);
        } else {
            setLineaCab15(null);
        } // end if
        String l_valueLineaCab16 = p_rs.getString("LineaCab16");
        if (!p_rs.wasNull()) {
            setLineaCab16(l_valueLineaCab16);
        } else {
            setLineaCab16(null);
        } // end if
        String l_valueLineaCab17 = p_rs.getString("LineaCab17");
        if (!p_rs.wasNull()) {
            setLineaCab17(l_valueLineaCab17);
        } else {
            setLineaCab17(null);
        } // end if
        String l_valueLineaCab18 = p_rs.getString("LineaCab18");
        if (!p_rs.wasNull()) {
            setLineaCab18(l_valueLineaCab18);
        } else {
            setLineaCab18(null);
        } // end if
        String l_valueLineaCab19 = p_rs.getString("LineaCab19");
        if (!p_rs.wasNull()) {
            setLineaCab19(l_valueLineaCab19);
        } else {
            setLineaCab19(null);
        } // end if
        String l_valueLineaCab20 = p_rs.getString("LineaCab20");
        if (!p_rs.wasNull()) {
            setLineaCab20(l_valueLineaCab20);
        } else {
            setLineaCab20(null);
        } // end if
        java.sql.Timestamp l_valueFchProceso = p_rs.getTimestamp("FchProceso");
        if (!p_rs.wasNull()) {
            setFchProceso(l_valueFchProceso);
        } else {
            setFchProceso(null);
        } // end if
        String l_valuePDFFileName = p_rs.getString("PDFFileName");
        if (!p_rs.wasNull()) {
            setPDFFileName(l_valuePDFFileName);
        } else {
            setPDFFileName(null);
        } // end if
        String l_valueModeloCopias = p_rs.getString("ModeloCopias");
        if (!p_rs.wasNull()) {
            setModeloCopias(l_valueModeloCopias);
        } else {
            setModeloCopias(null);
        } // end if
        String l_valueEstadoPDF = p_rs.getString("EstadoPDF");
        if (!p_rs.wasNull()) {
            setEstadoPDF(l_valueEstadoPDF);
        } else {
            setEstadoPDF(null);
        } // end if
        Integer l_valueIdLoteFacturacion = p_rs.getInt("IdLoteFacturacion");
        if (!p_rs.wasNull()) {
            setIdLoteFacturacion(l_valueIdLoteFacturacion);
        } else {
            setIdLoteFacturacion(null);
        } // end if
        Long l_valueCodActividad = p_rs.getLong("CodActividad");
        if (!p_rs.wasNull()) {
            setCodActividad(l_valueCodActividad);
        } else {
            setCodActividad(null);
        } // end if
        Integer l_valueCodCondIva = p_rs.getInt("CodCondIva");
        if (!p_rs.wasNull()) {
            setCodCondIva(l_valueCodCondIva);
        } else {
            setCodCondIva(null);
        } // end if
        String l_valuePermisoExistente = p_rs.getString("PermisoExistente");
        if (!p_rs.wasNull()) {
            setPermisoExistente(l_valuePermisoExistente);
        } else {
            setPermisoExistente(null);
        } // end if
        String l_valueIdFEXDstPais = p_rs.getString("IdFEXDstPais");
        if (!p_rs.wasNull()) {
            setIdFEXDstPais(l_valueIdFEXDstPais);
        } else {
            setIdFEXDstPais(null);
        } // end if
        Long l_valueIdFEXDstCuit = p_rs.getLong("IdFEXDstCuit");
        if (!p_rs.wasNull()) {
            setIdFEXDstCuit(l_valueIdFEXDstCuit);
        } else {
            setIdFEXDstCuit(null);
        } // end if
        String l_valueCanMisMonExt = p_rs.getString("CanMisMonExt");
        if (!p_rs.wasNull()) {
            setCanMisMonExt(l_valueCanMisMonExt);
        } else {
            setCanMisMonExt(null);
        } // end if
        String l_valueObsComerciales = p_rs.getString("ObsComerciales");
        if (!p_rs.wasNull()) {
            setObsComerciales(l_valueObsComerciales);
        } else {
            setObsComerciales(null);
        } // end if
        String l_valueObservaciones = p_rs.getString("Observaciones");
        if (!p_rs.wasNull()) {
            setObservaciones(l_valueObservaciones);
        } else {
            setObservaciones(null);
        } // end if
        String l_valueFormaPago = p_rs.getString("FormaPago");
        if (!p_rs.wasNull()) {
            setFormaPago(l_valueFormaPago);
        } else {
            setFormaPago(null);
        } // end if
        Integer l_valueIdFEXIdioma = p_rs.getInt("IdFEXIdioma");
        if (!p_rs.wasNull()) {
            setIdFEXIdioma(l_valueIdFEXIdioma);
        } else {
            setIdFEXIdioma(null);
        } // end if
        String l_valueIdFEXIncoterm = p_rs.getString("IdFEXIncoterm");
        if (!p_rs.wasNull()) {
            setIdFEXIncoterm(l_valueIdFEXIncoterm);
        } else {
            setIdFEXIncoterm(null);
        } // end if
        String l_valueIncotermsDesc = p_rs.getString("IncotermsDesc");
        if (!p_rs.wasNull()) {
            setIncotermsDesc(l_valueIncotermsDesc);
        } else {
            setIncotermsDesc(null);
        } // end if
        String l_valueMontoEscrito = p_rs.getString("MontoEscrito");
        if (!p_rs.wasNull()) {
            setMontoEscrito(l_valueMontoEscrito);
        } else {
            setMontoEscrito(null);
        } // end if
    }

    public void serializeFrom(TR_FEComprobantes p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar FEComprobantes desde un registro origen = null");
    }
        setIdDocumentoFE(p_src.getIdDocumentoFE());
        setIdPtoVta(p_src.getIdPtoVta());
        setCbteTipo(p_src.getCbteTipo());
        setCbteDesde(p_src.getCbteDesde());
        setCbteHasta(p_src.getCbteHasta());
        setConcepto(p_src.getConcepto());
        setDocTipo(p_src.getDocTipo());
        setDocNro(p_src.getDocNro());
        setCbteFch(p_src.getCbteFch());
        setImpTotal(p_src.getImpTotal());
        setImpTotConc(p_src.getImpTotConc());
        setImpNeto(p_src.getImpNeto());
        setImpOpEx(p_src.getImpOpEx());
        setImpTrib(p_src.getImpTrib());
        setImpIVA(p_src.getImpIVA());
        setFchServDesde(p_src.getFchServDesde());
        setFchServHasta(p_src.getFchServHasta());
        setFchVtoPago(p_src.getFchVtoPago());
        setMonId(p_src.getMonId());
        setMonCotiz(p_src.getMonCotiz());
        setResultado(p_src.getResultado());
        setCodAutorizacion(p_src.getCodAutorizacion());
        setCAEFchVto(p_src.getCAEFchVto());
        setHashLink(p_src.getHashLink());
        setCodeErrs(p_src.getCodeErrs());
        setMsgErrs(p_src.getMsgErrs());
        setReportTemplate(p_src.getReportTemplate());
        setBarCode(p_src.getBarCode());
        setRazonSocial(p_src.getRazonSocial());
        setDomicilio1(p_src.getDomicilio1());
        setDomicilio2(p_src.getDomicilio2());
        setLineaCab1(p_src.getLineaCab1());
        setLineaCab2(p_src.getLineaCab2());
        setLineaCab3(p_src.getLineaCab3());
        setLineaCab4(p_src.getLineaCab4());
        setLineaCab5(p_src.getLineaCab5());
        setLineaCab6(p_src.getLineaCab6());
        setLineaCab7(p_src.getLineaCab7());
        setLineaCab8(p_src.getLineaCab8());
        setLineaCab9(p_src.getLineaCab9());
        setLineaCab10(p_src.getLineaCab10());
        setLineaCab11(p_src.getLineaCab11());
        setLineaCab12(p_src.getLineaCab12());
        setLineaCab13(p_src.getLineaCab13());
        setLineaCab14(p_src.getLineaCab14());
        setLineaCab15(p_src.getLineaCab15());
        setLineaCab16(p_src.getLineaCab16());
        setLineaCab17(p_src.getLineaCab17());
        setLineaCab18(p_src.getLineaCab18());
        setLineaCab19(p_src.getLineaCab19());
        setLineaCab20(p_src.getLineaCab20());
        setFchProceso(p_src.getFchProceso());
        setPDFFileName(p_src.getPDFFileName());
        setModeloCopias(p_src.getModeloCopias());
        setEstadoPDF(p_src.getEstadoPDF());
        setIdLoteFacturacion(p_src.getIdLoteFacturacion());
        setCodActividad(p_src.getCodActividad());
        setCodCondIva(p_src.getCodCondIva());
        setPermisoExistente(p_src.getPermisoExistente());
        setIdFEXDstPais(p_src.getIdFEXDstPais());
        setIdFEXDstCuit(p_src.getIdFEXDstCuit());
        setCanMisMonExt(p_src.getCanMisMonExt());
        setObsComerciales(p_src.getObsComerciales());
        setObservaciones(p_src.getObservaciones());
        setFormaPago(p_src.getFormaPago());
        setIdFEXIdioma(p_src.getIdFEXIdioma());
        setIdFEXIncoterm(p_src.getIdFEXIncoterm());
        setIncotermsDesc(p_src.getIncotermsDesc());
        setMontoEscrito(p_src.getMontoEscrito());
    }

    public Integer getId() {
        return getIdDocumentoFE();
    }

}
