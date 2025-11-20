package com.epidata.facele.orm;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.text.DateFormat;
import java.util.List;

/**
 *
 * * @author Gustavo Sbrugnera, para EPIDATA
 */
public class OrmSupport {

    private static class JsonResponse {

        private String m_relation;

        /**
         * Get the value of relation
         *
         * @return the value of relation
         */
        public String getRelation() {
            return m_relation;
        }

        /**
         * Set the value of relation
         *
         * @param p_relation new value of relation
         */
        public void setRelation(String p_relation) {
            this.m_relation = p_relation;
        }

        private List<AbstractRecord> m_rows;

        private int m_rowCount;

        /**
         * Get the value of rowCount
         *
         * @return the value of rowCount
         */
        public int getRowCount() {
            return m_rowCount;
        }

        /**
         * Set the value of rowCount
         *
         * @param p_rowCount new value of rowCount
         */
        public void setRowCount(int p_rowCount) {
            this.m_rowCount = p_rowCount;
        }

        /**
         * Get the value of rows
         *
         * @return the value of rows
         */
        public List<AbstractRecord> getRows() {
            return m_rows;
        }

        /**
         * Set the value of rows
         *
         * @param p_rows new value of rows
         */
        public void setRows(List<AbstractRecord> p_rows) {
            this.m_rows = p_rows;
        }

        public JsonResponse(String p_relation, List<AbstractRecord> p_rows) {
            m_relation = p_relation;
            m_rows = p_rows;
            m_rowCount = p_rows.size();
        }

    }

    /**
     * Encierra entre apostrofes una cadena. Codifica los apostrofes internos.
     *
     * @param p_value
     * @return p_value encerrado entre apostrofes, o "NULL" si es null
     */
    public static String sqlQuote(Object p_value) {
        if (p_value == null) {
            return "NULL";
        } // end if
        if (p_value instanceof java.sql.Timestamp) {
            String l_strDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")
                    .format((Date) p_value);
            return "'" + l_strDate + "'";
        } // end if
        if (p_value instanceof Date) {
            String l_strDate = new SimpleDateFormat("yyyy-MM-dd")
                    .format((Date) p_value);
            return "'" + l_strDate + "'";
        } // end if
        String l_strValue = p_value.toString();
        if (l_strValue == null) {
            return "NULL";
        } // end if
        l_strValue = l_strValue.trim();
        if (l_strValue.isEmpty()) {
            return "NULL";
        } // end if

        String l_toReturn = "'" + l_strValue.replace("'", "''") + "'";
        return l_toReturn;
    }

    /**
     *
     * @param p_record
     * @return
     * @throws Exception
     */
    public static String asJSON(AbstractRecord p_record) throws Exception {
        ObjectMapper l_mapper = new ObjectMapper();
        DateFormat l_dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        l_mapper.setDateFormat(l_dateFormat);
        return l_mapper.writeValueAsString(p_record);
    }

    /**
     *
     * @param p_obj
     * @return
     * @throws Exception
     */
    public static String asJSON(Object p_obj) throws Exception {
        ObjectMapper l_mapper = new ObjectMapper();
        DateFormat l_dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        l_mapper.setDateFormat(l_dateFormat);
        return l_mapper.writeValueAsString(p_obj);
    }

    /**
     *
     * @param p_publicRelName
     * @param p_relation
     * @return
     * @throws Exception
     */
    public static String asJSON(String p_publicRelName,
            AbstractRelation p_relation) throws Exception {
        if (p_relation == null) {
            return "[]";
        } // end if
        ObjectMapper l_mapper = new ObjectMapper();
        // TO-DO: no está renderizando la hora en la salida 
        DateFormat l_dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        l_mapper.setDateFormat(l_dateFormat);

        JsonResponse l_response = new JsonResponse(p_publicRelName, p_relation.getRows());
        return l_mapper.writeValueAsString(l_response);
    }

    /**
     *
     * @param p_jsonStr
     * @param p_record
     * @return
     * @throws Exception
     */
    public static AbstractRecord fromJSON(String p_jsonStr,
            AbstractRecord p_record) throws Exception {
        ObjectMapper l_mapper = new ObjectMapper();
        AbstractRecord l_toReturn = l_mapper.readValue(p_jsonStr, p_record.getClass());
        return l_toReturn;
    }

    /**
     *
     * @param p_xmlString
     * @return
     * @throws Exception
     */
    public static Date xml2Date(String p_xmlString) throws Exception {
        if (p_xmlString == null || p_xmlString.isEmpty() || p_xmlString.equalsIgnoreCase("NULL")) {
            return null;
        } // end if
        return new SimpleDateFormat("yyyyMMdd").parse(p_xmlString);

    }

}
