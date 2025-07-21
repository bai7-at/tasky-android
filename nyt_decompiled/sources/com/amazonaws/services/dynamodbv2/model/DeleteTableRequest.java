package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class DeleteTableRequest extends AmazonWebServiceRequest implements Serializable {
    private String tableName;

    public DeleteTableRequest() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DeleteTableRequest)) {
            return false;
        }
        DeleteTableRequest deleteTableRequest = (DeleteTableRequest) obj;
        if ((deleteTableRequest.getTableName() == null) ^ (getTableName() == null)) {
            return false;
        }
        return deleteTableRequest.getTableName() == null || deleteTableRequest.getTableName().equals(getTableName());
    }

    public String getTableName() {
        return this.tableName;
    }

    public int hashCode() {
        return 31 + (getTableName() == null ? 0 : getTableName().hashCode());
    }

    public void setTableName(String str) {
        this.tableName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTableName() != null) {
            sb.append("TableName: " + getTableName());
        }
        sb.append("}");
        return sb.toString();
    }

    public DeleteTableRequest withTableName(String str) {
        this.tableName = str;
        return this;
    }

    public DeleteTableRequest(String str) {
        setTableName(str);
    }
}
