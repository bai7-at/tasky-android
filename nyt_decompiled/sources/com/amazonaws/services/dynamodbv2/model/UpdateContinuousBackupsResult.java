package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class UpdateContinuousBackupsResult implements Serializable {
    private ContinuousBackupsDescription continuousBackupsDescription;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateContinuousBackupsResult)) {
            return false;
        }
        UpdateContinuousBackupsResult updateContinuousBackupsResult = (UpdateContinuousBackupsResult) obj;
        if ((updateContinuousBackupsResult.getContinuousBackupsDescription() == null) ^ (getContinuousBackupsDescription() == null)) {
            return false;
        }
        return updateContinuousBackupsResult.getContinuousBackupsDescription() == null || updateContinuousBackupsResult.getContinuousBackupsDescription().equals(getContinuousBackupsDescription());
    }

    public ContinuousBackupsDescription getContinuousBackupsDescription() {
        return this.continuousBackupsDescription;
    }

    public int hashCode() {
        return 31 + (getContinuousBackupsDescription() == null ? 0 : getContinuousBackupsDescription().hashCode());
    }

    public void setContinuousBackupsDescription(ContinuousBackupsDescription continuousBackupsDescription) {
        this.continuousBackupsDescription = continuousBackupsDescription;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getContinuousBackupsDescription() != null) {
            sb.append("ContinuousBackupsDescription: " + getContinuousBackupsDescription());
        }
        sb.append("}");
        return sb.toString();
    }

    public UpdateContinuousBackupsResult withContinuousBackupsDescription(ContinuousBackupsDescription continuousBackupsDescription) {
        this.continuousBackupsDescription = continuousBackupsDescription;
        return this;
    }
}
