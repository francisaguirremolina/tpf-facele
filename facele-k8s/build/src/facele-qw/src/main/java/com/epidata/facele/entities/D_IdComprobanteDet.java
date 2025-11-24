/**
ORM domain class for: IdComprobanteDet
Generated: 2025-10-21 15:27:38
Código de detalle de comprobante
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código de detalle de comprobante"
*/
public class D_IdComprobanteDet extends AbstractDomain {

    private Integer m_value;

    /**
    Establece el valor de "IdComprobanteDet"
    */
    public void set(Integer p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "IdComprobanteDet"
    */
    public Integer get() {
        return m_value;
    }

}
