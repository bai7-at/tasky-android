package com.amazonaws.services.dynamodbv2.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public enum Select {
    ALL_ATTRIBUTES("ALL_ATTRIBUTES"),
    ALL_PROJECTED_ATTRIBUTES("ALL_PROJECTED_ATTRIBUTES"),
    SPECIFIC_ATTRIBUTES("SPECIFIC_ATTRIBUTES"),
    COUNT("COUNT");

    private static final Map<String, Select> enumMap;
    private String value;

    static {
        Select select = ALL_ATTRIBUTES;
        Select select2 = ALL_PROJECTED_ATTRIBUTES;
        Select select3 = SPECIFIC_ATTRIBUTES;
        Select select4 = COUNT;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("ALL_ATTRIBUTES", select);
        hashMap.put("ALL_PROJECTED_ATTRIBUTES", select2);
        hashMap.put("SPECIFIC_ATTRIBUTES", select3);
        hashMap.put("COUNT", select4);
    }

    Select(String str) {
        this.value = str;
    }

    public static Select fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, Select> map = enumMap;
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
