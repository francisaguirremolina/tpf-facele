package com.epidata.facele.ws;

import com.epidata.facele.conf.GlobalConf;
import com.epidata.facele.logger.FaceleLogger;
import jakarta.inject.Named;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.faces.context.FacesContext;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
@Named(value = "app")
@ApplicationScoped
public class AppBean {

    public static String urlEncodeUTF8(String p_str) {
        try {
            return URLEncoder.encode(p_str, "UTF-8");
        } catch (UnsupportedEncodingException l_ex) {
            throw new UnsupportedOperationException(l_ex);
        }
    }

    public static String urlEncodeUTF8(Map<String, Object> p_inputMap) {
        StringBuilder l_buffer = new StringBuilder();
        for (Map.Entry<String, Object> l_entry : p_inputMap.entrySet()) {
            if (l_entry.getValue() == null) {
                continue;
            } // end if
            if (l_buffer.length() > 0) {
                l_buffer.append("&");
            } // end if
            l_buffer.append(String.format("%s=%s",
                    urlEncodeUTF8(l_entry.getKey().toString()),
                    urlEncodeUTF8(l_entry.getValue().toString())));
        }
        return l_buffer.toString();
    }
    private String m_cae;

    private Integer m_cbteNro;

    private Integer m_cbteNroDesde;

    private Integer m_cbteNroHasta;

    private Integer m_cbteTipo;

    private String m_codMoneda;
    private String m_codOpcional;
    private GlobalConf m_conf;
    private Long m_cuit;
    private Long m_docNro;
    private Integer m_docTipo;

    private Date m_fecha;

    private Date m_fechaDesde;

    private Date m_fechaHasta;
    private Integer m_id;

    private Integer m_idDesde;
    private String m_idFEXDstPais;
    private Integer m_idFEXIdioma;
    private String m_idFEXIncoterm;
    private Integer m_idFEXTipoExpo;
    private Integer m_idFEXUnidadMedida;

    private Integer m_idHasta;

    private Integer m_idLote;
    private Double m_importe;

    private String m_modoEmision = "CAE";
    private Integer m_ptoVta;
    private String m_resultado;

    private String m_wsName;

    private EnumProvider m_enums;

    /**
     * Get the value of enums
     *
     * @return the value of enums
     */
    public EnumProvider getEnums() {
        if (m_enums == null) {
            m_enums = new EnumProvider();
        } // end if
        return m_enums;
    }

    /**
     * Set the value of enums
     *
     * @param p_enums new value of enums
     */
    public void setEnums(EnumProvider p_enums) {
        this.m_enums = p_enums;
    }

    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public AppBean() {
    }

    /**
     * Get the value of cae
     *
     * @return the value of cae
     */
    public String getCae() {
        return m_cae;
    }

    /**
     * Get the value of cbteNro
     *
     * @return the value of cbteNro
     */
    public Integer getCbteNro() {
        return m_cbteNro;
    }

    /**
     * Get the value of cbteNroDesde
     *
     * @return the value of cbteNroDesde
     */
    public Integer getCbteNroDesde() {
        return m_cbteNroDesde;
    }

    /**
     * Get the value of cbteNroHasta
     *
     * @return the value of cbteNroHasta
     */
    public Integer getCbteNroHasta() {
        return m_cbteNroHasta;
    }

    /**
     * Get the value of cbteTipo
     *
     * @return the value of cbteTipo
     */
    public Integer getCbteTipo() {
        return m_cbteTipo;
    }

    /**
     * Get the value of codMoneda
     *
     * @return the value of codMoneda
     */
    public String getCodMoneda() {
        return m_codMoneda;
    }

    /**
     * Get the value of codOpcional
     *
     * @return the value of codOpcional
     */
    public String getCodOpcional() {
        return m_codOpcional;
    }

    public GlobalConf getConf() throws Exception {
        m_conf = GlobalConf.getInstance();
        return m_conf;
    }

    /**
     * Get the value of cuit
     *
     * @return the value of cuit
     */
    public Long getCuit() {
        return m_cuit;
    }

    /**
     * Get the value of docNro
     *
     * @return the value of docNro
     */
    public Long getDocNro() {
        return m_docNro;
    }

