package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class ProvisionedThroughput implements Serializable {
    private Long readCapacityUnits;
    private Long writeCapacityUnits;

    public ProvisionedThroughput() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ProvisionedThroughput)) {
            return false;
        }
        ProvisionedThroughput provisionedThroughput = (ProvisionedThroughput) obj;
        if ((provisionedThroughput.getReadCapacityUnits() == null) ^ (getReadCapacityUnits() == null)) {
            return false;
        }
        if (provisionedThroughput.getReadCapacityUnits() != null && !provisionedThroughput.getReadCapacityUnits().equals(getReadCapacityUnits())) {
            return false;
        }
        if ((provisionedThroughput.getWriteCapacityUnits() == null) ^ (getWriteCapacityUnits() == null)) {
            return false;
        }
        return provisionedThroughput.getWriteCapacityUnits() == null || provisionedThroughput.getWriteCapacityUnits().equals(getWriteCapacityUnits());
    }

    public Long getReadCapacityUnits() {
        return this.readCapacityUnits;
    }

    public Long getWriteCapacityUnits() {
        return this.writeCapacityUnits;
    }

    public int hashCode() {
        return (((getReadCapacityUnits() == null ? 0 : getReadCapacityUnits().hashCode()) + 31) * 31) + (getWriteCapacityUnits() != null ? getWriteCapacityUnits().hashCode() : 0);
    }

    public void setReadCapacityUnits(Long l) {
        this.readCapacityUnits = l;
    }

    public void setWriteCapacityUnits(Long l) {
        this.writeCapacityUnits = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getReadCapacityUnits() != null) {
            sb.append("ReadCapacityUnits: " + getReadCapacityUnits() + ",");
        }
        if (getWriteCapacityUnits() != null) {
            sb.append("WriteCapacityUnits: " + getWriteCapacityUnits());
        }
        sb.append("}");
        return sb.toString();
    }

    public ProvisionedThroughput withReadCapacityUnits(Long l) {
        this.readCapacityUnits = l;
        return this;
    }

    public ProvisionedThroughput withWriteCapacityUnits(Long l) {
        this.writeCapacityUnits = l;
        return this;
    }

    public ProvisionedThroughput(Long l, Long l2) {
        setReadCapacityUnits(l);
        setWriteCapacityUnits(l2);
    }
}
