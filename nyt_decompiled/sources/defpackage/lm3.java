package defpackage;

import com.facebook.AuthenticationTokenClaims;
import java.util.Objects;

/* loaded from: classes5.dex */
public abstract class lm3 {
    private static final lm3 a = b("");

    lm3() {
    }

    public static mm3 a(String str) {
        return new mm3(str);
    }

    public static lm3 b(String str) {
        return c(str, null, null, hv.d());
    }

    static lm3 c(String str, String str2, String str3, hv hvVar) {
        Objects.requireNonNull(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        Objects.requireNonNull(hvVar, "attributes");
        return new u10(str, str2, str3, hvVar);
    }

    public abstract hv d();

    public abstract String e();

    public abstract String f();

    public abstract String g();
}
