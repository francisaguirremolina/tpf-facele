package com.epidata.facele.tickets;

import com.epidata.facele.ws.arca.wsaa.LoginCMS;
import com.epidata.facele.ws.arca.wsaa.LoginCMSService;
import jakarta.xml.ws.BindingProvider;
import java.io.ByteArrayInputStream;
import java.security.cert.X509Certificate;
import java.util.Date;

import java.io.Reader;
import java.io.StringReader;
import java.security.PrivateKey;
import java.security.Security;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.dom4j.Document;
import org.dom4j.io.SAXReader;

import org.bouncycastle.cms.CMSSignedDataGenerator;
import org.bouncycastle.cms.CMSProcessableByteArray;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;
import org.bouncycastle.cms.jcajce.JcaSignerInfoGeneratorBuilder;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Base64;
/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA Sbrugnera, para EPIDATA
 */
public class WSAALoginProvider {

    /**
     * Create the CMS Message
     *
     * @param p_certString
     * @param p_privateKeyString
     * @param p_service
     * @param p_expTime
     * @param p_genTime
     * @return
     * @throws java.lang.Exception
     */
    private static byte[] createCms(String p_certString,
            String p_privateKeyString,
            WSType p_service,
            Date p_genTime,
            Date p_expTime) throws Exception {

        Security.addProvider(new BouncyCastleProvider());
        
        // Generate X509 Certificate from string
        X509Certificate l_certificate = loadCertificate(p_certString);

        // Generate PrivateKey from string
        PrivateKey l_privateKey = loadPrivateKey(p_privateKeyString);

        // Create XML Message
        String l_loginTicketRequest_xml = createLoginTicketRequest(
                p_service, p_genTime, p_expTime);

        // Generate CMS signed data
        byte[] l_cmsData = createSignedCMS(l_certificate, l_privateKey, l_loginTicketRequest_xml);

        // Output the CMS data 
        return l_cmsData;
    }

    private static X509Certificate loadCertificate(String p_certString) throws CertificateException {
        String l_sanitized = p_certString.replaceAll("(?m)^(?:[ \\t]*)?(?:-----BEGIN CERTIFICATE-----|-----END CERTIFICATE-----)$", "").replaceAll("\\s", "");
        byte[] l_certBytes = java.util.Base64.getDecoder().decode(l_sanitized);
        CertificateFactory l_factory = CertificateFactory.getInstance("X.509");
        return (X509Certificate) l_factory.generateCertificate(new ByteArrayInputStream(l_certBytes));
    }

    private static PrivateKey loadPrivateKey(String p_privateKeyString) throws Exception {
        // Implementation depends on the key format (PKCS#8 or PKCS#1)
        // Here, assuming PKCS#8 PEM format
        String l_sanitized = p_privateKeyString.replaceAll("(?m)^(?:[ \\t]*)?(?:-----BEGIN (?:RSA|PRIVATE) KEY-----|-----END (?:RSA|PRIVATE) KEY-----)$", "").replaceAll("\\s", "");
        byte[] l_keyBytes = java.util.Base64.getDecoder().decode(l_sanitized);

        // Use PKCS8EncodedKeySpec with the key bytes
        java.security.spec.PKCS8EncodedKeySpec l_keySpec = new java.security.spec.PKCS8EncodedKeySpec(l_keyBytes);
        java.security.KeyFactory l_keyFactory = java.security.KeyFactory.getInstance("RSA");
        return l_keyFactory.generatePrivate(l_keySpec);
    }
    
