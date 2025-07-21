package com.amazonaws.services.kms.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class XksProxyAuthenticationCredentialType implements Serializable {
    private String accessKeyId;
    private String rawSecretAccessKey;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof XksProxyAuthenticationCredentialType)) {
            return false;
        }
        XksProxyAuthenticationCredentialType xksProxyAuthenticationCredentialType = (XksProxyAuthenticationCredentialType) obj;
        if ((xksProxyAuthenticationCredentialType.getAccessKeyId() == null) ^ (getAccessKeyId() == null)) {
            return false;
        }
        if (xksProxyAuthenticationCredentialType.getAccessKeyId() != null && !xksProxyAuthenticationCredentialType.getAccessKeyId().equals(getAccessKeyId())) {
            return false;
        }
        if ((xksProxyAuthenticationCredentialType.getRawSecretAccessKey() == null) ^ (getRawSecretAccessKey() == null)) {
            return false;
        }
        return xksProxyAuthenticationCredentialType.getRawSecretAccessKey() == null || xksProxyAuthenticationCredentialType.getRawSecretAccessKey().equals(getRawSecretAccessKey());
    }

    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public String getRawSecretAccessKey() {
        return this.rawSecretAccessKey;
    }

    public int hashCode() {
        return (((getAccessKeyId() == null ? 0 : getAccessKeyId().hashCode()) + 31) * 31) + (getRawSecretAccessKey() != null ? getRawSecretAccessKey().hashCode() : 0);
    }

    public void setAccessKeyId(String str) {
        this.accessKeyId = str;
    }

    public void setRawSecretAccessKey(String str) {
        this.rawSecretAccessKey = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAccessKeyId() != null) {
            sb.append("AccessKeyId: " + getAccessKeyId() + ",");
        }
        if (getRawSecretAccessKey() != null) {
            sb.append("RawSecretAccessKey: " + getRawSecretAccessKey());
        }
        sb.append("}");
        return sb.toString();
    }

    public XksProxyAuthenticationCredentialType withAccessKeyId(String str) {
        this.accessKeyId = str;
        return this;
    }

    public XksProxyAuthenticationCredentialType withRawSecretAccessKey(String str) {
        this.rawSecretAccessKey = str;
        return this;
    }
}
