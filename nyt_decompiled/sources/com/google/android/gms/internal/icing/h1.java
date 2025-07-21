package com.google.android.gms.internal.icing;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class h1 extends j1 {
    h1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.icing.j1
    public final void a(Object obj, long j, byte b) {
        if (k1.i) {
            k1.d(obj, j, b);
        } else {
            k1.e(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.icing.j1
    public final boolean b(Object obj, long j) {
        return k1.i ? k1.A(obj, j) : k1.B(obj, j);
    }

    @Override // com.google.android.gms.internal.icing.j1
    public final void c(Object obj, long j, boolean z) {
        if (k1.i) {
            k1.d(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            k1.e(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.icing.j1
    public final float d(Object obj, long j) {
        return Float.intBitsToFloat(k(obj, j));
    }

    @Override // com.google.android.gms.internal.icing.j1
    public final void e(Object obj, long j, float f) {
        l(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.icing.j1
    public final double f(Object obj, long j) {
        return Double.longBitsToDouble(m(obj, j));
    }

    @Override // com.google.android.gms.internal.icing.j1
    public final void g(Object obj, long j, double d) {
        n(obj, j, Double.doubleToLongBits(d));
    }
}
