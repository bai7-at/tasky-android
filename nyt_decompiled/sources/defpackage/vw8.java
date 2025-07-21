package defpackage;

import com.facebook.AuthenticationTokenClaims;

/* loaded from: classes2.dex */
public final class vw8 extends bq0 {
    private final dc5[] b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw8(String str, dc5... dc5VarArr) {
        super(str, null);
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(dc5VarArr, "members");
        this.b = dc5VarArr;
    }
}
