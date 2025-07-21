package defpackage;

/* loaded from: classes5.dex */
public final class gf4 {
    private final String a;
    private final an3 b;

    public gf4(String str, an3 an3Var) {
        zq3.h(str, "value");
        zq3.h(an3Var, "range");
        this.a = str;
        this.b = an3Var;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf4)) {
            return false;
        }
        gf4 gf4Var = (gf4) obj;
        return zq3.c(this.a, gf4Var.a) && zq3.c(this.b, gf4Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
