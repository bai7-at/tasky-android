package defpackage;

import com.facebook.AuthenticationTokenClaims;

/* loaded from: classes4.dex */
public final class gw8 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    public gw8(String str, String str2, String str3, String str4, String str5, String str6) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str2, "groupKey");
        zq3.h(str3, "version");
        zq3.h(str4, "licenseType");
        zq3.h(str5, "licenseName");
        zq3.h(str6, "licenseUrl");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw8)) {
            return false;
        }
        gw8 gw8Var = (gw8) obj;
        return zq3.c(this.a, gw8Var.a) && zq3.c(this.b, gw8Var.b) && zq3.c(this.c, gw8Var.c) && zq3.c(this.d, gw8Var.d) && zq3.c(this.e, gw8Var.e) && zq3.c(this.f, gw8Var.f);
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "UiLibrary(name=" + this.a + ", groupKey=" + this.b + ", version=" + this.c + ", licenseType=" + this.d + ", licenseName=" + this.e + ", licenseUrl=" + this.f + ")";
    }
}
