package com.amazonaws.services.kms.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public enum KeySpec {
    RSA_2048("RSA_2048"),
    RSA_3072("RSA_3072"),
    RSA_4096("RSA_4096"),
    ECC_NIST_P256("ECC_NIST_P256"),
    ECC_NIST_P384("ECC_NIST_P384"),
    ECC_NIST_P521("ECC_NIST_P521"),
    ECC_SECG_P256K1("ECC_SECG_P256K1"),
    SYMMETRIC_DEFAULT("SYMMETRIC_DEFAULT"),
    HMAC_224("HMAC_224"),
    HMAC_256("HMAC_256"),
    HMAC_384("HMAC_384"),
    HMAC_512("HMAC_512"),
    SM2("SM2");

    private static final Map<String, KeySpec> enumMap;
    private String value;

    static {
        KeySpec keySpec = RSA_2048;
        KeySpec keySpec2 = RSA_3072;
        KeySpec keySpec3 = RSA_4096;
        KeySpec keySpec4 = ECC_NIST_P256;
        KeySpec keySpec5 = ECC_NIST_P384;
        KeySpec keySpec6 = ECC_NIST_P521;
        KeySpec keySpec7 = ECC_SECG_P256K1;
        KeySpec keySpec8 = SYMMETRIC_DEFAULT;
        KeySpec keySpec9 = HMAC_224;
        KeySpec keySpec10 = HMAC_256;
        KeySpec keySpec11 = HMAC_384;
        KeySpec keySpec12 = HMAC_512;
        KeySpec keySpec13 = SM2;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("RSA_2048", keySpec);
        hashMap.put("RSA_3072", keySpec2);
        hashMap.put("RSA_4096", keySpec3);
        hashMap.put("ECC_NIST_P256", keySpec4);
        hashMap.put("ECC_NIST_P384", keySpec5);
        hashMap.put("ECC_NIST_P521", keySpec6);
        hashMap.put("ECC_SECG_P256K1", keySpec7);
        hashMap.put("SYMMETRIC_DEFAULT", keySpec8);
        hashMap.put("HMAC_224", keySpec9);
        hashMap.put("HMAC_256", keySpec10);
        hashMap.put("HMAC_384", keySpec11);
        hashMap.put("HMAC_512", keySpec12);
        hashMap.put("SM2", keySpec13);
    }

    KeySpec(String str) {
        this.value = str;
    }

    public static KeySpec fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, KeySpec> map = enumMap;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Cannot create enum from " + str + " value!");
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
