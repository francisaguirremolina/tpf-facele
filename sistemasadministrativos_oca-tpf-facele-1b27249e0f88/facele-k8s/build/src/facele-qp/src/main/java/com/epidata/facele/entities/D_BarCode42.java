/**
ORM domain class for: BarCode42
Generated: 2025-10-21 15:27:38
Código de barras al pie de un comprobante autorizado. 
De acuerdo con la R.G. 1702 (2004). Contiene 42 dígitos:
- C.U.I.T. (Clave Unica de Identificación Tributaria) del emisor (11 caracteres).
- Código de tipo de comprobante (3 caracteres).
- Punto de venta (5 caracteres).
- Código de Autorización de Impresión (14 caracteres).
- Fecha de vencimiento (8 caracteres).
- Dígito verificador (1 carácter).
*/
package com.epidata.facele.entities;

import java.util.Date;
import com.epidata.facele.orm.AbstractDomain;

/**
Clase que almacena un valor: "Código de barras al pie de un comprobante autorizado. 
De acuerdo con la R.G. 1702 (2004). Contiene 42 dígitos:
- C.U.I.T. (Clave Unica de Identificación Tributaria) del emisor (11 caracteres).
- Código de tipo de comprobante (3 caracteres).
- Punto de venta (5 caracteres).
- Código de Autorización de Impresión (14 caracteres).
- Fecha de vencimiento (8 caracteres).
- Dígito verificador (1 carácter)."
*/
public class D_BarCode42 extends AbstractDomain {

    private String m_value;

    /**
    Establece el valor de "BarCode42"
    */
    public void set(String p_value) {
        m_value = p_value;
    }

    /**
    Devuelve el valor de "BarCode42"
    */
    public String get() {
        return m_value;
    }

}
