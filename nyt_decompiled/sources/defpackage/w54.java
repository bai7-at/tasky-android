package defpackage;

/* loaded from: classes4.dex */
public final class w54 implements mk8 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public w54(String str, String str2, String str3, String str4) {
        zq3.h(str2, "uri");
        zq3.h(str4, "headline");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public String a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w54)) {
            return false;
        }
        w54 w54Var = (w54) obj;
        return zq3.c(this.a, w54Var.a) && zq3.c(this.b, w54Var.b) && zq3.c(this.c, w54Var.c) && zq3.c(this.d, w54Var.d);
    }

    @Override // defpackage.mk8
    public String getUri() {
        return this.b;
    }

    @Override // defpackage.mk8
    public String getUrl() {
        return this.c;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31;
        String str2 = this.c;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ListItem(imageUrl=" + this.a + ", uri=" + this.b + ", url=" + this.c + ", headline=" + this.d + ")";
    }
}
