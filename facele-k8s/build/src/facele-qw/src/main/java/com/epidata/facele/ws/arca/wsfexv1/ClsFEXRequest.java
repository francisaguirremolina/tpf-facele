
package com.epidata.facele.ws.arca.wsfexv1;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClsFEXRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClsFEXRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Fecha_cbte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cbte_Tipo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Punto_vta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cbte_nro" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Tipo_expo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Permiso_existente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Permisos" type="{http://ar.gov.afip.dif.fexv1/}ArrayOfPermiso" minOccurs="0"/>
 *         &lt;element name="Dst_cmp" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cuit_pais_cliente" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Domicilio_cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_impositivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Moneda_Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Moneda_ctz" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CanMisMonExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Obs_comerciales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Imp_total" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Obs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cmps_asoc" type="{http://ar.gov.afip.dif.fexv1/}ArrayOfCmp_asoc" minOccurs="0"/>
 *         &lt;element name="Forma_pago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Incoterms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Incoterms_Ds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Idioma_cbte" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Items" type="{http://ar.gov.afip.dif.fexv1/}ArrayOfItem" minOccurs="0"/>
 *         &lt;element name="Opcionales" type="{http://ar.gov.afip.dif.fexv1/}ArrayOfOpcional" minOccurs="0"/>
 *         &lt;element name="Fecha_pago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Actividades" type="{http://ar.gov.afip.dif.fexv1/}ArrayOfActividad" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsFEXRequest", propOrder = {
    "id",
    "fechaCbte",
    "cbteTipo",
    "puntoVta",
    "cbteNro",
    "tipoExpo",
    "permisoExistente",
    "permisos",
    "dstCmp",
    "cliente",
    "cuitPaisCliente",
    "domicilioCliente",
    "idImpositivo",
    "monedaId",
    "monedaCtz",
    "canMisMonExt",
    "obsComerciales",
    "impTotal",
    "obs",
    "cmpsAsoc",
    "formaPago",
    "incoterms",
    "incotermsDs",
    "idiomaCbte",
    "items",
    "opcionales",
    "fechaPago",
    "actividades"
})
public class ClsFEXRequest {

    @XmlElement(name = "Id")
    protected long id;
    @XmlElement(name = "Fecha_cbte")
    protected String fechaCbte;
    @XmlElement(name = "Cbte_Tipo")
    protected short cbteTipo;
    @XmlElement(name = "Punto_vta")
    protected int puntoVta;
    @XmlElement(name = "Cbte_nro")
    protected long cbteNro;
    @XmlElement(name = "Tipo_expo")
    protected short tipoExpo;
    @XmlElement(name = "Permiso_existente")
    protected String permisoExistente;
    @XmlElement(name = "Permisos")
    protected ArrayOfPermiso permisos;
    @XmlElement(name = "Dst_cmp")
    protected short dstCmp;
    @XmlElement(name = "Cliente")
    protected String cliente;
    @XmlElement(name = "Cuit_pais_cliente")
    protected long cuitPaisCliente;
    @XmlElement(name = "Domicilio_cliente")
    protected String domicilioCliente;
    @XmlElement(name = "Id_impositivo")
    protected String idImpositivo;
    @XmlElement(name = "Moneda_Id")
    protected String monedaId;
    @XmlElement(name = "Moneda_ctz")
    protected BigDecimal monedaCtz;
    @XmlElement(name = "CanMisMonExt")
    protected String canMisMonExt;
    @XmlElement(name = "Obs_comerciales")
    protected String obsComerciales;
    @XmlElement(name = "Imp_total", required = true)
    protected BigDecimal impTotal;
    @XmlElement(name = "Obs")
    protected String obs;
    @XmlElement(name = "Cmps_asoc")
    protected ArrayOfCmpAsoc cmpsAsoc;
    @XmlElement(name = "Forma_pago")
    protected String formaPago;
    @XmlElement(name = "Incoterms")
    protected String incoterms;
    @XmlElement(name = "Incoterms_Ds")
    protected String incotermsDs;
    @XmlElement(name = "Idioma_cbte")
    protected short idiomaCbte;
    @XmlElement(name = "Items")
    protected ArrayOfItem items;
    @XmlElement(name = "Opcionales")
    protected ArrayOfOpcional opcionales;
    @XmlElement(name = "Fecha_pago")
    protected String fechaPago;
    @XmlElement(name = "Actividades")
    protected ArrayOfActividad actividades;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the fechaCbte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaCbte() {
        return fechaCbte;
    }

    /**
     * Sets the value of the fechaCbte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaCbte(String value) {
        this.fechaCbte = value;
    }

    /**
     * Gets the value of the cbteTipo property.
     * 
     */
    public short getCbteTipo() {
        return cbteTipo;
    }

    /**
     * Sets the value of the cbteTipo property.
     * 
     */
    public void setCbteTipo(short value) {
        this.cbteTipo = value;
    }

    /**
     * Gets the value of the puntoVta property.
     * 
     */
    public int getPuntoVta() {
        return puntoVta;
    }

    /**
     * Sets the value of the puntoVta property.
     * 
     */
    public void setPuntoVta(int value) {
        this.puntoVta = value;
    }

    /**
     * Gets the value of the cbteNro property.
     * 
     */
    public long getCbteNro() {
        return cbteNro;
    }

    /**
     * Sets the value of the cbteNro property.
     * 
     */
    public void setCbteNro(long value) {
        this.cbteNro = value;
    }

    /**
     * Gets the value of the tipoExpo property.
     * 
     */
    public short getTipoExpo() {
        return tipoExpo;
    }

