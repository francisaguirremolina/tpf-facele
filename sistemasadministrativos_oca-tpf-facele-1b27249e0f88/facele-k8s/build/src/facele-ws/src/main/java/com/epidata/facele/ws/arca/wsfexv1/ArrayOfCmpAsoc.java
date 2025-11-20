
package com.epidata.facele.ws.arca.wsfexv1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCmp_asoc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCmp_asoc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cmp_asoc" type="{http://ar.gov.afip.dif.fexv1/}Cmp_asoc" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCmp_asoc", propOrder = {
    "cmpAsoc"
})
public class ArrayOfCmpAsoc {

    @XmlElement(name = "Cmp_asoc", nillable = true)
    protected List<CmpAsoc> cmpAsoc;

    /**
     * Gets the value of the cmpAsoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmpAsoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmpAsoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CmpAsoc }
     * 
     * 
     */
    public List<CmpAsoc> getCmpAsoc() {
        if (cmpAsoc == null) {
            cmpAsoc = new ArrayList<CmpAsoc>();
        }
        return this.cmpAsoc;
    }

}
