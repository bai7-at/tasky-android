package defpackage;

import com.facebook.AuthenticationTokenClaims;

/* loaded from: classes.dex */
public final class tj9 {
    private final String a;
    private final String b;

    public tj9(String str, String str2) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str2, "workSpecId");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }
}
