package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class RevokeGrantRequest extends AmazonWebServiceRequest implements Serializable {
    private String grantId;
    private String keyId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RevokeGrantRequest)) {
            return false;
        }
        RevokeGrantRequest revokeGrantRequest = (RevokeGrantRequest) obj;
        if ((revokeGrantRequest.getKeyId() == null) ^ (getKeyId() == null)) {
            return false;
        }
        if (revokeGrantRequest.getKeyId() != null && !revokeGrantRequest.getKeyId().equals(getKeyId())) {
            return false;
        }
        if ((revokeGrantRequest.getGrantId() == null) ^ (getGrantId() == null)) {
            return false;
        }
        return revokeGrantRequest.getGrantId() == null || revokeGrantRequest.getGrantId().equals(getGrantId());
    }

    public String getGrantId() {
        return this.grantId;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public int hashCode() {
        return (((getKeyId() == null ? 0 : getKeyId().hashCode()) + 31) * 31) + (getGrantId() != null ? getGrantId().hashCode() : 0);
    }

    public void setGrantId(String str) {
        this.grantId = str;
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKeyId() != null) {
            sb.append("KeyId: " + getKeyId() + ",");
        }
        if (getGrantId() != null) {
            sb.append("GrantId: " + getGrantId());
        }
        sb.append("}");
        return sb.toString();
    }

    public RevokeGrantRequest withGrantId(String str) {
        this.grantId = str;
        return this;
    }

    public RevokeGrantRequest withKeyId(String str) {
        this.keyId = str;
        return this;
    }
}
