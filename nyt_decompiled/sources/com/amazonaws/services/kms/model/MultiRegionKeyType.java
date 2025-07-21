package com.amazonaws.services.kms.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public enum MultiRegionKeyType {
    PRIMARY("PRIMARY"),
    REPLICA("REPLICA");

    private static final Map<String, MultiRegionKeyType> enumMap;
    private String value;

    static {
        MultiRegionKeyType multiRegionKeyType = PRIMARY;
        MultiRegionKeyType multiRegionKeyType2 = REPLICA;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("PRIMARY", multiRegionKeyType);
        hashMap.put("REPLICA", multiRegionKeyType2);
    }

    MultiRegionKeyType(String str) {
        this.value = str;
    }

    public static MultiRegionKeyType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, MultiRegionKeyType> map = enumMap;
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
