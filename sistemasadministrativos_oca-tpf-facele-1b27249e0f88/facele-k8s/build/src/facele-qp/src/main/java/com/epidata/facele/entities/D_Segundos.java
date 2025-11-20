/**
ORM domain class for: Segundos
Generated: 2025-10-21 15:27:38
Cantidad de segundos
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Cantidad de segundos"
*/
public class D_Segundos extends AbstractDomain {

    private Integer m_value;

    /**
    Establece el valor de "Segundos"
    */
    public void set(Integer p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "Segundos"
    */
    public Integer get() {
        return m_value;
    }

}
