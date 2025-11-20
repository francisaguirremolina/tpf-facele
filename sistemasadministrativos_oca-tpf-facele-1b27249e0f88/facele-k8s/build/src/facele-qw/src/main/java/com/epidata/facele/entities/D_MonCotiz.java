/**
ORM domain class for: MonCotiz
Generated: 2025-10-21 15:27:38
Cotización de la moneda informada. Para PES, pesos argentinos la misma debe ser 1
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Cotización de la moneda informada. Para PES, pesos argentinos la misma debe ser 1"
*/
public class D_MonCotiz extends AbstractDomain {

    private Double m_value;

    /**
    Establece el valor de "MonCotiz"
    */
    public void set(Double p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "MonCotiz"
    */
    public Double get() {
        return m_value;
    }

}
