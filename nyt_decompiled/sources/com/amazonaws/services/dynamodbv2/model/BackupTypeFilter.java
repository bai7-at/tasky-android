package com.amazonaws.services.dynamodbv2.model;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public enum BackupTypeFilter {
    USER("USER"),
    SYSTEM("SYSTEM"),
    ALL("ALL");

    private static final Map<String, BackupTypeFilter> enumMap;
    private String value;

    static {
        BackupTypeFilter backupTypeFilter = USER;
        BackupTypeFilter backupTypeFilter2 = SYSTEM;
        BackupTypeFilter backupTypeFilter3 = ALL;
        HashMap hashMap = new HashMap();
        enumMap = hashMap;
        hashMap.put("USER", backupTypeFilter);
        hashMap.put("SYSTEM", backupTypeFilter2);
        hashMap.put("ALL", backupTypeFilter3);
    }

    BackupTypeFilter(String str) {
        this.value = str;
    }

    public static BackupTypeFilter fromValue(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }
        Map<String, BackupTypeFilter> map = enumMap;
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
