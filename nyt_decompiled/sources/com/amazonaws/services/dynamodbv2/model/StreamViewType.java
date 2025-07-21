package com.amazonaws.services.dynamodbv2.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public enum StreamViewType {
    NEW_IMAGE("NEW_IMAGE"),
    OLD_IMAGE("OLD_IMAGE"),
    NEW_AND_OLD_IMAGES("NEW_AND_OLD_IMAGES"),
    KEYS_ONLY("KEYS_ONLY");

    private static final Map<String, StreamViewType> enumMap;
    private String value;

    static {
        StreamViewType streamViewType = NEW_IMAGE;
        StreamViewType streamViewType2 = OLD_IMAGE;
        StreamViewType streamViewType3 = NEW_AND_OLD_IMAGES;
        StreamViewType streamViewType4 = KEYS_ONLY;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("NEW_IMAGE", streamViewType);
        hashMap.put("OLD_IMAGE", streamViewType2);
        hashMap.put("NEW_AND_OLD_IMAGES", streamViewType3);
        hashMap.put("KEYS_ONLY", streamViewType4);
    }

    StreamViewType(String str) {
        this.value = str;
    }

    public static StreamViewType fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, StreamViewType> map = enumMap;
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
