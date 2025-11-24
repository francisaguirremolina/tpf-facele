/**
ORM view row class for: ComprobantesQuery
Generated: 2025-10-21 15:27:38
null
*/
package com.epidata.facele.entities;

import java.util.Date;
import java.sql.ResultSet;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.SinglePkRecord;

public class VR_ComprobantesQuery extends AbstractRecord implements SinglePkRecord<Integer> {

    public VR_ComprobantesQuery() {
        m_IdDocumentoFE = new com.epidata.facele.entities.D_IdDocumentoFE();
        m_IdPtoVta = new com.epidata.facele.entities.D_IdPtoVta();
        m_PtoVta = new com.epidata.facele.entities.D_PtoVta();
        m_Cuit = new com.epidata.facele.entities.D_Cuit();
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
        m_codeerrs = new com.epidata.facele.entities.D_Descripcion();
        m_ReportTemplate = new com.epidata.facele.entities.D_ReportTemplate();
        m_razonsocial = new com.epidata.facele.entities.D_Descripcion();
        m_domicilio1 = new com.epidata.facele.entities.D_Descripcion();
        m_domicilio2 = new com.epidata.facele.entities.D_Descripcion();
        m_fchproceso = new com.epidata.facele.entities.D_FechaHora();
        m_pdffilename = new com.epidata.facele.entities.D_FullFileName();
        m_impopex = new com.epidata.facele.entities.D_Monto();
        m_msgerrs = new com.epidata.facele.entities.D_Observaciones();
        m_barcode = new com.epidata.facele.entities.D_BarCode42();
        m_modelocopias = new com.epidata.facele.entities.D_Descripcion();
        m_EstadoPDF = new com.epidata.facele.entities.D_EstadoPDF();
        m_IdLoteFacturacion = new com.epidata.facele.entities.D_IdLoteFacturacion();
        m_CodActividad = new com.epidata.facele.entities.D_CodActividad();
        m_CodCondIva = new com.epidata.facele.entities.D_CodCondIva();
        m_permisoexistente = new com.epidata.facele.entities.D_SiNo();
        m_destinocmp = new com.epidata.facele.entities.D_IdFEXDstPais();
        m_cuitpaiscliente = new com.epidata.facele.entities.D_IdFEXDstCuit();
        m_canmismonext = new com.epidata.facele.entities.D_SiNo();
        m_obscomerciales = new com.epidata.facele.entities.D_Observaciones();
        m_Observaciones = new com.epidata.facele.entities.D_Observaciones();
        m_formapago = new com.epidata.facele.entities.D_Descripcion();
        m_idiomacbte = new com.epidata.facele.entities.D_IdFEXIdioma();
        m_incoterms = new com.epidata.facele.entities.D_IdFEXIncoterm();
        m_incotermsdesc = new com.epidata.facele.entities.D_Descripcion();
    }

