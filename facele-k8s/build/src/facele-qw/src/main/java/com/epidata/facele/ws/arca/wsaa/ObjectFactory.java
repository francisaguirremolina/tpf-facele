
package com.epidata.facele.ws.arca.wsaa;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.epidata.facele package. 
 * <p>An ObjectFactory allows you to programatically  
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Fault_QNAME = new QName("https://wsaahomo.afip.gov.ar/ws/services/LoginCms", "fault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.epidata.facele
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginCms2 }
     * 
     * @return 
     */
    public LoginCms2 createLoginCms() {
        return new LoginCms2();
    }

    /**
     * Create an instance of {@link LoginCmsResponse }
     * 
     * @return 
     */
    public LoginCmsResponse createLoginCmsResponse() {
        return new LoginCmsResponse();
    }

    /**
     * Create an instance of {@link LoginFault }
     * 
     * @return 
     */
    public LoginFault createLoginFault() {
        return new LoginFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginFault }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginFault }{@code >}
     */
    @XmlElementDecl(namespace = "https://wsaahomo.afip.gov.ar/ws/services/LoginCms", name = "fault")
    public JAXBElement<LoginFault> createFault(LoginFault value) {
        return new JAXBElement<LoginFault>(_Fault_QNAME, LoginFault.class, null, value);
    }

}
