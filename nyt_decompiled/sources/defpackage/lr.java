package defpackage;

/* loaded from: classes3.dex */
public final class lr implements rp2 {
    private final String a;
    private final String b;
    private final String c;

    public lr(String str, String str2, String str3) {
        zq3.h(str, "__typename");
        zq3.h(str2, "uri");
        zq3.h(str3, "url");
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
        if (!(obj instanceof lr)) {
            return false;
        }
        lr lrVar = (lr) obj;
        return zq3.c(this.a, lrVar.a) && zq3.c(this.b, lrVar.b) && zq3.c(this.c, lrVar.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "ArticlePublished(__typename=" + this.a + ", uri=" + this.b + ", url=" + this.c + ")";
    }
}
