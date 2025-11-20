/**
ORM domain class for: Token
Generated: 2025-10-21 15:27:38
Token otorgado temporalmente por AFIP, para operaciones con web-services
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Token otorgado temporalmente por AFIP, para operaciones con web-services"
*/
public class D_Token extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "Token"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "Token"
    */
    public String get() {
        return m_value;
    }

}
