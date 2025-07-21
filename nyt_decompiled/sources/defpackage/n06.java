package defpackage;

/* loaded from: classes4.dex */
public final class n06 {
    private final String a;
    private final String b;
    private final String c;
    private final oh3 d;

    public n06(String str, String str2, String str3, oh3 oh3Var) {
        zq3.h(str, "header");
        zq3.h(str2, "subheader");
        zq3.h(str3, "toggleLabel");
        zq3.h(oh3Var, "valueProps");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = oh3Var;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final oh3 d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n06)) {
            return false;
        }
        n06 n06Var = (n06) obj;
        return zq3.c(this.a, n06Var.a) && zq3.c(this.b, n06Var.b) && zq3.c(this.c, n06Var.c) && zq3.c(this.d, n06Var.d);
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "PostAuthInfoData(header=" + this.a + ", subheader=" + this.b + ", toggleLabel=" + this.c + ", valueProps=" + this.d + ")";
    }
}
