package defpackage;

/* loaded from: classes4.dex */
public final class zq implements mk8 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public zq(String str, String str2, String str3, String str4, String str5) {
        zq3.h(str3, "uri");
        zq3.h(str5, "headline");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final String a() {
        return this.b;
    }

    public String b() {
        return this.e;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq)) {
            return false;
        }
        zq zqVar = (zq) obj;
        return zq3.c(this.a, zqVar.a) && zq3.c(this.b, zqVar.b) && zq3.c(this.c, zqVar.c) && zq3.c(this.d, zqVar.d) && zq3.c(this.e, zqVar.e);
    }

    @Override // defpackage.mk8
    public String getUri() {
        return this.c;
    }

    @Override // defpackage.mk8
    public String getUrl() {
        return this.d;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.c.hashCode()) * 31;
        String str3 = this.d;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "ArticleItem(imageUrl=" + this.a + ", credit=" + this.b + ", uri=" + this.c + ", url=" + this.d + ", headline=" + this.e + ")";
    }
}
