/**
ORM domain class for: HashLink
Generated: 2025-10-21 15:27:38
Código pseudo-aleatorio para la identificación segura de comprobantes generados. 
Sólo letras "A" a "Z" y dígitos "0" a "9". 20 caracteres.
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código pseudo-aleatorio para la identificación segura de comprobantes generados. 
Sólo letras "A" a "Z" y dígitos "0" a "9". 20 caracteres."
*/
public class D_HashLink extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "HashLink"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "HashLink"
    */
    public String get() {
        return m_value;
    }

}
