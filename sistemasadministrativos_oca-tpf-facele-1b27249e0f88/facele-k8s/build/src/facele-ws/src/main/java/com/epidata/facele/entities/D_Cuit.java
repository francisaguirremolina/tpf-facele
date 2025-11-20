/**
ORM domain class for: Cuit
Generated: 2025-10-21 15:27:38
Código Único de Identificación Tributaria; 11 dígitos sin espacios ni guiones
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código Único de Identificación Tributaria; 11 dígitos sin espacios ni guiones"
*/
public class D_Cuit extends AbstractDomain {

    private Long m_value;

    /**
    Establece el valor de "Cuit"
    */
    public void set(Long p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "Cuit"
    */
    public Long get() {
        return m_value;
    }

}
