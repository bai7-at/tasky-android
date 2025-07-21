package com.nytimes.subauth.ui.login.helpers;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ErrorDisplayType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ErrorDisplayType[] $VALUES;
    public static final ErrorDisplayType Dialog = new ErrorDisplayType("Dialog", 0);
    public static final ErrorDisplayType EmailInline = new ErrorDisplayType("EmailInline", 1);
    public static final ErrorDisplayType PasswordInline = new ErrorDisplayType("PasswordInline", 2);
    public static final ErrorDisplayType Snackbar = new ErrorDisplayType("Snackbar", 3);

    private static final /* synthetic */ ErrorDisplayType[] $values() {
        return new ErrorDisplayType[]{Dialog, EmailInline, PasswordInline, Snackbar};
    }

    static {
        ErrorDisplayType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ErrorDisplayType(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ErrorDisplayType valueOf(String str) {
        return (ErrorDisplayType) Enum.valueOf(ErrorDisplayType.class, str);
    }

    public static ErrorDisplayType[] values() {
        return (ErrorDisplayType[]) $VALUES.clone();
    }
}
