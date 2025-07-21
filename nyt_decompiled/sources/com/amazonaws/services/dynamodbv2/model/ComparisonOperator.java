package com.amazonaws.services.dynamodbv2.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public enum ComparisonOperator {
    EQ("EQ"),
    NE("NE"),
    IN("IN"),
    LE("LE"),
    LT("LT"),
    GE("GE"),
    GT("GT"),
    BETWEEN("BETWEEN"),
    NOT_NULL("NOT_NULL"),
    NULL("NULL"),
    CONTAINS("CONTAINS"),
    NOT_CONTAINS("NOT_CONTAINS"),
    BEGINS_WITH("BEGINS_WITH");

    private static final Map<String, ComparisonOperator> enumMap;
    private String value;

    static {
        ComparisonOperator comparisonOperator = EQ;
        ComparisonOperator comparisonOperator2 = NE;
        ComparisonOperator comparisonOperator3 = IN;
        ComparisonOperator comparisonOperator4 = LE;
        ComparisonOperator comparisonOperator5 = LT;
        ComparisonOperator comparisonOperator6 = GE;
        ComparisonOperator comparisonOperator7 = GT;
        ComparisonOperator comparisonOperator8 = BETWEEN;
        ComparisonOperator comparisonOperator9 = NOT_NULL;
        ComparisonOperator comparisonOperator10 = NULL;
        ComparisonOperator comparisonOperator11 = CONTAINS;
        ComparisonOperator comparisonOperator12 = NOT_CONTAINS;
        ComparisonOperator comparisonOperator13 = BEGINS_WITH;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("EQ", comparisonOperator);
        hashMap.put("NE", comparisonOperator2);
        hashMap.put("IN", comparisonOperator3);
        hashMap.put("LE", comparisonOperator4);
        hashMap.put("LT", comparisonOperator5);
        hashMap.put("GE", comparisonOperator6);
        hashMap.put("GT", comparisonOperator7);
        hashMap.put("BETWEEN", comparisonOperator8);
        hashMap.put("NOT_NULL", comparisonOperator9);
        hashMap.put("NULL", comparisonOperator10);
        hashMap.put("CONTAINS", comparisonOperator11);
        hashMap.put("NOT_CONTAINS", comparisonOperator12);
        hashMap.put("BEGINS_WITH", comparisonOperator13);
    }

    ComparisonOperator(String str) {
        this.value = str;
    }

    public static ComparisonOperator fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, ComparisonOperator> map = enumMap;
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
