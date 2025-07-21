package com.amazonaws.services.cognitosync.model;

import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public enum Operation {
    Replace("replace"),
    Remove("remove");

    private static final Map<String, Operation> enumMap;
    private String value;

    static {
        Operation operation = Replace;
        Operation operation2 = Remove;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("replace", operation);
        hashMap.put("remove", operation2);
    }

    Operation(String str) {
        this.value = str;
    }

    public static Operation fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, Operation> map = enumMap;
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
