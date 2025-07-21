package defpackage;

/* loaded from: classes.dex */
public final class n14 {
    private final cy4 a;
    private final cy4 b;
    private boolean c;
    private Object d;
    private final t04 e;

    public n14(int i, int i2) {
        this.a = ow7.a(i);
        this.b = ow7.a(i2);
        this.e = new t04(i, 30, 100);
    }

    private final void f(int i) {
        this.b.f(i);
    }

    private final void g(int i, int i2) {
        if (i >= 0.0f) {
            e(i);
            this.e.o(i);
            f(i2);
        } else {
            throw new IllegalArgumentException(("Index should be non-negative (" + i + ')').toString());
        }
    }

    public final int a() {
        return this.a.d();
    }

    public final t04 b() {
        return this.e;
    }

    public final int c() {
        return this.b.d();
    }

    public final void d(int i, int i2) {
        g(i, i2);
        this.d = null;
    }

    public final void e(int i) {
        this.a.f(i);
    }

    public final void h(k14 k14Var) {
        l14 o = k14Var.o();
        this.d = o != null ? o.getKey() : null;
        if (this.c || k14Var.h() > 0) {
            this.c = true;
            int p = k14Var.p();
            if (p >= 0.0f) {
                l14 o2 = k14Var.o();
                g(o2 != null ? o2.getIndex() : 0, p);
            } else {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + p + ')').toString());
            }
        }
    }

    public final void i(int i) {
        if (i >= 0.0f) {
            f(i);
            return;
        }
        throw new IllegalStateException(("scrollOffset should be non-negative (" + i + ')').toString());
    }

    public final int j(h14 h14Var, int i) {
        int a = p04.a(h14Var, this.d, i);
        if (i != a) {
            e(a);
            this.e.o(i);
        }
        return a;
    }
}
