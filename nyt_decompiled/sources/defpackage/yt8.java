package defpackage;

import android.text.Layout;

/* loaded from: classes2.dex */
final class yt8 {
    private String a;
    private int b;
    private boolean c;
    private int d;
    private boolean e;
    private float k;
    private String l;
    private Layout.Alignment o;
    private Layout.Alignment p;
    private ai8 r;
    private int f = -1;
    private int g = -1;
    private int h = -1;
    private int i = -1;
    private int j = -1;
    private int m = -1;
    private int n = -1;
    private int q = -1;
    private float s = Float.MAX_VALUE;

    private yt8 r(yt8 yt8Var, boolean z) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (yt8Var != null) {
            if (!this.c && yt8Var.c) {
                w(yt8Var.b);
            }
            if (this.h == -1) {
                this.h = yt8Var.h;
            }
            if (this.i == -1) {
                this.i = yt8Var.i;
            }
            if (this.a == null && (str = yt8Var.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = yt8Var.f;
            }
            if (this.g == -1) {
                this.g = yt8Var.g;
            }
            if (this.n == -1) {
                this.n = yt8Var.n;
            }
            if (this.o == null && (alignment2 = yt8Var.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = yt8Var.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = yt8Var.q;
            }
            if (this.j == -1) {
                this.j = yt8Var.j;
                this.k = yt8Var.k;
            }
            if (this.r == null) {
                this.r = yt8Var.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = yt8Var.s;
            }
            if (z && !this.e && yt8Var.e) {
                u(yt8Var.d);
            }
            if (z && this.m == -1 && (i = yt8Var.m) != -1) {
                this.m = i;
            }
        }
        return this;
    }

    public yt8 A(String str) {
        this.l = str;
        return this;
    }

    public yt8 B(boolean z) {
        this.i = z ? 1 : 0;
        return this;
    }

    public yt8 C(boolean z) {
        this.f = z ? 1 : 0;
        return this;
    }

    public yt8 D(Layout.Alignment alignment) {
        this.p = alignment;
        return this;
    }

    public yt8 E(int i) {
        this.n = i;
        return this;
    }

    public yt8 F(int i) {
        this.m = i;
        return this;
    }

    public yt8 G(float f) {
        this.s = f;
        return this;
    }

    public yt8 H(Layout.Alignment alignment) {
        this.o = alignment;
        return this;
    }

    public yt8 I(boolean z) {
        this.q = z ? 1 : 0;
        return this;
    }

    public yt8 J(ai8 ai8Var) {
        this.r = ai8Var;
        return this;
    }

    public yt8 K(boolean z) {
        this.g = z ? 1 : 0;
        return this;
    }

    public yt8 a(yt8 yt8Var) {
        return r(yt8Var, true);
    }

    public int b() {
        if (this.e) {
            return this.d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.c) {
            return this.b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.a;
    }

    public float e() {
        return this.k;
    }

    public int f() {
        return this.j;
    }

    public String g() {
        return this.l;
    }

    public Layout.Alignment h() {
        return this.p;
    }

    public int i() {
        return this.n;
    }

    public int j() {
        return this.m;
    }

    public float k() {
        return this.s;
    }

    public int l() {
        int i = this.h;
        if (i == -1 && this.i == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.i == 1 ? 2 : 0);
    }

    public Layout.Alignment m() {
        return this.o;
    }

    public boolean n() {
        return this.q == 1;
    }

    public ai8 o() {
        return this.r;
    }

    public boolean p() {
        return this.e;
    }

    public boolean q() {
        return this.c;
    }

    public boolean s() {
        return this.f == 1;
    }

    public boolean t() {
        return this.g == 1;
    }

    public yt8 u(int i) {
        this.d = i;
        this.e = true;
        return this;
    }

    public yt8 v(boolean z) {
        this.h = z ? 1 : 0;
        return this;
    }

    public yt8 w(int i) {
        this.b = i;
        this.c = true;
        return this;
    }

    public yt8 x(String str) {
        this.a = str;
        return this;
    }

    public yt8 y(float f) {
        this.k = f;
        return this;
    }

    public yt8 z(int i) {
        this.j = i;
        return this;
    }
}
