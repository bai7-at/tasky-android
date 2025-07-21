package defpackage;

/* loaded from: classes4.dex */
public final class ky3 implements mk8 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    public ky3(String str, String str2, String str3, String str4, String str5, String str6) {
        zq3.h(str, "summary");
        zq3.h(str4, "uri");
        zq3.h(str6, "headline");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final String a() {
        return this.c;
    }

    public String b() {
        return this.f;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky3)) {
            return false;
        }
        ky3 ky3Var = (ky3) obj;
        return zq3.c(this.a, ky3Var.a) && zq3.c(this.b, ky3Var.b) && zq3.c(this.c, ky3Var.c) && zq3.c(this.d, ky3Var.d) && zq3.c(this.e, ky3Var.e) && zq3.c(this.f, ky3Var.f);
    }

    @Override // defpackage.mk8
    public String getUri() {
        return this.d;
    }

    @Override // defpackage.mk8
    public String getUrl() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d.hashCode()) * 31;
        String str3 = this.e;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "LargeItem(summary=" + this.a + ", imageUrl=" + this.b + ", credit=" + this.c + ", uri=" + this.d + ", url=" + this.e + ", headline=" + this.f + ")";
    }
}