    /**
     * Get the value of docTipo
     *
     * @return the value of docTipo
     */
    public Integer getDocTipo() {
        return m_docTipo;
    }

    /**
     * Get the value of fecha
     *
     * @return the value of fecha
     */
    public Date getFecha() {
        return m_fecha;
    }

    /**
     * Get the value of fechaDesde
     *
     * @return the value of fechaDesde
     */
    public Date getFechaDesde() {
        return m_fechaDesde;
    }

    /**
     * Get the value of fechaHasta
     *
     * @return the value of fechaHasta
     */
    public Date getFechaHasta() {
        return m_fechaHasta;
    }

    public String getFullLogFileName() {
        return FaceleLogger.getFullLogFileName();
    }

    /**
     * Get the value of idDocumentoFE
     *
     * @return the value of idDocumentoFE
     */
    public Integer getId() {
        return m_id;
    }

    /**
     * Get the value of idDesde
     *
     * @return the value of idDesde
     */
    public Integer getIdDesde() {
        return m_idDesde;
    }

    /**
     * Get the value of idFEXDstPais
     *
     * @return the value of idFEXDstPais
     */
    public String getIdFEXDstPais() {
        return m_idFEXDstPais;
    }

    /**
     * Get the value of idFEXIdioma
     *
     * @return the value of idFEXIdioma
     */
    public Integer getIdFEXIdioma() {
        return m_idFEXIdioma;
    }

    /**
     * Get the value of idFEXIncoterm
     *
     * @return the value of idFEXIncoterm
     */
    public String getIdFEXIncoterm() {
        return m_idFEXIncoterm;
    }

    /**
     * Get the value of idFEXTipoExpo
     *
     * @return the value of idFEXTipoExpo
     */
    public Integer getIdFEXTipoExpo() {
        return m_idFEXTipoExpo;
    }

    /**
     * Get the value of idFEXUnidadMedida
     *
     * @return the value of idFEXUnidadMedida
     */
    public Integer getIdFEXUnidadMedida() {
        return m_idFEXUnidadMedida;
    }

    /**
     * Get the value of idHasta
     *
     * @return the value of idHasta
     */
    public Integer getIdHasta() {
        return m_idHasta;
    }

    /**
     * Get the value of idLote
     *
     * @return the value of idLote
     */
    public Integer getIdLote() {
        return m_idLote;
    }

    /**
     * Get the value of importe
     *
     * @return the value of importe
     */
    public Double getImporte() {
        return m_importe;
    }

    /**
     * Get the value of modoEmision
     *
     * @return the value of modoEmision
     */
    public String getModoEmision() {
        return m_modoEmision;
    }

    /**
     * Get the value of ptoVta
     *
     * @return the value of ptoVta
     */
    public Integer getPtoVta() {
        return m_ptoVta;
    }

    /**
     * Get the value of resultado
     *
     * @return the value of resultado
     */
    public String getResultado() {
        return m_resultado;
    }

    public String getVersion() {
        return FaceleLogger.k_VERSION;
    }

    /**
     * Get the value of wsName
     *
     * @return the value of wsName
     */
    public String getWsName() {
        return m_wsName;
    }

