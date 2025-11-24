/**
ORM domain class for: CodAlicIVA
Generated: 2025-10-21 15:27:38
Código de alícuota de IVA (según el método FEParamGetTiposIva)
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código de alícuota de IVA (según el método FEParamGetTiposIva)"
*/
public class D_CodAlicIVA extends AbstractDomain {

    private Integer m_value;

    /**
    Establece el valor de "CodAlicIVA"
    */
    public void set(Integer p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "CodAlicIVA"
    */
    public Integer get() {
        return m_value;
    }

}
