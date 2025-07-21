package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

@Deprecated
/* loaded from: classes.dex */
public class RegisterDeviceResult implements Serializable {
    private String deviceId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RegisterDeviceResult)) {
            return false;
        }
        RegisterDeviceResult registerDeviceResult = (RegisterDeviceResult) obj;
        if ((registerDeviceResult.getDeviceId() == null) ^ (getDeviceId() == null)) {
            return false;
        }
        return registerDeviceResult.getDeviceId() == null || registerDeviceResult.getDeviceId().equals(getDeviceId());
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public int hashCode() {
        return 31 + (getDeviceId() == null ? 0 : getDeviceId().hashCode());
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDeviceId() != null) {
            sb.append("DeviceId: " + getDeviceId());
        }
        sb.append("}");
        return sb.toString();
    }

    public RegisterDeviceResult withDeviceId(String str) {
        this.deviceId = str;
        return this;
    }
}
