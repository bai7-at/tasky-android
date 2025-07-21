package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class ReplicaDescription implements Serializable {
    private String regionName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ReplicaDescription)) {
            return false;
        }
        ReplicaDescription replicaDescription = (ReplicaDescription) obj;
        if ((replicaDescription.getRegionName() == null) ^ (getRegionName() == null)) {
            return false;
        }
        return replicaDescription.getRegionName() == null || replicaDescription.getRegionName().equals(getRegionName());
    }

    public String getRegionName() {
        return this.regionName;
    }

    public int hashCode() {
        return 31 + (getRegionName() == null ? 0 : getRegionName().hashCode());
    }

    public void setRegionName(String str) {
        this.regionName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRegionName() != null) {
            sb.append("RegionName: " + getRegionName());
        }
        sb.append("}");
        return sb.toString();
    }

    public ReplicaDescription withRegionName(String str) {
        this.regionName = str;
        return this;
    }
}
