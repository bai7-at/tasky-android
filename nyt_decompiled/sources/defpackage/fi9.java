package defpackage;

/* loaded from: classes4.dex */
public final class fi9 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public fi9(String str, String str2, String str3, String str4) {
        zq3.h(str2, "newsletterCode");
        zq3.h(str3, "title");
        zq3.h(str4, "description");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi9)) {
            return false;
        }
        fi9 fi9Var = (fi9) obj;
        return zq3.c(this.a, fi9Var.a) && zq3.c(this.b, fi9Var.b) && zq3.c(this.c, fi9Var.c) && zq3.c(this.d, fi9Var.d);
    }

    public int hashCode() {
        String str = this.a;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "WirecutterNewsletterData(newsletterLogo=" + this.a + ", newsletterCode=" + this.b + ", title=" + this.c + ", description=" + this.d + ")";
    }
}
