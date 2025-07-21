package com.amazonaws.services.dynamodbv2.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public enum SSEStatus {
    ENABLING("ENABLING"),
    ENABLED("ENABLED"),
    DISABLING("DISABLING"),
    DISABLED("DISABLED"),
    UPDATING("UPDATING");

    private static final Map<String, SSEStatus> enumMap;
    private String value;

    static {
        SSEStatus sSEStatus = ENABLING;
        SSEStatus sSEStatus2 = ENABLED;
        SSEStatus sSEStatus3 = DISABLING;
        SSEStatus sSEStatus4 = DISABLED;
        SSEStatus sSEStatus5 = UPDATING;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("ENABLING", sSEStatus);
        hashMap.put("ENABLED", sSEStatus2);
        hashMap.put("DISABLING", sSEStatus3);
        hashMap.put("DISABLED", sSEStatus4);
        hashMap.put("UPDATING", sSEStatus5);
    }

    SSEStatus(String str) {
        this.value = str;
    }

    public static SSEStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, SSEStatus> map = enumMap;
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
