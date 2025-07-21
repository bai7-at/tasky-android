package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import java.util.Date;

/* loaded from: classes2.dex */
public class PointInTimeRecoveryDescription implements Serializable {
    private Date earliestRestorableDateTime;
    private Date latestRestorableDateTime;
    private String pointInTimeRecoveryStatus;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PointInTimeRecoveryDescription)) {
            return false;
        }
        PointInTimeRecoveryDescription pointInTimeRecoveryDescription = (PointInTimeRecoveryDescription) obj;
        if ((pointInTimeRecoveryDescription.getPointInTimeRecoveryStatus() == null) ^ (getPointInTimeRecoveryStatus() == null)) {
            return false;
        }
        if (pointInTimeRecoveryDescription.getPointInTimeRecoveryStatus() != null && !pointInTimeRecoveryDescription.getPointInTimeRecoveryStatus().equals(getPointInTimeRecoveryStatus())) {
            return false;
        }
        if ((pointInTimeRecoveryDescription.getEarliestRestorableDateTime() == null) ^ (getEarliestRestorableDateTime() == null)) {
            return false;
        }
        if (pointInTimeRecoveryDescription.getEarliestRestorableDateTime() != null && !pointInTimeRecoveryDescription.getEarliestRestorableDateTime().equals(getEarliestRestorableDateTime())) {
            return false;
        }
        if ((pointInTimeRecoveryDescription.getLatestRestorableDateTime() == null) ^ (getLatestRestorableDateTime() == null)) {
            return false;
        }
        return pointInTimeRecoveryDescription.getLatestRestorableDateTime() == null || pointInTimeRecoveryDescription.getLatestRestorableDateTime().equals(getLatestRestorableDateTime());
    }

    public Date getEarliestRestorableDateTime() {
        return this.earliestRestorableDateTime;
    }

    public Date getLatestRestorableDateTime() {
        return this.latestRestorableDateTime;
    }

    public String getPointInTimeRecoveryStatus() {
        return this.pointInTimeRecoveryStatus;
    }

    public int hashCode() {
        return (((((getPointInTimeRecoveryStatus() == null ? 0 : getPointInTimeRecoveryStatus().hashCode()) + 31) * 31) + (getEarliestRestorableDateTime() == null ? 0 : getEarliestRestorableDateTime().hashCode())) * 31) + (getLatestRestorableDateTime() != null ? getLatestRestorableDateTime().hashCode() : 0);
    }

    public void setEarliestRestorableDateTime(Date date) {
        this.earliestRestorableDateTime = date;
    }

    public void setLatestRestorableDateTime(Date date) {
        this.latestRestorableDateTime = date;
    }

    public void setPointInTimeRecoveryStatus(String str) {
        this.pointInTimeRecoveryStatus = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPointInTimeRecoveryStatus() != null) {
            sb.append("PointInTimeRecoveryStatus: " + getPointInTimeRecoveryStatus() + ",");
        }
        if (getEarliestRestorableDateTime() != null) {
            sb.append("EarliestRestorableDateTime: " + getEarliestRestorableDateTime() + ",");
        }
        if (getLatestRestorableDateTime() != null) {
            sb.append("LatestRestorableDateTime: " + getLatestRestorableDateTime());
        }
        sb.append("}");
        return sb.toString();
    }

    public PointInTimeRecoveryDescription withEarliestRestorableDateTime(Date date) {
        this.earliestRestorableDateTime = date;
        return this;
    }

    public PointInTimeRecoveryDescription withLatestRestorableDateTime(Date date) {
        this.latestRestorableDateTime = date;
        return this;
    }

    public PointInTimeRecoveryDescription withPointInTimeRecoveryStatus(String str) {
        this.pointInTimeRecoveryStatus = str;
        return this;
    }

    public void setPointInTimeRecoveryStatus(PointInTimeRecoveryStatus pointInTimeRecoveryStatus) {
        this.pointInTimeRecoveryStatus = pointInTimeRecoveryStatus.toString();
    }

    public PointInTimeRecoveryDescription withPointInTimeRecoveryStatus(PointInTimeRecoveryStatus pointInTimeRecoveryStatus) {
        this.pointInTimeRecoveryStatus = pointInTimeRecoveryStatus.toString();
        return this;
    }
}
