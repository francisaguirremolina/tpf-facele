
package com.epidata.facele.ws.arca.wsfev1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPaisTipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPaisTipo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaisTipo" type="{http://ar.gov.afip.dif.FEV1/}PaisTipo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPaisTipo", propOrder = {
    "paisTipo"
})
public class ArrayOfPaisTipo {

    /**
     *
     */
    @XmlElement(name = "PaisTipo", nillable = true)
    protected List<PaisTipo> paisTipo;

    /**
     * Gets the value of the paisTipo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paisTipo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaisTipo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaisTipo }
     * 
     * 
     * @return 
     */
    public List<PaisTipo> getPaisTipo() {
        if (paisTipo == null) {
            paisTipo = new ArrayList<PaisTipo>();
        }
        return this.paisTipo;
    }

}
