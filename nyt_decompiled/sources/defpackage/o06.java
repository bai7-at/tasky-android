package defpackage;

/* loaded from: classes4.dex */
public final class o06 {
    private final bd5 a;
    private final String b;
    private final String c;
    private final String d;

    public o06(bd5 bd5Var, String str, String str2, String str3) {
        zq3.h(bd5Var, "offersState");
        zq3.h(str, "priceSubtitle");
        zq3.h(str2, "subscribeButtonText");
        zq3.h(str3, "continueButtonText");
        this.a = bd5Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final String a() {
        return this.d;
    }

    public final bd5 b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o06)) {
            return false;
        }
        o06 o06Var = (o06) obj;
        return zq3.c(this.a, o06Var.a) && zq3.c(this.b, o06Var.b) && zq3.c(this.c, o06Var.c) && zq3.c(this.d, o06Var.d);
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "PostAuthPurchaseData(offersState=" + this.a + ", priceSubtitle=" + this.b + ", subscribeButtonText=" + this.c + ", continueButtonText=" + this.d + ")";
    }
}
