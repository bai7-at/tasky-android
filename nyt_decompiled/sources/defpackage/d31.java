package defpackage;

import com.facebook.AuthenticationTokenClaims;

/* loaded from: classes4.dex */
public final class d31 {
    private final String a;
    private final String b;

    public d31(String str, String str2) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str2, "url");
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
        if (!(obj instanceof d31)) {
            return false;
        }
        d31 d31Var = (d31) obj;
        return zq3.c(this.a, d31Var.a) && zq3.c(this.b, d31Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "Crop(name=" + this.a + ", url=" + this.b + ")";
    }
}
