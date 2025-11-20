/**
ORM domain class for: Porcentaje
Generated: 2025-10-21 15:27:38
Porcentaje (0 a 100)
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Porcentaje (0 a 100)"
*/
public class D_Porcentaje extends AbstractDomain {

    private Double m_value;

    /**
    Establece el valor de "Porcentaje"
    */
    public void set(Double p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "Porcentaje"
    */
    public Double get() {
        return m_value;
    }

}
