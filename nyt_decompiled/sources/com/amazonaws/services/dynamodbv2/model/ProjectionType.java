package com.amazonaws.services.dynamodbv2.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public enum ProjectionType {
    ALL("ALL"),
    KEYS_ONLY("KEYS_ONLY"),
    INCLUDE("INCLUDE");

    private static final Map<String, ProjectionType> enumMap;
    private String value;

    static {
        ProjectionType projectionType = ALL;
        ProjectionType projectionType2 = KEYS_ONLY;
        ProjectionType projectionType3 = INCLUDE;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("ALL", projectionType);
        hashMap.put("KEYS_ONLY", projectionType2);
        hashMap.put("INCLUDE", projectionType3);
    }

    ProjectionType(String str) {
        this.value = str;
    }

    public static ProjectionType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, ProjectionType> map = enumMap;
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
