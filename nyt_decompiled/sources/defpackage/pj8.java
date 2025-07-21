package defpackage;

import androidx.compose.ui.text.i;

/* loaded from: classes.dex */
public abstract class pj8 {
    public static final long a(int i) {
        return b(i, i);
    }

    public static final long b(int i, int i2) {
        return i.c(d(i, i2));
    }

    public static final long c(long j, int i, int i2) {
        int m = uo6.m(i.n(j), i, i2);
        int m2 = uo6.m(i.i(j), i, i2);
        return (m == i.n(j) && m2 == i.i(j)) ? j : b(m, m2);
    }

    private static final long d(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i + ", end: " + i2 + ']').toString());
        }
        if (i2 >= 0) {
            return (i2 & 4294967295L) | (i << 32);
        }
        throw new IllegalArgumentException(("end cannot be negative. [start: " + i + ", end: " + i2 + ']').toString());
    }
}
