package com.amazonaws.services.dynamodbv2.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public enum SSEType {
    AES256("AES256"),
    KMS("KMS");

    private static final Map<String, SSEType> enumMap;
    private String value;

    static {
        SSEType sSEType = AES256;
        SSEType sSEType2 = KMS;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("AES256", sSEType);
        hashMap.put("KMS", sSEType2);
    }

    SSEType(String str) {
        this.value = str;
    }

    public static SSEType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, SSEType> map = enumMap;
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
