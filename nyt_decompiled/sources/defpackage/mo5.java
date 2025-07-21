package defpackage;

import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.d;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.g;
import androidx.compose.ui.text.j;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.lu4;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class mo5 {
    private String a;
    private j b;
    private e.b c;
    private int d;
    private boolean e;
    private int f;
    private int g;
    private long h;
    private fm1 i;
    private io5 j;
    private boolean k;
    private long l;
    private lu4 m;
    private lo5 n;
    private LayoutDirection o;
    private long p;
    private int q;
    private int r;

    public /* synthetic */ mo5(String str, j jVar, e.b bVar, int i, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jVar, bVar, i, z, i2, i3);
    }

    private final io5 g(long j, LayoutDirection layoutDirection) {
        lo5 n = n(layoutDirection);
        return androidx.compose.ui.text.e.c(n, zz3.a(j, this.e, this.d, n.a()), zz3.b(this.e, this.d, this.f), kj8.e(this.d, kj8.a.b()));
    }

    private final void i() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = fv0.b.c(0, 0);
        this.l = in3.a(0, 0);
        this.k = false;
    }

    private final boolean l(long j, LayoutDirection layoutDirection) {
        lo5 lo5Var;
        io5 io5Var = this.j;
        if (io5Var == null || (lo5Var = this.n) == null || lo5Var.c() || layoutDirection != this.o) {
            return true;
        }
        if (fv0.g(j, this.p)) {
            return false;
        }
        return fv0.n(j) != fv0.n(this.p) || ((float) fv0.m(j)) < io5Var.getHeight() || io5Var.n();
    }

    private final lo5 n(LayoutDirection layoutDirection) {
        lo5 lo5Var = this.n;
        if (lo5Var == null || layoutDirection != this.o || lo5Var.c()) {
            this.o = layoutDirection;
            String str = this.a;
            j d = ak8.d(this.b, layoutDirection);
            fm1 fm1Var = this.i;
            zq3.e(fm1Var);
            lo5Var = d.b(str, d, null, null, fm1Var, this.c, 12, null);
        }
        this.n = lo5Var;
        return lo5Var;
    }

    public final fm1 a() {
        return this.i;
    }

    public final boolean b() {
        return this.k;
    }

    public final long c() {
        return this.l;
    }

    public final ww8 d() {
        lo5 lo5Var = this.n;
        if (lo5Var != null) {
            lo5Var.c();
        }
        return ww8.a;
    }

    public final io5 e() {
        return this.j;
    }

    public final int f(int i, LayoutDirection layoutDirection) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        int a = th8.a(g(iv0.a(0, i, 0, Integer.MAX_VALUE), layoutDirection).getHeight());
        this.q = i;
        this.r = a;
        return a;
    }

    public final boolean h(long j, LayoutDirection layoutDirection) {
        boolean z = true;
        if (this.g > 1) {
            lu4.a aVar = lu4.h;
            lu4 lu4Var = this.m;
            j jVar = this.b;
            fm1 fm1Var = this.i;
            zq3.e(fm1Var);
            lu4 a = aVar.a(lu4Var, layoutDirection, jVar, fm1Var, this.c);
            this.m = a;
            j = a.c(j, this.g);
        }
        boolean z2 = false;
        if (l(j, layoutDirection)) {
            io5 g = g(j, layoutDirection);
            this.p = j;
            this.l = iv0.d(j, in3.a(th8.a(g.getWidth()), th8.a(g.getHeight())));
            if (!kj8.e(this.d, kj8.a.c()) && (hn3.g(r9) < g.getWidth() || hn3.f(r9) < g.getHeight())) {
                z2 = true;
            }
            this.k = z2;
            this.j = g;
            return true;
        }
        if (!fv0.g(j, this.p)) {
            io5 io5Var = this.j;
            zq3.e(io5Var);
            this.l = iv0.d(j, in3.a(th8.a(Math.min(io5Var.a(), io5Var.getWidth())), th8.a(io5Var.getHeight())));
            if (kj8.e(this.d, kj8.a.c()) || (hn3.g(r3) >= io5Var.getWidth() && hn3.f(r3) >= io5Var.getHeight())) {
                z = false;
            }
            this.k = z;
            this.p = j;
        }
        return false;
    }

    public final int j(LayoutDirection layoutDirection) {
        return th8.a(n(layoutDirection).a());
    }

    public final int k(LayoutDirection layoutDirection) {
        return th8.a(n(layoutDirection).b());
    }

    public final void m(fm1 fm1Var) {
        fm1 fm1Var2 = this.i;
        long d = fm1Var != null ? ak3.d(fm1Var) : ak3.a.a();
        if (fm1Var2 == null) {
            this.i = fm1Var;
            this.h = d;
        } else if (fm1Var == null || !ak3.e(this.h, d)) {
            this.i = fm1Var;
            this.h = d;
            i();
        }
    }

    public final aj8 o(j jVar) {
        fm1 fm1Var;
        LayoutDirection layoutDirection = this.o;
        if (layoutDirection == null || (fm1Var = this.i) == null) {
            return null;
        }
        a aVar = new a(this.a, null, null, 6, null);
        if (this.j == null || this.n == null) {
            return null;
        }
        long e = fv0.e(this.p, 0, 0, 0, 0, 10, null);
        return new aj8(new g(aVar, jVar, i.l(), this.f, this.e, this.d, fm1Var, layoutDirection, this.c, e, (DefaultConstructorMarker) null), new MultiParagraph(new MultiParagraphIntrinsics(aVar, jVar, i.l(), fm1Var, this.c), e, this.f, kj8.e(this.d, kj8.a.b()), null), this.l, null);
    }

    public final void p(String str, j jVar, e.b bVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = jVar;
        this.c = bVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        i();
    }

    private mo5(String str, j jVar, e.b bVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = jVar;
        this.c = bVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = ak3.a.a();
        this.l = in3.a(0, 0);
        this.p = fv0.b.c(0, 0);
        this.q = -1;
        this.r = -1;
    }
}
