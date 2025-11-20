package com.epidata.facele.etc;

import static com.epidata.facele.logger.FaceleLogger.log;
import com.epidata.facele.orm.OrmSupport;
import java.util.Date;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public class QueweResponse {

    private final String m_queweName;
    private final int m_batchSize;
    private final int m_ptoVta;
    
    private Date m_batchStart;
    private Date m_batchEnd;
    private int m_batchApproved;
    private int m_batchRejected;

    /**
     *
     * @param p_queweName
     * @param p_queweName
     * @param p_ptoVta
     * @param p_batchSize
     * @param p_batchSize
     * @param p_ptoVta */
    public QueweResponse(String p_queweName, int p_batchSize, int p_ptoVta) {
        m_queweName = p_queweName;
        m_batchSize = p_batchSize;
        m_ptoVta = p_ptoVta;
        
        setBatchStart(new Date());
    }
    
    /**
     *
     * @return
     */
    public String getQueweName() {
        return m_queweName;
    }

    /**
     *
     * @return
     */
    public Date getBatchStart() {
        return m_batchStart;
    }

    /**
     *
     * @param p_batchStart
     */
    public void setBatchStart(Date p_batchStart) {
        this.m_batchStart = p_batchStart;
    }

    /**
     *
     * @return
     */
    public Date getBatchEnd() {
        return m_batchEnd;
    }

    /**
     *
     * @param p_batchEnd
     */
    public void setBatchEnd(Date p_batchEnd) {
        this.m_batchEnd = p_batchEnd;
    }

    /**
     *
     * @return
     */
    public int getBatchSize() {
        return m_batchSize;
    }

    /**
     *
     * @return
     */
    public int getBatchApproved() {
        return m_batchApproved;
    }

    /**
     *
     * @param p_batchApproved
     */
    public void setBatchApproved(int p_batchApproved) {
        this.m_batchApproved = p_batchApproved;
    }

    /**
     *
     * @return
     */
    public int getBatchRejected() {
        return m_batchRejected;
    }

    /**
     *
     * @param p_batchRejected
     */
    public void setBatchRejected(int p_batchRejected) {
        this.m_batchRejected = p_batchRejected;
    }

    /**
     *
     * @return
     */
    public int getPtoVta() {
        return m_ptoVta;
    }

    
    /**
     *
     * @param p_endpoint
     * @param p_qResponse
     * @throws Exception
     */
    public static void notifyBatchFinished(String p_endpoint, QueweResponse p_qResponse) throws Exception {
        
        p_qResponse.setBatchEnd(new Date());
        String l_json = OrmSupport.asJSON(p_qResponse);

        log("Notificando en " + p_endpoint + " la finalización del lote, informando: " + l_json);
        if (p_endpoint == null) {
            // No hay notificación.
            return;
        } // end if

        HttpClient l_httpClient = HttpClientBuilder.create().build();
        HttpPost l_request = new HttpPost(p_endpoint);
        StringEntity l_params = new StringEntity(l_json);
        l_request.addHeader("content-type", "application/json");
        l_request.setEntity(l_params);
        HttpResponse l_response = l_httpClient.execute(l_request);

        log("Notificación concluida. Respuesta obtenida: " + l_response.getStatusLine());
    }

    
}
