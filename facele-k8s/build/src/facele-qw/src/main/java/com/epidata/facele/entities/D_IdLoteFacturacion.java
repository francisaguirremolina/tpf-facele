/**
ORM domain class for: IdLoteFacturacion
Generated: 2025-10-21 15:27:38
Código de lote de facturación que agrupa varios comprobantes a facturar
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código de lote de facturación que agrupa varios comprobantes a facturar"
*/
public class D_IdLoteFacturacion extends AbstractDomain {

    private Integer m_value;

    /**
    Establece el valor de "IdLoteFacturacion"
    */
    public void set(Integer p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "IdLoteFacturacion"
    */
    public Integer get() {
        return m_value;
    }

}
