package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class DescribeGlobalTableRequest extends AmazonWebServiceRequest implements Serializable {
    private String globalTableName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeGlobalTableRequest)) {
            return false;
        }
        DescribeGlobalTableRequest describeGlobalTableRequest = (DescribeGlobalTableRequest) obj;
        if ((describeGlobalTableRequest.getGlobalTableName() == null) ^ (getGlobalTableName() == null)) {
            return false;
        }
        return describeGlobalTableRequest.getGlobalTableName() == null || describeGlobalTableRequest.getGlobalTableName().equals(getGlobalTableName());
    }

    public String getGlobalTableName() {
        return this.globalTableName;
    }

    public int hashCode() {
        return 31 + (getGlobalTableName() == null ? 0 : getGlobalTableName().hashCode());
    }

    public void setGlobalTableName(String str) {
        this.globalTableName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGlobalTableName() != null) {
            sb.append("GlobalTableName: " + getGlobalTableName());
        }
        sb.append("}");
        return sb.toString();
    }

    public DescribeGlobalTableRequest withGlobalTableName(String str) {
        this.globalTableName = str;
        return this;
    }
}
