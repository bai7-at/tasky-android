package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class as0 {
    private final cz3 a;
    private final long b;
    private final long c;
    private final kt2 d;
    private final fm1 e;

    public /* synthetic */ as0(cz3 cz3Var, long j, long j2, kt2 kt2Var, fm1 fm1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(cz3Var, j, j2, kt2Var, fm1Var);
    }

    public final kt2 a() {
        return this.d;
    }

    public final float b() {
        return this.e.v(hn3.f(this.c));
    }

    public final long c() {
        return this.b;
    }

    public final long d() {
        fm1 fm1Var = this.e;
        return du1.a(fm1Var.X0(fd5.o(this.b)), fm1Var.X0(fd5.p(this.b)));
    }

    public final float e() {
        return this.e.v(hn3.g(this.c));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof as0)) {
            return super.equals(obj);
        }
        as0 as0Var = (as0) obj;
        return zq3.c(this.a, as0Var.a) && fd5.l(this.b, as0Var.b) && hn3.e(this.c, as0Var.c) && zq3.c(this.e, as0Var.e);
    }

    public int hashCode() {
        cz3 cz3Var = this.a;
        int hashCode = (((((cz3Var == null ? 0 : cz3Var.hashCode()) * 31) + fd5.q(this.b)) * 31) + hn3.h(this.c)) * 31;
        kt2 kt2Var = this.d;
        return ((hashCode + (kt2Var != null ? kt2Var.hashCode() : 0)) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "ComposablePosition(layoutCoordinates=" + this.a + ", offset=" + fd5.v(this.b) + ", size=" + hn3.i(this.c) + ", content=" + this.d + ", density=" + this.e + ")";
    }

    private as0(cz3 cz3Var, long j, long j2, kt2 kt2Var, fm1 fm1Var) {
        zq3.h(fm1Var, "density");
        this.a = cz3Var;
        this.b = j;
        this.c = j2;
        this.d = kt2Var;
        this.e = fm1Var;
    }
}
