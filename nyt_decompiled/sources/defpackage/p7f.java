package defpackage;

import android.util.Pair;

/* loaded from: classes3.dex */
public abstract class p7f extends n1c {
    private final int f;
    private final s2g g;

    public p7f(boolean z, s2g s2gVar) {
        this.g = s2gVar;
        this.f = s2gVar.c();
    }

    private final int w(int i, boolean z) {
        if (z) {
            return this.g.d(i);
        }
        if (i >= this.f - 1) {
            return -1;
        }
        return i + 1;
    }

    private final int x(int i, boolean z) {
        if (z) {
            return this.g.e(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    @Override // defpackage.n1c
    public final int a(Object obj) {
        int a;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int p = p(obj2);
            if (p != -1 && (a = u(p).a(obj3)) != -1) {
                return s(p) + a;
            }
        }
        return -1;
    }

    @Override // defpackage.n1c
    public final fyb d(int i, fyb fybVar, boolean z) {
        int q = q(i);
        int t = t(q);
        u(q).d(i - s(q), fybVar, z);
        fybVar.c += t;
        if (z) {
            Object v = v(q);
            Object obj = fybVar.b;
            obj.getClass();
            fybVar.b = Pair.create(v, obj);
        }
        return fybVar;
    }

    @Override // defpackage.n1c
    public final l0c e(int i, l0c l0cVar, long j) {
        int r = r(i);
        int t = t(r);
        int s = s(r);
        u(r).e(i - t, l0cVar, j);
        Object v = v(r);
        if (!l0c.p.equals(l0cVar.a)) {
            v = Pair.create(v, l0cVar.a);
        }
        l0cVar.a = v;
        l0cVar.n += s;
        l0cVar.o += s;
        return l0cVar;
    }

    @Override // defpackage.n1c
    public final Object f(int i) {
        int q = q(i);
        return Pair.create(v(q), u(q).f(i - s(q)));
    }

    @Override // defpackage.n1c
    public final int g(boolean z) {
        if (this.f != 0) {
            int a = z ? this.g.a() : 0;
            while (u(a).o()) {
                a = w(a, z);
                if (a == -1) {
                }
            }
            return t(a) + u(a).g(z);
        }
        return -1;
    }

    @Override // defpackage.n1c
    public final int h(boolean z) {
        int i = this.f;
        if (i != 0) {
            int b = z ? this.g.b() : i - 1;
            while (u(b).o()) {
                b = x(b, z);
                if (b == -1) {
                }
            }
            return t(b) + u(b).h(z);
        }
        return -1;
    }

    @Override // defpackage.n1c
    public final int j(int i, int i2, boolean z) {
        int r = r(i);
        int t = t(r);
        int j = u(r).j(i - t, i2 == 2 ? 0 : i2, z);
        if (j != -1) {
            return t + j;
        }
        int w = w(r, z);
        while (w != -1 && u(w).o()) {
            w = w(w, z);
        }
        if (w != -1) {
            return t(w) + u(w).g(z);
        }
        if (i2 == 2) {
            return g(z);
        }
        return -1;
    }

    @Override // defpackage.n1c
    public final int k(int i, int i2, boolean z) {
        int r = r(i);
        int t = t(r);
        int k = u(r).k(i - t, 0, false);
        if (k != -1) {
            return t + k;
        }
        int x = x(r, false);
        while (x != -1 && u(x).o()) {
            x = x(x, false);
        }
        if (x != -1) {
            return t(x) + u(x).h(false);
        }
        return -1;
    }

    @Override // defpackage.n1c
    public final fyb n(Object obj, fyb fybVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int p = p(obj2);
        int t = t(p);
        u(p).n(obj3, fybVar);
        fybVar.c += t;
        fybVar.b = obj;
        return fybVar;
    }

    protected abstract int p(Object obj);

    protected abstract int q(int i);

    protected abstract int r(int i);

    protected abstract int s(int i);

    protected abstract int t(int i);

    protected abstract n1c u(int i);

    protected abstract Object v(int i);
}
