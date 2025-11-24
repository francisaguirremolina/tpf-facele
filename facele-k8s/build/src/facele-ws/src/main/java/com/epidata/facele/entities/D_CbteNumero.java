/**
ORM domain class for: CbteNumero
Generated: 2025-10-21 15:27:38
Número de comprobante. Hasta 8 dígitos
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Número de comprobante. Hasta 8 dígitos"
*/
public class D_CbteNumero extends AbstractDomain {

    private Integer m_value;

    /**
    Establece el valor de "CbteNumero"
    */
    public void set(Integer p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "CbteNumero"
    */
    public Integer get() {
        return m_value;
    }

}
