/**
ORM domain class for: IdComprobIVA
Generated: 2025-10-21 15:27:38
Código interno de declaración de IVA de un comprobante electrónico
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código interno de declaración de IVA de un comprobante electrónico"
*/
public class D_IdComprobIVA extends AbstractDomain {

    private Integer m_value;

    /**
    Establece el valor de "IdComprobIVA"
    */
    public void set(Integer p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "IdComprobIVA"
    */
    public Integer get() {
        return m_value;
    }

}
