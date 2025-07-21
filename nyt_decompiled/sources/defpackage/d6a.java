package defpackage;

import android.text.Layout;

/* loaded from: classes3.dex */
final class d6a {
    private String a;
    private int b;
    private boolean c;
    private int d;
    private boolean e;
    private float k;
    private String l;
    private Layout.Alignment o;
    private Layout.Alignment p;
    private w5a r;
    private int f = -1;
    private int g = -1;
    private int h = -1;
    private int i = -1;
    private int j = -1;
    private int m = -1;
    private int n = -1;
    private int q = -1;
    private float s = Float.MAX_VALUE;

    public final d6a A(float f) {
        this.k = f;
        return this;
    }

    public final d6a B(int i) {
        this.j = i;
        return this;
    }

    public final d6a C(String str) {
        this.l = str;
        return this;
    }

    public final d6a D(boolean z) {
        this.i = z ? 1 : 0;
        return this;
    }

    public final d6a E(boolean z) {
        this.f = z ? 1 : 0;
        return this;
    }

    public final d6a F(Layout.Alignment alignment) {
        this.p = alignment;
        return this;
    }

    public final d6a G(int i) {
        this.n = i;
        return this;
    }

    public final d6a H(int i) {
        this.m = i;
        return this;
    }

    public final d6a I(float f) {
        this.s = f;
        return this;
    }

    public final d6a J(Layout.Alignment alignment) {
        this.o = alignment;
        return this;
    }

    public final d6a a(boolean z) {
        this.q = z ? 1 : 0;
        return this;
    }

    public final d6a b(w5a w5aVar) {
        this.r = w5aVar;
        return this;
    }

    public final d6a c(boolean z) {
        this.g = z ? 1 : 0;
        return this;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.l;
    }

    public final boolean f() {
        return this.q == 1;
    }

    public final boolean g() {
        return this.e;
    }

    public final boolean h() {
        return this.c;
    }

    public final boolean i() {
        return this.f == 1;
    }

    public final boolean j() {
        return this.g == 1;
    }

    public final float k() {
        return this.k;
    }

    public final float l() {
        return this.s;
    }

    public final int m() {
        if (this.e) {
            return this.d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final int n() {
        if (this.c) {
            return this.b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final int o() {
        return this.j;
    }

    public final int p() {
        return this.n;
    }

    public final int q() {
        return this.m;
    }

    public final int r() {
        int i = this.h;
        if (i == -1 && this.i == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.i == 1 ? 2 : 0);
    }

    public final Layout.Alignment s() {
        return this.p;
    }

    public final Layout.Alignment t() {
        return this.o;
    }

    public final w5a u() {
        return this.r;
    }

    public final d6a v(d6a d6aVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (d6aVar != null) {
            if (!this.c && d6aVar.c) {
                y(d6aVar.b);
            }
            if (this.h == -1) {
                this.h = d6aVar.h;
            }
            if (this.i == -1) {
                this.i = d6aVar.i;
            }
            if (this.a == null && (str = d6aVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = d6aVar.f;
            }
            if (this.g == -1) {
                this.g = d6aVar.g;
            }
            if (this.n == -1) {
                this.n = d6aVar.n;
            }
            if (this.o == null && (alignment2 = d6aVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = d6aVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = d6aVar.q;
            }
            if (this.j == -1) {
                this.j = d6aVar.j;
                this.k = d6aVar.k;
            }
            if (this.r == null) {
                this.r = d6aVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = d6aVar.s;
            }
            if (!this.e && d6aVar.e) {
                w(d6aVar.d);
            }
            if (this.m == -1 && (i = d6aVar.m) != -1) {
                this.m = i;
            }
        }
        return this;
    }

    public final d6a w(int i) {
        this.d = i;
        this.e = true;
        return this;
    }

    public final d6a x(boolean z) {
        this.h = z ? 1 : 0;
        return this;
    }

    public final d6a y(int i) {
        this.b = i;
        this.c = true;
        return this;
    }

    public final d6a z(String str) {
        this.a = str;
        return this;
    }
}
