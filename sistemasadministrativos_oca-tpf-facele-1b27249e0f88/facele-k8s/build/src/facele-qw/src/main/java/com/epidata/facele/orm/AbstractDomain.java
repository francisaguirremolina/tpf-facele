package com.epidata.facele.orm;

/**
 *
 * * @author Gustavo Sbrugnera, para EPIDATA
 */
public abstract class AbstractDomain {

    /**
     * Devuelve la clase Java capaz de contener un dato del tipo SQL indicado:
     * Object, Short, Integer, Date, etc.
     *
     * @param p_sqlDef
     * @return
     */
    public static String javaClassFor(String p_sqlDef) {
        if (p_sqlDef == null) {
            return "Object";
        } // end if
        p_sqlDef = p_sqlDef.trim().toUpperCase();
        if (p_sqlDef.equals("BIGINT")) {
            return "Long";
        } // end if
        if (p_sqlDef.equals("BIT")
                || p_sqlDef.equals("SMALLINT")) {
            return "Short";
        } // end if
        if (p_sqlDef.startsWith("INT")) {
            return "Integer";
        } // end if
        if (p_sqlDef.equals("TIMESTAMP")) {
            return "java.sql.Timestamp";
        } // end if
        if (p_sqlDef.equals("DATE")) {
            return "Date";
        } // end if
        if (p_sqlDef.equals("FLOAT")
                || p_sqlDef.equals("REAL")
                || p_sqlDef.startsWith("DOUBLE")
                || p_sqlDef.startsWith("DECIMAL")
                || p_sqlDef.startsWith("NUMERIC")) {
            return "Double";
        } // end if
        if (p_sqlDef.startsWith("CHAR")
                || p_sqlDef.startsWith("NCHAR")
                || p_sqlDef.startsWith("VARCHAR")
                || p_sqlDef.startsWith("NVARCHAR")
                || p_sqlDef.startsWith("TEXT")
                || p_sqlDef.startsWith("CLOB")) {
            return "String";
        } // end if

        // BLOB
        return "Object";
    }

    /**
     * Devuelve un getter de resultset para una clase Java:
     * "getInt" para Integer, "getString" para String, "getBlob" predeterminado
     * @param p_javaClass
     * @return 
     */
    public static String rsGetterFor(String p_javaClass) {
        if (p_javaClass.equals("Integer")) {
            return "getInt";
        } // end if
        if (p_javaClass.equals("String")) {
            return "getString";
        } // end if
        if (p_javaClass.equals("Double")) {
            return "getDouble";
        } // end if
        if (p_javaClass.equals("Long")) {
            return "getLong";
        } // end if
        if (p_javaClass.equals("Short")) {
            return "getShort";
        } // end if
        if (p_javaClass.equals("Date")) {
            return "getDate";
        } // end if
        if (p_javaClass.equals("java.sql.Timestamp")) {
            return "getTimestamp";
        } // end if
        return "getBlob";
    }
}
