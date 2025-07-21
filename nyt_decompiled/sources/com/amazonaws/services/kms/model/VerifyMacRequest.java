package com.amazonaws.services.kms.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public class VerifyMacRequest extends AmazonWebServiceRequest implements Serializable {
    private List<String> grantTokens = new ArrayList();
    private String keyId;
    private ByteBuffer mac;
    private String macAlgorithm;
    private ByteBuffer message;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof VerifyMacRequest)) {
            return false;
        }
        VerifyMacRequest verifyMacRequest = (VerifyMacRequest) obj;
        if ((verifyMacRequest.getMessage() == null) ^ (getMessage() == null)) {
            return false;
        }
        if (verifyMacRequest.getMessage() != null && !verifyMacRequest.getMessage().equals(getMessage())) {
            return false;
        }
        if ((verifyMacRequest.getKeyId() == null) ^ (getKeyId() == null)) {
            return false;
        }
        if (verifyMacRequest.getKeyId() != null && !verifyMacRequest.getKeyId().equals(getKeyId())) {
            return false;
        }
        if ((verifyMacRequest.getMacAlgorithm() == null) ^ (getMacAlgorithm() == null)) {
            return false;
        }
        if (verifyMacRequest.getMacAlgorithm() != null && !verifyMacRequest.getMacAlgorithm().equals(getMacAlgorithm())) {
            return false;
        }
        if ((verifyMacRequest.getMac() == null) ^ (getMac() == null)) {
            return false;
        }
        if (verifyMacRequest.getMac() != null && !verifyMacRequest.getMac().equals(getMac())) {
            return false;
        }
        if ((verifyMacRequest.getGrantTokens() == null) ^ (getGrantTokens() == null)) {
            return false;
        }
        return verifyMacRequest.getGrantTokens() == null || verifyMacRequest.getGrantTokens().equals(getGrantTokens());
    }

    public List<String> getGrantTokens() {
        return this.grantTokens;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public ByteBuffer getMac() {
        return this.mac;
    }

    public String getMacAlgorithm() {
        return this.macAlgorithm;
    }

    public ByteBuffer getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (((((((((getMessage() == null ? 0 : getMessage().hashCode()) + 31) * 31) + (getKeyId() == null ? 0 : getKeyId().hashCode())) * 31) + (getMacAlgorithm() == null ? 0 : getMacAlgorithm().hashCode())) * 31) + (getMac() == null ? 0 : getMac().hashCode())) * 31) + (getGrantTokens() != null ? getGrantTokens().hashCode() : 0);
    }

    public void setGrantTokens(Collection<String> collection) {
        if (collection == null) {
            this.grantTokens = null;
        } else {
            this.grantTokens = new ArrayList(collection);
        }
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public void setMac(ByteBuffer byteBuffer) {
        this.mac = byteBuffer;
    }

    public void setMacAlgorithm(String str) {
        this.macAlgorithm = str;
    }

    public void setMessage(ByteBuffer byteBuffer) {
        this.message = byteBuffer;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMessage() != null) {
            sb.append("Message: " + getMessage() + ",");
        }
        if (getKeyId() != null) {
            sb.append("KeyId: " + getKeyId() + ",");
        }
        if (getMacAlgorithm() != null) {
            sb.append("MacAlgorithm: " + getMacAlgorithm() + ",");
        }
        if (getMac() != null) {
            sb.append("Mac: " + getMac() + ",");
        }
        if (getGrantTokens() != null) {
            sb.append("GrantTokens: " + getGrantTokens());
        }
        sb.append("}");
        return sb.toString();
    }

    public VerifyMacRequest withGrantTokens(String... strArr) {
        if (getGrantTokens() == null) {
            this.grantTokens = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.grantTokens.add(str);
        }
        return this;
    }

    public VerifyMacRequest withKeyId(String str) {
        this.keyId = str;
        return this;
    }

    public VerifyMacRequest withMac(ByteBuffer byteBuffer) {
        this.mac = byteBuffer;
        return this;
    }

    public VerifyMacRequest withMacAlgorithm(String str) {
        this.macAlgorithm = str;
        return this;
    }

    public VerifyMacRequest withMessage(ByteBuffer byteBuffer) {
        this.message = byteBuffer;
        return this;
    }

    public void setMacAlgorithm(MacAlgorithmSpec macAlgorithmSpec) {
        this.macAlgorithm = macAlgorithmSpec.toString();
    }

    public VerifyMacRequest withMacAlgorithm(MacAlgorithmSpec macAlgorithmSpec) {
        this.macAlgorithm = macAlgorithmSpec.toString();
        return this;
    }

    public VerifyMacRequest withGrantTokens(Collection<String> collection) {
        setGrantTokens(collection);
        return this;
    }
}
