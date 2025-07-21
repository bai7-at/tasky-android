package defpackage;

/* loaded from: classes3.dex */
public final class qv2 implements rp2 {
    private final String a;
    private final ov2 b;

    public qv2(String str, ov2 ov2Var) {
        zq3.h(str, "__typename");
        this.a = str;
        this.b = ov2Var;
    }

    public final ov2 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv2)) {
            return false;
        }
        qv2 qv2Var = (qv2) obj;
        return zq3.c(this.a, qv2Var.a) && zq3.c(this.b, qv2Var.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ov2 ov2Var = this.b;
        return hashCode + (ov2Var == null ? 0 : ov2Var.hashCode());
    }

    public String toString() {
        return "GamesPromotionalMedia(__typename=" + this.a + ", gamesPromo=" + this.b + ")";
    }
}
