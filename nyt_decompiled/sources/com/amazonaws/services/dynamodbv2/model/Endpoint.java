package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class Endpoint implements Serializable {
    private String address;
    private Long cachePeriodInMinutes;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Endpoint)) {
            return false;
        }
        Endpoint endpoint = (Endpoint) obj;
        if ((endpoint.getAddress() == null) ^ (getAddress() == null)) {
            return false;
        }
        if (endpoint.getAddress() != null && !endpoint.getAddress().equals(getAddress())) {
            return false;
        }
        if ((endpoint.getCachePeriodInMinutes() == null) ^ (getCachePeriodInMinutes() == null)) {
            return false;
        }
        return endpoint.getCachePeriodInMinutes() == null || endpoint.getCachePeriodInMinutes().equals(getCachePeriodInMinutes());
    }

    public String getAddress() {
        return this.address;
    }

    public Long getCachePeriodInMinutes() {
        return this.cachePeriodInMinutes;
    }

    public int hashCode() {
        return (((getAddress() == null ? 0 : getAddress().hashCode()) + 31) * 31) + (getCachePeriodInMinutes() != null ? getCachePeriodInMinutes().hashCode() : 0);
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setCachePeriodInMinutes(Long l) {
        this.cachePeriodInMinutes = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAddress() != null) {
            sb.append("Address: " + getAddress() + ",");
        }
        if (getCachePeriodInMinutes() != null) {
            sb.append("CachePeriodInMinutes: " + getCachePeriodInMinutes());
        }
        sb.append("}");
        return sb.toString();
    }

    public Endpoint withAddress(String str) {
        this.address = str;
        return this;
    }

    public Endpoint withCachePeriodInMinutes(Long l) {
        this.cachePeriodInMinutes = l;
        return this;
    }
}
