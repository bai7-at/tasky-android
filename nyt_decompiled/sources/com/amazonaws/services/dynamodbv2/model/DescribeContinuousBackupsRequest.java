package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class DescribeContinuousBackupsRequest extends AmazonWebServiceRequest implements Serializable {
    private String tableName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeContinuousBackupsRequest)) {
            return false;
        }
        DescribeContinuousBackupsRequest describeContinuousBackupsRequest = (DescribeContinuousBackupsRequest) obj;
        if ((describeContinuousBackupsRequest.getTableName() == null) ^ (getTableName() == null)) {
            return false;
        }
        return describeContinuousBackupsRequest.getTableName() == null || describeContinuousBackupsRequest.getTableName().equals(getTableName());
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

    public DescribeContinuousBackupsRequest withTableName(String str) {
        this.tableName = str;
        return this;
    }
}
