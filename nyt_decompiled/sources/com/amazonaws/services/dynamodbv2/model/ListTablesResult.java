package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public class ListTablesResult implements Serializable {
    private String lastEvaluatedTableName;
    private List<String> tableNames;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListTablesResult)) {
            return false;
        }
        ListTablesResult listTablesResult = (ListTablesResult) obj;
        if ((listTablesResult.getTableNames() == null) ^ (getTableNames() == null)) {
            return false;
        }
        if (listTablesResult.getTableNames() != null && !listTablesResult.getTableNames().equals(getTableNames())) {
            return false;
        }
        if ((listTablesResult.getLastEvaluatedTableName() == null) ^ (getLastEvaluatedTableName() == null)) {
            return false;
        }
        return listTablesResult.getLastEvaluatedTableName() == null || listTablesResult.getLastEvaluatedTableName().equals(getLastEvaluatedTableName());
    }

    public String getLastEvaluatedTableName() {
        return this.lastEvaluatedTableName;
    }

    public List<String> getTableNames() {
        return this.tableNames;
    }

    public int hashCode() {
        return (((getTableNames() == null ? 0 : getTableNames().hashCode()) + 31) * 31) + (getLastEvaluatedTableName() != null ? getLastEvaluatedTableName().hashCode() : 0);
    }

    public void setLastEvaluatedTableName(String str) {
        this.lastEvaluatedTableName = str;
    }

    public void setTableNames(Collection<String> collection) {
        if (collection == null) {
            this.tableNames = null;
        } else {
            this.tableNames = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTableNames() != null) {
            sb.append("TableNames: " + getTableNames() + ",");
        }
        if (getLastEvaluatedTableName() != null) {
            sb.append("LastEvaluatedTableName: " + getLastEvaluatedTableName());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListTablesResult withLastEvaluatedTableName(String str) {
        this.lastEvaluatedTableName = str;
        return this;
    }

    public ListTablesResult withTableNames(String... strArr) {
        if (getTableNames() == null) {
            this.tableNames = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.tableNames.add(str);
        }
        return this;
    }

    public ListTablesResult withTableNames(Collection<String> collection) {
        setTableNames(collection);
        return this;
    }
}
