/**
ORM domain class for: CbteTipo
Generated: 2025-10-21 15:27:38
Tipo de comprobante. Hasta 3 dígitos
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Tipo de comprobante. Hasta 3 dígitos"
*/
public class D_CbteTipo extends AbstractDomain {

    private Integer m_value;

    /**
    Establece el valor de "CbteTipo"
    */
    public void set(Integer p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "CbteTipo"
    */
    public Integer get() {
        return m_value;
    }

}
