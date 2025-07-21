package com.google.android.gms.internal.pal;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class m1 extends o1 {
    m1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.pal.o1
    public final double a(Object obj, long j) {
        return Double.longBitsToDouble(k(obj, j));
    }

    @Override // com.google.android.gms.internal.pal.o1
    public final float b(Object obj, long j) {
        return Float.intBitsToFloat(j(obj, j));
    }

    @Override // com.google.android.gms.internal.pal.o1
    public final void c(Object obj, long j, boolean z) {
        if (p1.h) {
            p1.d(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            p1.e(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.pal.o1
    public final void d(Object obj, long j, byte b) {
        if (p1.h) {
            p1.d(obj, j, b);
        } else {
            p1.e(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.pal.o1
    public final void e(Object obj, long j, double d) {
        o(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.pal.o1
    public final void f(Object obj, long j, float f) {
        n(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.pal.o1
    public final boolean g(Object obj, long j) {
        return p1.h ? p1.y(obj, j) : p1.z(obj, j);
    }
}
