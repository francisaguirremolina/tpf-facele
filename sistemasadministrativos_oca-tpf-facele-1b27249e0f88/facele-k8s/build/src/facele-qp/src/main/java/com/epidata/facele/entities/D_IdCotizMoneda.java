/**
ORM domain class for: IdCotizMoneda
Generated: 2025-10-21 15:27:38
Código de cotización de moneda
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código de cotización de moneda"
*/
public class D_IdCotizMoneda extends AbstractDomain {

    private Integer m_value;

    /**
    Establece el valor de "IdCotizMoneda"
    */
    public void set(Integer p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "IdCotizMoneda"
    */
    public Integer get() {
        return m_value;
    }

}
