package com.epidata.facele.orm;

/**
 *
 * * @author Gustavo Sbrugnera, para EPIDATA
 * @param <PK>
 */
public interface SinglePkRecord<PK> {

    /**
     *
     * @return
     */
    public PK getId();

}
