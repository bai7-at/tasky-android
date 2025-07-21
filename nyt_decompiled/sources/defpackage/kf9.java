package defpackage;

import com.facebook.AuthenticationTokenClaims;

/* loaded from: classes4.dex */
public final class kf9 {
    private final String a;
    private final String b;

    public kf9(String str, String str2) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str2, "script");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf9)) {
            return false;
        }
        kf9 kf9Var = (kf9) obj;
        return zq3.c(this.a, kf9Var.a) && zq3.c(this.b, kf9Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "WebViewScript(name=" + this.a + ", script=" + this.b + ")";
    }
}
