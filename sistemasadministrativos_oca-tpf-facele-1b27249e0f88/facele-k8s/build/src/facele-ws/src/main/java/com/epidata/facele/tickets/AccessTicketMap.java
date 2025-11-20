package com.epidata.facele.tickets;

import com.epidata.facele.conf.GlobalConf;
import com.epidata.facele.entities.TR_FECuits;
import com.epidata.facele.entities.T_FECuits;
import static com.epidata.facele.logger.FaceleLogger.log;
import com.epidata.facele.tickets.WSAALoginProvider.WSType;
import static com.epidata.facele.tickets.WSAALoginProvider.WSType.wscdc;
import java.sql.Connection;
import java.sql.Timestamp;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Administra un mapa en memoria con los tickes de acceso a los WS de ARCA.
 * Mantiene ese mapa sincronizado con la tabla "facele.t_FECuits" de la base de
 * datos.
 *
 * @author Gustavo Sbrugnera, para EPIDATA Sbrugnera, para EPIDATA
 */
public class AccessTicketMap {

    /**
     *
     * Mapa de pares [wsname+cuit, ticket]
     */
    private static Map<String, AccessTicket> m_internalMap
            = new LinkedHashMap<>();

    /**
     * Devuelve un ticket. Primero busca en memoria. Si encuentra uno, lo
     * valida. Si es válido, lo devuelve. Si no, solicita uno nuevo.
     *
     * Si no encuentra en memoria, busca en la base de datos un ticket válido.
     * Si lo encuentra, lo registra y devuelve. Si no, solicita uno nuevo.
     *
     * @param p_wsName
     * @param p_cuit
     * @param p_conn
     * @param p_conf
     * @return
     * @throws Exception
     */
    public static AccessTicket getValidTicketFor(WSType p_wsName, long p_cuit,
            Connection p_conn, GlobalConf p_conf) throws Exception {

        try {
            AccessTicket l_toReturn = m_internalMap.get(p_wsName.toString() + p_cuit);
            if (l_toReturn == null) {
                // No hay ticket en memoria.
                // Solicita un nuevo ticket (o reutiliza desde la base de datos). 
                // Lo agrega en el mapa y retorna
                l_toReturn = reuseOrRequestNewTicket(p_wsName, p_cuit, p_conn, p_conf);
                return l_toReturn;
            } // end if

            // Ya hay un ticket en memoria. Verifica si el ticket no está vencido.
            if (l_toReturn.getVencimiento().before(new Date())) {
                // Ticket vencido. Primero, por seguridad, lo olvida de la memoria.
                log("El ticket en memoria para CUIT: " + p_cuit + " venció el: "
                        + l_toReturn.getVencimiento());

                addTicketFor(p_wsName, p_cuit, null);
                // Segundo, obtiene uno nuevo. 
                l_toReturn = reuseOrRequestNewTicket(p_wsName, p_cuit, p_conn, p_conf);
                return l_toReturn;
            } // end if

            // Ticket vigente.
            return l_toReturn;
        } catch (Exception l_ex) {
            log(l_ex);
            throw (l_ex);
        }
    }

    /**
     * Agrega (o quita) un ticket de memoria
     *
     * @param p_wsName
     * @param p_cuit
     * @param p_ticket
     */
    private static void addTicketFor(WSType p_wsName, long p_cuit,
            AccessTicket p_ticket) {
        if (p_ticket == null) {
            // Quita del mapa
            m_internalMap.remove(p_wsName.toString() + p_cuit);
        } else {
            m_internalMap.put(p_wsName.toString() + p_cuit, p_ticket);
        }
    }

    private static AccessTicket makeValidAccessTicketFromRecord(
            WSType p_wsName, TR_FECuits p_row) {

        String l_sign = null;
        String l_token = null;
        Timestamp l_vencimiento = null;

        switch (p_wsName) {
            case wscdc: {
                l_sign = p_row.getSignCDC();
                l_token = p_row.getTokenCDC();
                l_vencimiento = p_row.getVencimientoCDC();
            }
            break;
            case wsfe: {
                l_sign = p_row.getSign();
                l_token = p_row.getToken();
                l_vencimiento = p_row.getVencimiento();
            }
            break;
            case wsfex: {
                l_sign = p_row.getSignFEX();
                l_token = p_row.getTokenFEX();
                l_vencimiento = p_row.getVencimientoFEX();
            }
            break;
        } // end switch

        if (p_row.getCuit() == null
                || p_row.getCertificado() == null
                || p_row.getClavePrivada() == null
                || p_row.getTicketLive() == null
                || l_sign == null
                || l_token == null
                || l_vencimiento == null) {
            // Registro incompleto
            return null;
        } // end if

        Timestamp l_now = new Timestamp(new Date().getTime());
        if (l_now.after(l_vencimiento)) {
            // Ticket vencido
            log("El ticket en la base de datos está vencido, para CUIT: "
                    + p_row.getCuit() + " venció en: " + l_vencimiento);
            return null;
        } // end if

        AccessTicket l_toReturn = new AccessTicket();
        l_toReturn.setCuit(p_row.getCuit());
        l_toReturn.setSign(l_sign);
        l_toReturn.setToken(l_token);
        l_toReturn.setVencimiento(l_vencimiento);

        return l_toReturn;
    }

