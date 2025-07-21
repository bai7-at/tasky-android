package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class DescribeGlobalTableResult implements Serializable {
    private GlobalTableDescription globalTableDescription;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeGlobalTableResult)) {
            return false;
        }
        DescribeGlobalTableResult describeGlobalTableResult = (DescribeGlobalTableResult) obj;
        if ((describeGlobalTableResult.getGlobalTableDescription() == null) ^ (getGlobalTableDescription() == null)) {
            return false;
        }
        return describeGlobalTableResult.getGlobalTableDescription() == null || describeGlobalTableResult.getGlobalTableDescription().equals(getGlobalTableDescription());
    }

    public GlobalTableDescription getGlobalTableDescription() {
        return this.globalTableDescription;
    }

    public int hashCode() {
        return 31 + (getGlobalTableDescription() == null ? 0 : getGlobalTableDescription().hashCode());
    }

    public void setGlobalTableDescription(GlobalTableDescription globalTableDescription) {
        this.globalTableDescription = globalTableDescription;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGlobalTableDescription() != null) {
            sb.append("GlobalTableDescription: " + getGlobalTableDescription());
        }
        sb.append("}");
        return sb.toString();
    }

    public DescribeGlobalTableResult withGlobalTableDescription(GlobalTableDescription globalTableDescription) {
        this.globalTableDescription = globalTableDescription;
        return this;
    }
}
