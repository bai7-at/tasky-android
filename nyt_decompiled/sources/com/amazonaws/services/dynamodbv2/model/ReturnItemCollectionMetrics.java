package com.amazonaws.services.dynamodbv2.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public enum ReturnItemCollectionMetrics {
    SIZE("SIZE"),
    NONE("NONE");

    private static final Map<String, ReturnItemCollectionMetrics> enumMap;
    private String value;

    static {
        ReturnItemCollectionMetrics returnItemCollectionMetrics = SIZE;
        ReturnItemCollectionMetrics returnItemCollectionMetrics2 = NONE;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("SIZE", returnItemCollectionMetrics);
        hashMap.put("NONE", returnItemCollectionMetrics2);
    }

    ReturnItemCollectionMetrics(String str) {
        this.value = str;
    }

    public static ReturnItemCollectionMetrics fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, ReturnItemCollectionMetrics> map = enumMap;
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
