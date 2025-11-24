/**
ORM domain class for: IdFEXDstPais
Generated: 2025-10-21 15:27:38
Código de país de destino
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código de país de destino"
*/
public class D_IdFEXDstPais extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "IdFEXDstPais"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "IdFEXDstPais"
    */
    public String get() {
        return m_value;
    }

}
