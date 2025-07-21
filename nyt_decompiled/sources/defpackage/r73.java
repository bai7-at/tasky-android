package defpackage;

/* loaded from: classes4.dex */
public final class r73 implements mk8 {
    private final String a;
    private final String b;
    private final String c;

    public r73(String str, String str2, String str3) {
        zq3.h(str, "uri");
        zq3.h(str3, "headline");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public String a() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r73)) {
            return false;
        }
        r73 r73Var = (r73) obj;
        return zq3.c(this.a, r73Var.a) && zq3.c(this.b, r73Var.b) && zq3.c(this.c, r73Var.c);
    }

    @Override // defpackage.mk8
    public String getUri() {
        return this.a;
    }

    @Override // defpackage.mk8
    public String getUrl() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "HeadlineItem(uri=" + this.a + ", url=" + this.b + ", headline=" + this.c + ")";
    }
}
