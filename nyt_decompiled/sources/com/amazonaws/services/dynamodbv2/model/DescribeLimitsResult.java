package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class DescribeLimitsResult implements Serializable {
    private Long accountMaxReadCapacityUnits;
    private Long accountMaxWriteCapacityUnits;
    private Long tableMaxReadCapacityUnits;
    private Long tableMaxWriteCapacityUnits;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeLimitsResult)) {
            return false;
        }
        DescribeLimitsResult describeLimitsResult = (DescribeLimitsResult) obj;
        if ((describeLimitsResult.getAccountMaxReadCapacityUnits() == null) ^ (getAccountMaxReadCapacityUnits() == null)) {
            return false;
        }
        if (describeLimitsResult.getAccountMaxReadCapacityUnits() != null && !describeLimitsResult.getAccountMaxReadCapacityUnits().equals(getAccountMaxReadCapacityUnits())) {
            return false;
        }
        if ((describeLimitsResult.getAccountMaxWriteCapacityUnits() == null) ^ (getAccountMaxWriteCapacityUnits() == null)) {
            return false;
        }
        if (describeLimitsResult.getAccountMaxWriteCapacityUnits() != null && !describeLimitsResult.getAccountMaxWriteCapacityUnits().equals(getAccountMaxWriteCapacityUnits())) {
            return false;
        }
        if ((describeLimitsResult.getTableMaxReadCapacityUnits() == null) ^ (getTableMaxReadCapacityUnits() == null)) {
            return false;
        }
        if (describeLimitsResult.getTableMaxReadCapacityUnits() != null && !describeLimitsResult.getTableMaxReadCapacityUnits().equals(getTableMaxReadCapacityUnits())) {
            return false;
        }
        if ((describeLimitsResult.getTableMaxWriteCapacityUnits() == null) ^ (getTableMaxWriteCapacityUnits() == null)) {
            return false;
        }
        return describeLimitsResult.getTableMaxWriteCapacityUnits() == null || describeLimitsResult.getTableMaxWriteCapacityUnits().equals(getTableMaxWriteCapacityUnits());
    }

    public Long getAccountMaxReadCapacityUnits() {
        return this.accountMaxReadCapacityUnits;
    }

    public Long getAccountMaxWriteCapacityUnits() {
        return this.accountMaxWriteCapacityUnits;
    }

    public Long getTableMaxReadCapacityUnits() {
        return this.tableMaxReadCapacityUnits;
    }

    public Long getTableMaxWriteCapacityUnits() {
        return this.tableMaxWriteCapacityUnits;
    }

    public int hashCode() {
        return (((((((getAccountMaxReadCapacityUnits() == null ? 0 : getAccountMaxReadCapacityUnits().hashCode()) + 31) * 31) + (getAccountMaxWriteCapacityUnits() == null ? 0 : getAccountMaxWriteCapacityUnits().hashCode())) * 31) + (getTableMaxReadCapacityUnits() == null ? 0 : getTableMaxReadCapacityUnits().hashCode())) * 31) + (getTableMaxWriteCapacityUnits() != null ? getTableMaxWriteCapacityUnits().hashCode() : 0);
    }

    public void setAccountMaxReadCapacityUnits(Long l) {
        this.accountMaxReadCapacityUnits = l;
    }

    public void setAccountMaxWriteCapacityUnits(Long l) {
        this.accountMaxWriteCapacityUnits = l;
    }

    public void setTableMaxReadCapacityUnits(Long l) {
        this.tableMaxReadCapacityUnits = l;
    }

    public void setTableMaxWriteCapacityUnits(Long l) {
        this.tableMaxWriteCapacityUnits = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAccountMaxReadCapacityUnits() != null) {
            sb.append("AccountMaxReadCapacityUnits: " + getAccountMaxReadCapacityUnits() + ",");
        }
        if (getAccountMaxWriteCapacityUnits() != null) {
            sb.append("AccountMaxWriteCapacityUnits: " + getAccountMaxWriteCapacityUnits() + ",");
        }
        if (getTableMaxReadCapacityUnits() != null) {
            sb.append("TableMaxReadCapacityUnits: " + getTableMaxReadCapacityUnits() + ",");
        }
        if (getTableMaxWriteCapacityUnits() != null) {
            sb.append("TableMaxWriteCapacityUnits: " + getTableMaxWriteCapacityUnits());
        }
        sb.append("}");
        return sb.toString();
    }

    public DescribeLimitsResult withAccountMaxReadCapacityUnits(Long l) {
        this.accountMaxReadCapacityUnits = l;
        return this;
    }

    public DescribeLimitsResult withAccountMaxWriteCapacityUnits(Long l) {
        this.accountMaxWriteCapacityUnits = l;
        return this;
    }

    public DescribeLimitsResult withTableMaxReadCapacityUnits(Long l) {
        this.tableMaxReadCapacityUnits = l;
        return this;
    }

    public DescribeLimitsResult withTableMaxWriteCapacityUnits(Long l) {
        this.tableMaxWriteCapacityUnits = l;
        return this;
    }
}
