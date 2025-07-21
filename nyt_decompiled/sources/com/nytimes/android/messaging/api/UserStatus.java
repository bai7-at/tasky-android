package com.nytimes.android.messaging.api;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class UserStatus {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ UserStatus[] $VALUES;
    private final String status;
    public static final UserStatus SUBSCRIBER = new UserStatus("SUBSCRIBER", 0, "sub");
    public static final UserStatus REGISTERED = new UserStatus("REGISTERED", 1, "regi");
    public static final UserStatus ANONYMOUS = new UserStatus("ANONYMOUS", 2, "anon");

    private static final /* synthetic */ UserStatus[] $values() {
        return new UserStatus[]{SUBSCRIBER, REGISTERED, ANONYMOUS};
    }

    static {
        UserStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private UserStatus(String str, int i, String str2) {
        this.status = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static UserStatus valueOf(String str) {
        return (UserStatus) Enum.valueOf(UserStatus.class, str);
    }

    public static UserStatus[] values() {
        return (UserStatus[]) $VALUES.clone();
    }

    public final String getStatus() {
        return this.status;
    }
}
