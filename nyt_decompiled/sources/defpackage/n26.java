package defpackage;

/* loaded from: classes4.dex */
public final class n26 {
    private final z28 a;
    private final u28 b;
    private final z28 c;
    private final u28 d;

    public n26(z28 z28Var, u28 u28Var, z28 z28Var2, u28 u28Var2) {
        this.a = z28Var;
        this.b = u28Var;
        this.c = z28Var2;
        this.d = u28Var2;
    }

    public final z28 a() {
        return this.c;
    }

    public final u28 b() {
        return this.d;
    }

    public final z28 c() {
        return this.a;
    }

    public final u28 d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n26)) {
            return false;
        }
        n26 n26Var = (n26) obj;
        return zq3.c(this.a, n26Var.a) && zq3.c(this.b, n26Var.b) && zq3.c(this.c, n26Var.c) && zq3.c(this.d, n26Var.d);
    }

    public int hashCode() {
        z28 z28Var = this.a;
        int hashCode = (z28Var == null ? 0 : z28Var.hashCode()) * 31;
        u28 u28Var = this.b;
        int hashCode2 = (hashCode + (u28Var == null ? 0 : u28Var.hashCode())) * 31;
        z28 z28Var2 = this.c;
        int hashCode3 = (hashCode2 + (z28Var2 == null ? 0 : z28Var2.hashCode())) * 31;
        u28 u28Var2 = this.d;
        return hashCode3 + (u28Var2 != null ? u28Var2.hashCode() : 0);
    }

    public String toString() {
        return "PricingModel(introOfferDetail=" + this.a + ", offerPhase=" + this.b + ", baseOfferDetail=" + this.c + ", basePhase=" + this.d + ")";
    }
}
