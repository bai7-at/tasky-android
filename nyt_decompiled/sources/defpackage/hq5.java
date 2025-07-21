package defpackage;

/* loaded from: classes4.dex */
public final class hq5 {
    private final String a;
    private final oh3 b;
    private final String c;
    private final String d;

    public hq5(String str, oh3 oh3Var, String str2, String str3) {
        zq3.h(str, "topperText");
        zq3.h(str2, "header");
        zq3.h(str3, "buttonText");
        this.a = str;
        this.b = oh3Var;
        this.c = str2;
        this.d = str3;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final oh3 c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq5)) {
            return false;
        }
        hq5 hq5Var = (hq5) obj;
        return zq3.c(this.a, hq5Var.a) && zq3.c(this.b, hq5Var.b) && zq3.c(this.c, hq5Var.c) && zq3.c(this.d, hq5Var.d);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        oh3 oh3Var = this.b;
        return ((((hashCode + (oh3Var == null ? 0 : oh3Var.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "PaywallConfig(topperText=" + this.a + ", icons=" + this.b + ", header=" + this.c + ", buttonText=" + this.d + ")";
    }
}
