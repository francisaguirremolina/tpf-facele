package com.epidata.facele.ws;

import com.epidata.facele.ws.jsonmodel.ReimportResponseModel;
import com.epidata.facele.entities.TR_FECbteTipos;
import com.epidata.facele.entities.T_FECbteTipos;
import com.epidata.facele.orm.AbstractRecord;
import com.epidata.facele.orm.AbstractTable;
import com.epidata.facele.orm.OrmSupport;
import com.epidata.facele.orm.SinglePkRecord;
import com.epidata.facele.ws.arca.wsfev1.AbstractArcaModel;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Gustavo Sbrugnera, para EPIDATA
 * @param <TABLE>
 * @param <RECORD>
 * @param <ARCAMODEL>
 */
public abstract class AbstractReimporter<TABLE extends AbstractTable, 
        RECORD extends AbstractRecord, 
        ARCAMODEL extends AbstractArcaModel> {

    private String m_entityName;

    public String getEntityName() {
        return m_entityName;
    }

    public void setEntityName(String p_entityName) {
        this.m_entityName = p_entityName;
    }

    public AbstractReimporter(String p_entityName) {
        m_entityName = p_entityName;
    }

    public Map<String, RECORD> makeRecordMap(List<RECORD> p_recordList) {
        Map<String, RECORD> l_recordMap = new HashMap<>();
        for (RECORD l_record : p_recordList) {
            l_recordMap.put(((SinglePkRecord) l_record).getId().toString(), l_record);
        } // end for

        return l_recordMap;
    }

    public Map<String, ARCAMODEL> makeArcaMap(List<ARCAMODEL> p_arcaList) {
        
        Map<String, ARCAMODEL> l_arcaMap = new HashMap<>();
        for (ARCAMODEL l_arca : p_arcaList) {
            // A veces, el JSON de ARCA incluye elementos null, como en la lista
            // de unidades de medida en el ambiente de homologación
            if (l_arca == null) {
                continue;
            } // end if
            
            l_arcaMap.put(l_arca.getModelId().toString(), l_arca);
        } // end for

        return l_arcaMap;
    }

    public Response reimport(
            Connection p_conn,
            String p_entityName,
            List<ARCAMODEL> p_arcaList,
            TABLE p_table,
            Class<RECORD> p_recordClass
    ) throws Exception {
        try {
            p_table.serializeFrom(p_conn, null, null);
            List<RECORD> l_recordList = p_table.getRows();

            // Construye ambos mapas
            Map<String, ARCAMODEL> l_arcaMap = makeArcaMap(p_arcaList);
            Map<String, RECORD> l_recordMap = makeRecordMap(l_recordList);

            ReimportResponseModel l_response = new ReimportResponseModel();
            l_response.setEntity(p_entityName);

            // 1. Borra los que sobran en recordList
            for (RECORD l_record : l_recordMap.values()) {
                l_response.incrementDeleted(
                        reimportDelete(p_conn, l_record, l_arcaMap, p_table));
            } // end for

            // 2. Actualiza los que existen en ambas listas
            for (ARCAMODEL l_arca : l_arcaMap.values()) {
                l_response.incrementUpdated(
                        reimportUpdate(p_conn, l_arca, l_recordMap, p_table));
            } // end for
            // 3. Agrega los que faltan en recordList
            for (ARCAMODEL l_arca : l_arcaMap.values()) {
                l_response.incrementInserted(
                        reimportInsert(p_conn, l_arca, l_recordMap, p_table, p_recordClass));
            } // end for

            return Response
                    .ok(OrmSupport.asJSON(l_response), MediaType.APPLICATION_JSON_TYPE)
                    .build();
        } catch (Exception l_ex) {
            throw l_ex;
        }
    }

    public boolean canDelete(RECORD p_record) {
        return true;
    }
    
    public boolean reimportDelete(Connection p_conn, RECORD p_record,
            Map<String, ARCAMODEL> p_arcaList,
            TABLE p_table) throws Exception {
        String l_pk = ((SinglePkRecord) p_record).getId().toString();
        if (p_arcaList.containsKey(l_pk)) {
            // La lista ARCA contiene el elemento en la base de datos; no lo elimina
            return false;
        } // end if
        if (!canDelete(p_record)) {
            return false;
        } // end if
        // elimina
        p_table.executeSPD(p_conn, l_pk);
        return true;
    }

    public boolean reimportInsert(Connection p_conn, ARCAMODEL p_arca,
            Map<String, RECORD> p_recordList,
            TABLE p_table,
            Class<RECORD> p_recordClass) throws Exception {

        if (p_recordList.containsKey(p_arca.getModelId().toString())) {
            // La base de datos ya contiene el elemento ARCA
            return false;
        } // end if
        // agrega
        RECORD l_record = p_recordClass.newInstance();
        updateRecord(l_record, p_arca);

        p_table.executeSPIR(p_conn, l_record);

        return true;
    }

    public boolean reimportUpdate(Connection p_conn, ARCAMODEL p_arca,
            Map<String, RECORD> p_recordList, TABLE p_table) throws Exception {
        RECORD l_record = p_recordList.get(p_arca.getModelId().toString());
        if (!p_recordList.containsKey(p_arca.getModelId().toString())) {
            // La base de datos no contiene el elemento ARCA
            return false;
        } // end if
        // actualiza registro
        updateRecord(l_record, p_arca);

        int l_updated = p_table.executeSPUR(p_conn, l_record);

        return (l_updated > 0);

    }

    public abstract void updateRecord(RECORD p_record, ARCAMODEL p_arca)
            throws Exception;

}
