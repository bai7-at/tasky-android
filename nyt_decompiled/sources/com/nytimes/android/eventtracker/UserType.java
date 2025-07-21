package com.nytimes.android.eventtracker;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class UserType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ UserType[] $VALUES;
    public static final UserType ANONYMOUS = new UserType("ANONYMOUS", 0, "anon");
    public static final UserType ANONYMOUS_SUB = new UserType("ANONYMOUS_SUB", 1, "anon sub");
    public static final UserType REGISTERED = new UserType("REGISTERED", 2, "regi");
    public static final UserType SUBSCRIBER = new UserType("SUBSCRIBER", 3, "sub");
    private final String value;

    private static final /* synthetic */ UserType[] $values() {
        return new UserType[]{ANONYMOUS, ANONYMOUS_SUB, REGISTERED, SUBSCRIBER};
    }

    static {
        UserType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private UserType(String str, int i, String str2) {
        this.value = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static UserType valueOf(String str) {
        return (UserType) Enum.valueOf(UserType.class, str);
    }

    public static UserType[] values() {
        return (UserType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
