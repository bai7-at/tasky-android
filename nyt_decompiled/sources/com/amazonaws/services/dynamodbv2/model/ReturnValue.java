package com.amazonaws.services.dynamodbv2.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public enum ReturnValue {
    NONE("NONE"),
    ALL_OLD("ALL_OLD"),
    UPDATED_OLD("UPDATED_OLD"),
    ALL_NEW("ALL_NEW"),
    UPDATED_NEW("UPDATED_NEW");

    private static final Map<String, ReturnValue> enumMap;
    private String value;

    static {
        ReturnValue returnValue = NONE;
        ReturnValue returnValue2 = ALL_OLD;
        ReturnValue returnValue3 = UPDATED_OLD;
        ReturnValue returnValue4 = ALL_NEW;
        ReturnValue returnValue5 = UPDATED_NEW;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("NONE", returnValue);
        hashMap.put("ALL_OLD", returnValue2);
        hashMap.put("UPDATED_OLD", returnValue3);
        hashMap.put("ALL_NEW", returnValue4);
        hashMap.put("UPDATED_NEW", returnValue5);
    }

    ReturnValue(String str) {
        this.value = str;
    }

    public static ReturnValue fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, ReturnValue> map = enumMap;
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
