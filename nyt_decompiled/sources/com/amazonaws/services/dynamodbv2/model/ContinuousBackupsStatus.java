package com.amazonaws.services.dynamodbv2.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public enum ContinuousBackupsStatus {
    ENABLED("ENABLED"),
    DISABLED("DISABLED");

    private static final Map<String, ContinuousBackupsStatus> enumMap;
    private String value;

    static {
        ContinuousBackupsStatus continuousBackupsStatus = ENABLED;
        ContinuousBackupsStatus continuousBackupsStatus2 = DISABLED;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("ENABLED", continuousBackupsStatus);
        hashMap.put("DISABLED", continuousBackupsStatus2);
    }

    ContinuousBackupsStatus(String str) {
        this.value = str;
    }

    public static ContinuousBackupsStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, ContinuousBackupsStatus> map = enumMap;
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
