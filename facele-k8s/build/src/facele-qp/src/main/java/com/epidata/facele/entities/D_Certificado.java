/**
ORM domain class for: Certificado
Generated: 2025-10-21 15:27:38
Certificado X.509 en formato PEM
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Certificado X.509 en formato PEM"
*/
public class D_Certificado extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "Certificado"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "Certificado"
    */
    public String get() {
        return m_value;
    }

}
