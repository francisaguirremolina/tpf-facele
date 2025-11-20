package com.epidata.facele.ws.jsonmodel;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 */
public class ReimportResponseModel {

    private String m_entity;
    private int m_inserted;
    private int m_updated;
    private int m_deleted;

    public String getEntity() {
        return m_entity;
    }

    public void setEntity(String p_entity) {
        this.m_entity = p_entity;
    }

    public int getInserted() {
        return m_inserted;
    }

    public void setInserted(int p_inserted) {
        this.m_inserted = p_inserted;
    }

    public int getUpdated() {
        return m_updated;
    }

    public void setUpdated(int p_updated) {
        this.m_updated = p_updated;
    }

    public int getDeleted() {
        return m_deleted;
    }

    public void setDeleted(int p_deleted) {
        this.m_deleted = p_deleted;
    }

    public void incrementInserted(boolean p_mustIncrement) {
        if (p_mustIncrement) {
            setInserted(getInserted() + 1);
        } // end if
    }

    public void incrementUpdated(boolean p_mustIncrement) {
        if (p_mustIncrement) {
            setUpdated(getUpdated() + 1);
        } // end if
    }

    public void incrementDeleted(boolean p_mustIncrement) {
        if (p_mustIncrement) {
            setDeleted(getDeleted() + 1);
        } // end if
    }
}