    /**
     * Si encuentra un ticket válido en la base de datos, lo registra en memoria
     * y lo devuelve.
     *
     * Si no, fuerza la obtención de un nuevo ticket, lo guarda en el mapa y lo
     * almacena en la base de datos
     *
     * @param p_wsName
     * @param p_cuit
     * @param p_conn
     * @param p_conf
     * @param p_reuseSaved
     * @return
     * @throws Exception
     */
    private static AccessTicket reuseOrRequestNewTicket(WSType p_wsName,
            long p_cuit, Connection p_conn, GlobalConf p_conf) throws Exception {
        T_FECuits l_table = new T_FECuits(p_conn, "Cuit=" + p_cuit, null);
        if (l_table.getRows().isEmpty()) {
            throw new Exception(
                    "No se encontró la configuración para el CUIT "
                    + p_cuit + " en la tabla facele.t_FECuits");

        } // end if

        TR_FECuits l_row = l_table.getRows().get(0);
        AccessTicket l_ticket = makeValidAccessTicketFromRecord(p_wsName, l_row);
        if (l_ticket == null) {
            // El ticket en la BdD no es válido. Solicita nuevo a ARCA
            l_ticket = makeTicketFromProvider(p_conn, p_conf, l_row,
                    p_wsName);
        } else {
            // El ticket en la BdD es válido. Reutiliza.
            log("Reutilizando el ticket en base de datos para CUIT: "
                    + l_row.getCuit() + ", vencimiento: " + l_ticket.getVencimiento());
        } // end if

        addTicketFor(p_wsName, p_cuit, l_ticket);
        return l_ticket;

    }

    /**
     * Solicita un nuevo ticket en ARCA y lo registra en la base de datos
     *
     * @return
     * @throws Exception
     */
    private static AccessTicket makeTicketFromProvider(Connection p_conn,
            GlobalConf p_conf, TR_FECuits p_row, WSType p_wsName)
            throws Exception {

        log("Solicitando ticket en ARCA para CUIT: " + p_row.getCuit());
        if (p_row.getCuit() == null) {
            throw new Exception("CUIT no indicado");
        } // end if
        if (p_row.getClavePrivada() == null) {
            throw new Exception("Clave privada no provista");
        } // end if
        if (p_row.getCertificado() == null) {
            throw new Exception("Certificado no provisto");
        } // end if
        if (p_row.getTicketLive() == null) {
            throw new Exception("TicketLive no indicado");
        } // end if

        Date l_thisServerTime = new Date();

        // Atrasa 5 minutos
        // @since 2022-04-19
        long l_leapTime = 5 * 60 * 1000; // retrasa 5 minutos
        l_thisServerTime = new Date(l_thisServerTime.getTime() - l_leapTime);

        // Hay que solicitar uno nuevo.
        WSAALoginProvider l_login = new WSAALoginProvider();

        l_login.setCertificateString(p_row.getCertificado());
        l_login.setWsaaEndPoint(p_conf.m_WSAAEndpoint);
        l_login.setPrivateKeyString(p_row.getClavePrivada());
        l_login.setProxyHost(p_conf.m_ProxyHost);
        l_login.setProxyPort(p_conf.m_ProxyPort);
        l_login.setTicketLive(p_row.getTicketLive());
        l_login.setWsName(p_wsName);
        l_login.setGenTime(l_thisServerTime);
        l_login.setWsTimeout(p_conf.m_WSTimeout);

        AccessTicket l_ticket = l_login.request();
        l_ticket.setCuit(p_row.getCuit());
        Date l_vencimiento = new Date(l_ticket.getSolicitud().getTime()
                + p_row.getTicketLive() * 1000);

        l_ticket.setVencimiento(l_vencimiento);
        log("Ticket obtenido para CUIT: " + p_row.getCuit()
                + ", vencimiento: " + l_vencimiento);

        // Recuerda el ticket en la base de datos
        switch (p_wsName) {
            case wscdc: {
                p_row.setSignCDC(l_ticket.getSign());
                p_row.setTokenCDC(l_ticket.getToken());
                p_row.setVencimientoCDC(new Timestamp(l_ticket.getVencimiento().getTime()));
            }
            break;
            case wsfe: {
                p_row.setSign(l_ticket.getSign());
                p_row.setToken(l_ticket.getToken());
                p_row.setVencimiento(new Timestamp(l_ticket.getVencimiento().getTime()));
            }
            break;
            case wsfex: {
                p_row.setSignFEX(l_ticket.getSign());
                p_row.setTokenFEX(l_ticket.getToken());
                p_row.setVencimientoFEX(new Timestamp(l_ticket.getVencimiento().getTime()));
            }
            break;
        }

        (new T_FECuits()).executeSPUR(p_conn, p_row);
        log("Nuevo ticket " + p_wsName.toString() + " registrado en la base de datos para CUIT: "
                + p_row.getCuit());

        return l_ticket;

    }

    public static void forgetTicket(WSType p_wsName,
            long p_cuit) {
        addTicketFor(p_wsName, p_cuit, null);
    }
}
