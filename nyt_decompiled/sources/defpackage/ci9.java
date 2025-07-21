package defpackage;

/* loaded from: classes3.dex */
public final class ci9 implements rp2 {
    private final String a;
    private final c86 b;
    private final u21 c;
    private final t66 d;

    public ci9(String str, c86 c86Var, u21 u21Var, t66 t66Var) {
        zq3.h(str, "__typename");
        zq3.h(c86Var, "publishedProperties");
        zq3.h(u21Var, "creativeWorkProperties");
        zq3.h(t66Var, "promotionalProperties");
        this.a = str;
        this.b = c86Var;
        this.c = u21Var;
        this.d = t66Var;
    }

    public final u21 a() {
        return this.c;
    }

    public final t66 b() {
        return this.d;
    }

    public final c86 c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci9)) {
            return false;
        }
        ci9 ci9Var = (ci9) obj;
        return zq3.c(this.a, ci9Var.a) && zq3.c(this.b, ci9Var.b) && zq3.c(this.c, ci9Var.c) && zq3.c(this.d, ci9Var.d);
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "WirecutterArticleAsset(__typename=" + this.a + ", publishedProperties=" + this.b + ", creativeWorkProperties=" + this.c + ", promotionalProperties=" + this.d + ")";
    }
}
