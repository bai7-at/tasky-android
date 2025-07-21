package defpackage;

/* loaded from: classes4.dex */
public final class w13 {
    private final String a;
    private final ss2 b;

    public w13(String str, ss2 ss2Var) {
        zq3.h(str, "url");
        zq3.h(ss2Var, "analyticsTrackingId");
        this.a = str;
        this.b = ss2Var;
    }

    public final ss2 a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w13)) {
            return false;
        }
        w13 w13Var = (w13) obj;
        return zq3.c(this.a, w13Var.a) && zq3.c(this.b, w13Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "GraphQLConfig(url=" + this.a + ", analyticsTrackingId=" + this.b + ")";
    }
}
