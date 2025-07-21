package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class CreateTableResult implements Serializable {
    private TableDescription tableDescription;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateTableResult)) {
            return false;
        }
        CreateTableResult createTableResult = (CreateTableResult) obj;
        if ((createTableResult.getTableDescription() == null) ^ (getTableDescription() == null)) {
            return false;
        }
        return createTableResult.getTableDescription() == null || createTableResult.getTableDescription().equals(getTableDescription());
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

    public CreateTableResult withTableDescription(TableDescription tableDescription) {
        this.tableDescription = tableDescription;
        return this;
    }
}
