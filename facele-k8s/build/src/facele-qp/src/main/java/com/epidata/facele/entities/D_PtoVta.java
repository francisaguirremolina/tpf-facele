/**
ORM domain class for: PtoVta
Generated: 2025-10-21 15:27:38
Punto de venta declarado. Hasta 5 dígitos
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Punto de venta declarado. Hasta 5 dígitos"
*/
public class D_PtoVta extends AbstractDomain {

    private Integer m_value;

    /**
    Establece el valor de "PtoVta"
    */
    public void set(Integer p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "PtoVta"
    */
    public Integer get() {
        return m_value;
    }

}
