package defpackage;

import com.facebook.AuthenticationTokenClaims;

/* loaded from: classes2.dex */
public final class x41 extends bq0 {
    private final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x41(String str, String str2) {
        super(str, null);
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str2, "className");
        this.b = str2;
    }

    public final String b() {
        return this.b;
    }
}
