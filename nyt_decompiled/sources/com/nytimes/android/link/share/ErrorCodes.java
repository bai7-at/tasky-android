package com.nytimes.android.link.share;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ErrorCodes {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ErrorCodes[] $VALUES;
    public static final ErrorCodes OUT_OF_ARTICLES = new ErrorCodes("OUT_OF_ARTICLES", 0, "0");
    private final String value;

    private static final /* synthetic */ ErrorCodes[] $values() {
        return new ErrorCodes[]{OUT_OF_ARTICLES};
    }

    static {
        ErrorCodes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ErrorCodes(String str, int i, String str2) {
        this.value = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ErrorCodes valueOf(String str) {
        return (ErrorCodes) Enum.valueOf(ErrorCodes.class, str);
    }

    public static ErrorCodes[] values() {
        return (ErrorCodes[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
