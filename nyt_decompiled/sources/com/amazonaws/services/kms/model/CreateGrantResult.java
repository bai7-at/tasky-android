package com.amazonaws.services.kms.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class CreateGrantResult implements Serializable {
    private String grantId;
    private String grantToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CreateGrantResult)) {
            return false;
        }
        CreateGrantResult createGrantResult = (CreateGrantResult) obj;
        if ((createGrantResult.getGrantToken() == null) ^ (getGrantToken() == null)) {
            return false;
        }
        if (createGrantResult.getGrantToken() != null && !createGrantResult.getGrantToken().equals(getGrantToken())) {
            return false;
        }
        if ((createGrantResult.getGrantId() == null) ^ (getGrantId() == null)) {
            return false;
        }
        return createGrantResult.getGrantId() == null || createGrantResult.getGrantId().equals(getGrantId());
    }

    public String getGrantId() {
        return this.grantId;
    }

    public String getGrantToken() {
        return this.grantToken;
    }

    public int hashCode() {
        return (((getGrantToken() == null ? 0 : getGrantToken().hashCode()) + 31) * 31) + (getGrantId() != null ? getGrantId().hashCode() : 0);
    }

    public void setGrantId(String str) {
        this.grantId = str;
    }

    public void setGrantToken(String str) {
        this.grantToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGrantToken() != null) {
            sb.append("GrantToken: " + getGrantToken() + ",");
        }
        if (getGrantId() != null) {
            sb.append("GrantId: " + getGrantId());
        }
        sb.append("}");
        return sb.toString();
    }

    public CreateGrantResult withGrantId(String str) {
        this.grantId = str;
        return this;
    }

    public CreateGrantResult withGrantToken(String str) {
        this.grantToken = str;
        return this;
    }
}
