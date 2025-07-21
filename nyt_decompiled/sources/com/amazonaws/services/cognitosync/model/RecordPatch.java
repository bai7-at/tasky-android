package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;
import java.util.Date;

@Deprecated
/* loaded from: classes.dex */
public class RecordPatch implements Serializable {
    private Date deviceLastModifiedDate;
    private String key;
    private String op;
    private Long syncCount;
    private String value;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RecordPatch)) {
            return false;
        }
        RecordPatch recordPatch = (RecordPatch) obj;
        if ((recordPatch.getOp() == null) ^ (getOp() == null)) {
            return false;
        }
        if (recordPatch.getOp() != null && !recordPatch.getOp().equals(getOp())) {
            return false;
        }
        if ((recordPatch.getKey() == null) ^ (getKey() == null)) {
            return false;
        }
        if (recordPatch.getKey() != null && !recordPatch.getKey().equals(getKey())) {
            return false;
        }
        if ((recordPatch.getValue() == null) ^ (getValue() == null)) {
            return false;
        }
        if (recordPatch.getValue() != null && !recordPatch.getValue().equals(getValue())) {
            return false;
        }
        if ((recordPatch.getSyncCount() == null) ^ (getSyncCount() == null)) {
            return false;
        }
        if (recordPatch.getSyncCount() != null && !recordPatch.getSyncCount().equals(getSyncCount())) {
            return false;
        }
        if ((recordPatch.getDeviceLastModifiedDate() == null) ^ (getDeviceLastModifiedDate() == null)) {
            return false;
        }
        return recordPatch.getDeviceLastModifiedDate() == null || recordPatch.getDeviceLastModifiedDate().equals(getDeviceLastModifiedDate());
    }

    public Date getDeviceLastModifiedDate() {
        return this.deviceLastModifiedDate;
    }

    public String getKey() {
        return this.key;
    }

    public String getOp() {
        return this.op;
    }

    public Long getSyncCount() {
        return this.syncCount;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((((((getOp() == null ? 0 : getOp().hashCode()) + 31) * 31) + (getKey() == null ? 0 : getKey().hashCode())) * 31) + (getValue() == null ? 0 : getValue().hashCode())) * 31) + (getSyncCount() == null ? 0 : getSyncCount().hashCode())) * 31) + (getDeviceLastModifiedDate() != null ? getDeviceLastModifiedDate().hashCode() : 0);
    }

    public void setDeviceLastModifiedDate(Date date) {
        this.deviceLastModifiedDate = date;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setOp(String str) {
        this.op = str;
    }

    public void setSyncCount(Long l) {
        this.syncCount = l;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOp() != null) {
            sb.append("Op: " + getOp() + ",");
        }
        if (getKey() != null) {
            sb.append("Key: " + getKey() + ",");
        }
        if (getValue() != null) {
            sb.append("Value: " + getValue() + ",");
        }
        if (getSyncCount() != null) {
            sb.append("SyncCount: " + getSyncCount() + ",");
        }
        if (getDeviceLastModifiedDate() != null) {
            sb.append("DeviceLastModifiedDate: " + getDeviceLastModifiedDate());
        }
        sb.append("}");
        return sb.toString();
    }

    public RecordPatch withDeviceLastModifiedDate(Date date) {
        this.deviceLastModifiedDate = date;
        return this;
    }

    public RecordPatch withKey(String str) {
        this.key = str;
        return this;
    }

    public RecordPatch withOp(String str) {
        this.op = str;
        return this;
    }

    public RecordPatch withSyncCount(Long l) {
        this.syncCount = l;
        return this;
    }

    public RecordPatch withValue(String str) {
        this.value = str;
        return this;
    }

    public void setOp(Operation operation) {
        this.op = operation.toString();
    }

    public RecordPatch withOp(Operation operation) {
        this.op = operation.toString();
        return this;
    }
}
