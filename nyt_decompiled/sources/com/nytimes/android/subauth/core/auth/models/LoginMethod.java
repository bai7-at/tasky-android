package com.nytimes.android.subauth.core.auth.models;

import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class LoginMethod {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ LoginMethod[] $VALUES;
    public static final LoginMethod LoginCredentials = new LoginMethod("LoginCredentials", 0);
    public static final LoginMethod LoginMagicLink = new LoginMethod("LoginMagicLink", 1);
    public static final LoginMethod RegisterCredentials = new LoginMethod("RegisterCredentials", 2);
    public static final LoginMethod GoogleSSO = new LoginMethod("GoogleSSO", 3);
    public static final LoginMethod FacebookSSO = new LoginMethod("FacebookSSO", 4);
    public static final LoginMethod GoogleOneTap = new LoginMethod("GoogleOneTap", 5);
    public static final LoginMethod SetPasswordWithToken = new LoginMethod("SetPasswordWithToken", 6);
    public static final LoginMethod WebSSO = new LoginMethod("WebSSO", 7);

    private static final /* synthetic */ LoginMethod[] $values() {
        return new LoginMethod[]{LoginCredentials, LoginMagicLink, RegisterCredentials, GoogleSSO, FacebookSSO, GoogleOneTap, SetPasswordWithToken, WebSSO};
    }

    static {
        LoginMethod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private LoginMethod(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static LoginMethod valueOf(String str) {
        return (LoginMethod) Enum.valueOf(LoginMethod.class, str);
    }

    public static LoginMethod[] values() {
        return (LoginMethod[]) $VALUES.clone();
    }
}
