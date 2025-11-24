/**
ORM domain class for: Sign
Generated: 2025-10-21 15:27:38
Sign otorgado temporalmente por AFIP, para operaciones con web-services
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Sign otorgado temporalmente por AFIP, para operaciones con web-services"
*/
public class D_Sign extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "Sign"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "Sign"
    */
    public String get() {
        return m_value;
    }

}
