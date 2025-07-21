package com.amazonaws.services.cognitosync.model;

import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public enum Platform {
    APNS("APNS"),
    APNS_SANDBOX("APNS_SANDBOX"),
    GCM("GCM"),
    ADM("ADM");

    private static final Map<String, Platform> enumMap;
    private String value;

    static {
        Platform platform = APNS;
        Platform platform2 = APNS_SANDBOX;
        Platform platform3 = GCM;
        Platform platform4 = ADM;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("APNS", platform);
        hashMap.put("APNS_SANDBOX", platform2);
        hashMap.put("GCM", platform3);
        hashMap.put("ADM", platform4);
    }

    Platform(String str) {
        this.value = str;
    }

    public static Platform fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, Platform> map = enumMap;
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
