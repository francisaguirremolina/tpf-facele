/**
ORM domain class for: MonId
Generated: 2025-10-21 15:27:38
Código de moneda del comprobante. Consultar método FEParamGetTiposMonedas para valores posibles
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código de moneda del comprobante. Consultar método FEParamGetTiposMonedas para valores posibles"
*/
public class D_MonId extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "MonId"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "MonId"
    */
    public String get() {
        return m_value;
    }

}