    /**
     * Sets the value of the tipoExpo property.
     * 
     */
    public void setTipoExpo(short value) {
        this.tipoExpo = value;
    }

    /**
     * Gets the value of the permisoExistente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermisoExistente() {
        return permisoExistente;
    }

    /**
     * Sets the value of the permisoExistente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermisoExistente(String value) {
        this.permisoExistente = value;
    }

    /**
     * Gets the value of the permisos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPermiso }
     *     
     */
    public ArrayOfPermiso getPermisos() {
        return permisos;
    }

    /**
     * Sets the value of the permisos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPermiso }
     *     
     */
    public void setPermisos(ArrayOfPermiso value) {
        this.permisos = value;
    }

    /**
     * Gets the value of the dstCmp property.
     * 
     */
    public short getDstCmp() {
        return dstCmp;
    }

    /**
     * Sets the value of the dstCmp property.
     * 
     */
    public void setDstCmp(short value) {
        this.dstCmp = value;
    }

    /**
     * Gets the value of the cliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Sets the value of the cliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCliente(String value) {
        this.cliente = value;
    }

    /**
     * Gets the value of the cuitPaisCliente property.
     * 
     */
    public long getCuitPaisCliente() {
        return cuitPaisCliente;
    }

    /**
     * Sets the value of the cuitPaisCliente property.
     * 
     */
    public void setCuitPaisCliente(long value) {
        this.cuitPaisCliente = value;
    }

    /**
     * Gets the value of the domicilioCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomicilioCliente() {
        return domicilioCliente;
    }

    /**
     * Sets the value of the domicilioCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomicilioCliente(String value) {
        this.domicilioCliente = value;
    }

    /**
     * Gets the value of the idImpositivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdImpositivo() {
        return idImpositivo;
    }

    /**
     * Sets the value of the idImpositivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdImpositivo(String value) {
        this.idImpositivo = value;
    }

    /**
     * Gets the value of the monedaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonedaId() {
        return monedaId;
    }

    /**
     * Sets the value of the monedaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonedaId(String value) {
        this.monedaId = value;
    }

    /**
     * Gets the value of the monedaCtz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonedaCtz() {
        return monedaCtz;
    }

    /**
     * Sets the value of the monedaCtz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonedaCtz(BigDecimal value) {
        this.monedaCtz = value;
    }

    /**
     * Gets the value of the canMisMonExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanMisMonExt() {
        return canMisMonExt;
    }

    /**
     * Sets the value of the canMisMonExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanMisMonExt(String value) {
        this.canMisMonExt = value;
    }

    /**
     * Gets the value of the obsComerciales property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsComerciales() {
        return obsComerciales;
    }

    /**
     * Sets the value of the obsComerciales property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsComerciales(String value) {
        this.obsComerciales = value;
    }

    /**
     * Gets the value of the impTotal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImpTotal() {
        return impTotal;
    }

    /**
     * Sets the value of the impTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImpTotal(BigDecimal value) {
        this.impTotal = value;
    }

    /**
     * Gets the value of the obs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObs() {
        return obs;
    }

    /**
     * Sets the value of the obs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObs(String value) {
        this.obs = value;
    }

    /**
     * Gets the value of the cmpsAsoc property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCmpAsoc }
     *     
     */
    public ArrayOfCmpAsoc getCmpsAsoc() {
        return cmpsAsoc;
    }

    /**
     * Sets the value of the cmpsAsoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCmpAsoc }
     *     
     */
    public void setCmpsAsoc(ArrayOfCmpAsoc value) {
        this.cmpsAsoc = value;
    }

    /**
     * Gets the value of the formaPago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaPago() {
        return formaPago;
    }

    /**
     * Sets the value of the formaPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaPago(String value) {
        this.formaPago = value;
    }

    /**
     * Gets the value of the incoterms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncoterms() {
        return incoterms;
    }

    /**
     * Sets the value of the incoterms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncoterms(String value) {
        this.incoterms = value;
    }

    /**
     * Gets the value of the incotermsDs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncotermsDs() {
        return incotermsDs;
    }

    /**
     * Sets the value of the incotermsDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncotermsDs(String value) {
        this.incotermsDs = value;
    }

    /**
     * Gets the value of the idiomaCbte property.
     * 
     */
    public short getIdiomaCbte() {
        return idiomaCbte;
    }

    /**
     * Sets the value of the idiomaCbte property.
     * 
     */
    public void setIdiomaCbte(short value) {
        this.idiomaCbte = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfItem }
     *     
     */
    public ArrayOfItem getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfItem }
     *     
     */
    public void setItems(ArrayOfItem value) {
        this.items = value;
    }

    /**
     * Gets the value of the opcionales property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOpcional }
     *     
     */
    public ArrayOfOpcional getOpcionales() {
        return opcionales;
    }

    /**
     * Sets the value of the opcionales property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOpcional }
     *     
     */
    public void setOpcionales(ArrayOfOpcional value) {
        this.opcionales = value;
    }

    /**
     * Gets the value of the fechaPago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaPago() {
        return fechaPago;
    }

    /**
     * Sets the value of the fechaPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaPago(String value) {
        this.fechaPago = value;
    }

    /**
     * Gets the value of the actividades property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfActividad }
     *     
     */
    public ArrayOfActividad getActividades() {
        return actividades;
    }

    /**
     * Sets the value of the actividades property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfActividad }
     *     
     */
    public void setActividades(ArrayOfActividad value) {
        this.actividades = value;
    }

}
