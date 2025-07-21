package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class Capacity implements Serializable {
    private Double capacityUnits;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Capacity)) {
            return false;
        }
        Capacity capacity = (Capacity) obj;
        if ((capacity.getCapacityUnits() == null) ^ (getCapacityUnits() == null)) {
            return false;
        }
        return capacity.getCapacityUnits() == null || capacity.getCapacityUnits().equals(getCapacityUnits());
    }

    public Double getCapacityUnits() {
        return this.capacityUnits;
    }

    public int hashCode() {
        return 31 + (getCapacityUnits() == null ? 0 : getCapacityUnits().hashCode());
    }

    public void setCapacityUnits(Double d) {
        this.capacityUnits = d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCapacityUnits() != null) {
            sb.append("CapacityUnits: " + getCapacityUnits());
        }
        sb.append("}");
        return sb.toString();
    }

    public Capacity withCapacityUnits(Double d) {
        this.capacityUnits = d;
        return this;
    }
}
