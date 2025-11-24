/**
ORM domain class for: IdDocumentoFE
Generated: 2025-10-21 15:27:38
Código interno de comprobante
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código interno de comprobante"
*/
public class D_IdDocumentoFE extends AbstractDomain {

    private Integer m_value;

    /**
    Establece el valor de "IdDocumentoFE"
    */
    public void set(Integer p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "IdDocumentoFE"
    */
    public Integer get() {
        return m_value;
    }

}
