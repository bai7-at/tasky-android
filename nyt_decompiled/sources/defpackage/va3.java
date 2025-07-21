package defpackage;

import com.facebook.AuthenticationTokenClaims;

/* loaded from: classes2.dex */
public final class va3 {
    private final String a;
    private final String b;

    public va3(String str, String str2) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str2, "value");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va3)) {
            return false;
        }
        va3 va3Var = (va3) obj;
        return zq3.c(this.a, va3Var.a) && zq3.c(this.b, va3Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "HttpHeader(name=" + this.a + ", value=" + this.b + ')';
    }
}
