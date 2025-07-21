package defpackage;

/* loaded from: classes3.dex */
public final class y75 implements rp2 {
    private final String a;
    private final String b;
    private final z76 c;
    private final eq d;
    private final dg3 e;

    public y75(String str, String str2, z76 z76Var, eq eqVar, dg3 dg3Var) {
        zq3.h(str, "__typename");
        zq3.h(str2, "id");
        this.a = str;
        this.b = str2;
        this.c = z76Var;
        this.d = eqVar;
        this.e = dg3Var;
    }

    public final eq a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final dg3 c() {
        return this.e;
    }

    public final z76 d() {
        return this.c;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y75)) {
            return false;
        }
        y75 y75Var = (y75) obj;
        return zq3.c(this.a, y75Var.a) && zq3.c(this.b, y75Var.b) && zq3.c(this.c, y75Var.c) && zq3.c(this.d, y75Var.d) && zq3.c(this.e, y75Var.e);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        z76 z76Var = this.c;
        int hashCode2 = (hashCode + (z76Var == null ? 0 : z76Var.hashCode())) * 31;
        eq eqVar = this.d;
        int hashCode3 = (hashCode2 + (eqVar == null ? 0 : eqVar.hashCode())) * 31;
        dg3 dg3Var = this.e;
        return hashCode3 + (dg3Var != null ? dg3Var.hashCode() : 0);
    }

    public String toString() {
        return "NodeFragment(__typename=" + this.a + ", id=" + this.b + ", publishedArticle=" + this.c + ", articleDetails=" + this.d + ", imageDetails=" + this.e + ")";
    }
}
