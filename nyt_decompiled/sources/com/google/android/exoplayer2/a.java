package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.g2;
import defpackage.qr7;
import defpackage.ur;

/* loaded from: classes2.dex */
public abstract class a extends g2 {
    private final int f;
    private final qr7 g;
    private final boolean h;

    public a(boolean z, qr7 qr7Var) {
        this.h = z;
        this.g = qr7Var;
        this.f = qr7Var.getLength();
    }

    public static Object A(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object B(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object D(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    private int G(int i, boolean z) {
        if (z) {
            return this.g.c(i);
        }
        if (i < this.f - 1) {
            return i + 1;
        }
        return -1;
    }

    private int H(int i, boolean z) {
        if (z) {
            return this.g.b(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    protected abstract Object C(int i);

    protected abstract int E(int i);

    protected abstract int F(int i);

    protected abstract g2 I(int i);

    @Override // com.google.android.exoplayer2.g2
    public int f(boolean z) {
        if (this.f == 0) {
            return -1;
        }
        if (this.h) {
            z = false;
        }
        int f = z ? this.g.f() : 0;
        while (I(f).v()) {
            f = G(f, z);
            if (f == -1) {
                return -1;
            }
        }
        return F(f) + I(f).f(z);
    }

    @Override // com.google.android.exoplayer2.g2
    public final int g(Object obj) {
        int g;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object B = B(obj);
        Object A = A(obj);
        int x = x(B);
        if (x == -1 || (g = I(x).g(A)) == -1) {
            return -1;
        }
        return E(x) + g;
    }

    @Override // com.google.android.exoplayer2.g2
    public int h(boolean z) {
        int i = this.f;
        if (i == 0) {
            return -1;
        }
        if (this.h) {
            z = false;
        }
        int d = z ? this.g.d() : i - 1;
        while (I(d).v()) {
            d = H(d, z);
            if (d == -1) {
                return -1;
            }
        }
        return F(d) + I(d).h(z);
    }

    @Override // com.google.android.exoplayer2.g2
    public int j(int i, int i2, boolean z) {
        if (this.h) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int z2 = z(i);
        int F = F(z2);
        int j = I(z2).j(i - F, i2 != 2 ? i2 : 0, z);
        if (j != -1) {
            return F + j;
        }
        int G = G(z2, z);
        while (G != -1 && I(G).v()) {
            G = G(G, z);
        }
        if (G != -1) {
            return F(G) + I(G).f(z);
        }
        if (i2 == 2) {
            return f(z);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.g2
    public final g2.b l(int i, g2.b bVar, boolean z) {
        int y = y(i);
        int F = F(y);
        I(y).l(i - E(y), bVar, z);
        bVar.c += F;
        if (z) {
            bVar.b = D(C(y), ur.e(bVar.b));
        }
        return bVar;
    }

    @Override // com.google.android.exoplayer2.g2
    public final g2.b m(Object obj, g2.b bVar) {
        Object B = B(obj);
        Object A = A(obj);
        int x = x(B);
        int F = F(x);
        I(x).m(A, bVar);
        bVar.c += F;
        bVar.b = obj;
        return bVar;
    }

    @Override // com.google.android.exoplayer2.g2
    public int q(int i, int i2, boolean z) {
        if (this.h) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int z2 = z(i);
        int F = F(z2);
        int q = I(z2).q(i - F, i2 != 2 ? i2 : 0, z);
        if (q != -1) {
            return F + q;
        }
        int H = H(z2, z);
        while (H != -1 && I(H).v()) {
            H = H(H, z);
        }
        if (H != -1) {
            return F(H) + I(H).h(z);
        }
        if (i2 == 2) {
            return h(z);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.g2
    public final Object r(int i) {
        int y = y(i);
        return D(C(y), I(y).r(i - E(y)));
    }

    @Override // com.google.android.exoplayer2.g2
    public final g2.d t(int i, g2.d dVar, long j) {
        int z = z(i);
        int F = F(z);
        int E = E(z);
        I(z).t(i - F, dVar, j);
        Object C = C(z);
        if (!g2.d.u.equals(dVar.a)) {
            C = D(C, dVar.a);
        }
        dVar.a = C;
        dVar.r += E;
        dVar.s += E;
        return dVar;
    }

    protected abstract int x(Object obj);

    protected abstract int y(int i);

    protected abstract int z(int i);
}