    public VR_ComprobantesQuery(ResultSet p_rs) throws Exception {
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

    /** Valor del campo: codeerrs
    */
    private com.epidata.facele.entities.D_Descripcion  m_codeerrs;

    /**
    */
    public String getCodeerrs() {
        return m_codeerrs.get();
    }
    /**
    */
    public void setCodeerrs(String p_value) {
        m_codeerrs.set(p_value);
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

    /** Valor del campo: modelocopias
    */
    private com.epidata.facele.entities.D_Descripcion  m_modelocopias;

    /**
    */
    public String getModelocopias() {
        return m_modelocopias.get();
    }
    /**
    */
    public void setModelocopias(String p_value) {
        m_modelocopias.set(p_value);
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

    /** Valor del campo: permisoexistente
    */
    private com.epidata.facele.entities.D_SiNo  m_permisoexistente;

    /**
    */
    public String getPermisoexistente() {
        return m_permisoexistente.get();
    }
    /**
    */
    public void setPermisoexistente(String p_value) {
        m_permisoexistente.set(p_value);
    }

    /** Valor del campo: destinocmp
    */
    private com.epidata.facele.entities.D_IdFEXDstPais  m_destinocmp;

    /**
    */
    public String getDestinocmp() {
        return m_destinocmp.get();
    }
    /**
    */
    public void setDestinocmp(String p_value) {
        m_destinocmp.set(p_value);
    }

    /** Valor del campo: cuitpaiscliente
    */
    private com.epidata.facele.entities.D_IdFEXDstCuit  m_cuitpaiscliente;

    /**
    */
    public Long getCuitpaiscliente() {
        return m_cuitpaiscliente.get();
    }
    /**
    */
    public void setCuitpaiscliente(Long p_value) {
        m_cuitpaiscliente.set(p_value);
    }

    /** Valor del campo: canmismonext
    */
    private com.epidata.facele.entities.D_SiNo  m_canmismonext;

    /**
    */
    public String getCanmismonext() {
        return m_canmismonext.get();
    }
    /**
    */
    public void setCanmismonext(String p_value) {
        m_canmismonext.set(p_value);
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

    /** Valor del campo: formapago
    */
    private com.epidata.facele.entities.D_Descripcion  m_formapago;

    /**
    */
    public String getFormapago() {
        return m_formapago.get();
    }
    /**
    */
    public void setFormapago(String p_value) {
        m_formapago.set(p_value);
    }

    /** Valor del campo: idiomacbte
    */
    private com.epidata.facele.entities.D_IdFEXIdioma  m_idiomacbte;

    /**
    */
    public Integer getIdiomacbte() {
        return m_idiomacbte.get();
    }
    /**
    */
    public void setIdiomacbte(Integer p_value) {
        m_idiomacbte.set(p_value);
    }

    /** Valor del campo: incoterms
    */
    private com.epidata.facele.entities.D_IdFEXIncoterm  m_incoterms;

    /**
    */
    public String getIncoterms() {
        return m_incoterms.get();
    }
    /**
    */
    public void setIncoterms(String p_value) {
        m_incoterms.set(p_value);
    }

    /** Valor del campo: incotermsdesc
    */
    private com.epidata.facele.entities.D_Descripcion  m_incotermsdesc;

    /**
    */
    public String getIncotermsdesc() {
        return m_incotermsdesc.get();
    }
    /**
    */
    public void setIncotermsdesc(String p_value) {
        m_incotermsdesc.set(p_value);
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
        Integer l_valuePtoVta = p_rs.getInt("PtoVta");
        if (!p_rs.wasNull()) {
            setPtoVta(l_valuePtoVta);
        } else {
            setPtoVta(null);
        } // end if
        Long l_valueCuit = p_rs.getLong("Cuit");
        if (!p_rs.wasNull()) {
            setCuit(l_valueCuit);
        } else {
            setCuit(null);
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
        String l_valuecodeerrs = p_rs.getString("codeerrs");
        if (!p_rs.wasNull()) {
            setCodeerrs(l_valuecodeerrs);
        } else {
            setCodeerrs(null);
        } // end if
        String l_valueReportTemplate = p_rs.getString("ReportTemplate");
        if (!p_rs.wasNull()) {
            setReportTemplate(l_valueReportTemplate);
        } else {
            setReportTemplate(null);
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
        Double l_valueimpopex = p_rs.getDouble("impopex");
        if (!p_rs.wasNull()) {
            setImpopex(l_valueimpopex);
        } else {
            setImpopex(null);
        } // end if
        String l_valuemsgerrs = p_rs.getString("msgerrs");
        if (!p_rs.wasNull()) {
            setMsgerrs(l_valuemsgerrs);
        } else {
            setMsgerrs(null);
        } // end if
        String l_valuebarcode = p_rs.getString("barcode");
        if (!p_rs.wasNull()) {
            setBarcode(l_valuebarcode);
        } else {
            setBarcode(null);
        } // end if
        String l_valuemodelocopias = p_rs.getString("modelocopias");
        if (!p_rs.wasNull()) {
            setModelocopias(l_valuemodelocopias);
        } else {
            setModelocopias(null);
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
        String l_valuepermisoexistente = p_rs.getString("permisoexistente");
        if (!p_rs.wasNull()) {
            setPermisoexistente(l_valuepermisoexistente);
        } else {
            setPermisoexistente(null);
        } // end if
        String l_valuedestinocmp = p_rs.getString("destinocmp");
        if (!p_rs.wasNull()) {
            setDestinocmp(l_valuedestinocmp);
        } else {
            setDestinocmp(null);
        } // end if
        Long l_valuecuitpaiscliente = p_rs.getLong("cuitpaiscliente");
        if (!p_rs.wasNull()) {
            setCuitpaiscliente(l_valuecuitpaiscliente);
        } else {
            setCuitpaiscliente(null);
        } // end if
        String l_valuecanmismonext = p_rs.getString("canmismonext");
        if (!p_rs.wasNull()) {
            setCanmismonext(l_valuecanmismonext);
        } else {
            setCanmismonext(null);
        } // end if
        String l_valueobscomerciales = p_rs.getString("obscomerciales");
        if (!p_rs.wasNull()) {
            setObscomerciales(l_valueobscomerciales);
        } else {
            setObscomerciales(null);
        } // end if
        String l_valueObservaciones = p_rs.getString("Observaciones");
        if (!p_rs.wasNull()) {
            setObservaciones(l_valueObservaciones);
        } else {
            setObservaciones(null);
        } // end if
        String l_valueformapago = p_rs.getString("formapago");
        if (!p_rs.wasNull()) {
            setFormapago(l_valueformapago);
        } else {
            setFormapago(null);
        } // end if
        Integer l_valueidiomacbte = p_rs.getInt("idiomacbte");
        if (!p_rs.wasNull()) {
            setIdiomacbte(l_valueidiomacbte);
        } else {
            setIdiomacbte(null);
        } // end if
        String l_valueincoterms = p_rs.getString("incoterms");
        if (!p_rs.wasNull()) {
            setIncoterms(l_valueincoterms);
        } else {
            setIncoterms(null);
        } // end if
        String l_valueincotermsdesc = p_rs.getString("incotermsdesc");
        if (!p_rs.wasNull()) {
            setIncotermsdesc(l_valueincotermsdesc);
        } else {
            setIncotermsdesc(null);
        } // end if
    }

    public void serializeFrom(VR_ComprobantesQuery p_src) throws Exception {
    if (p_src == null) {
        throw new Exception("Error al serializar ComprobantesQuery desde un registro origen = null");
    }
        setIdDocumentoFE(p_src.getIdDocumentoFE());
        setIdPtoVta(p_src.getIdPtoVta());
        setPtoVta(p_src.getPtoVta());
        setCuit(p_src.getCuit());
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
        setCodeerrs(p_src.getCodeerrs());
        setReportTemplate(p_src.getReportTemplate());
        setRazonsocial(p_src.getRazonsocial());
        setDomicilio1(p_src.getDomicilio1());
        setDomicilio2(p_src.getDomicilio2());
        setFchproceso(p_src.getFchproceso());
        setPdffilename(p_src.getPdffilename());
        setImpopex(p_src.getImpopex());
        setMsgerrs(p_src.getMsgerrs());
        setBarcode(p_src.getBarcode());
        setModelocopias(p_src.getModelocopias());
        setEstadoPDF(p_src.getEstadoPDF());
        setIdLoteFacturacion(p_src.getIdLoteFacturacion());
        setCodActividad(p_src.getCodActividad());
        setCodCondIva(p_src.getCodCondIva());
        setPermisoexistente(p_src.getPermisoexistente());
        setDestinocmp(p_src.getDestinocmp());
        setCuitpaiscliente(p_src.getCuitpaiscliente());
        setCanmismonext(p_src.getCanmismonext());
        setObscomerciales(p_src.getObscomerciales());
        setObservaciones(p_src.getObservaciones());
        setFormapago(p_src.getFormapago());
        setIdiomacbte(p_src.getIdiomacbte());
        setIncoterms(p_src.getIncoterms());
        setIncotermsdesc(p_src.getIncotermsdesc());
    }

    public Integer getId() {
        return getIdDocumentoFE();
    }

}
