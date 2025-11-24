package com.epidata.facele.orm;

/**
 *
 * * @author Gustavo Sbrugnera, para EPIDATA
 */
public abstract class AbstractFunction {

    private static boolean m_debug = true;

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
        AbstractFunction.m_debug = p_debug;
    }

}
