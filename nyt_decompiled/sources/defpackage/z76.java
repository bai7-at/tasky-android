package defpackage;

/* loaded from: classes3.dex */
public final class z76 implements rp2 {
    private final String a;
    private final String b;

    public z76(String str, String str2) {
        zq3.h(str, "url");
        zq3.h(str2, "uri");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z76)) {
            return false;
        }
        z76 z76Var = (z76) obj;
        return zq3.c(this.a, z76Var.a) && zq3.c(this.b, z76Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "PublishedArticle(url=" + this.a + ", uri=" + this.b + ")";
    }
}
