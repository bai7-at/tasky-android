package defpackage;

/* loaded from: classes3.dex */
public final class e56 implements rp2 {
    private final String a;
    private final String b;
    private final String c;

    public e56(String str, String str2, String str3) {
        zq3.h(str, "__typename");
        zq3.h(str2, "id");
        zq3.h(str3, "targetUrl");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e56)) {
            return false;
        }
        e56 e56Var = (e56) obj;
        return zq3.c(this.a, e56Var.a) && zq3.c(this.b, e56Var.b) && zq3.c(this.c, e56Var.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "PromoArticle(__typename=" + this.a + ", id=" + this.b + ", targetUrl=" + this.c + ")";
    }
}
