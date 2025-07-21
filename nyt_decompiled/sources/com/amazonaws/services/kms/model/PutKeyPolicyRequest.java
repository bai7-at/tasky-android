package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class PutKeyPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    private Boolean bypassPolicyLockoutSafetyCheck;
    private String keyId;
    private String policy;
    private String policyName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PutKeyPolicyRequest)) {
            return false;
        }
        PutKeyPolicyRequest putKeyPolicyRequest = (PutKeyPolicyRequest) obj;
        if ((putKeyPolicyRequest.getKeyId() == null) ^ (getKeyId() == null)) {
            return false;
        }
        if (putKeyPolicyRequest.getKeyId() != null && !putKeyPolicyRequest.getKeyId().equals(getKeyId())) {
            return false;
        }
        if ((putKeyPolicyRequest.getPolicyName() == null) ^ (getPolicyName() == null)) {
            return false;
        }
        if (putKeyPolicyRequest.getPolicyName() != null && !putKeyPolicyRequest.getPolicyName().equals(getPolicyName())) {
            return false;
        }
        if ((putKeyPolicyRequest.getPolicy() == null) ^ (getPolicy() == null)) {
            return false;
        }
        if (putKeyPolicyRequest.getPolicy() != null && !putKeyPolicyRequest.getPolicy().equals(getPolicy())) {
            return false;
        }
        if ((putKeyPolicyRequest.getBypassPolicyLockoutSafetyCheck() == null) ^ (getBypassPolicyLockoutSafetyCheck() == null)) {
            return false;
        }
        return putKeyPolicyRequest.getBypassPolicyLockoutSafetyCheck() == null || putKeyPolicyRequest.getBypassPolicyLockoutSafetyCheck().equals(getBypassPolicyLockoutSafetyCheck());
    }

    public Boolean getBypassPolicyLockoutSafetyCheck() {
        return this.bypassPolicyLockoutSafetyCheck;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public String getPolicy() {
        return this.policy;
    }

    public String getPolicyName() {
        return this.policyName;
    }

    public int hashCode() {
        return (((((((getKeyId() == null ? 0 : getKeyId().hashCode()) + 31) * 31) + (getPolicyName() == null ? 0 : getPolicyName().hashCode())) * 31) + (getPolicy() == null ? 0 : getPolicy().hashCode())) * 31) + (getBypassPolicyLockoutSafetyCheck() != null ? getBypassPolicyLockoutSafetyCheck().hashCode() : 0);
    }

    public Boolean isBypassPolicyLockoutSafetyCheck() {
        return this.bypassPolicyLockoutSafetyCheck;
    }

    public void setBypassPolicyLockoutSafetyCheck(Boolean bool) {
        this.bypassPolicyLockoutSafetyCheck = bool;
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public void setPolicy(String str) {
        this.policy = str;
    }

    public void setPolicyName(String str) {
        this.policyName = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKeyId() != null) {
            sb.append("KeyId: " + getKeyId() + ",");
        }
        if (getPolicyName() != null) {
            sb.append("PolicyName: " + getPolicyName() + ",");
        }
        if (getPolicy() != null) {
            sb.append("Policy: " + getPolicy() + ",");
        }
        if (getBypassPolicyLockoutSafetyCheck() != null) {
            sb.append("BypassPolicyLockoutSafetyCheck: " + getBypassPolicyLockoutSafetyCheck());
        }
        sb.append("}");
        return sb.toString();
    }

    public PutKeyPolicyRequest withBypassPolicyLockoutSafetyCheck(Boolean bool) {
        this.bypassPolicyLockoutSafetyCheck = bool;
        return this;
    }

    public PutKeyPolicyRequest withKeyId(String str) {
        this.keyId = str;
        return this;
    }

    public PutKeyPolicyRequest withPolicy(String str) {
        this.policy = str;
        return this;
    }

    public PutKeyPolicyRequest withPolicyName(String str) {
        this.policyName = str;
        return this;
    }
}
