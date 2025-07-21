package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class UpdateTimeToLiveResult implements Serializable {
    private TimeToLiveSpecification timeToLiveSpecification;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateTimeToLiveResult)) {
            return false;
        }
        UpdateTimeToLiveResult updateTimeToLiveResult = (UpdateTimeToLiveResult) obj;
        if ((updateTimeToLiveResult.getTimeToLiveSpecification() == null) ^ (getTimeToLiveSpecification() == null)) {
            return false;
        }
        return updateTimeToLiveResult.getTimeToLiveSpecification() == null || updateTimeToLiveResult.getTimeToLiveSpecification().equals(getTimeToLiveSpecification());
    }

    public TimeToLiveSpecification getTimeToLiveSpecification() {
        return this.timeToLiveSpecification;
    }

    public int hashCode() {
        return 31 + (getTimeToLiveSpecification() == null ? 0 : getTimeToLiveSpecification().hashCode());
    }

    public void setTimeToLiveSpecification(TimeToLiveSpecification timeToLiveSpecification) {
        this.timeToLiveSpecification = timeToLiveSpecification;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTimeToLiveSpecification() != null) {
            sb.append("TimeToLiveSpecification: " + getTimeToLiveSpecification());
        }
        sb.append("}");
        return sb.toString();
    }

    public UpdateTimeToLiveResult withTimeToLiveSpecification(TimeToLiveSpecification timeToLiveSpecification) {
        this.timeToLiveSpecification = timeToLiveSpecification;
        return this;
    }
}
