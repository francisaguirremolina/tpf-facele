package com.epidata.facele.tickets;

import com.epidata.facele.ws.arca.wsfev1.FEAuthRequest;
import com.epidata.facele.ws.arca.wsfev1.ObjectFactory;
import java.text.SimpleDateFormat;
import java.util.Date;
 
/**  
 *
 * @author Gustavo Sbrugnera, para EPIDATA Sbrugnera, para EPIDATA
 */
public class AccessTicket {

    /**
     *
     */
    private String m_token;

    /**
     *
     */
    private String m_sign;

    /**
     *
     */
    private long m_Cuit;

    /**
     *
     */
    private Date m_solicitud;

    /**
     *
     */
    private Date m_vencimiento;

    /**
     * Get the value of m_solicitud
     *
     * @return the value of m_solicitud
     */
    public Date getSolicitud() {
        return m_solicitud;
    }

    /**
     * Set the value of m_solicitud
     *
     * @param p_solicitud new value of m_solicitud
     */
    public void setSolicitud(Date p_solicitud) {
        this.m_solicitud = p_solicitud;
    }

    /**
     * Get the value of m_vencimiento
     *
     * @return the value of m_vencimiento
     */
    public Date getVencimiento() {
        return m_vencimiento;
    }

    /**
     * Set the value of m_vencimiento
     *
     * @param p_vencimiento new value of m_vencimiento
     */
    public void setVencimiento(Date p_vencimiento) {
        this.m_vencimiento = p_vencimiento;
    }

    /**
     * Get the value of m_Cuit
     *
     * @return the value of m_Cuit
     */
    public long getCuit() {
        return m_Cuit;
    }

    /**
     * Set the value of m_Cuit
     *
     * @param p_Cuit new value of m_Cuit
     */
    public void setCuit(long p_Cuit) {
        this.m_Cuit = p_Cuit;
    }

    /**
     * Get the value of m_sign
     *
     * @return the value of m_sign
     */
    public String getSign() {
        return m_sign;
    }

    /**
     * Set the value of m_sign
     *
     * @param p_sign new value of m_sign
     */
    public void setSign(String p_sign) {
        this.m_sign = p_sign;
    }

    /**
     * Get the value of m_token
     *
     * @return the value of m_token
     */
    public String getToken() {
        return m_token;
    }

    /**
     * Set the value of m_token
     *
     * @param p_token new value of m_token
     */
    public void setToken(String p_token) {
        this.m_token = p_token;
    }

    /**
     *
     * @return
     */
    public FEAuthRequest getAuthRequest() {
        FEAuthRequest l_toReturn
                = new ObjectFactory().createFEAuthRequest();
        l_toReturn.setCuit(getCuit());
        l_toReturn.setSign(getSign());
        l_toReturn.setToken(getToken());
        return l_toReturn;
    }

    /**
     *
     * @return
     */
    public com.epidata.facele.ws.arca.wscdc.CmpAuthRequest getCDCAuthRequest() {

        com.epidata.facele.ws.arca.wscdc.CmpAuthRequest l_toReturn
                = new com.epidata.facele.ws.arca.wscdc.ObjectFactory()
                        .createCmpAuthRequest();
        l_toReturn.setCuit(getCuit());
        l_toReturn.setSign(getSign());
        l_toReturn.setToken(getToken());
        return l_toReturn;
    }

    /**
     *
     * @return
     */
    public com.epidata.facele.ws.arca.wsfexv1.ClsFEXAuthRequest getWSFEXAuthRequest() {

        com.epidata.facele.ws.arca.wsfexv1.ClsFEXAuthRequest l_toReturn
                = new com.epidata.facele.ws.arca.wsfexv1.ObjectFactory()
                        .createClsFEXAuthRequest();
        l_toReturn.setCuit(getCuit());
        l_toReturn.setSign(getSign());
        l_toReturn.setToken(getToken());
        return l_toReturn;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        SimpleDateFormat l_formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String l_strSolicitud = (getSolicitud() == null)
                ? "NULL" : l_formatter.format(getSolicitud());
        String l_strVencimiento = (getVencimiento() == null)
                ? "NULL" : l_formatter.format(getVencimiento());

        return String.format("AccessTicket(cuit=%d, solicitud=%s, vencimiento=%s)",
                getCuit(), l_strSolicitud, l_strVencimiento);
    }
    
    public String asAuth() {
        StringBuilder l_toReturn = new StringBuilder();
        l_toReturn.append("<Auth>");
        l_toReturn.append("<Token>");
        l_toReturn.append(getToken());
        l_toReturn.append("</Token>");
        l_toReturn.append("<Sign>");
        l_toReturn.append(getSign());
        l_toReturn.append("</Sign>");
        l_toReturn.append("<Cuit>");
        l_toReturn.append(getCuit());
        l_toReturn.append("</Cuit>");
        l_toReturn.append("</Auth>");
        
        return l_toReturn.toString();
    }
}
