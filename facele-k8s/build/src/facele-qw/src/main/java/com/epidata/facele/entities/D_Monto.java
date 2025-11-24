/**
ORM domain class for: Monto
Generated: 2025-10-21 15:27:38
Valor monetario
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Valor monetario"
*/
public class D_Monto extends AbstractDomain {

    private Double m_value;

    /**
    Establece el valor de "Monto"
    */
    public void set(Double p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "Monto"
    */
    public Double get() {
        return m_value;
    }

}
