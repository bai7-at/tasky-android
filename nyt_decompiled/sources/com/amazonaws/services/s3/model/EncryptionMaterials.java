package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.security.KeyPair;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.SecretKey;

@Deprecated
/* loaded from: classes2.dex */
public class EncryptionMaterials implements Serializable {
    private final Map<String, String> desc;
    private final KeyPair keyPair;
    private final SecretKey symmetricKey;

    public EncryptionMaterials(KeyPair keyPair) {
        this(keyPair, null);
    }

    public EncryptionMaterials addDescription(String str, String str2) {
        this.desc.put(str, str2);
        return this;
    }

    public EncryptionMaterials addDescriptions(Map<String, String> map) {
        this.desc.putAll(map);
        return this;
    }

    public EncryptionMaterialsAccessor getAccessor() {
        return null;
    }

    public String getCustomerMasterKeyId() {
        throw new UnsupportedOperationException();
    }

    protected String getDescription(String str) {
        return this.desc.get(str);
    }

    public KeyPair getKeyPair() {
        return this.keyPair;
    }

    public Map<String, String> getMaterialsDescription() {
        return new HashMap(this.desc);
    }

    public SecretKey getSymmetricKey() {
        return this.symmetricKey;
    }

    public boolean isKMSEnabled() {
        return false;
    }

    public EncryptionMaterials(SecretKey secretKey) {
        this(null, secretKey);
    }

    protected EncryptionMaterials(KeyPair keyPair, SecretKey secretKey) {
        this.desc = new HashMap();
        this.keyPair = keyPair;
        this.symmetricKey = secretKey;
    }
}