    private static byte[] createSignedCMS(X509Certificate p_cert, PrivateKey p_privateKey,
            String p_message) throws Exception {

        CMSSignedDataGenerator l_generator = new CMSSignedDataGenerator();

        // Add signer info
        ContentSigner l_signer = new JcaContentSignerBuilder("SHA256withRSA").build(p_privateKey);
        l_generator.addSignerInfoGenerator(new JcaSignerInfoGeneratorBuilder(
                new JcaDigestCalculatorProviderBuilder().build())
                .build(l_signer, p_cert));

        // Add certificate
        l_generator.addCertificate(new JcaX509CertificateHolder(p_cert));

        // Create CMS data
        CMSProcessableByteArray l_message = new CMSProcessableByteArray(p_message.getBytes());
        return l_generator.generate(l_message, true).getEncoded();
    }
    
    
    /**
     *
     * @param p_service
     * @param p_genTime
     * @param p_expTime
     * @return
     */
    private static String createLoginTicketRequest(WSType p_service,
            Date p_genTime,
            Date p_expTime) {
        DateFormat l_xmlDateFormatter = new SimpleDateFormat(
                "yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        String l_XMLGenTime = l_xmlDateFormatter.format(p_genTime);
        String l_XMLExpTime = l_xmlDateFormatter.format(p_expTime);

        String l_uniqueId = Long.toString(p_genTime.getTime() / 1000);

        String l_loginTicketRequest_xml
                = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"
                + "<loginTicketRequest version=\"1.0\">"
                + "<header>"
                + "<uniqueId>" + l_uniqueId + "</uniqueId>"
                + "<generationTime>" + l_XMLGenTime + "</generationTime>"
                + "<expirationTime>" + l_XMLExpTime + "</expirationTime>"
                + "</header>"
                + "<service>" + p_service + "</service>"
                + "</loginTicketRequest>";

        return l_loginTicketRequest_xml;
    }

    /**
     *
     * @param p_loginTicketRequestXmlCms
     * @param p_endpoint
     * @return
     * @throws Exception
     */
    private static String invokeWsaa2(byte[] p_loginTicketRequestXmlCms,
            String p_endpoint) throws Exception {

        String l_cmsEncoded = new String(Base64.encode(p_loginTicketRequestXmlCms));
        
        LoginCMSService l_service = new LoginCMSService();
        
        LoginCMS l_soap = l_service.getLoginCms();

        ((BindingProvider) l_soap).getRequestContext()
                .put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
                        p_endpoint);

        String l_loginTicketResponse = l_soap.loginCms(l_cmsEncoded);
        return l_loginTicketResponse;
    }

    /**
     *
     */
    private String m_certificateString;
    /**
     *
     */
    private Date m_genTime;

    /**
     *
     */
    private String m_privateKeyString;
    /**
     *
     */
    private String m_proxyHost;
    /**
     *
     */
    private String m_proxyPort;

    /**
     *
     */
    private int m_ticketLive;

    /**
     *
     */
    private WSType m_wsName;

    /**
     *
     */
    private int m_wsTimeout;

    /**
     *
     */
    private String m_wsaaEndPoint;

    /**
     *
     */
    public WSAALoginProvider() {
    }

    /**
     * Get the value of m_certificateString
     *
     * @return the value of m_certificateString
     */
    public String getCertificateString() {
        return m_certificateString;
    }

    /**
     *
     * @return
     */
    public Date getExpirationTime() {
        if (getGenTime() == null) {
            return null;
        } // end if
        return new Date(getGenTime().getTime() + getTicketLive() * 1000L);
    }

    /**
     * Get the value of m_genTime
     *
     * @return the value of m_genTime
     */
    public Date getGenTime() {
        return m_genTime;
    }

    /**
     * Get the value of m_privateKeyString
     *
     * @return the value of m_privateKeyString
     */
    public String getPrivateKeyString() {
        return m_privateKeyString;
    }

    /**
     * Get the value of m_proxyHost
     *
     * @return the value of m_proxyHost
     */
    public String getProxyHost() {
        return m_proxyHost;
    }

    /**
     * Get the value of m_proxyPort
     *
     * @return the value of m_proxyPort
     */
    public String getProxyPort() {
        return m_proxyPort;
    }

    /**
     * Get the value of m_ticketLive
     *
     * @return the value of m_ticketLive
     */
    public int getTicketLive() {
        return m_ticketLive;
    }

    /**
     * Get the value of m_wsName
     *
     * @return the value of m_wsName
     */
    public WSType getWsName() {
        return m_wsName;
    }

    /**
     *
     * @return
     */
    public int getWsTimeout() {
        return m_wsTimeout;
    }

