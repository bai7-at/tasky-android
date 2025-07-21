package com.amazonaws.services.dynamodbv2.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public enum BackupStatus {
    CREATING("CREATING"),
    DELETED("DELETED"),
    AVAILABLE("AVAILABLE");

    private static final Map<String, BackupStatus> enumMap;
    private String value;

    static {
        BackupStatus backupStatus = CREATING;
        BackupStatus backupStatus2 = DELETED;
        BackupStatus backupStatus3 = AVAILABLE;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("CREATING", backupStatus);
        hashMap.put("DELETED", backupStatus2);
        hashMap.put("AVAILABLE", backupStatus3);
    }

    BackupStatus(String str) {
        this.value = str;
    }

    public static BackupStatus fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, BackupStatus> map = enumMap;
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
