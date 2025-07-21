package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class UpdateGlobalTableResult implements Serializable {
    private GlobalTableDescription globalTableDescription;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateGlobalTableResult)) {
            return false;
        }
        UpdateGlobalTableResult updateGlobalTableResult = (UpdateGlobalTableResult) obj;
        if ((updateGlobalTableResult.getGlobalTableDescription() == null) ^ (getGlobalTableDescription() == null)) {
            return false;
        }
        return updateGlobalTableResult.getGlobalTableDescription() == null || updateGlobalTableResult.getGlobalTableDescription().equals(getGlobalTableDescription());
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

    public UpdateGlobalTableResult withGlobalTableDescription(GlobalTableDescription globalTableDescription) {
        this.globalTableDescription = globalTableDescription;
        return this;
    }
}
