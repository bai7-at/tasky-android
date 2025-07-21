package com.nytimes.xwords.hybrid.utils;

import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ErrorType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ErrorType[] $VALUES;
    public static final ErrorType OFFLINE = new ErrorType("OFFLINE", 0);
    public static final ErrorType GENERIC = new ErrorType("GENERIC", 1);

    private static final /* synthetic */ ErrorType[] $values() {
        return new ErrorType[]{OFFLINE, GENERIC};
    }

    static {
        ErrorType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ErrorType(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ErrorType valueOf(String str) {
        return (ErrorType) Enum.valueOf(ErrorType.class, str);
    }

    public static ErrorType[] values() {
        return (ErrorType[]) $VALUES.clone();
    }
}
