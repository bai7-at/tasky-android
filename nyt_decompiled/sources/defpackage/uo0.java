package defpackage;

import com.facebook.AuthenticationTokenClaims;

/* loaded from: classes3.dex */
public final class uo0 implements rp2 {
    private final String a;
    private final boolean b;
    private final String c;

    public uo0(String str, boolean z, String str2) {
        zq3.h(str, "slug");
        zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final boolean b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo0)) {
            return false;
        }
        uo0 uo0Var = (uo0) obj;
        return zq3.c(this.a, uo0Var.a) && this.b == uo0Var.b && zq3.c(this.c, uo0Var.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + Boolean.hashCode(this.b)) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "Column(slug=" + this.a + ", showPicture=" + this.b + ", name=" + this.c + ")";
    }
}
