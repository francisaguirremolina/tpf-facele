package com.epidata.facele.ws;

import com.epidata.facele.entities.T_FECbteTipos;
import com.epidata.facele.entities.T_FECuits;
import com.epidata.facele.entities.T_Monedas;
import com.epidata.facele.ws.ConnectionProvider;
import java.sql.Connection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author gustavo
 */
public class EnumProvider {

    private Map<String, Long> m_cuits;
    private Map<String, Integer> m_cbteTipos;
    private Map<String, String> m_monedas;
    
    public void clearCuits() {
        m_cuits = null;
    }

    public void clearCbteTipos() {
        m_cuits = null;
    }

    public void clearMonedas() {
        m_monedas = null;
    }
    
    public Map<String, Long> getCuits() throws Exception {
        if (m_cuits == null) {
            m_cuits = new LinkedHashMap<>();

            try (Connection l_conn = ConnectionProvider.getConn()) {
                T_FECuits l_table = new T_FECuits(l_conn, null, "Cuit");
                for (var l_row : l_table.getRows()) {
                    m_cuits.put(l_row.getCuit() + " " + l_row.getDescripcion(), l_row.getId());
                } // end for
            }
        } //end if
        return m_cuits;
    }

    public Map<String, Integer> getCbteTipos() throws Exception {
        if (m_cbteTipos == null) {
            m_cbteTipos = new LinkedHashMap<>();

            try (Connection l_conn = ConnectionProvider.getConn()) {
                T_FECbteTipos l_table = new T_FECbteTipos(l_conn, null, "CbteTipo");
                for (var l_row : l_table.getRows()) {
                    m_cbteTipos.put(l_row.getCbteTipo() + " " + l_row.getDescripcion(), l_row.getId());
                } // end for
            }
        } //end if
        return m_cbteTipos;
    }

    public Map<String, String> getMonedas() throws Exception {
        if (m_monedas == null) {
            m_monedas = new LinkedHashMap<>();

            try (Connection l_conn = ConnectionProvider.getConn()) {
                T_Monedas l_table = new T_Monedas(l_conn, null, "MonId");
                for (var l_row : l_table.getRows()) {
                    m_monedas.put(l_row.getMonId() + " " + l_row.getDescripcion()
                            , l_row.getId());
                } // end for
            }
        } //end if
        return m_monedas;
    }
    
}
