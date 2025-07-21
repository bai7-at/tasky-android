package defpackage;

/* loaded from: classes4.dex */
public final class j06 {
    private final m06 a;
    private final n06 b;
    private final o06 c;
    private final String d;

    public j06(m06 m06Var, n06 n06Var, o06 o06Var, String str) {
        zq3.h(m06Var, "headerData");
        zq3.h(n06Var, "infoData");
        zq3.h(o06Var, "purchaseData");
        zq3.h(str, "terms");
        this.a = m06Var;
        this.b = n06Var;
        this.c = o06Var;
        this.d = str;
    }

    public static /* synthetic */ j06 b(j06 j06Var, m06 m06Var, n06 n06Var, o06 o06Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            m06Var = j06Var.a;
        }
        if ((i & 2) != 0) {
            n06Var = j06Var.b;
        }
        if ((i & 4) != 0) {
            o06Var = j06Var.c;
        }
        if ((i & 8) != 0) {
            str = j06Var.d;
        }
        return j06Var.a(m06Var, n06Var, o06Var, str);
    }

    public final j06 a(m06 m06Var, n06 n06Var, o06 o06Var, String str) {
        zq3.h(m06Var, "headerData");
        zq3.h(n06Var, "infoData");
        zq3.h(o06Var, "purchaseData");
        zq3.h(str, "terms");
        return new j06(m06Var, n06Var, o06Var, str);
    }

    public final m06 c() {
        return this.a;
    }

    public final n06 d() {
        return this.b;
    }

    public final o06 e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j06)) {
            return false;
        }
        j06 j06Var = (j06) obj;
        return zq3.c(this.a, j06Var.a) && zq3.c(this.b, j06Var.b) && zq3.c(this.c, j06Var.c) && zq3.c(this.d, j06Var.d);
    }

    public final String f() {
        return this.d;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "PostAuthConfig(headerData=" + this.a + ", infoData=" + this.b + ", purchaseData=" + this.c + ", terms=" + this.d + ")";
    }
}
