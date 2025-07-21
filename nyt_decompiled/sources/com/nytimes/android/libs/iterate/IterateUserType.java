package com.nytimes.android.libs.iterate;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class IterateUserType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ IterateUserType[] $VALUES;
    public static final IterateUserType Anon = new IterateUserType("Anon", 0, "anon");
    public static final IterateUserType Regi = new IterateUserType("Regi", 1, "regi");
    public static final IterateUserType Sub = new IterateUserType("Sub", 2, "sub");
    private final String value;

    private static final /* synthetic */ IterateUserType[] $values() {
        return new IterateUserType[]{Anon, Regi, Sub};
    }

    static {
        IterateUserType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private IterateUserType(String str, int i, String str2) {
        this.value = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static IterateUserType valueOf(String str) {
        return (IterateUserType) Enum.valueOf(IterateUserType.class, str);
    }

    public static IterateUserType[] values() {
        return (IterateUserType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
