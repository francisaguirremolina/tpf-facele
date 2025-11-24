package com.epidata.facele.etc;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public class SafeDelayTool {

    /**
     *
     * @param p_millis
     */
    public static void safeDelay(int p_millis) {
        try {
            Thread.sleep(p_millis);
        } catch (Exception l_ex) {
            // Nada por hacer.
        }
    }

}
