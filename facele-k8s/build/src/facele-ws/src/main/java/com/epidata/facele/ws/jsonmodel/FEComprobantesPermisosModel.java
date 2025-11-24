package com.epidata.facele.ws.jsonmodel;

import com.epidata.facele.entities.TR_FEComprobantesOpc;
import com.epidata.facele.entities.TR_FEXPermisos;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public class FEComprobantesPermisosModel {

    private String m_codDespacho;

    public String getCodDespacho() {
        return m_codDespacho;
    }

    public void setCodDespacho(String p_codDespacho) {
        this.m_codDespacho = p_codDespacho;
    }

    public String getDestMercaderia() {
        return m_destMercaderia;
    }

    public void setDestMercaderia(String p_destMercaderia) {
        this.m_destMercaderia = p_destMercaderia;
    }
    private String m_destMercaderia;
    
    public FEComprobantesPermisosModel() {
    }

    public FEComprobantesPermisosModel(TR_FEXPermisos p_rec) {
        setCodDespacho(p_rec.getCodDespacho());
        // TO-DO setDestMercaderia(p_rec.getIdFEXDstPais());
    }

}
