package com.nytimes.android.subauth.core.api.listeners;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LogoutSource {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ LogoutSource[] $VALUES;
    public static final LogoutSource USER_LOGOUT = new LogoutSource("USER_LOGOUT", 0);
    public static final LogoutSource UNIFIED_LIRE_FAILED_FORCE = new LogoutSource("UNIFIED_LIRE_FAILED_FORCE", 1);
    public static final LogoutSource DELETE_ACCOUNT = new LogoutSource("DELETE_ACCOUNT", 2);
    public static final LogoutSource SESSION_REFRESH_FAILED_FORCE = new LogoutSource("SESSION_REFRESH_FAILED_FORCE", 3);

    private static final /* synthetic */ LogoutSource[] $values() {
        return new LogoutSource[]{USER_LOGOUT, UNIFIED_LIRE_FAILED_FORCE, DELETE_ACCOUNT, SESSION_REFRESH_FAILED_FORCE};
    }

    static {
        LogoutSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private LogoutSource(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static LogoutSource valueOf(String str) {
        return (LogoutSource) Enum.valueOf(LogoutSource.class, str);
    }

    public static LogoutSource[] values() {
        return (LogoutSource[]) $VALUES.clone();
    }
}
