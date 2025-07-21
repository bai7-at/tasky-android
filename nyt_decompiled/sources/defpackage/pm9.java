package defpackage;

import com.facebook.AuthenticationTokenClaims;

/* loaded from: classes4.dex */
public final class pm9 {
    private final String a;
    private final String b;
    private final String c;

    public pm9(String str, String str2, String str3) {
        zq3.h(str, "email");
        zq3.h(str2, "status");
        zq3.h(str3, AuthenticationTokenClaims.JSON_KEY_NAME);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm9)) {
            return false;
        }
        pm9 pm9Var = (pm9) obj;
        return zq3.c(this.a, pm9Var.a) && zq3.c(this.b, pm9Var.b) && zq3.c(this.c, pm9Var.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "YouTabUser(email=" + this.a + ", status=" + this.b + ", name=" + this.c + ")";
    }
}
