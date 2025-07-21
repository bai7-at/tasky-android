package com.nytimes.android.subauth.core.auth.network.response;

import com.facebook.AccessToken;
import defpackage.b22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AuthMethod {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ AuthMethod[] $VALUES;
    private final String value;
    public static final AuthMethod PASSWORD = new AuthMethod("PASSWORD", 0, "nyt-password");
    public static final AuthMethod GOOGLE = new AuthMethod("GOOGLE", 1, "google");
    public static final AuthMethod FACEBOOK = new AuthMethod("FACEBOOK", 2, AccessToken.DEFAULT_GRAPH_DOMAIN);

    private static final /* synthetic */ AuthMethod[] $values() {
        return new AuthMethod[]{PASSWORD, GOOGLE, FACEBOOK};
    }

    static {
        AuthMethod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AuthMethod(String str, int i, String str2) {
        this.value = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static AuthMethod valueOf(String str) {
        return (AuthMethod) Enum.valueOf(AuthMethod.class, str);
    }

    public static AuthMethod[] values() {
        return (AuthMethod[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
