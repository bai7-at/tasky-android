package com.nytimes.android.logging.remote.models;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class Priority {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ Priority[] $VALUES;
    private final String displayString;
    public static final Priority VERBOSE = new Priority("VERBOSE", 0, "V/");
    public static final Priority DEBUG = new Priority("DEBUG", 1, "D/");
    public static final Priority INFO = new Priority("INFO", 2, "I/");
    public static final Priority WARN = new Priority("WARN", 3, "W/");
    public static final Priority ERROR = new Priority("ERROR", 4, "E/");
    public static final Priority WTF = new Priority("WTF", 5, "?/");
    public static final Priority REPORT = new Priority("REPORT", 6, "REPORT/");

    private static final /* synthetic */ Priority[] $values() {
        return new Priority[]{VERBOSE, DEBUG, INFO, WARN, ERROR, WTF, REPORT};
    }

    static {
        Priority[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private Priority(String str, int i, String str2) {
        this.displayString = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static Priority valueOf(String str) {
        return (Priority) Enum.valueOf(Priority.class, str);
    }

    public static Priority[] values() {
        return (Priority[]) $VALUES.clone();
    }

    public final String getDisplayString() {
        return this.displayString;
    }
}
