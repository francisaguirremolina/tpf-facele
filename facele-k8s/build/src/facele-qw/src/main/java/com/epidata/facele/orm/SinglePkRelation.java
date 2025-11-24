package com.epidata.facele.orm;

/**
 *
 * * @author Gustavo Sbrugnera, para EPIDATA
 * @param <ID>
 */
public interface SinglePkRelation<ID> {

    /**
     *
     * @param p_id
     * @return
     */
    public AbstractRecord getById(ID p_id);
}
