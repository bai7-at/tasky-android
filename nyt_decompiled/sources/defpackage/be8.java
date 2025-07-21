package defpackage;

/* loaded from: classes4.dex */
public final class be8 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public be8(String str, String str2, String str3, String str4) {
        zq3.h(str, "id");
        zq3.h(str2, "url");
        zq3.h(str3, "headline");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public static /* synthetic */ be8 b(be8 be8Var, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = be8Var.a;
        }
        if ((i & 2) != 0) {
            str2 = be8Var.b;
        }
        if ((i & 4) != 0) {
            str3 = be8Var.c;
        }
        if ((i & 8) != 0) {
            str4 = be8Var.d;
        }
        return be8Var.a(str, str2, str3, str4);
    }

    public final be8 a(String str, String str2, String str3, String str4) {
        zq3.h(str, "id");
        zq3.h(str2, "url");
        zq3.h(str3, "headline");
        return new be8(str, str2, str3, str4);
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be8)) {
            return false;
        }
        be8 be8Var = (be8) obj;
        return zq3.c(this.a, be8Var.a) && zq3.c(this.b, be8Var.b) && zq3.c(this.c, be8Var.c) && zq3.c(this.d, be8Var.d);
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SyndicatedResult(id=" + this.a + ", url=" + this.b + ", headline=" + this.c + ", imageUrl=" + this.d + ")";
    }
}
