package com.epidata.facele.orm;

import java.sql.ResultSet;

/**
 *
 * * @author Gustavo Sbrugnera, para EPIDATA
 */
public abstract class AbstractRecord {

    /**
     *
     * @param p_rs
     * @throws Exception
     */
    abstract public void serializeFrom(ResultSet p_rs) throws Exception;

}
