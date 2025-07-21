package com.amazonaws.services.securitytoken.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public class AssumeRoleWithWebIdentityRequest extends AmazonWebServiceRequest implements Serializable {
    private Integer durationSeconds;
    private String policy;
    private List<PolicyDescriptorType> policyArns;
    private String providerId;
    private String roleArn;
    private String roleSessionName;
    private String webIdentityToken;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AssumeRoleWithWebIdentityRequest)) {
            return false;
        }
        AssumeRoleWithWebIdentityRequest assumeRoleWithWebIdentityRequest = (AssumeRoleWithWebIdentityRequest) obj;
        if ((assumeRoleWithWebIdentityRequest.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.getRoleArn() != null && !assumeRoleWithWebIdentityRequest.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((assumeRoleWithWebIdentityRequest.getRoleSessionName() == null) ^ (getRoleSessionName() == null)) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.getRoleSessionName() != null && !assumeRoleWithWebIdentityRequest.getRoleSessionName().equals(getRoleSessionName())) {
            return false;
        }
        if ((assumeRoleWithWebIdentityRequest.getWebIdentityToken() == null) ^ (getWebIdentityToken() == null)) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.getWebIdentityToken() != null && !assumeRoleWithWebIdentityRequest.getWebIdentityToken().equals(getWebIdentityToken())) {
            return false;
        }
        if ((assumeRoleWithWebIdentityRequest.getProviderId() == null) ^ (getProviderId() == null)) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.getProviderId() != null && !assumeRoleWithWebIdentityRequest.getProviderId().equals(getProviderId())) {
            return false;
        }
        if ((assumeRoleWithWebIdentityRequest.getPolicyArns() == null) ^ (getPolicyArns() == null)) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.getPolicyArns() != null && !assumeRoleWithWebIdentityRequest.getPolicyArns().equals(getPolicyArns())) {
            return false;
        }
        if ((assumeRoleWithWebIdentityRequest.getPolicy() == null) ^ (getPolicy() == null)) {
            return false;
        }
        if (assumeRoleWithWebIdentityRequest.getPolicy() != null && !assumeRoleWithWebIdentityRequest.getPolicy().equals(getPolicy())) {
            return false;
        }
        if ((assumeRoleWithWebIdentityRequest.getDurationSeconds() == null) ^ (getDurationSeconds() == null)) {
            return false;
        }
        return assumeRoleWithWebIdentityRequest.getDurationSeconds() == null || assumeRoleWithWebIdentityRequest.getDurationSeconds().equals(getDurationSeconds());
    }

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    public String getPolicy() {
        return this.policy;
    }

    public List<PolicyDescriptorType> getPolicyArns() {
        return this.policyArns;
    }

    public String getProviderId() {
        return this.providerId;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public String getRoleSessionName() {
        return this.roleSessionName;
    }

    public String getWebIdentityToken() {
        return this.webIdentityToken;
    }

    public int hashCode() {
        return (((((((((((((getRoleArn() == null ? 0 : getRoleArn().hashCode()) + 31) * 31) + (getRoleSessionName() == null ? 0 : getRoleSessionName().hashCode())) * 31) + (getWebIdentityToken() == null ? 0 : getWebIdentityToken().hashCode())) * 31) + (getProviderId() == null ? 0 : getProviderId().hashCode())) * 31) + (getPolicyArns() == null ? 0 : getPolicyArns().hashCode())) * 31) + (getPolicy() == null ? 0 : getPolicy().hashCode())) * 31) + (getDurationSeconds() != null ? getDurationSeconds().hashCode() : 0);
    }

    public void setDurationSeconds(Integer num) {
        this.durationSeconds = num;
    }

    public void setPolicy(String str) {
        this.policy = str;
    }

    public void setPolicyArns(Collection<PolicyDescriptorType> collection) {
        if (collection == null) {
            this.policyArns = null;
        } else {
            this.policyArns = new ArrayList(collection);
        }
    }

    public void setProviderId(String str) {
        this.providerId = str;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public void setRoleSessionName(String str) {
        this.roleSessionName = str;
    }

    public void setWebIdentityToken(String str) {
        this.webIdentityToken = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRoleArn() != null) {
            sb.append("RoleArn: " + getRoleArn() + ",");
        }
        if (getRoleSessionName() != null) {
            sb.append("RoleSessionName: " + getRoleSessionName() + ",");
        }
        if (getWebIdentityToken() != null) {
            sb.append("WebIdentityToken: " + getWebIdentityToken() + ",");
        }
        if (getProviderId() != null) {
            sb.append("ProviderId: " + getProviderId() + ",");
        }
        if (getPolicyArns() != null) {
            sb.append("PolicyArns: " + getPolicyArns() + ",");
        }
        if (getPolicy() != null) {
            sb.append("Policy: " + getPolicy() + ",");
        }
        if (getDurationSeconds() != null) {
            sb.append("DurationSeconds: " + getDurationSeconds());
        }
        sb.append("}");
        return sb.toString();
    }

    public AssumeRoleWithWebIdentityRequest withDurationSeconds(Integer num) {
        this.durationSeconds = num;
        return this;
    }

    public AssumeRoleWithWebIdentityRequest withPolicy(String str) {
        this.policy = str;
        return this;
    }

    public AssumeRoleWithWebIdentityRequest withPolicyArns(PolicyDescriptorType... policyDescriptorTypeArr) {
        if (getPolicyArns() == null) {
            this.policyArns = new ArrayList(policyDescriptorTypeArr.length);
        }
        for (PolicyDescriptorType policyDescriptorType : policyDescriptorTypeArr) {
            this.policyArns.add(policyDescriptorType);
        }
        return this;
    }

    public AssumeRoleWithWebIdentityRequest withProviderId(String str) {
        this.providerId = str;
        return this;
    }

    public AssumeRoleWithWebIdentityRequest withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public AssumeRoleWithWebIdentityRequest withRoleSessionName(String str) {
        this.roleSessionName = str;
        return this;
    }

    public AssumeRoleWithWebIdentityRequest withWebIdentityToken(String str) {
        this.webIdentityToken = str;
        return this;
    }

    public AssumeRoleWithWebIdentityRequest withPolicyArns(Collection<PolicyDescriptorType> collection) {
        setPolicyArns(collection);
        return this;
    }
}
