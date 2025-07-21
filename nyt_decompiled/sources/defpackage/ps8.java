package defpackage;

/* loaded from: classes4.dex */
public final class ps8 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final boolean f;

    public ps8(String str, String str2, String str3, String str4, int i, boolean z) {
        zq3.h(str, "headline");
        zq3.h(str3, "credit");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = z;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final int d() {
        return this.e;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps8)) {
            return false;
        }
        ps8 ps8Var = (ps8) obj;
        return zq3.c(this.a, ps8Var.a) && zq3.c(this.b, ps8Var.b) && zq3.c(this.c, ps8Var.c) && zq3.c(this.d, ps8Var.d) && this.e == ps8Var.e && this.f == ps8Var.f;
    }

    public final boolean f() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31;
        String str2 = this.d;
        return ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.e)) * 31) + Boolean.hashCode(this.f);
    }

    public String toString() {
        return "TrendingLockupData(headline=" + this.a + ", imageUrl=" + this.b + ", credit=" + this.c + ", upperLabel=" + this.d + ", ordinal=" + this.e + ", isVideo=" + this.f + ")";
    }
}
