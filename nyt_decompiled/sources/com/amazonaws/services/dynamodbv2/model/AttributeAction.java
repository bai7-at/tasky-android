package com.amazonaws.services.dynamodbv2.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public enum AttributeAction {
    ADD("ADD"),
    PUT("PUT"),
    DELETE("DELETE");

    private static final Map<String, AttributeAction> enumMap;
    private String value;

    static {
        AttributeAction attributeAction = ADD;
        AttributeAction attributeAction2 = PUT;
        AttributeAction attributeAction3 = DELETE;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("ADD", attributeAction);
        hashMap.put("PUT", attributeAction2);
        hashMap.put("DELETE", attributeAction3);
    }

    AttributeAction(String str) {
        this.value = str;
    }

    public static AttributeAction fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, AttributeAction> map = enumMap;
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
