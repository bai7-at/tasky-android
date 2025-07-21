package com.nytimes.android.hybrid;

import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ConnectionStatus {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ConnectionStatus[] $VALUES;
    private final int statusValue;
    public static final ConnectionStatus NO_CONNECTION = new ConnectionStatus("NO_CONNECTION", 0, 0);
    public static final ConnectionStatus POOR_WIFI = new ConnectionStatus("POOR_WIFI", 1, 0);
    public static final ConnectionStatus LEGACY_CELL = new ConnectionStatus("LEGACY_CELL", 2, 1);
    public static final ConnectionStatus MODERN_CELL = new ConnectionStatus("MODERN_CELL", 3, 2);
    public static final ConnectionStatus GOOD_WIFI = new ConnectionStatus("GOOD_WIFI", 4, 3);

    private static final /* synthetic */ ConnectionStatus[] $values() {
        return new ConnectionStatus[]{NO_CONNECTION, POOR_WIFI, LEGACY_CELL, MODERN_CELL, GOOD_WIFI};
    }

    static {
        ConnectionStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ConnectionStatus(String str, int i, int i2) {
        this.statusValue = i2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ConnectionStatus valueOf(String str) {
        return (ConnectionStatus) Enum.valueOf(ConnectionStatus.class, str);
    }

    public static ConnectionStatus[] values() {
        return (ConnectionStatus[]) $VALUES.clone();
    }

    public final int status() {
        return this.statusValue;
    }
}