    /**
     * Get the value of m_wsaaEndPoint
     *
     * @return the value of m_wsaaEndPoint
     */
    public String getWsaaEndPoint() {
        return m_wsaaEndPoint;
    }

    /**
     * Devuelve un nuevo ticket desde ARCA. Solo contiene los atributos:
     * "solicitud", "sign" y "token" No tiene los atributos: "Cuit",
     * "vencimiento"
     *
     * @return
     * @throws java.lang.Exception
     */
    public AccessTicket request() throws Exception {
        try {
            AccessTicket l_toReturn = new AccessTicket();

            if (getProxyHost() != null) {
                System.setProperty("http.proxyHost", getProxyHost());
                System.setProperty("http.proxyPort", getProxyPort());
            } // end if

            byte[] l_loginTicketRequest_xml_cms
                    = createCms(getCertificateString(),
                            getPrivateKeyString(),
                            getWsName(),
                            getGenTime(),
                            getExpirationTime());

            // Invoke AFIP wsaa and get LoginTicketResponse
            String l_loginTicketResponse = invokeWsaa2(l_loginTicketRequest_xml_cms,
                    m_wsaaEndPoint);
            // Get token & sign from LoginTicketResponse
            Reader l_tokenReader = new StringReader(l_loginTicketResponse);

            Document l_tokenDoc = new SAXReader(false).read(l_tokenReader);

            String l_token = l_tokenDoc.valueOf(
                    "/loginTicketResponse/credentials/token");
            String l_sign = l_tokenDoc.valueOf(
                    "/loginTicketResponse/credentials/sign");

            l_toReturn.setSolicitud(new Date());
            l_toReturn.setSign(l_sign);
            l_toReturn.setToken(l_token);

            return l_toReturn;
        } catch (java.net.SocketTimeoutException l_ex) {
            throw new java.net.SocketTimeoutException("Límite de tiempo ("
                    + (getWsTimeout() / 1000.0)
                    + " seg) superado esperando la respuesta");
        }
    }

    /**
     * Set the value of m_certificateString
     *
     * @param certificateString new value of m_certificateString
     */
    public void setCertificateString(String certificateString) {
        this.m_certificateString = certificateString;
    }

    /**
     * Set the value of m_genTime
     *
     * @param genTime new value of m_genTime
     */
    public void setGenTime(Date genTime) {
        this.m_genTime = genTime;
    }

    /**
     * Set the value of m_privateKeyString
     *
     * @param privateKeyString new value of m_privateKeyString
     */
    public void setPrivateKeyString(String privateKeyString) {
        this.m_privateKeyString = privateKeyString;
    }

    /**
     * Set the value of m_proxyHost
     *
     * @param proxyHost new value of m_proxyHost
     */
    public void setProxyHost(String proxyHost) {
        this.m_proxyHost = proxyHost;
    }

    /**
     * Set the value of m_proxyPort
     *
     * @param proxyPort new value of m_proxyPort
     */
    public void setProxyPort(String proxyPort) {
        this.m_proxyPort = proxyPort;
    }

    /**
     * Set the value of m_ticketLive
     *
     * @param ticketLive new value of m_ticketLive
     */
    public void setTicketLive(int ticketLive) {
        this.m_ticketLive = ticketLive;
    }

    /**
     * Set the value of m_wsName
     *
     * @param p_wsName new value of m_wsName
     */
    public void setWsName(WSType p_wsName) {
        this.m_wsName = p_wsName;
    }

    /**
     *
     * @param p_wsTimeout
     */
    public void setWsTimeout(int p_wsTimeout) {
        this.m_wsTimeout = p_wsTimeout;
    }

    /**
     * Set the value of m_wsaaEndPoint
     *
     * @param endPoint new value of m_wsaaEndPoint
     */
    public void setWsaaEndPoint(String endPoint) {
        this.m_wsaaEndPoint = endPoint;
    }

    public enum WSType {
        wsfe, // Facturación electrónica local
        wsfex, // Facturación electrónica al exterior
        wscdc       // Constatación de comprobantes
    }

}
