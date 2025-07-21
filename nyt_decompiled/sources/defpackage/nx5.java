package defpackage;

/* loaded from: classes.dex */
public abstract class nx5 {
    public static final boolean a(vx5 vx5Var) {
        return (vx5Var.q() || vx5Var.m() || !vx5Var.j()) ? false : true;
    }

    public static final boolean b(vx5 vx5Var) {
        return !vx5Var.m() && vx5Var.j();
    }

    public static final boolean c(vx5 vx5Var) {
        return (vx5Var.q() || !vx5Var.m() || vx5Var.j()) ? false : true;
    }

    public static final boolean d(vx5 vx5Var) {
        return vx5Var.m() && !vx5Var.j();
    }

    public static final boolean e(vx5 vx5Var, long j) {
        long i = vx5Var.i();
        float o = fd5.o(i);
        float p = fd5.p(i);
        return o < 0.0f || o > ((float) hn3.g(j)) || p < 0.0f || p > ((float) hn3.f(j));
    }

    public static final boolean f(vx5 vx5Var, long j, long j2) {
        if (!iy5.g(vx5Var.o(), iy5.a.d())) {
            return e(vx5Var, j);
        }
        long i = vx5Var.i();
        float o = fd5.o(i);
        float p = fd5.p(i);
        return o < (-zt7.i(j2)) || o > ((float) hn3.g(j)) + zt7.i(j2) || p < (-zt7.g(j2)) || p > ((float) hn3.f(j)) + zt7.g(j2);
    }

    public static final long g(vx5 vx5Var) {
        return i(vx5Var, false);
    }

    public static final long h(vx5 vx5Var) {
        return i(vx5Var, true);
    }

    private static final long i(vx5 vx5Var, boolean z) {
        long s = fd5.s(vx5Var.i(), vx5Var.l());
        return (z || !vx5Var.q()) ? s : fd5.b.c();
    }

    public static final boolean j(vx5 vx5Var) {
        return !fd5.l(i(vx5Var, true), fd5.b.c());
    }
}
