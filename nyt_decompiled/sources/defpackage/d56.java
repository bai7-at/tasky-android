package defpackage;

/* loaded from: classes4.dex */
public final class d56 {
    public static final int c = 8;
    private final ih4 a;
    private final boolean b;

    public d56(ih4 ih4Var, boolean z) {
        zq3.h(ih4Var, "media");
        this.a = ih4Var;
        this.b = z;
    }

    public final ih4 a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d56)) {
            return false;
        }
        d56 d56Var = (d56) obj;
        return zq3.c(this.a, d56Var.a) && this.b == d56Var.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Boolean.hashCode(this.b);
    }

    public String toString() {
        return "Promo(media=" + this.a + ", fullbleed=" + this.b + ")";
    }
}
