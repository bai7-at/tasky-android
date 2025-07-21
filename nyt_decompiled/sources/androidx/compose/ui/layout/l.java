package androidx.compose.ui.layout;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.fv0;
import defpackage.hn3;
import defpackage.in3;
import defpackage.ss2;
import defpackage.tg4;
import defpackage.uo6;
import defpackage.vm3;
import defpackage.wm3;

/* loaded from: classes.dex */
public abstract class l implements tg4 {
    private int a;
    private int b;
    private long c = in3.a(0, 0);
    private long d;
    private long e;

    public static abstract class a {
        public static /* synthetic */ void f(a aVar, l lVar, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            aVar.e(lVar, i, i2, f);
        }

        public static /* synthetic */ void h(a aVar, l lVar, long j, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            aVar.g(lVar, j, f);
        }

        public static /* synthetic */ void j(a aVar, l lVar, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            aVar.i(lVar, i, i2, f);
        }

        public static /* synthetic */ void l(a aVar, l lVar, long j, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            aVar.k(lVar, j, f);
        }

        public static /* synthetic */ void n(a aVar, l lVar, int i, int i2, float f, ss2 ss2Var, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                ss2Var = PlaceableKt.a;
            }
            aVar.m(lVar, i, i2, f2, ss2Var);
        }

        public static /* synthetic */ void p(a aVar, l lVar, long j, float f, ss2 ss2Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                ss2Var = PlaceableKt.a;
            }
            aVar.o(lVar, j, f2, ss2Var);
        }

        public static /* synthetic */ void r(a aVar, l lVar, int i, int i2, float f, ss2 ss2Var, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                ss2Var = PlaceableKt.a;
            }
            aVar.q(lVar, i, i2, f2, ss2Var);
        }

        public static /* synthetic */ void t(a aVar, l lVar, long j, float f, ss2 ss2Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                ss2Var = PlaceableKt.a;
            }
            aVar.s(lVar, j, f2, ss2Var);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract LayoutDirection c();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract int d();

        public final void e(l lVar, int i, int i2, float f) {
            long a = wm3.a(i, i2);
            long j = lVar.e;
            lVar.L0(wm3.a(vm3.j(a) + vm3.j(j), vm3.k(a) + vm3.k(j)), f, null);
        }

        public final void g(l lVar, long j, float f) {
            long j2 = lVar.e;
            lVar.L0(wm3.a(vm3.j(j) + vm3.j(j2), vm3.k(j) + vm3.k(j2)), f, null);
        }

        public final void i(l lVar, int i, int i2, float f) {
            long a = wm3.a(i, i2);
            if (c() == LayoutDirection.Ltr || d() == 0) {
                long j = lVar.e;
                lVar.L0(wm3.a(vm3.j(a) + vm3.j(j), vm3.k(a) + vm3.k(j)), f, null);
            } else {
                long a2 = wm3.a((d() - lVar.F0()) - vm3.j(a), vm3.k(a));
                long j2 = lVar.e;
                lVar.L0(wm3.a(vm3.j(a2) + vm3.j(j2), vm3.k(a2) + vm3.k(j2)), f, null);
            }
        }

        public final void k(l lVar, long j, float f) {
            if (c() == LayoutDirection.Ltr || d() == 0) {
                long j2 = lVar.e;
                lVar.L0(wm3.a(vm3.j(j) + vm3.j(j2), vm3.k(j) + vm3.k(j2)), f, null);
            } else {
                long a = wm3.a((d() - lVar.F0()) - vm3.j(j), vm3.k(j));
                long j3 = lVar.e;
                lVar.L0(wm3.a(vm3.j(a) + vm3.j(j3), vm3.k(a) + vm3.k(j3)), f, null);
            }
        }

        public final void m(l lVar, int i, int i2, float f, ss2 ss2Var) {
            long a = wm3.a(i, i2);
            if (c() == LayoutDirection.Ltr || d() == 0) {
                long j = lVar.e;
                lVar.L0(wm3.a(vm3.j(a) + vm3.j(j), vm3.k(a) + vm3.k(j)), f, ss2Var);
            } else {
                long a2 = wm3.a((d() - lVar.F0()) - vm3.j(a), vm3.k(a));
                long j2 = lVar.e;
                lVar.L0(wm3.a(vm3.j(a2) + vm3.j(j2), vm3.k(a2) + vm3.k(j2)), f, ss2Var);
            }
        }

        public final void o(l lVar, long j, float f, ss2 ss2Var) {
            if (c() == LayoutDirection.Ltr || d() == 0) {
                long j2 = lVar.e;
                lVar.L0(wm3.a(vm3.j(j) + vm3.j(j2), vm3.k(j) + vm3.k(j2)), f, ss2Var);
            } else {
                long a = wm3.a((d() - lVar.F0()) - vm3.j(j), vm3.k(j));
                long j3 = lVar.e;
                lVar.L0(wm3.a(vm3.j(a) + vm3.j(j3), vm3.k(a) + vm3.k(j3)), f, ss2Var);
            }
        }

        public final void q(l lVar, int i, int i2, float f, ss2 ss2Var) {
            long a = wm3.a(i, i2);
            long j = lVar.e;
            lVar.L0(wm3.a(vm3.j(a) + vm3.j(j), vm3.k(a) + vm3.k(j)), f, ss2Var);
        }

        public final void s(l lVar, long j, float f, ss2 ss2Var) {
            long j2 = lVar.e;
            lVar.L0(wm3.a(vm3.j(j) + vm3.j(j2), vm3.k(j) + vm3.k(j2)), f, ss2Var);
        }
    }

    public l() {
        long j;
        j = PlaceableKt.b;
        this.d = j;
        this.e = vm3.b.a();
    }

    private final void J0() {
        this.a = uo6.m(hn3.g(this.c), fv0.p(this.d), fv0.n(this.d));
        this.b = uo6.m(hn3.f(this.c), fv0.o(this.d), fv0.m(this.d));
        this.e = wm3.a((this.a - hn3.g(this.c)) / 2, (this.b - hn3.f(this.c)) / 2);
    }

    public int B0() {
        return hn3.g(this.c);
    }

    protected final long E0() {
        return this.d;
    }

    public final int F0() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void L0(long j, float f, ss2 ss2Var);

    protected final void P0(long j) {
        if (hn3.e(this.c, j)) {
            return;
        }
        this.c = j;
        J0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void Q0(long j) {
        if (fv0.g(this.d, j)) {
            return;
        }
        this.d = j;
        J0();
    }

    protected final long u0() {
        return this.e;
    }

    public final int v0() {
        return this.b;
    }

    public int x0() {
        return hn3.f(this.c);
    }

    protected final long z0() {
        return this.c;
    }
}
