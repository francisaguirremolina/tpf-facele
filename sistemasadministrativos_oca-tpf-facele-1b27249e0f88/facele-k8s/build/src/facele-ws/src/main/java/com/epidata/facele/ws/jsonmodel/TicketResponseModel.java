package com.epidata.facele.ws.jsonmodel;

import com.epidata.facele.entities.TR_FECuits;
import com.epidata.facele.tickets.WSAALoginProvider.WSType;
import static com.epidata.facele.tickets.WSAALoginProvider.WSType.wscdc;
import java.util.Date;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public class TicketResponseModel {

    private String m_sign;

    private String m_token;

    private Date m_vencimiento;

    private String m_wsname;

    /**
     * Get the value of wsType
     *
     * @return the value of wsType
     */
    public String getWsname() {
        return m_wsname;
    }

    /**
     * Set the value of wsType
     *
     * @param p_wsname new value of wsType
     */
    public void setWsname(String p_wsname) {
        this.m_wsname = p_wsname;
    }

    /**
     * Get the value of vencimiento
     *
     * @return the value of vencimiento
     */
    public Date getVencimiento() {
        return m_vencimiento;
    }

    /**
     * Set the value of vencimiento
     *
     * @param p_vencimiento new value of vencimiento
     */
    public void setVencimiento(Date p_vencimiento) {
        this.m_vencimiento = p_vencimiento;
    }

    /**
     * Get the value of token
     *
     * @return the value of token
     */
    public String getToken() {
        return m_token;
    }

    /**
     * Set the value of token
     *
     * @param p_token new value of token
     */
    public void setToken(String p_token) {
        this.m_token = p_token;
    }

    /**
     * Get the value of sign
     *
     * @return the value of sign
     */
    public String getSign() {
        return m_sign;
    }

    /**
     * Set the value of sign
     *
     * @param p_sign new value of sign
     */
    public void setSign(String p_sign) {
        this.m_sign = p_sign;
    }

    public TicketResponseModel() {

    }

    public TicketResponseModel(WSType p_wsName, TR_FECuits p_src) {
        setWsname(p_wsName.toString());
        switch (p_wsName) {
            case wscdc: {
                m_sign = p_src.getSignCDC();
                m_token = p_src.getTokenCDC();
                m_vencimiento = p_src.getVencimientoCDC();
            }
            break;
            case wsfe: {
                m_sign = p_src.getSign();
                m_token = p_src.getToken();
                m_vencimiento = p_src.getVencimiento();
            }
            break;
            case wsfex: {
                m_sign = p_src.getSignFEX();
                m_token = p_src.getTokenFEX();
                m_vencimiento = p_src.getVencimientoFEX();
            }
            break;
        }
    }
}
