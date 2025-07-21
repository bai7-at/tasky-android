package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class DescribeTableResult implements Serializable {
    private TableDescription table;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeTableResult)) {
            return false;
        }
        DescribeTableResult describeTableResult = (DescribeTableResult) obj;
        if ((describeTableResult.getTable() == null) ^ (getTable() == null)) {
            return false;
        }
        return describeTableResult.getTable() == null || describeTableResult.getTable().equals(getTable());
    }

    public TableDescription getTable() {
        return this.table;
    }

    public int hashCode() {
        return 31 + (getTable() == null ? 0 : getTable().hashCode());
    }

    public void setTable(TableDescription tableDescription) {
        this.table = tableDescription;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTable() != null) {
            sb.append("Table: " + getTable());
        }
        sb.append("}");
        return sb.toString();
    }

    public DescribeTableResult withTable(TableDescription tableDescription) {
        this.table = tableDescription;
        return this;
    }
}
