package defpackage;

import androidx.compose.foundation.layout.LayoutOrientation;

/* loaded from: classes.dex */
public abstract class xk5 {
    public static long a(int i, int i2, int i3, int i4) {
        return b(iv0.a(i, i2, i3, i4));
    }

    private static long b(long j) {
        return j;
    }

    public static long c(long j, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        return a(layoutOrientation == layoutOrientation2 ? fv0.p(j) : fv0.o(j), layoutOrientation == layoutOrientation2 ? fv0.n(j) : fv0.m(j), layoutOrientation == layoutOrientation2 ? fv0.o(j) : fv0.p(j), layoutOrientation == layoutOrientation2 ? fv0.m(j) : fv0.n(j));
    }

    public static final long d(long j, int i, int i2, int i3, int i4) {
        return a(i, i2, i3, i4);
    }

    public static /* synthetic */ long e(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = fv0.p(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = fv0.n(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = fv0.o(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = fv0.m(j);
        }
        return d(j, i6, i7, i8, i4);
    }

    public static final long f(long j, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? iv0.a(fv0.p(j), fv0.n(j), fv0.o(j), fv0.m(j)) : iv0.a(fv0.o(j), fv0.m(j), fv0.p(j), fv0.n(j));
    }
}
