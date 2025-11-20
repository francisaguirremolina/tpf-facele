/**
ORM domain class for: Observaciones
Generated: 2025-10-21 15:27:38
Observaciones obtenidas desde AFIP
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Observaciones obtenidas desde AFIP"
*/
public class D_Observaciones extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "Observaciones"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "Observaciones"
    */
    public String get() {
        return m_value;
    }

}
