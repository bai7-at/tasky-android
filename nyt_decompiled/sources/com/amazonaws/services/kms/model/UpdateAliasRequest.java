package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class UpdateAliasRequest extends AmazonWebServiceRequest implements Serializable {
    private String aliasName;
    private String targetKeyId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateAliasRequest)) {
            return false;
        }
        UpdateAliasRequest updateAliasRequest = (UpdateAliasRequest) obj;
        if ((updateAliasRequest.getAliasName() == null) ^ (getAliasName() == null)) {
            return false;
        }
        if (updateAliasRequest.getAliasName() != null && !updateAliasRequest.getAliasName().equals(getAliasName())) {
            return false;
        }
        if ((updateAliasRequest.getTargetKeyId() == null) ^ (getTargetKeyId() == null)) {
            return false;
        }
        return updateAliasRequest.getTargetKeyId() == null || updateAliasRequest.getTargetKeyId().equals(getTargetKeyId());
    }

    public String getAliasName() {
        return this.aliasName;
    }

    public String getTargetKeyId() {
        return this.targetKeyId;
    }

    public int hashCode() {
        return (((getAliasName() == null ? 0 : getAliasName().hashCode()) + 31) * 31) + (getTargetKeyId() != null ? getTargetKeyId().hashCode() : 0);
    }

    public void setAliasName(String str) {
        this.aliasName = str;
    }

    public void setTargetKeyId(String str) {
        this.targetKeyId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAliasName() != null) {
            sb.append("AliasName: " + getAliasName() + ",");
        }
        if (getTargetKeyId() != null) {
            sb.append("TargetKeyId: " + getTargetKeyId());
        }
        sb.append("}");
        return sb.toString();
    }

    public UpdateAliasRequest withAliasName(String str) {
        this.aliasName = str;
        return this;
    }

    public UpdateAliasRequest withTargetKeyId(String str) {
        this.targetKeyId = str;
        return this;
    }
}
