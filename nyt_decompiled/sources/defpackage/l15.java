package defpackage;

import androidx.navigation.a;
import com.facebook.AuthenticationTokenClaims;

/* loaded from: classes.dex */
public final class l15 {
    private final String a;
    private final a b;

    public l15(String str, a aVar) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(aVar, "argument");
        this.a = str;
        this.b = aVar;
    }

    public final String a() {
        return this.a;
    }

    public final a b() {
        return this.b;
    }
}
