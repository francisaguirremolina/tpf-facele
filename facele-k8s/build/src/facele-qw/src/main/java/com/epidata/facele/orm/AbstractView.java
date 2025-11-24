package com.epidata.facele.orm;

import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * * @author Gustavo Sbrugnera, para EPIDATA
 * @param <ROW>
 */
public abstract class AbstractView<ROW extends AbstractRecord> extends AbstractRelation<ROW> {

    /**
     *
     * @param p_type
     */
    public AbstractView(Class<ROW> p_type) {
        super(p_type);
    }

    /**
     *
     * @param p_type
     * @param p_rs
     * @throws Exception
     */
    public AbstractView(Class<ROW> p_type, ResultSet p_rs) throws Exception {
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
    public AbstractView(Class<ROW> p_type, Connection p_conn, String p_where,
            String p_orderBy) throws Exception {
        super(p_type, p_conn, p_where, p_orderBy);
    }

}
