package com.amazonaws.services.dynamodbv2.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public enum IndexStatus {
    CREATING("CREATING"),
    UPDATING("UPDATING"),
    DELETING("DELETING"),
    ACTIVE("ACTIVE");

    private static final Map<String, IndexStatus> enumMap;
    private String value;

    static {
        IndexStatus indexStatus = CREATING;
        IndexStatus indexStatus2 = UPDATING;
        IndexStatus indexStatus3 = DELETING;
        IndexStatus indexStatus4 = ACTIVE;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("CREATING", indexStatus);
        hashMap.put("UPDATING", indexStatus2);
        hashMap.put("DELETING", indexStatus3);
        hashMap.put("ACTIVE", indexStatus4);
    }

    IndexStatus(String str) {
        this.value = str;
    }

    public static IndexStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, IndexStatus> map = enumMap;
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
