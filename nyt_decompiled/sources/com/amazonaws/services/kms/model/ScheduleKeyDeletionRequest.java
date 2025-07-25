package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ScheduleKeyDeletionRequest extends AmazonWebServiceRequest implements Serializable {
    private String keyId;
    private Integer pendingWindowInDays;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ScheduleKeyDeletionRequest)) {
            return false;
        }
        ScheduleKeyDeletionRequest scheduleKeyDeletionRequest = (ScheduleKeyDeletionRequest) obj;
        if ((scheduleKeyDeletionRequest.getKeyId() == null) ^ (getKeyId() == null)) {
            return false;
        }
        if (scheduleKeyDeletionRequest.getKeyId() != null && !scheduleKeyDeletionRequest.getKeyId().equals(getKeyId())) {
            return false;
        }
        if ((scheduleKeyDeletionRequest.getPendingWindowInDays() == null) ^ (getPendingWindowInDays() == null)) {
            return false;
        }
        return scheduleKeyDeletionRequest.getPendingWindowInDays() == null || scheduleKeyDeletionRequest.getPendingWindowInDays().equals(getPendingWindowInDays());
    }

    public String getKeyId() {
        return this.keyId;
    }

    public Integer getPendingWindowInDays() {
        return this.pendingWindowInDays;
    }

    public int hashCode() {
        return (((getKeyId() == null ? 0 : getKeyId().hashCode()) + 31) * 31) + (getPendingWindowInDays() != null ? getPendingWindowInDays().hashCode() : 0);
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public void setPendingWindowInDays(Integer num) {
        this.pendingWindowInDays = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKeyId() != null) {
            sb.append("KeyId: " + getKeyId() + ",");
        }
        if (getPendingWindowInDays() != null) {
            sb.append("PendingWindowInDays: " + getPendingWindowInDays());
        }
        sb.append("}");
        return sb.toString();
    }

    public ScheduleKeyDeletionRequest withKeyId(String str) {
        this.keyId = str;
        return this;
    }

    public ScheduleKeyDeletionRequest withPendingWindowInDays(Integer num) {
        this.pendingWindowInDays = num;
        return this;
    }
}
