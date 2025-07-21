package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ConsumedCapacity implements Serializable {
    private Double capacityUnits;
    private Map<String, Capacity> globalSecondaryIndexes;
    private Map<String, Capacity> localSecondaryIndexes;
    private Capacity table;
    private String tableName;

    public ConsumedCapacity addGlobalSecondaryIndexesEntry(String str, Capacity capacity) {
        if (this.globalSecondaryIndexes == null) {
            this.globalSecondaryIndexes = new HashMap();
        }
        if (!this.globalSecondaryIndexes.containsKey(str)) {
            this.globalSecondaryIndexes.put(str, capacity);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public ConsumedCapacity addLocalSecondaryIndexesEntry(String str, Capacity capacity) {
        if (this.localSecondaryIndexes == null) {
            this.localSecondaryIndexes = new HashMap();
        }
        if (!this.localSecondaryIndexes.containsKey(str)) {
            this.localSecondaryIndexes.put(str, capacity);
            return this;
        }
        throw new IllegalArgumentException("Duplicated keys (" + str.toString() + ") are provided.");
    }

    public ConsumedCapacity clearGlobalSecondaryIndexesEntries() {
        this.globalSecondaryIndexes = null;
        return this;
    }

    public ConsumedCapacity clearLocalSecondaryIndexesEntries() {
        this.localSecondaryIndexes = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ConsumedCapacity)) {
            return false;
        }
        ConsumedCapacity consumedCapacity = (ConsumedCapacity) obj;
        if ((consumedCapacity.getTableName() == null) ^ (getTableName() == null)) {
            return false;
        }
        if (consumedCapacity.getTableName() != null && !consumedCapacity.getTableName().equals(getTableName())) {
            return false;
        }
        if ((consumedCapacity.getCapacityUnits() == null) ^ (getCapacityUnits() == null)) {
            return false;
        }
        if (consumedCapacity.getCapacityUnits() != null && !consumedCapacity.getCapacityUnits().equals(getCapacityUnits())) {
            return false;
        }
        if ((consumedCapacity.getTable() == null) ^ (getTable() == null)) {
            return false;
        }
        if (consumedCapacity.getTable() != null && !consumedCapacity.getTable().equals(getTable())) {
            return false;
        }
        if ((consumedCapacity.getLocalSecondaryIndexes() == null) ^ (getLocalSecondaryIndexes() == null)) {
            return false;
        }
        if (consumedCapacity.getLocalSecondaryIndexes() != null && !consumedCapacity.getLocalSecondaryIndexes().equals(getLocalSecondaryIndexes())) {
            return false;
        }
        if ((consumedCapacity.getGlobalSecondaryIndexes() == null) ^ (getGlobalSecondaryIndexes() == null)) {
            return false;
        }
        return consumedCapacity.getGlobalSecondaryIndexes() == null || consumedCapacity.getGlobalSecondaryIndexes().equals(getGlobalSecondaryIndexes());
    }

    public Double getCapacityUnits() {
        return this.capacityUnits;
    }

    public Map<String, Capacity> getGlobalSecondaryIndexes() {
        return this.globalSecondaryIndexes;
    }

    public Map<String, Capacity> getLocalSecondaryIndexes() {
        return this.localSecondaryIndexes;
    }

    public Capacity getTable() {
        return this.table;
    }

    public String getTableName() {
        return this.tableName;
    }

    public int hashCode() {
        return (((((((((getTableName() == null ? 0 : getTableName().hashCode()) + 31) * 31) + (getCapacityUnits() == null ? 0 : getCapacityUnits().hashCode())) * 31) + (getTable() == null ? 0 : getTable().hashCode())) * 31) + (getLocalSecondaryIndexes() == null ? 0 : getLocalSecondaryIndexes().hashCode())) * 31) + (getGlobalSecondaryIndexes() != null ? getGlobalSecondaryIndexes().hashCode() : 0);
    }

    public void setCapacityUnits(Double d) {
        this.capacityUnits = d;
    }

    public void setGlobalSecondaryIndexes(Map<String, Capacity> map) {
        this.globalSecondaryIndexes = map;
    }

    public void setLocalSecondaryIndexes(Map<String, Capacity> map) {
        this.localSecondaryIndexes = map;
    }

    public void setTable(Capacity capacity) {
        this.table = capacity;
    }

    public void setTableName(String str) {
        this.tableName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTableName() != null) {
            sb.append("TableName: " + getTableName() + ",");
        }
        if (getCapacityUnits() != null) {
            sb.append("CapacityUnits: " + getCapacityUnits() + ",");
        }
        if (getTable() != null) {
            sb.append("Table: " + getTable() + ",");
        }
        if (getLocalSecondaryIndexes() != null) {
            sb.append("LocalSecondaryIndexes: " + getLocalSecondaryIndexes() + ",");
        }
        if (getGlobalSecondaryIndexes() != null) {
            sb.append("GlobalSecondaryIndexes: " + getGlobalSecondaryIndexes());
        }
        sb.append("}");
        return sb.toString();
    }

    public ConsumedCapacity withCapacityUnits(Double d) {
        this.capacityUnits = d;
        return this;
    }

    public ConsumedCapacity withGlobalSecondaryIndexes(Map<String, Capacity> map) {
        this.globalSecondaryIndexes = map;
        return this;
    }

    public ConsumedCapacity withLocalSecondaryIndexes(Map<String, Capacity> map) {
        this.localSecondaryIndexes = map;
        return this;
    }

    public ConsumedCapacity withTable(Capacity capacity) {
        this.table = capacity;
        return this;
    }

    public ConsumedCapacity withTableName(String str) {
        this.tableName = str;
        return this;
    }
}
