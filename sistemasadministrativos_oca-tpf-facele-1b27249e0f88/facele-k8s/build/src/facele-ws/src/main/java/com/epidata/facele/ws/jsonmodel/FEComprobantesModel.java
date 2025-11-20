package com.epidata.facele.ws.jsonmodel;

import com.epidata.facele.entities.TR_FEComprobantes;
import com.epidata.facele.entities.TR_FEComprobantesAsoc;
import com.epidata.facele.entities.TR_FEComprobantesDet;
import com.epidata.facele.entities.TR_FEComprobantesIva;
import com.epidata.facele.entities.TR_FEComprobantesOpc;
import com.epidata.facele.entities.TR_FEComprobantesTrib;
import com.epidata.facele.entities.TR_FEXPermisos;
import com.epidata.facele.entities.T_FEComprobantesAsoc;
import com.epidata.facele.entities.T_FEComprobantesDet;
import com.epidata.facele.entities.T_FEComprobantesIva;
import com.epidata.facele.entities.T_FEComprobantesOpc;
import com.epidata.facele.entities.T_FEComprobantesTrib;
import com.epidata.facele.entities.T_FEXPermisos;
import java.sql.Connection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public class FEComprobantesModel {

    private String m_BarCode;
    private Date m_CAEFchVto;
    private Integer m_CbteDesde;
    private Date m_CbteFch;
    private Integer m_CbteHasta;
    private Integer m_CbteTipo;
    private String m_CodAutorizacion;
    private String m_CodeErrs;
    private Integer m_Concepto;
    private Long m_DocNro;
    private Integer m_DocTipo;
    private String m_Domicilio1;
    private String m_Domicilio2;
    private String m_EstadoPDF;
    private java.sql.Timestamp m_FchProceso;
    private Date m_FchServDesde;
    private Date m_FchServHasta;
    private Date m_FchVtoPago;
    private String m_HashLink;
    private Integer m_IdDocumentoFE;
    private Integer m_IdLoteFacturacion;
    private Integer m_IdPtoVta;
    private Double m_ImpIVA;
    private Double m_ImpNeto;
    private Double m_ImpOpEx;
    private Double m_ImpTotConc;
    private Double m_ImpTotal;
    private Double m_ImpTrib;
    private String m_LineaCab1;
    private String m_LineaCab10;
    private String m_LineaCab11;
    private String m_LineaCab12;
    private String m_LineaCab13;
    private String m_LineaCab14;
    private String m_LineaCab15;
    private String m_LineaCab16;
    private String m_LineaCab17;
    private String m_LineaCab18;
    private String m_LineaCab19;
    private String m_LineaCab2;
    private String m_LineaCab20;
    private String m_LineaCab3;
    private String m_LineaCab4;
    private String m_LineaCab5;
    private String m_LineaCab6;
    private String m_LineaCab7;
    private String m_LineaCab8;
    private String m_LineaCab9;
    private String m_ModeloCopias;
    private Double m_MonCotiz;
    private String m_MonId;
    private String m_MsgErrs;
    private String m_PDFFileName;
    private String m_RazonSocial;
    private String m_ReportTemplate;
    private String m_Resultado;
    private String m_canMisMonExt;
    private Long m_codActividad;
    private Integer m_codCondIva;
    private List<FEComprobantesAsocModel> m_comprobantesAsoc;
    private List<FEComprobantesDetModel> m_comprobantesDet;
    private List<FEComprobantesIvaModel> m_comprobantesIva;
    private List<FEComprobantesOpcModel> m_comprobantesOpc;
    private List<FEComprobantesPermisosModel> m_comprobantesPermisos;
    private List<FEComprobantesTribModel> m_comprobantesTrib;
    private Long m_cuitPaisCliente;
    private Integer m_destinoCmp;
    private String m_formaPago;
    private String m_idiomaCbte;
    private String m_incoterms;
    private String m_incotermsDesc;
    private String m_obsComerciales;
    private String m_observaciones;
    private String m_permisoExistente;

    public FEComprobantesModel() {
        m_comprobantesAsoc = new LinkedList<>();
        m_comprobantesDet = new LinkedList<>();
        m_comprobantesIva = new LinkedList<>();
        m_comprobantesOpc = new LinkedList<>();
        m_comprobantesTrib = new LinkedList<>();
        m_comprobantesPermisos = new LinkedList<>();
    }

    public FEComprobantesModel(TR_FEComprobantes p_rec, Connection p_conn)
            throws Exception {
        this();
        setBarCode(p_rec.getBarCode());
        setCaeFchVto(p_rec.getCAEFchVto());
        setCbteDesde(p_rec.getCbteDesde());
        setCbteFch(p_rec.getCbteFch());
        setCbteHasta(p_rec.getCbteHasta());
        setCbteTipo(p_rec.getCbteTipo());
        setCodAutorizacion(p_rec.getCodAutorizacion());
        setCodeErrs(p_rec.getCodeErrs());
        setConcepto(p_rec.getConcepto());
        setDocNro(p_rec.getDocNro());
        setDocTipo(p_rec.getDocTipo());
        setDomicilio1(p_rec.getDomicilio1());
        setDomicilio2(p_rec.getDomicilio2());
        setEstadoPDF(p_rec.getEstadoPDF());
        setFchProceso(p_rec.getFchProceso());

        setFchServDesde(p_rec.getFchServDesde());
        setFchServHasta(p_rec.getFchServHasta());
        setFchVtoPago(p_rec.getFchVtoPago());
        setHashLink(p_rec.getHashLink());
        setIdDocumentoFE(p_rec.getIdDocumentoFE());
        setIdLoteFacturacion(p_rec.getIdLoteFacturacion());
        setIdPtoVta(p_rec.getIdPtoVta());
        setImpIVA(p_rec.getImpIVA());
        setImpNeto(p_rec.getImpNeto());
        setImpOpEx(p_rec.getImpOpEx());
        setImpTotConc(p_rec.getImpTotConc());
        setImpTotal(p_rec.getImpTotal());
        setImpTrib(p_rec.getImpTrib());
        setLineaCab1(p_rec.getLineaCab1());
        setLineaCab2(p_rec.getLineaCab2());
        setLineaCab3(p_rec.getLineaCab3());
        setLineaCab4(p_rec.getLineaCab4());
        setLineaCab5(p_rec.getLineaCab5());
        setLineaCab6(p_rec.getLineaCab6());
        setLineaCab7(p_rec.getLineaCab7());
        setLineaCab8(p_rec.getLineaCab8());
        setLineaCab9(p_rec.getLineaCab9());
        setLineaCab10(p_rec.getLineaCab10());
        setLineaCab11(p_rec.getLineaCab11());
        setLineaCab12(p_rec.getLineaCab12());
        setLineaCab13(p_rec.getLineaCab13());
        setLineaCab14(p_rec.getLineaCab14());
        setLineaCab15(p_rec.getLineaCab15());
        setLineaCab16(p_rec.getLineaCab16());
        setLineaCab17(p_rec.getLineaCab17());
        setLineaCab18(p_rec.getLineaCab18());
        setLineaCab19(p_rec.getLineaCab19());
        setLineaCab20(p_rec.getLineaCab20());
        setModeloCopias(p_rec.getModeloCopias());
        setMonCotiz(p_rec.getMonCotiz());
        setMonId(p_rec.getMonId());
        setMsgErrs(p_rec.getMsgErrs());
        setPdfFileName(p_rec.getPDFFileName());
        setRazonSocial(p_rec.getRazonSocial());
        setReportTemplate(p_rec.getReportTemplate());
        setResultado(p_rec.getResultado());

        // @since 2025-07-31
        setCodActividad(p_rec.getCodActividad());
        setCodCondIva(p_rec.getCodCondIva());
        setPermisoExistente(p_rec.getPermisoExistente());
        if (p_rec.getIdFEXDstPais() != null) {
            setDestinoCmp(Integer.parseInt(p_rec.getIdFEXDstPais()));
        } // end if
        setMcuitPaisCliente(p_rec.getIdFEXDstCuit());
        setCanMisMonExt(p_rec.getCanMisMonExt());
        setObsComerciales(p_rec.getObsComerciales());
        setObservaciones(p_rec.getObservaciones());
        setFormaPago(p_rec.getFormaPago());
        setIncoterms(p_rec.getIdFEXIncoterm());
        setIncotermsDesc(p_rec.getIncotermsDesc());
        setIdiomaCbte(String.valueOf(p_rec.getIdFEXIdioma()));

        // Arma colección ComprobantesAsoc --------------
        {
            T_FEComprobantesAsoc l_table = new T_FEComprobantesAsoc(p_conn,
                    "IdDocumentoFE=" + p_rec.getIdDocumentoFE(), null);
            for (TR_FEComprobantesAsoc l_rec : l_table.getRows()) {
                FEComprobantesAsocModel l_toAdd = new FEComprobantesAsocModel(l_rec);
                getComprobantesAsoc().add(l_toAdd);
            } // end for
        }
        // Arma colección ComprobantesDet --------------

        {
            T_FEComprobantesDet l_table = new T_FEComprobantesDet(p_conn,
                    "IdDocumentoFE=" + p_rec.getIdDocumentoFE(), null);
            for (TR_FEComprobantesDet l_rec : l_table.getRows()) {
                FEComprobantesDetModel l_toAdd = new FEComprobantesDetModel(l_rec);
                getComprobantesDet().add(l_toAdd);
            } // end for
        }
        // Arma colección ComprobantesIva --------------

        {
            T_FEComprobantesIva l_table = new T_FEComprobantesIva(p_conn,
                    "IdDocumentoFE=" + p_rec.getIdDocumentoFE(), null);
            for (TR_FEComprobantesIva l_rec : l_table.getRows()) {
                FEComprobantesIvaModel l_toAdd = new FEComprobantesIvaModel(l_rec);
                getComprobantesIva().add(l_toAdd);
            } // end for
        }
        // Arma colección ComprobantesOpc --------------

        {
            T_FEComprobantesOpc l_table = new T_FEComprobantesOpc(p_conn,
                    "IdDocumentoFE=" + p_rec.getIdDocumentoFE(), null);
            for (TR_FEComprobantesOpc l_rec : l_table.getRows()) {
                FEComprobantesOpcModel l_toAdd = new FEComprobantesOpcModel(l_rec);
                getComprobantesOpc().add(l_toAdd);
            } // end for
        }
        // Arma colección ComprobantesTrib --------------
        {
            T_FEComprobantesTrib l_table = new T_FEComprobantesTrib(p_conn,
                    "IdDocumentoFE=" + p_rec.getIdDocumentoFE(), null);
            for (TR_FEComprobantesTrib l_rec : l_table.getRows()) {
                FEComprobantesTribModel l_toAdd = new FEComprobantesTribModel(l_rec);
                getComprobantesTrib().add(l_toAdd);
            } // end for
        }

        // Arma colección ComprobantesPermisos --------------
        {
            T_FEXPermisos l_table = new T_FEXPermisos(p_conn,
                    "IdDocumentoFE=" + p_rec.getIdDocumentoFE(), null);
            for (TR_FEXPermisos l_rec : l_table.getRows()) {
                FEComprobantesPermisosModel l_toAdd
                        = new FEComprobantesPermisosModel(l_rec);
                getComprobantesPermisos().add(l_toAdd);
            } // end for
        }

    }

    public TR_FEComprobantes asTR_FEComprobantes() {
        TR_FEComprobantes l_toReturn = new TR_FEComprobantes();

        // Proceso VALID1: validación y completamiento
        
        l_toReturn.setIdDocumentoFE(getIdDocumentoFE());
        l_toReturn.setIdPtoVta(getIdPtoVta());
        l_toReturn.setCbteTipo(getCbteTipo());
        l_toReturn.setCbteDesde(getCbteDesde());
        l_toReturn.setCbteHasta(getCbteHasta());
        l_toReturn.setConcepto(getConcepto());
        l_toReturn.setDocTipo(getDocTipo());
        l_toReturn.setDocNro(getDocNro());
        l_toReturn.setCbteFch(getCbteFch());
        l_toReturn.setImpTotal(getImpTotal());
        l_toReturn.setImpTotConc(getImpTotConc());
        l_toReturn.setImpNeto(getImpNeto());
        l_toReturn.setImpOpEx(getImpOpEx());
        l_toReturn.setImpTrib(getImpTrib());
        l_toReturn.setImpIVA(getImpIVA());
        l_toReturn.setFchServDesde(getFchServDesde());
        l_toReturn.setFchServHasta(getFchServHasta());
        l_toReturn.setFchVtoPago(getFchVtoPago());
        l_toReturn.setMonId(getMonId());
        l_toReturn.setMonCotiz(getMonCotiz());
        l_toReturn.setResultado(getResultado());
        l_toReturn.setCodAutorizacion(getCodAutorizacion());
        l_toReturn.setCAEFchVto(getCaeFchVto());
        l_toReturn.setHashLink(getHashLink());
        l_toReturn.setCodeErrs(getCodeErrs());
        l_toReturn.setMsgErrs(getMsgErrs());
        l_toReturn.setReportTemplate(getReportTemplate());
        l_toReturn.setBarCode(getBarCode());
        l_toReturn.setRazonSocial(getRazonSocial());
        l_toReturn.setDomicilio1(getDomicilio1());
        l_toReturn.setDomicilio2(getDomicilio2());
        l_toReturn.setLineaCab1(getLineaCab1());
        l_toReturn.setLineaCab2(getLineaCab2());
        l_toReturn.setLineaCab3(getLineaCab3());
        l_toReturn.setLineaCab4(getLineaCab4());
        l_toReturn.setLineaCab5(getLineaCab5());
        l_toReturn.setLineaCab6(getLineaCab6());
        l_toReturn.setLineaCab7(getLineaCab7());
        l_toReturn.setLineaCab8(getLineaCab8());
        l_toReturn.setLineaCab9(getLineaCab9());
        l_toReturn.setLineaCab10(getLineaCab10());
        l_toReturn.setLineaCab11(getLineaCab11());
        l_toReturn.setLineaCab12(getLineaCab12());
        l_toReturn.setLineaCab13(getLineaCab13());
        l_toReturn.setLineaCab14(getLineaCab14());
        l_toReturn.setLineaCab15(getLineaCab15());
        l_toReturn.setLineaCab16(getLineaCab16());
        l_toReturn.setLineaCab17(getLineaCab17());
        l_toReturn.setLineaCab18(getLineaCab18());
        l_toReturn.setLineaCab19(getLineaCab19());
        l_toReturn.setLineaCab20(getLineaCab20());
        l_toReturn.setFchProceso(getFchProceso());
        l_toReturn.setPDFFileName(getPdfFileName());
        l_toReturn.setModeloCopias(getModeloCopias());
        l_toReturn.setEstadoPDF(getEstadoPDF());
        l_toReturn.setIdLoteFacturacion(getIdLoteFacturacion());

        // @since 2025-07-31
        l_toReturn.setCodActividad(getCodActividad());
        l_toReturn.setCodCondIva(getCodCondIva());
        l_toReturn.setPermisoExistente(getPermisoExistente());
        if (getDestinoCmp() != null) {
            l_toReturn.setIdFEXDstCuit(getDestinoCmp().longValue());
        }
        if (getMcuitPaisCliente() != null) {
            l_toReturn.setIdFEXDstPais(getMcuitPaisCliente().toString());
        }
        l_toReturn.setCanMisMonExt(getCanMisMonExt());
        l_toReturn.setObsComerciales(getObsComerciales());
        l_toReturn.setObservaciones(getObservaciones());
        l_toReturn.setFormaPago(getFormaPago());
        l_toReturn.setIdFEXIncoterm(getIncoterms());
        l_toReturn.setIncotermsDesc(getIncotermsDesc());
        if (getIdiomaCbte() != null) {
            l_toReturn.setIdFEXIdioma(Integer.parseInt(getIdiomaCbte()));
        } // end if

        return l_toReturn;
    }

    public List<TR_FEComprobantesAsoc> asTR_FEComprobantesAsoc() {
        List<TR_FEComprobantesAsoc> l_toReturn = new LinkedList<>();

        // Proceso VALID1: validación y completamiento
        
        if (m_comprobantesAsoc == null) {
            return l_toReturn;
        } // end if
        
        for (FEComprobantesAsocModel l_srcModel : m_comprobantesAsoc) {
            TR_FEComprobantesAsoc l_toAdd = new TR_FEComprobantesAsoc();
            l_toAdd.setIdDocumentoFE(getIdDocumentoFE());
            l_toAdd.setPtoVta(l_srcModel.getPtoVta());
            l_toAdd.setCbteTipo(l_srcModel.getCbteTipo());
            l_toAdd.setCbteNumero(l_srcModel.getCbteNumero());

            l_toReturn.add(l_toAdd);
        } //end for
        return l_toReturn;
    }

    public List<TR_FEComprobantesDet> asTR_FEComprobantesDet() {
        List<TR_FEComprobantesDet> l_toReturn = new LinkedList<>();
        
        // Proceso VALID1: validación y completamiento
        
        if (m_comprobantesDet == null) {
            return l_toReturn;
        } // end if

        for (FEComprobantesDetModel l_srcModel : m_comprobantesDet) {
            TR_FEComprobantesDet l_toAdd = new TR_FEComprobantesDet();

            l_toAdd.setIdDocumentoFE(getIdDocumentoFE());
            l_toAdd.setCantidad(l_srcModel.getCantidad());
            l_toAdd.setDescripcion(l_srcModel.getDescripcion());
            l_toAdd.setPrecioUnitario(l_srcModel.getPrecioUnitario());
            l_toAdd.setValor1(l_srcModel.getValor1());
            l_toAdd.setValor2(l_srcModel.getValor2());
            l_toAdd.setSubtotal(l_srcModel.getSubtotal());
            l_toAdd.setLineaDet1(l_srcModel.getLineaDet1());
            l_toAdd.setLineaDet2(l_srcModel.getLineaDet2());
            l_toAdd.setCodigoProducto(l_srcModel.getCodigoProducto());
            l_toAdd.setBonificacion(l_srcModel.getBonificacion());

            l_toReturn.add(l_toAdd);
        } //end for
        return l_toReturn;
    }

    public List<TR_FEComprobantesIva> asTR_FEComprobantesIva() {
        List<TR_FEComprobantesIva> l_toReturn = new LinkedList<>();
        
        // Proceso VALID1: validación y completamiento
        
        if (m_comprobantesIva == null) {
            return l_toReturn;
        } // end if
        
        for (FEComprobantesIvaModel l_srcModel : m_comprobantesIva) {
            TR_FEComprobantesIva l_toAdd = new TR_FEComprobantesIva();

            l_toAdd.setIdDocumentoFE(getIdDocumentoFE());
            l_toAdd.setCodAlicIVA(l_srcModel.getCodAlicIVA());
            l_toAdd.setBaseImp(l_srcModel.getBaseImp());
            l_toAdd.setImporte(l_srcModel.getImporte());

            l_toReturn.add(l_toAdd);
        } //end for
        return l_toReturn;
    }

    public List<TR_FEComprobantesOpc> asTR_FEComprobantesOpc() {
        List<TR_FEComprobantesOpc> l_toReturn = new LinkedList<>();
        
        // Proceso VALID1: validación y completamiento
        
        if (m_comprobantesOpc == null) {
            return l_toReturn;
        } // end if
        
        for (FEComprobantesOpcModel l_srcModel : m_comprobantesOpc) {
            TR_FEComprobantesOpc l_toAdd = new TR_FEComprobantesOpc();
            l_toAdd.setIdDocumentoFE(getIdDocumentoFE());
            l_toAdd.setCodOpcional(l_srcModel.getCodOpcional());
            l_toAdd.setValor(l_srcModel.getValor());

            l_toReturn.add(l_toAdd);
        } //end for
        return l_toReturn;
    }

    public List<TR_FEComprobantesTrib> asTR_FEComprobantesTrib() {
        List<TR_FEComprobantesTrib> l_toReturn = new LinkedList<>();
        
        // Proceso VALID1: validación y completamiento
        
        if (m_comprobantesTrib == null) {
            return l_toReturn;
        } // end if
        
        for (FEComprobantesTribModel l_srcModel : m_comprobantesTrib) {
            TR_FEComprobantesTrib l_toAdd = new TR_FEComprobantesTrib();

            l_toAdd.setIdDocumentoFE(getIdDocumentoFE());
            l_toAdd.setCodTributo(l_srcModel.getCodTributo());
            l_toAdd.setDescripcion(l_srcModel.getDescripcion());
            l_toAdd.setBaseImp(l_srcModel.getBaseImp());
            l_toAdd.setAlic(l_srcModel.getAlic());
            l_toAdd.setImporte(l_srcModel.getImporte());

            l_toReturn.add(l_toAdd);
        } //end for
        return l_toReturn;
    }

    public List<TR_FEXPermisos> asTR_FEXPermisos() {
        List<TR_FEXPermisos> l_toReturn = new LinkedList<>();
        
        // Proceso VALID1: validación y completamiento
        
        if (m_comprobantesPermisos == null) {
            return l_toReturn;
        } // end if
        
        for (FEComprobantesPermisosModel l_srcModel : m_comprobantesPermisos) {
            TR_FEXPermisos l_toAdd = new TR_FEXPermisos();

            l_toAdd.setIdDocumentoFE(getIdDocumentoFE());
            l_toAdd.setCodDespacho(l_srcModel.getCodDespacho());
            // TO-DO l_toAdd.setIdFEXDstPais(l_srcModel.);

            l_toReturn.add(l_toAdd);
        } //end for
        return l_toReturn;
    }

    public String getBarCode() {
        return m_BarCode;
    }

    public Date getCaeFchVto() {
        return m_CAEFchVto;
    }

    public String getCanMisMonExt() {
        return m_canMisMonExt;
    }

    public Integer getCbteDesde() {
        return m_CbteDesde;
    }

    public Date getCbteFch() {
        return m_CbteFch;
    }

    public Integer getCbteHasta() {
        return m_CbteHasta;
    }

    public Integer getCbteTipo() {
        return m_CbteTipo;
    }

    public Long getCodActividad() {
        return m_codActividad;
    }

    public String getCodAutorizacion() {
        return m_CodAutorizacion;
    }

    public Integer getCodCondIva() {
        return m_codCondIva;
    }

    public String getCodeErrs() {
        return m_CodeErrs;
    }

    public List<FEComprobantesAsocModel> getComprobantesAsoc() {
        return m_comprobantesAsoc;
    }

    public List<FEComprobantesDetModel> getComprobantesDet() {
        return m_comprobantesDet;
    }

    public List<FEComprobantesIvaModel> getComprobantesIva() {
        return m_comprobantesIva;
    }

    public List<FEComprobantesOpcModel> getComprobantesOpc() {
        return m_comprobantesOpc;
    }

    public List<FEComprobantesPermisosModel> getComprobantesPermisos() {
        return m_comprobantesPermisos;
    }

    public List<FEComprobantesTribModel> getComprobantesTrib() {
        return m_comprobantesTrib;
    }

    public Integer getConcepto() {
        return m_Concepto;
    }


    public Integer getDestinoCmp() {
        return m_destinoCmp;
    }

    public Long getDocNro() {
        return m_DocNro;
    }

    public Integer getDocTipo() {
        return m_DocTipo;
    }

    public String getDomicilio1() {
        return m_Domicilio1;
    }

    public String getDomicilio2() {
        return m_Domicilio2;
    }

    public String getEstadoPDF() {
        return m_EstadoPDF;
    }

    public java.sql.Timestamp getFchProceso() {
        return m_FchProceso;
    }

    public Date getFchServDesde() {
        return m_FchServDesde;
    }

    public Date getFchServHasta() {
        return m_FchServHasta;
    }

    public Date getFchVtoPago() {
        return m_FchVtoPago;
    }

    public String getFormaPago() {
        return m_formaPago;
    }

    public String getHashLink() {
        return m_HashLink;
    }

    public Integer getIdDocumentoFE() {
        return m_IdDocumentoFE;
    }

    public Integer getIdLoteFacturacion() {
        return m_IdLoteFacturacion;
    }

    public Integer getIdPtoVta() {
        return m_IdPtoVta;
    }

    // @since 2025-07-31
    public String getIdiomaCbte() {
        return m_idiomaCbte;
    }

    public Double getImpIVA() {
        return m_ImpIVA;
    }

    public Double getImpNeto() {
        return m_ImpNeto;
    }

    public Double getImpOpEx() {
        return m_ImpOpEx;
    }

    public Double getImpTotConc() {
        return m_ImpTotConc;
    }

    public Double getImpTotal() {
        return m_ImpTotal;
    }

    public Double getImpTrib() {
        return m_ImpTrib;
    }

    public String getIncoterms() {
        return m_incoterms;
    }

    public String getIncotermsDesc() {
        return m_incotermsDesc;
    }

    public String getLineaCab1() {
        return m_LineaCab1;
    }

    public String getLineaCab10() {
        return m_LineaCab10;
    }

    public String getLineaCab11() {
        return m_LineaCab11;
    }

    public String getLineaCab12() {
        return m_LineaCab12;
    }

    public String getLineaCab13() {
        return m_LineaCab13;
    }

    public String getLineaCab14() {
        return m_LineaCab14;
    }

    public String getLineaCab15() {
        return m_LineaCab15;
    }

    public String getLineaCab16() {
        return m_LineaCab16;
    }

    public String getLineaCab17() {
        return m_LineaCab17;
    }

    public String getLineaCab18() {
        return m_LineaCab18;
    }

    public String getLineaCab19() {
        return m_LineaCab19;
    }

    public String getLineaCab2() {
        return m_LineaCab2;
    }

    public String getLineaCab20() {
        return m_LineaCab20;
    }

    public String getLineaCab3() {
        return m_LineaCab3;
    }

    public String getLineaCab4() {
        return m_LineaCab4;
    }

    public String getLineaCab5() {
        return m_LineaCab5;
    }

    public String getLineaCab6() {
        return m_LineaCab6;
    }

    public String getLineaCab7() {
        return m_LineaCab7;
    }

    public String getLineaCab8() {
        return m_LineaCab8;
    }

    public String getLineaCab9() {
        return m_LineaCab9;
    }
    public Long getMcuitPaisCliente() {
        return m_cuitPaisCliente;
    }

    public String getModeloCopias() {
        return m_ModeloCopias;
    }

    public Double getMonCotiz() {
        return m_MonCotiz;
    }

    public String getMonId() {
        return m_MonId;
    }

    public String getMsgErrs() {
        return m_MsgErrs;
    }

    public String getObsComerciales() {
        return m_obsComerciales;
    }

    public String getObservaciones() {
        return m_observaciones;
    }

    public String getPdfFileName() {
        return m_PDFFileName;
    }

    public String getPermisoExistente() {
        return m_permisoExistente;
    }

    public String getRazonSocial() {
        return m_RazonSocial;
    }

    public String getReportTemplate() {
        return m_ReportTemplate;
    }

    public String getResultado() {
        return m_Resultado;
    }

    public void setBarCode(String p_BarCode) {
        this.m_BarCode = p_BarCode;
    }

    public void setCaeFchVto(Date p_CAEFchVto) {
        this.m_CAEFchVto = p_CAEFchVto;
    }

    public void setCanMisMonExt(String p_canMisMonExt) {
        this.m_canMisMonExt = p_canMisMonExt;
    }

    public void setCbteDesde(Integer p_CbteDesde) {
        this.m_CbteDesde = p_CbteDesde;
    }

    public void setCbteFch(Date p_CbteFch) {
        this.m_CbteFch = p_CbteFch;
    }

    public void setCbteHasta(Integer p_CbteHasta) {
        this.m_CbteHasta = p_CbteHasta;
    }

    public void setCbteTipo(Integer p_CbteTipo) {
        this.m_CbteTipo = p_CbteTipo;
    }

    public void setCodActividad(Long p_codActividad) {
        this.m_codActividad = p_codActividad;
    }

    public void setCodAutorizacion(String p_CodAutorizacion) {
        this.m_CodAutorizacion = p_CodAutorizacion;
    }

    public void setCodCondIva(Integer p_codCondIva) {
        this.m_codCondIva = p_codCondIva;
    }

    public void setCodeErrs(String p_CodeErrs) {
        this.m_CodeErrs = p_CodeErrs;
    }

    public void setComprobantesAsoc(List<FEComprobantesAsocModel> p_comprobantesAsoc) {
        this.m_comprobantesAsoc = p_comprobantesAsoc;
    }

    public void setComprobantesDet(List<FEComprobantesDetModel> p_comprobantesDet) {
        this.m_comprobantesDet = p_comprobantesDet;
    }

    public void setComprobantesIva(List<FEComprobantesIvaModel> p_comprobantesIva) {
        this.m_comprobantesIva = p_comprobantesIva;
    }

    public void setComprobantesOpc(List<FEComprobantesOpcModel> p_comprobantesOpc) {
        this.m_comprobantesOpc = p_comprobantesOpc;
    }

    public void setComprobantesPermisos(List<FEComprobantesPermisosModel> p_comprobantesPermisos) {
        this.m_comprobantesPermisos = p_comprobantesPermisos;
    }

    public void setComprobantesTrib(List<FEComprobantesTribModel> p_comprobantesTrib) {
        this.m_comprobantesTrib = p_comprobantesTrib;
    }

    public void setConcepto(Integer p_Concepto) {
        this.m_Concepto = p_Concepto;
    }


    public void setDestinoCmp(Integer p_destinoCmp) {
        this.m_destinoCmp = p_destinoCmp;
    }

    public void setDocNro(Long p_DocNro) {
        this.m_DocNro = p_DocNro;
    }

    public void setDocTipo(Integer p_DocTipo) {
        this.m_DocTipo = p_DocTipo;
    }

    public void setDomicilio1(String p_Domicilio1) {
        this.m_Domicilio1 = p_Domicilio1;
    }

    public void setDomicilio2(String p_Domicilio2) {
        this.m_Domicilio2 = p_Domicilio2;
    }

    public void setEstadoPDF(String p_EstadoPDF) {
        this.m_EstadoPDF = p_EstadoPDF;
    }

    public void setFchProceso(java.sql.Timestamp p_FchProceso) {
        this.m_FchProceso = p_FchProceso;
    }

    public void setFchServDesde(Date p_FchServDesde) {
        this.m_FchServDesde = p_FchServDesde;
    }

    public void setFchServHasta(Date p_FchServHasta) {
        this.m_FchServHasta = p_FchServHasta;
    }

    public void setFchVtoPago(Date p_FchVtoPago) {
        this.m_FchVtoPago = p_FchVtoPago;
    }

    public void setFormaPago(String p_formaPago) {
        this.m_formaPago = p_formaPago;
    }

    public void setHashLink(String p_HashLink) {
        this.m_HashLink = p_HashLink;
    }

    public void setIdDocumentoFE(Integer p_IdDocumentoFE) {
        this.m_IdDocumentoFE = p_IdDocumentoFE;
    }

    public void setIdLoteFacturacion(Integer p_IdLoteFacturacion) {
        this.m_IdLoteFacturacion = p_IdLoteFacturacion;
    }

    public void setIdPtoVta(Integer p_IdPtoVta) {
        this.m_IdPtoVta = p_IdPtoVta;
    }

    public void setIdiomaCbte(String p_idiomaCbte) {
        this.m_idiomaCbte = p_idiomaCbte;
    }

    public void setImpIVA(Double p_ImpIVA) {
        this.m_ImpIVA = p_ImpIVA;
    }

    public void setImpNeto(Double p_ImpNeto) {
        this.m_ImpNeto = p_ImpNeto;
    }

    public void setImpOpEx(Double p_ImpOpEx) {
        this.m_ImpOpEx = p_ImpOpEx;
    }

    public void setImpTotConc(Double p_ImpTotConc) {
        this.m_ImpTotConc = p_ImpTotConc;
    }

    public void setImpTotal(Double p_ImpTotal) {
        this.m_ImpTotal = p_ImpTotal;
    }

    public void setImpTrib(Double p_ImpTrib) {
        this.m_ImpTrib = p_ImpTrib;
    }

    public void setIncoterms(String p_incoterms) {
        this.m_incoterms = p_incoterms;
    }

    public void setIncotermsDesc(String p_incotermsDesc) {
        this.m_incotermsDesc = p_incotermsDesc;
    }

    public void setLineaCab1(String p_LineaCab1) {
        this.m_LineaCab1 = p_LineaCab1;
    }

    public void setLineaCab10(String p_LineaCab10) {
        this.m_LineaCab10 = p_LineaCab10;
    }

    public void setLineaCab11(String p_LineaCab11) {
        this.m_LineaCab11 = p_LineaCab11;
    }

    public void setLineaCab12(String p_LineaCab12) {
        this.m_LineaCab12 = p_LineaCab12;
    }

    public void setLineaCab13(String p_LineaCab13) {
        this.m_LineaCab13 = p_LineaCab13;
    }

    public void setLineaCab14(String p_LineaCab14) {
        this.m_LineaCab14 = p_LineaCab14;
    }

    public void setLineaCab15(String p_LineaCab15) {
        this.m_LineaCab15 = p_LineaCab15;
    }

    public void setLineaCab16(String p_LineaCab16) {
        this.m_LineaCab16 = p_LineaCab16;
    }

    public void setLineaCab17(String p_LineaCab17) {
        this.m_LineaCab17 = p_LineaCab17;
    }

    public void setLineaCab18(String p_LineaCab18) {
        this.m_LineaCab18 = p_LineaCab18;
    }

    public void setLineaCab19(String p_LineaCab19) {
        this.m_LineaCab19 = p_LineaCab19;
    }

    public void setLineaCab2(String p_LineaCab2) {
        this.m_LineaCab2 = p_LineaCab2;
    }

    public void setLineaCab20(String p_LineaCab20) {
        this.m_LineaCab20 = p_LineaCab20;
    }

    public void setLineaCab3(String p_LineaCab3) {
        this.m_LineaCab3 = p_LineaCab3;
    }

    public void setLineaCab4(String p_LineaCab4) {
        this.m_LineaCab4 = p_LineaCab4;
    }

    public void setLineaCab5(String p_LineaCab5) {
        this.m_LineaCab5 = p_LineaCab5;
    }

    public void setLineaCab6(String p_LineaCab6) {
        this.m_LineaCab6 = p_LineaCab6;
    }

    public void setLineaCab7(String p_LineaCab7) {
        this.m_LineaCab7 = p_LineaCab7;
    }

    public void setLineaCab8(String p_LineaCab8) {
        this.m_LineaCab8 = p_LineaCab8;
    }

    public void setLineaCab9(String p_LineaCab9) {
        this.m_LineaCab9 = p_LineaCab9;
    }
    public void setMcuitPaisCliente(Long p_mcuitPaisCliente) {
        this.m_cuitPaisCliente = p_mcuitPaisCliente;
    }

    public void setModeloCopias(String p_ModeloCopias) {
        this.m_ModeloCopias = p_ModeloCopias;
    }

    public void setMonCotiz(Double p_MonCotiz) {
        this.m_MonCotiz = p_MonCotiz;
    }

    public void setMonId(String p_MonId) {
        this.m_MonId = p_MonId;
    }

    public void setMsgErrs(String p_MsgErrs) {
        this.m_MsgErrs = p_MsgErrs;
    }

    public void setObsComerciales(String p_obsComerciales) {
        this.m_obsComerciales = p_obsComerciales;
    }

    public void setObservaciones(String p_observaciones) {
        this.m_observaciones = p_observaciones;
    }

    public void setPdfFileName(String p_PDFFileName) {
        this.m_PDFFileName = p_PDFFileName;
    }

    public void setPermisoExistente(String p_permisoExistente) {
        this.m_permisoExistente = p_permisoExistente;
    }

    public void setRazonSocial(String p_RazonSocial) {
        this.m_RazonSocial = p_RazonSocial;
    }

    public void setReportTemplate(String p_ReportTemplate) {
        this.m_ReportTemplate = p_ReportTemplate;
    }

    public void setResultado(String p_Resultado) {
        this.m_Resultado = p_Resultado;
    }

}
