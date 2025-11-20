
package com.epidata.facele.ws.arca.wscdc;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFacModTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFacModTipo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FacModTipo" type="{http://servicios1.afip.gob.ar/wscdc/}FacModTipo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFacModTipo", propOrder = {
    "facModTipo"
})
public class ArrayOfFacModTipo {

    @XmlElement(name = "FacModTipo", nillable = true)
    protected List<FacModTipo> facModTipo;

    /**
     * Gets the value of the facModTipo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facModTipo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacModTipo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacModTipo }
     * 
     * 
     */
    public List<FacModTipo> getFacModTipo() {
        if (facModTipo == null) {
            facModTipo = new ArrayList<FacModTipo>();
        }
        return this.facModTipo;
    }

}
