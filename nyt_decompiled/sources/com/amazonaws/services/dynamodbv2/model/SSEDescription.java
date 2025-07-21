package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class SSEDescription implements Serializable {
    private String kMSMasterKeyArn;
    private String sSEType;
    private String status;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SSEDescription)) {
            return false;
        }
        SSEDescription sSEDescription = (SSEDescription) obj;
        if ((sSEDescription.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        if (sSEDescription.getStatus() != null && !sSEDescription.getStatus().equals(getStatus())) {
            return false;
        }
        if ((sSEDescription.getSSEType() == null) ^ (getSSEType() == null)) {
            return false;
        }
        if (sSEDescription.getSSEType() != null && !sSEDescription.getSSEType().equals(getSSEType())) {
            return false;
        }
        if ((sSEDescription.getKMSMasterKeyArn() == null) ^ (getKMSMasterKeyArn() == null)) {
            return false;
        }
        return sSEDescription.getKMSMasterKeyArn() == null || sSEDescription.getKMSMasterKeyArn().equals(getKMSMasterKeyArn());
    }

    public String getKMSMasterKeyArn() {
        return this.kMSMasterKeyArn;
    }

    public String getSSEType() {
        return this.sSEType;
    }

    public String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((getStatus() == null ? 0 : getStatus().hashCode()) + 31) * 31) + (getSSEType() == null ? 0 : getSSEType().hashCode())) * 31) + (getKMSMasterKeyArn() != null ? getKMSMasterKeyArn().hashCode() : 0);
    }

    public void setKMSMasterKeyArn(String str) {
        this.kMSMasterKeyArn = str;
    }

    public void setSSEType(String str) {
        this.sSEType = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStatus() != null) {
            sb.append("Status: " + getStatus() + ",");
        }
        if (getSSEType() != null) {
            sb.append("SSEType: " + getSSEType() + ",");
        }
        if (getKMSMasterKeyArn() != null) {
            sb.append("KMSMasterKeyArn: " + getKMSMasterKeyArn());
        }
        sb.append("}");
        return sb.toString();
    }

    public SSEDescription withKMSMasterKeyArn(String str) {
        this.kMSMasterKeyArn = str;
        return this;
    }

    public SSEDescription withSSEType(String str) {
        this.sSEType = str;
        return this;
    }

    public SSEDescription withStatus(String str) {
        this.status = str;
        return this;
    }

    public void setSSEType(SSEType sSEType) {
        this.sSEType = sSEType.toString();
    }

    public void setStatus(SSEStatus sSEStatus) {
        this.status = sSEStatus.toString();
    }

    public SSEDescription withSSEType(SSEType sSEType) {
        this.sSEType = sSEType.toString();
        return this;
    }

    public SSEDescription withStatus(SSEStatus sSEStatus) {
        this.status = sSEStatus.toString();
        return this;
    }
}
