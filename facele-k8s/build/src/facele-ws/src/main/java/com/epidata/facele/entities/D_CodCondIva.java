/**
ORM domain class for: CodCondIva
Generated: 2025-10-21 15:27:38
Código de condición de IVA del receptor
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código de condición de IVA del receptor"
*/
public class D_CodCondIva extends AbstractDomain {

    private Integer m_value;

    /**
    Establece el valor de "CodCondIva"
    */
    public void set(Integer p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "CodCondIva"
    */
    public Integer get() {
        return m_value;
    }

}
