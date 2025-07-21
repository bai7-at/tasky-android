package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class DescribeTableRequest extends AmazonWebServiceRequest implements Serializable {
    private String tableName;

    public DescribeTableRequest() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeTableRequest)) {
            return false;
        }
        DescribeTableRequest describeTableRequest = (DescribeTableRequest) obj;
        if ((describeTableRequest.getTableName() == null) ^ (getTableName() == null)) {
            return false;
        }
        return describeTableRequest.getTableName() == null || describeTableRequest.getTableName().equals(getTableName());
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

    public DescribeTableRequest withTableName(String str) {
        this.tableName = str;
        return this;
    }

    public DescribeTableRequest(String str) {
        setTableName(str);
    }
}
