/**
ORM domain class for: IdFEXDstCuit
Generated: 2025-10-21 15:27:38
Código de CUIT de destino
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código de CUIT de destino"
*/
public class D_IdFEXDstCuit extends AbstractDomain {

    private Long m_value;

    /**
    Establece el valor de "IdFEXDstCuit"
    */
    public void set(Long p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "IdFEXDstCuit"
    */
    public Long get() {
        return m_value;
    }

}
