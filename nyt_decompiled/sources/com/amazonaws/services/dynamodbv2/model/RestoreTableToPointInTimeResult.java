package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class RestoreTableToPointInTimeResult implements Serializable {
    private TableDescription tableDescription;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RestoreTableToPointInTimeResult)) {
            return false;
        }
        RestoreTableToPointInTimeResult restoreTableToPointInTimeResult = (RestoreTableToPointInTimeResult) obj;
        if ((restoreTableToPointInTimeResult.getTableDescription() == null) ^ (getTableDescription() == null)) {
            return false;
        }
        return restoreTableToPointInTimeResult.getTableDescription() == null || restoreTableToPointInTimeResult.getTableDescription().equals(getTableDescription());
    }

    public TableDescription getTableDescription() {
        return this.tableDescription;
    }

    public int hashCode() {
        return 31 + (getTableDescription() == null ? 0 : getTableDescription().hashCode());
    }

    public void setTableDescription(TableDescription tableDescription) {
        this.tableDescription = tableDescription;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTableDescription() != null) {
            sb.append("TableDescription: " + getTableDescription());
        }
        sb.append("}");
        return sb.toString();
    }

    public RestoreTableToPointInTimeResult withTableDescription(TableDescription tableDescription) {
        this.tableDescription = tableDescription;
        return this;
    }
}
