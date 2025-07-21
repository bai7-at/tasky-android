package com.amazonaws.services.dynamodbv2.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public enum TimeToLiveStatus {
    ENABLING("ENABLING"),
    DISABLING("DISABLING"),
    ENABLED("ENABLED"),
    DISABLED("DISABLED");

    private static final Map<String, TimeToLiveStatus> enumMap;
    private String value;

    static {
        TimeToLiveStatus timeToLiveStatus = ENABLING;
        TimeToLiveStatus timeToLiveStatus2 = DISABLING;
        TimeToLiveStatus timeToLiveStatus3 = ENABLED;
        TimeToLiveStatus timeToLiveStatus4 = DISABLED;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("ENABLING", timeToLiveStatus);
        hashMap.put("DISABLING", timeToLiveStatus2);
        hashMap.put("ENABLED", timeToLiveStatus3);
        hashMap.put("DISABLED", timeToLiveStatus4);
    }

    TimeToLiveStatus(String str) {
        this.value = str;
    }

    public static TimeToLiveStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, TimeToLiveStatus> map = enumMap;
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
