package com.epidata.facele.orm;

/**
 *
 * * @author Gustavo Sbrugnera, para EPIDATA
 */
public class ModelException extends Exception {

    /**
     *
     * @param p_th
     */
    public ModelException(Throwable p_th) {
        super(extractUserMsg(p_th), p_th);
    }

    /**
     *
     * @param p_ex
     * @return
     */
    public static String extractUserMsg(Throwable p_ex) {
        if (p_ex == null) {
            return null;
        } // end if
        String l_msg = p_ex.getMessage();
        if (l_msg == null) {
            return null;
        } // end if
        int l_firstBrace = l_msg.indexOf('{');
        if (l_firstBrace < 0) {
            return null;
        } // end if
        int l_lastBrace = l_msg.lastIndexOf('}');
        if (l_lastBrace < 0) {
            return null;
        } // end if
        if (l_lastBrace <= l_firstBrace + 1) {
            return null;
        } // end if
        String l_toReturn = l_msg.substring(l_firstBrace + 1, l_lastBrace);
        return l_toReturn;
    }

}
