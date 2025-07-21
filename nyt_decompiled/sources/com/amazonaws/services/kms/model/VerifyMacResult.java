package com.amazonaws.services.kms.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class VerifyMacResult implements Serializable {
    private String keyId;
    private String macAlgorithm;
    private Boolean macValid;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof VerifyMacResult)) {
            return false;
        }
        VerifyMacResult verifyMacResult = (VerifyMacResult) obj;
        if ((verifyMacResult.getKeyId() == null) ^ (getKeyId() == null)) {
            return false;
        }
        if (verifyMacResult.getKeyId() != null && !verifyMacResult.getKeyId().equals(getKeyId())) {
            return false;
        }
        if ((verifyMacResult.getMacValid() == null) ^ (getMacValid() == null)) {
            return false;
        }
        if (verifyMacResult.getMacValid() != null && !verifyMacResult.getMacValid().equals(getMacValid())) {
            return false;
        }
        if ((verifyMacResult.getMacAlgorithm() == null) ^ (getMacAlgorithm() == null)) {
            return false;
        }
        return verifyMacResult.getMacAlgorithm() == null || verifyMacResult.getMacAlgorithm().equals(getMacAlgorithm());
    }

    public String getKeyId() {
        return this.keyId;
    }

    public String getMacAlgorithm() {
        return this.macAlgorithm;
    }

    public Boolean getMacValid() {
        return this.macValid;
    }

    public int hashCode() {
        return (((((getKeyId() == null ? 0 : getKeyId().hashCode()) + 31) * 31) + (getMacValid() == null ? 0 : getMacValid().hashCode())) * 31) + (getMacAlgorithm() != null ? getMacAlgorithm().hashCode() : 0);
    }

    public Boolean isMacValid() {
        return this.macValid;
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public void setMacAlgorithm(String str) {
        this.macAlgorithm = str;
    }

    public void setMacValid(Boolean bool) {
        this.macValid = bool;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKeyId() != null) {
            sb.append("KeyId: " + getKeyId() + ",");
        }
        if (getMacValid() != null) {
            sb.append("MacValid: " + getMacValid() + ",");
        }
        if (getMacAlgorithm() != null) {
            sb.append("MacAlgorithm: " + getMacAlgorithm());
        }
        sb.append("}");
        return sb.toString();
    }

    public VerifyMacResult withKeyId(String str) {
        this.keyId = str;
        return this;
    }

    public VerifyMacResult withMacAlgorithm(String str) {
        this.macAlgorithm = str;
        return this;
    }

    public VerifyMacResult withMacValid(Boolean bool) {
        this.macValid = bool;
        return this;
    }

    public void setMacAlgorithm(MacAlgorithmSpec macAlgorithmSpec) {
        this.macAlgorithm = macAlgorithmSpec.toString();
    }

    public VerifyMacResult withMacAlgorithm(MacAlgorithmSpec macAlgorithmSpec) {
        this.macAlgorithm = macAlgorithmSpec.toString();
        return this;
    }
}
