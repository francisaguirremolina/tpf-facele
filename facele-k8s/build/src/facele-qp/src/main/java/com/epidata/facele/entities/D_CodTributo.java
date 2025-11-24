/**
ORM domain class for: CodTributo
Generated: 2025-10-21 15:27:38
Código de tributo (según el método FEParamGetTiposTributos)
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código de tributo (según el método FEParamGetTiposTributos)"
*/
public class D_CodTributo extends AbstractDomain {

    private Integer m_value;

    /**
    Establece el valor de "CodTributo"
    */
    public void set(Integer p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "CodTributo"
    */
    public Integer get() {
        return m_value;
    }

}
