package com.epidata.facele.orm;

import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * * @author Gustavo Sbrugnera, para EPIDATA
 * @param <ROW>
 */
public abstract class AbstractTable<ROW extends AbstractRecord> extends AbstractRelation<ROW> {

    /**
     *
     * @param p_type
     */
    public AbstractTable(Class<ROW> p_type) {
        super(p_type);
    }

    /**
     *
     * @param p_type
     * @param p_rs
     * @throws Exception
     */
    public AbstractTable(Class<ROW> p_type, ResultSet p_rs) throws Exception {
        super(p_type, p_rs);
    }

    /**
     *
     * @param p_type
     * @param p_conn
     * @param p_where
     * @param p_orderBy
     * @throws Exception
     */
    public AbstractTable(Class<ROW> p_type, Connection p_conn, String p_where,
            String p_orderBy) throws Exception {
        super(p_type, p_conn, p_where, p_orderBy);
    }

    /**
     *
     * @param p_conn
     * @param p_rec
     * @return
     * @throws Exception
     */
    public Object executeSPIR(Connection p_conn, ROW p_rec) throws Exception {
        throw new RuntimeException("Not implemented.");
    }

    /**
     *
     * @param p_conn
     * @param p_rec
     * @return
     * @throws Exception
     */
    public int executeSPUR(Connection p_conn, ROW p_rec) throws Exception {
        throw new RuntimeException("Not implemented.");
    }
    
    /**
     *
     * @param p_conn
     * @param p_Id
     * @throws Exception
     */
    public void executeSPD(Connection p_conn, Object p_Id) throws Exception {
        throw new RuntimeException("Not implemented.");
    }

}
