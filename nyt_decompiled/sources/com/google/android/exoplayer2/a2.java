package com.google.android.exoplayer2;

/* loaded from: classes2.dex */
public interface a2 {

    public interface a {
        void a(z1 z1Var);
    }

    static int I(int i) {
        return i & 7;
    }

    static int l(int i) {
        return i & 384;
    }

    static int n(int i, int i2, int i3, int i4, int i5) {
        return i | i2 | i3 | i4 | i5;
    }

    static int p(int i) {
        return i & 32;
    }

    static int q(int i) {
        return i & 24;
    }

    static int r(int i) {
        return y(i, 0, 0);
    }

    static int w(int i) {
        return i & 64;
    }

    static int y(int i, int i2, int i3) {
        return n(i, i2, i3, 0, 128);
    }

    int C();

    void H(a aVar);

    int b(t0 t0Var);

    int f();

    String getName();

    void j();
}
