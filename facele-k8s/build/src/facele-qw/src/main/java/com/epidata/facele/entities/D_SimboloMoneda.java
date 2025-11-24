/**
ORM domain class for: SimboloMoneda
Generated: 2025-10-21 15:27:38
Símbolo de la moneda ($, U$S, etc.)
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Símbolo de la moneda ($, U$S, etc.)"
*/
public class D_SimboloMoneda extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "SimboloMoneda"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "SimboloMoneda"
    */
    public String get() {
        return m_value;
    }

}
