/**
ORM domain class for: Resultado
Generated: 2025-10-21 15:27:38
Resultado de la solicitud de autorización de un comprobante 
"A" = aprobado; "P" = pendiente; "R" = rechazado; "S": simulación;
"T" = error técnico (2022-06-23)
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Resultado de la solicitud de autorización de un comprobante 
"A" = aprobado; "P" = pendiente; "R" = rechazado; "S": simulación;
"T" = error técnico (2022-06-23)"
*/
public class D_Resultado extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "Resultado"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "Resultado"
    */
    public String get() {
        return m_value;
    }

}
