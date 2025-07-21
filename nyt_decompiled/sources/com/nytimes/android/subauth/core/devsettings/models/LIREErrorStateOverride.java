package com.nytimes.android.subauth.core.devsettings.models;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LIREErrorStateOverride {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ LIREErrorStateOverride[] $VALUES;
    public static final LIREErrorStateOverride NoOverride = new LIREErrorStateOverride("NoOverride", 0);
    public static final LIREErrorStateOverride EmailFirstUnknownError = new LIREErrorStateOverride("EmailFirstUnknownError", 1);
    public static final LIREErrorStateOverride LoginUnknownError = new LIREErrorStateOverride("LoginUnknownError", 2);
    public static final LIREErrorStateOverride RegistrationUnknownError = new LIREErrorStateOverride("RegistrationUnknownError", 3);
    public static final LIREErrorStateOverride FacebookSSOUnknownError = new LIREErrorStateOverride("FacebookSSOUnknownError", 4);
    public static final LIREErrorStateOverride GoogleSSOUnknownError = new LIREErrorStateOverride("GoogleSSOUnknownError", 5);

    private static final /* synthetic */ LIREErrorStateOverride[] $values() {
        return new LIREErrorStateOverride[]{NoOverride, EmailFirstUnknownError, LoginUnknownError, RegistrationUnknownError, FacebookSSOUnknownError, GoogleSSOUnknownError};
    }

    static {
        LIREErrorStateOverride[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private LIREErrorStateOverride(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static LIREErrorStateOverride valueOf(String str) {
        return (LIREErrorStateOverride) Enum.valueOf(LIREErrorStateOverride.class, str);
    }

    public static LIREErrorStateOverride[] values() {
        return (LIREErrorStateOverride[]) $VALUES.clone();
    }
}
