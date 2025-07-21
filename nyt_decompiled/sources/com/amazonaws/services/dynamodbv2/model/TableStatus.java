package com.amazonaws.services.dynamodbv2.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public enum TableStatus {
    CREATING("CREATING"),
    UPDATING("UPDATING"),
    DELETING("DELETING"),
    ACTIVE("ACTIVE");

    private static final Map<String, TableStatus> enumMap;
    private String value;

    static {
        TableStatus tableStatus = CREATING;
        TableStatus tableStatus2 = UPDATING;
        TableStatus tableStatus3 = DELETING;
        TableStatus tableStatus4 = ACTIVE;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("CREATING", tableStatus);
        hashMap.put("UPDATING", tableStatus2);
        hashMap.put("DELETING", tableStatus3);
        hashMap.put("ACTIVE", tableStatus4);
    }

    TableStatus(String str) {
        this.value = str;
    }

    public static TableStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, TableStatus> map = enumMap;
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
