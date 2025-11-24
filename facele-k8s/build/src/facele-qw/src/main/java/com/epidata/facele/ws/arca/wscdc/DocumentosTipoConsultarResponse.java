
package com.epidata.facele.ws.arca.wscdc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentosTipoConsultarResult" type="{http://servicios1.afip.gob.ar/wscdc/}DocTipoResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentosTipoConsultarResult"
})
@XmlRootElement(name = "DocumentosTipoConsultarResponse")
public class DocumentosTipoConsultarResponse {

    @XmlElement(name = "DocumentosTipoConsultarResult")
    protected DocTipoResponse documentosTipoConsultarResult;

    /**
     * Gets the value of the documentosTipoConsultarResult property.
     * 
     * @return
     *     possible object is
     *     {@link DocTipoResponse }
     *     
     */
    public DocTipoResponse getDocumentosTipoConsultarResult() {
        return documentosTipoConsultarResult;
    }

    /**
     * Sets the value of the documentosTipoConsultarResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocTipoResponse }
     *     
     */
    public void setDocumentosTipoConsultarResult(DocTipoResponse value) {
        this.documentosTipoConsultarResult = value;
    }

}
