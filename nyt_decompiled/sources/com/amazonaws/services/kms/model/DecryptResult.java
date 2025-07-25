package com.amazonaws.services.kms.model;

import java.io.Serializable;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class DecryptResult implements Serializable {
    private String encryptionAlgorithm;
    private String keyId;
    private ByteBuffer plaintext;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DecryptResult)) {
            return false;
        }
        DecryptResult decryptResult = (DecryptResult) obj;
        if ((decryptResult.getKeyId() == null) ^ (getKeyId() == null)) {
            return false;
        }
        if (decryptResult.getKeyId() != null && !decryptResult.getKeyId().equals(getKeyId())) {
            return false;
        }
        if ((decryptResult.getPlaintext() == null) ^ (getPlaintext() == null)) {
            return false;
        }
        if (decryptResult.getPlaintext() != null && !decryptResult.getPlaintext().equals(getPlaintext())) {
            return false;
        }
        if ((decryptResult.getEncryptionAlgorithm() == null) ^ (getEncryptionAlgorithm() == null)) {
            return false;
        }
        return decryptResult.getEncryptionAlgorithm() == null || decryptResult.getEncryptionAlgorithm().equals(getEncryptionAlgorithm());
    }

    public String getEncryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }

    public String getKeyId() {
        return this.keyId;
    }

    public ByteBuffer getPlaintext() {
        return this.plaintext;
    }

    public int hashCode() {
        return (((((getKeyId() == null ? 0 : getKeyId().hashCode()) + 31) * 31) + (getPlaintext() == null ? 0 : getPlaintext().hashCode())) * 31) + (getEncryptionAlgorithm() != null ? getEncryptionAlgorithm().hashCode() : 0);
    }

    public void setEncryptionAlgorithm(String str) {
        this.encryptionAlgorithm = str;
    }

    public void setKeyId(String str) {
        this.keyId = str;
    }

    public void setPlaintext(ByteBuffer byteBuffer) {
        this.plaintext = byteBuffer;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKeyId() != null) {
            sb.append("KeyId: " + getKeyId() + ",");
        }
        if (getPlaintext() != null) {
            sb.append("Plaintext: " + getPlaintext() + ",");
        }
        if (getEncryptionAlgorithm() != null) {
            sb.append("EncryptionAlgorithm: " + getEncryptionAlgorithm());
        }
        sb.append("}");
        return sb.toString();
    }

    public DecryptResult withEncryptionAlgorithm(String str) {
        this.encryptionAlgorithm = str;
        return this;
    }

    public DecryptResult withKeyId(String str) {
        this.keyId = str;
        return this;
    }

    public DecryptResult withPlaintext(ByteBuffer byteBuffer) {
        this.plaintext = byteBuffer;
        return this;
    }

    public void setEncryptionAlgorithm(EncryptionAlgorithmSpec encryptionAlgorithmSpec) {
        this.encryptionAlgorithm = encryptionAlgorithmSpec.toString();
    }

    public DecryptResult withEncryptionAlgorithm(EncryptionAlgorithmSpec encryptionAlgorithmSpec) {
        this.encryptionAlgorithm = encryptionAlgorithmSpec.toString();
        return this;
    }
}
