/**
ORM domain class for: CBU
Generated: 2025-10-21 15:27:38
Clave Bancaria Uniforme. 22 dígitos.
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Clave Bancaria Uniforme. 22 dígitos."
*/
public class D_CBU extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "CBU"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "CBU"
    */
    public String get() {
        return m_value;
    }

}
