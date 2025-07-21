package com.amazonaws.services.dynamodbv2.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public enum ConditionalOperator {
    AND("AND"),
    OR("OR");

    private static final Map<String, ConditionalOperator> enumMap;
    private String value;

    static {
        ConditionalOperator conditionalOperator = AND;
        ConditionalOperator conditionalOperator2 = OR;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("AND", conditionalOperator);
        hashMap.put("OR", conditionalOperator2);
    }

    ConditionalOperator(String str) {
        this.value = str;
    }

    public static ConditionalOperator fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, ConditionalOperator> map = enumMap;
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
