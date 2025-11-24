/**
ORM domain class for: CodOpcional
Generated: 2025-10-21 15:27:38
Código de concepto opcional informado (según el método FEParamGetTiposOpcional)
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código de concepto opcional informado (según el método FEParamGetTiposOpcional)"
*/
public class D_CodOpcional extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "CodOpcional"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "CodOpcional"
    */
    public String get() {
        return m_value;
    }

}