    public void linkToActividades() throws Exception {
        String l_url = "resources/cuits/" + getCuit() + "/actividades";
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToActividadesExp() throws Exception {
        String l_url = "resources/cuits/" + getCuit() + "/actividadesexp";
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToBuscaComprobantes() throws Exception {
        String l_url = "resources/comprobantes?";
        Map<String, Object> l_params = new HashMap<>();

        String l_strCbteFchMin = null;
        if (getFechaDesde() != null) {
            l_strCbteFchMin = new SimpleDateFormat("yyyyMMdd").format(getFechaDesde());
        } // end if
        String l_strCbteFchMax = null;
        if (getFechaHasta() != null) {
            l_strCbteFchMax = new SimpleDateFormat("yyyyMMdd").format(getFechaHasta());
        } // end if

        if (getResultado() != null) {
            if (getResultado().isEmpty()) {
                setResultado(null);
            } // end if
        } // end if
        l_params.put("IdMin", getIdDesde());
        l_params.put("IdMax", getIdHasta());
        l_params.put("Cuit", getCuit());
        l_params.put("PtoVta", getPtoVta());
        l_params.put("CbteTipo", getCbteTipo());
        l_params.put("Lote", getIdLote());
        l_params.put("Resultado", getResultado());
        l_params.put("CbteNroMin", getCbteNroDesde());
        l_params.put("CbteNroMax", getCbteNroHasta());
        l_params.put("CbteFchMin", l_strCbteFchMin);
        l_params.put("CbteFchMax", l_strCbteFchMax);

        String l_query = l_url + urlEncodeUTF8(l_params);

        log("Redirecting from web panel to " + l_query);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_query);
    }

    public void linkToCDC() throws Exception {
        try {
            String l_cbteModo = getModoEmision();
            String l_cuitEmisor = String.valueOf(getCuit());
            String l_ptoVta = String.valueOf(getPtoVta());
            String l_cbteTipo = String.valueOf(getCbteTipo());
            String l_cbteNro = String.valueOf(getCbteNro());
            String l_impTotal = String.valueOf(getImporte());

            String l_cbteFch = new SimpleDateFormat("yyyyMMdd").format(getFecha());
            String l_codAutorizacion = getCae();
            String l_docTipoReceptor = String.valueOf(getDocTipo());
            String l_docNroReceptor = String.valueOf(getDocNro());

            Map<String, Object> l_params = new HashMap<>();
            l_params.put("CbteModo", l_cbteModo);
            l_params.put("CuitEmisor", l_cuitEmisor);
            l_params.put("PtoVta", l_ptoVta);
            l_params.put("CbteTipo", l_cbteTipo);
            l_params.put("CbteNro", l_cbteNro);
            l_params.put("CbteFch", l_cbteFch);
            l_params.put("ImpTotal", l_impTotal);
            l_params.put("CodAutorizacion", l_codAutorizacion);
            l_params.put("DocTipoReceptor", l_docTipoReceptor);
            l_params.put("DocNroReceptor", l_docNroReceptor);

            String l_url = "resources/cdc/constatar?" + urlEncodeUTF8(l_params);
            log("Redirecting from web panel to " + l_url);
            FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
        } catch (Exception l_ex) {
            System.out.println(l_ex.getMessage());
            l_ex.printStackTrace();
            throw l_ex;

        }
    }

    public void linkToCbteTipo() throws Exception {
        String l_url = "resources/cbtetipos/" + getCbteTipo();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToComprobante() throws Exception {
        String l_url = "resources/comprobantes/" + getId();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToComprobantePDF() throws Exception {
        String l_url = "resources/comprobantes/" + getId() + "/pdf";
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToComprobanteQR() throws Exception {
        String l_url = "resources/comprobantes/" + getId() + "/qr";
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToConcepto() throws Exception {
        String l_url = "resources/conceptos/" + getId();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToCotizMoneda() throws Exception {
        SimpleDateFormat l_formatter = new SimpleDateFormat("yyyy-MM-dd");
        String l_url = "resources/cotizmonedas/" + getCodMoneda()
                + "/" + l_formatter.format(getFecha());
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToCuit() throws Exception {
        String l_url = "resources/cuits/" + getCuit();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToDocTipo() throws Exception {
        String l_url = "resources/doctipos/" + getId();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToFEXCbteTipos() throws Exception {
        String l_url = "resources/fexcbtetipos/" + getCbteTipo();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToFEXDstCuits() throws Exception {
        String l_url = "resources/fexdstcuits/" + getCuit();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToFEXDstPaises() throws Exception {
        String l_url = "resources/fexdstpaises/" + getIdFEXDstPais();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToFEXIdiomas() throws Exception {
        String l_url = "resources/fexidiomas/" + getIdFEXIdioma();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToFEXIncoterms() throws Exception {
        String l_url = "resources/fexincoterms/" + getIdFEXIncoterm();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToFEXMonedas() throws Exception {
        String l_url = "resources/fexmonedas/" + getCodMoneda();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToFEXOpcionales() throws Exception {
        String l_url = "resources/fexopcionales/" + getCodOpcional();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToFEXTiposExpo() throws Exception {
        String l_url = "resources/fextiposexpo/" + getIdFEXTipoExpo();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToFEXUnisMedida() throws Exception {
        String l_url = "resources/fexunismedida/" + getIdFEXUnidadMedida();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToIvaReceptor() throws Exception {
        String l_url = "resources/ivareceptores/" + getId();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToIvaTipo() throws Exception {
        String l_url = "resources/ivatipos/" + getId();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToModeloCopia() throws Exception {
        String l_url = "resources/modelocopias/" + getId();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToMoneda() throws Exception {
        String l_url = "resources/monedas/" + getCodMoneda();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToNewTicket() throws Exception {
        String l_url = "resources/tickets/" + getCuit() + "/" + getWsName() + "/new";
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToOpcionalTipo() throws Exception {
        String l_url = "resources/opcionalestipos/" + getId();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToPais() throws Exception {
        String l_url = "resources/paises/" + getId();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToPuntoVenta() throws Exception {
        String l_url = "resources/puntosventa/" + getId();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToPuntosVenta() throws Exception {
        String l_url = "resources/cuits/" + getCuit() + "/puntosventa";
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToPuntosVentaExp() throws Exception {
        String l_url = "resources/cuits/" + getCuit() + "/puntosventaexp";
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToRecuperaComprobante() throws Exception {
        String l_url = "resources/comprobantes/" + getCuit() + "/" + getCbteTipo()
                + "/" + getPtoVta() + "/" + getCbteNro();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToFEXRecuperaComprobante() throws Exception {
        String l_url = "resources/fexcomprobantes/" + getCuit() + "/" + getCbteTipo()
                + "/" + getPtoVta() + "/" + getCbteNro();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToTicket() throws Exception {
        String l_url = "resources/tickets/" + getCuit() + "/" + getWsName();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToTributoTipo() throws Exception {
        String l_url = "resources/tributostipos/" + getId();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToUltimoAutorizado() throws Exception {
        String l_url = "resources/ultimoautoriz/" + getCuit() + "/"
                + getPtoVta() + "/" + getCbteTipo();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    public void linkToFEXUltimoAutorizado() throws Exception {
        String l_url = "resources/fexultimoautoriz/" + getCuit() + "/"
                + getPtoVta() + "/" + getCbteTipo();
        log("Redirecting from web panel to " + l_url);
        FacesContext.getCurrentInstance().getExternalContext().redirect(l_url);
    }

    /**
     * Set the value of cae
     *
     * @param p_cae new value of cae
     */
    public void setCae(String p_cae) {
        this.m_cae = p_cae;
    }

    /**
     * Set the value of cbteNro
     *
     * @param p_cbteNro new value of cbteNro
     */
    public void setCbteNro(Integer p_cbteNro) {
        this.m_cbteNro = p_cbteNro;
    }

    /**
     * Set the value of cbteNroDesde
     *
     * @param p_cbteNroDesde new value of cbteNroDesde
     */
    public void setCbteNroDesde(Integer p_cbteNroDesde) {
        this.m_cbteNroDesde = p_cbteNroDesde;
    }

    /**
     * Set the value of cbteNroHasta
     *
     * @param p_cbteNroHasta new value of cbteNroHasta
     */
    public void setCbteNroHasta(Integer p_cbteNroHasta) {
        this.m_cbteNroHasta = p_cbteNroHasta;
    }

    /**
     * Set the value of cbteTipo
     *
     * @param p_cbteTipo new value of cbteTipo
     */
    public void setCbteTipo(Integer p_cbteTipo) {
        this.m_cbteTipo = p_cbteTipo;
    }

    /**
     * Set the value of codMoneda
     *
     * @param p_codMoneda new value of codMoneda
     */
    public void setCodMoneda(String p_codMoneda) {
        this.m_codMoneda = p_codMoneda;
    }

    /**
     * Set the value of codOpcional
     *
     * @param p_codOpcional new value of codOpcional
     */
    public void setCodOpcional(String p_codOpcional) {
        this.m_codOpcional = p_codOpcional;
    }

    /**
     * Set the value of cuit
     *
     * @param p_cuit new value of cuit
     */
    public void setCuit(Long p_cuit) {
        this.m_cuit = p_cuit;
    }

    /**
     * Set the value of docNro
     *
     * @param p_docNro new value of docNro
     */
    public void setDocNro(Long p_docNro) {
        this.m_docNro = p_docNro;
    }

    /**
     * Set the value of docTipo
     *
     * @param p_docTipo new value of docTipo
     */
    public void setDocTipo(Integer p_docTipo) {
        this.m_docTipo = p_docTipo;
    }

    /**
     * Set the value of fecha
     *
     * @param p_fecha new value of fecha
     */
    public void setFecha(Date p_fecha) {
        this.m_fecha = p_fecha;
    }

    /**
     * Set the value of fechaDesde
     *
     * @param p_fechaDesde new value of fechaDesde
     */
    public void setFechaDesde(Date p_fechaDesde) {
        this.m_fechaDesde = p_fechaDesde;
    }

    /**
     * Set the value of fechaHasta
     *
     * @param p_fechaHasta new value of fechaHasta
     */
    public void setFechaHasta(Date p_fechaHasta) {
        this.m_fechaHasta = p_fechaHasta;
    }

    /**
     * Set the value of idDocumentoFE
     *
     * @param p_id new value of idDocumentoFE
     */
    public void setId(Integer p_id) {
        this.m_id = p_id;
    }

    /**
     * Set the value of idDesde
     *
     * @param p_idDesde new value of idDesde
     */
    public void setIdDesde(Integer p_idDesde) {
        this.m_idDesde = p_idDesde;
    }

    /**
     * Set the value of idFEXDstPais
     *
     * @param p_idFEXDstPais new value of idFEXDstPais
     */
    public void setIdFEXDstPais(String p_idFEXDstPais) {
        this.m_idFEXDstPais = p_idFEXDstPais;
    }

    /**
     * Set the value of idFEXIdioma
     *
     * @param p_idFEXIdioma new value of idFEXIdioma
     */
    public void setIdFEXIdioma(Integer p_idFEXIdioma) {
        this.m_idFEXIdioma = p_idFEXIdioma;
    }

    /**
     * Set the value of idFEXIncoterm
     *
     * @param p_idFEXIncoterm new value of idFEXIncoterm
     */
    public void setIdFEXIncoterm(String p_idFEXIncoterm) {
        this.m_idFEXIncoterm = p_idFEXIncoterm;
    }

    /**
     * Set the value of idFEXTipoExpo
     *
     * @param p_idFEXTipoExpo new value of idFEXTipoExpo
     */
    public void setIdFEXTipoExpo(Integer p_idFEXTipoExpo) {
        this.m_idFEXTipoExpo = p_idFEXTipoExpo;
    }

    /**
     * Set the value of idFEXUnidadMedida
     *
     * @param p_idFEXUnidadMedida new value of idFEXUnidadMedida
     */
    public void setIdFEXUnidadMedida(Integer p_idFEXUnidadMedida) {
        this.m_idFEXUnidadMedida = p_idFEXUnidadMedida;
    }

    /**
     * Set the value of idHasta
     *
     * @param p_idHasta new value of idHasta
     */
    public void setIdHasta(Integer p_idHasta) {
        this.m_idHasta = p_idHasta;
    }

    /**
     * Set the value of idLote
     *
     * @param p_idLote new value of idLote
     */
    public void setIdLote(Integer p_idLote) {
        this.m_idLote = p_idLote;
    }

    /**
     * Set the value of importe
     *
     * @param p_importe new value of importe
     */
    public void setImporte(Double p_importe) {
        this.m_importe = p_importe;
    }

    /**
     * Set the value of modoEmision
     *
     * @param p_modoEmision new value of modoEmision
     */
    public void setModoEmision(String p_modoEmision) {
        this.m_modoEmision = p_modoEmision;
    }

    /**
     * Set the value of ptoVta
     *
     * @param p_ptoVta new value of ptoVta
     */
    public void setPtoVta(Integer p_ptoVta) {
        this.m_ptoVta = p_ptoVta;
    }

    /**
     * Set the value of resultado
     *
     * @param p_resultado new value of resultado
     */
    public void setResultado(String p_resultado) {
        this.m_resultado = p_resultado;
    }

    /**
     * Set the value of wsName
     *
     * @param p_wsName new value of wsName
     */
    public void setWsName(String p_wsName) {
        this.m_wsName = p_wsName;
    }

    private void log(String p_msg) {
        FaceleLogger.log(p_msg);
    }

}
