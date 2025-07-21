package defpackage;

/* loaded from: classes4.dex */
public final class oz0 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;

    public oz0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        zq3.h(str, "url");
        zq3.h(str2, "uri");
        zq3.h(str6, "headline");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.h;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz0)) {
            return false;
        }
        oz0 oz0Var = (oz0) obj;
        return zq3.c(this.a, oz0Var.a) && zq3.c(this.b, oz0Var.b) && zq3.c(this.c, oz0Var.c) && zq3.c(this.d, oz0Var.d) && zq3.c(this.e, oz0Var.e) && zq3.c(this.f, oz0Var.f) && zq3.c(this.g, oz0Var.g) && zq3.c(this.h, oz0Var.h);
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.b;
    }

    public final String h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f.hashCode()) * 31;
        String str4 = this.g;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "CookingResult(url=" + this.a + ", uri=" + this.b + ", credit=" + this.c + ", type=" + this.d + ", kicker=" + this.e + ", headline=" + this.f + ", summary=" + this.g + ", imageUrl=" + this.h + ")";
    }
}
