package com.amazonaws.services.dynamodbv2.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ListGlobalTablesRequest extends AmazonWebServiceRequest implements Serializable {
    private String exclusiveStartGlobalTableName;
    private Integer limit;
    private String regionName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListGlobalTablesRequest)) {
            return false;
        }
        ListGlobalTablesRequest listGlobalTablesRequest = (ListGlobalTablesRequest) obj;
        if ((listGlobalTablesRequest.getExclusiveStartGlobalTableName() == null) ^ (getExclusiveStartGlobalTableName() == null)) {
            return false;
        }
        if (listGlobalTablesRequest.getExclusiveStartGlobalTableName() != null && !listGlobalTablesRequest.getExclusiveStartGlobalTableName().equals(getExclusiveStartGlobalTableName())) {
            return false;
        }
        if ((listGlobalTablesRequest.getLimit() == null) ^ (getLimit() == null)) {
            return false;
        }
        if (listGlobalTablesRequest.getLimit() != null && !listGlobalTablesRequest.getLimit().equals(getLimit())) {
            return false;
        }
        if ((listGlobalTablesRequest.getRegionName() == null) ^ (getRegionName() == null)) {
            return false;
        }
        return listGlobalTablesRequest.getRegionName() == null || listGlobalTablesRequest.getRegionName().equals(getRegionName());
    }

    public String getExclusiveStartGlobalTableName() {
        return this.exclusiveStartGlobalTableName;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public String getRegionName() {
        return this.regionName;
    }

    public int hashCode() {
        return (((((getExclusiveStartGlobalTableName() == null ? 0 : getExclusiveStartGlobalTableName().hashCode()) + 31) * 31) + (getLimit() == null ? 0 : getLimit().hashCode())) * 31) + (getRegionName() != null ? getRegionName().hashCode() : 0);
    }

    public void setExclusiveStartGlobalTableName(String str) {
        this.exclusiveStartGlobalTableName = str;
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public void setRegionName(String str) {
        this.regionName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getExclusiveStartGlobalTableName() != null) {
            sb.append("ExclusiveStartGlobalTableName: " + getExclusiveStartGlobalTableName() + ",");
        }
        if (getLimit() != null) {
            sb.append("Limit: " + getLimit() + ",");
        }
        if (getRegionName() != null) {
            sb.append("RegionName: " + getRegionName());
        }
        sb.append("}");
        return sb.toString();
    }

    public ListGlobalTablesRequest withExclusiveStartGlobalTableName(String str) {
        this.exclusiveStartGlobalTableName = str;
        return this;
    }

    public ListGlobalTablesRequest withLimit(Integer num) {
        this.limit = num;
        return this;
    }

    public ListGlobalTablesRequest withRegionName(String str) {
        this.regionName = str;
        return this;
    }
}
