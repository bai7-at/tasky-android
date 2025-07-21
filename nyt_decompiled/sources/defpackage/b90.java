package defpackage;

import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3ApplicationInterceptor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class b90 {
    public static final a a = new a(null);
    private static final int b = D(0);
    private static final int c = D(1);
    private static final int d = D(2);
    private static final int e = D(3);
    private static final int f = D(4);
    private static final int g = D(5);
    private static final int h = D(6);
    private static final int i = D(7);
    private static final int j = D(8);
    private static final int k = D(9);
    private static final int l = D(10);
    private static final int m = D(11);
    private static final int n = D(12);
    private static final int o = D(13);
    private static final int p = D(14);
    private static final int q = D(15);
    private static final int r = D(16);
    private static final int s = D(17);
    private static final int t = D(18);
    private static final int u = D(19);
    private static final int v = D(20);
    private static final int w = D(21);
    private static final int x = D(22);
    private static final int y = D(23);
    private static final int z = D(24);
    private static final int A = D(25);
    private static final int B = D(26);
    private static final int C = D(27);
    private static final int D = D(28);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int A() {
            return b90.i;
        }

        public final int B() {
            return b90.e;
        }

        public final int C() {
            return b90.m;
        }

        public final int a() {
            return b90.b;
        }

        public final int b() {
            return b90.C;
        }

        public final int c() {
            return b90.u;
        }

        public final int d() {
            return b90.t;
        }

        public final int e() {
            return b90.r;
        }

        public final int f() {
            return b90.x;
        }

        public final int g() {
            return b90.d;
        }

        public final int h() {
            return b90.l;
        }

        public final int i() {
            return b90.h;
        }

        public final int j() {
            return b90.j;
        }

        public final int k() {
            return b90.f;
        }

        public final int l() {
            return b90.y;
        }

        public final int m() {
            return b90.v;
        }

        public final int n() {
            return b90.A;
        }

        public final int o() {
            return b90.s;
        }

        public final int p() {
            return b90.D;
        }

        public final int q() {
            return b90.o;
        }

        public final int r() {
            return b90.z;
        }

        public final int s() {
            return b90.q;
        }

        public final int t() {
            return b90.n;
        }

        public final int u() {
            return b90.B;
        }

        public final int v() {
            return b90.p;
        }

        public final int w() {
            return b90.w;
        }

        public final int x() {
            return b90.c;
        }

        public final int y() {
            return b90.k;
        }

        public final int z() {
            return b90.g;
        }

        private a() {
        }
    }

    public static int D(int i2) {
        return i2;
    }

    public static final boolean E(int i2, int i3) {
        return i2 == i3;
    }

    public static int F(int i2) {
        return Integer.hashCode(i2);
    }

    public static String G(int i2) {
        return E(i2, b) ? "Clear" : E(i2, c) ? "Src" : E(i2, d) ? "Dst" : E(i2, e) ? "SrcOver" : E(i2, f) ? "DstOver" : E(i2, g) ? "SrcIn" : E(i2, h) ? "DstIn" : E(i2, i) ? "SrcOut" : E(i2, j) ? "DstOut" : E(i2, k) ? "SrcAtop" : E(i2, l) ? "DstAtop" : E(i2, m) ? "Xor" : E(i2, n) ? "Plus" : E(i2, o) ? "Modulate" : E(i2, p) ? "Screen" : E(i2, q) ? "Overlay" : E(i2, r) ? "Darken" : E(i2, s) ? "Lighten" : E(i2, t) ? "ColorDodge" : E(i2, u) ? "ColorBurn" : E(i2, v) ? "HardLight" : E(i2, w) ? "Softlight" : E(i2, x) ? "Difference" : E(i2, y) ? "Exclusion" : E(i2, z) ? "Multiply" : E(i2, A) ? "Hue" : E(i2, B) ? "Saturation" : E(i2, C) ? "Color" : E(i2, D) ? "Luminosity" : EmbraceOkHttp3ApplicationInterceptor.UNKNOWN_EXCEPTION;
    }
}
