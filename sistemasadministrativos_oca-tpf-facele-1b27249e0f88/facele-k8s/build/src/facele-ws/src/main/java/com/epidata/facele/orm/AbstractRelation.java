package com.epidata.facele.orm;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * * @author Gustavo Sbrugnera, para EPIDATA
 * @param <ROW>
 */
public abstract class AbstractRelation<ROW extends AbstractRecord> {

    private static boolean m_debug = true;

    /**
     *
     */
    private List<ROW> m_rows;
    /**
     *
     */
    private ROW m_selected;
    /**
     *
     */
    private Class<ROW> m_type;

    /**
     *
     * @param p_type */
    public AbstractRelation(Class<ROW> p_type) {
        m_rows = new ArrayList<>();
        m_type = p_type;
    }

    /**
     *
     * @param p_type
     * @param p_rs
     * @throws Exception
     */
    public AbstractRelation(Class<ROW> p_type, ResultSet p_rs) throws Exception {
        this(p_type);
        serializeFrom(p_rs);
    }

    /**
     *
     * @param p_type
     * @param p_conn
     * @param p_where
     * @param p_orderBy
     * @throws Exception
     */
    public AbstractRelation(Class<ROW> p_type, Connection p_conn, String p_where,
            String p_orderBy) throws Exception {
        this(p_type);
        serializeFrom(p_conn, p_where, p_orderBy);
    }

    /**
     *
     * @return
     */
    public List<ROW> getRows() {
        return m_rows;
    }

    /**
     *
     * @return
     */
    public ROW getSelected() {
        return m_selected;
    }

    /**
     *
     * @param p_selected
     */
    public void setSelected(ROW p_selected) {
        this.m_selected = p_selected;
    }

    /**
     *
     * @return
     */
    public abstract String getSqlName();

    /**
     *
     * @return
     */
    public static boolean isDebug() {
        return m_debug;
    }

    /**
     *
     * @param p_debug
     */
    public static void setDebug(boolean p_debug) {
        m_debug = p_debug;
    }

    /**
     *
     * @return @throws InstantiationException
     * @throws java.lang.InstantiationException
     * @throws IllegalAccessException
     */
    public ROW newType() throws InstantiationException, IllegalAccessException {
        return m_type.newInstance();
    }

    /**
     *
     * @param p_conn
     * @param p_where
     * @param p_orderBy
     * @throws Exception
     */
    public void serializeFrom(Connection p_conn, String p_where,
            String p_orderBy) throws Exception {
        String l_sql = "SELECT * FROM " + getSqlName();
        
        if (p_where != null && !p_where.trim().isEmpty()) {
            l_sql += " WHERE " + p_where.trim();
        } // end if
        if (p_orderBy != null) {
            l_sql += " ORDER BY " + p_orderBy;
        } // end if
        if (m_debug) {
            System.out.println("ORM-DEBUG: " + l_sql);
        } // end if
        Statement l_stmt = p_conn.createStatement();
        ResultSet l_rs = l_stmt.executeQuery(l_sql);
        serializeFrom(l_rs);
        l_rs.close();
        l_stmt.close();
    }

    /**
     *
     * @param p_rs
     * @throws Exception
     */
    public void serializeFrom(ResultSet p_rs) throws Exception {
        m_rows.clear();
        while (p_rs.next()) {

            ROW l_aRow = newType();
            l_aRow.serializeFrom(p_rs);
            m_rows.add(l_aRow);
        } // end while
        if (m_debug) {
            System.out.println("ORM-DEBUG: " + m_rows.size() + " row(s) serialized");
        } // end if
    }

    /**
     *
     * @param p_conn
     * @param p_where
     * @param p_orderBy
     * @param p_rowClass
     * @return
     * @throws Exception
     */
    public ROW getFirstRecord(Connection p_conn, String p_where,
            String p_orderBy, Class<ROW> p_rowClass) throws Exception {

        String l_sql = "SELECT * FROM " + getSqlName();
        if (p_where != null) {
            l_sql += " WHERE " + p_where;
        } // end if
        if (p_orderBy != null) {
            l_sql += " ORDER BY " + p_orderBy;
        } // end if
        if (m_debug) {
            System.out.println("ORM-DEBUG: " + l_sql);
        } // end if
        Statement l_stmt = p_conn.createStatement();
        ResultSet l_rs = l_stmt.executeQuery(l_sql);

        ROW l_toReturn = null;

        if (l_rs.next()) {
            l_toReturn = p_rowClass.newInstance();
            l_toReturn.serializeFrom(l_rs);
        } // end if
        l_rs.close();
        l_stmt.close();

        if (m_debug) {
            System.out.println("ORM-DEBUG: " + (l_toReturn != null
                    ? "First record found" : "First record not found"));
        } // end if

        return l_toReturn;
    }
}
