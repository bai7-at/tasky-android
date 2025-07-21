package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class q3 extends r3 {
    q3(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.r3
    public final double a(Object obj, long j) {
        return Double.longBitsToDouble(k(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.r3
    public final float b(Object obj, long j) {
        return Float.intBitsToFloat(j(obj, j));
    }

    @Override // com.google.android.gms.internal.measurement.r3
    public final void c(Object obj, long j, boolean z) {
        if (s3.h) {
            s3.d(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            s3.e(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.r3
    public final void d(Object obj, long j, byte b) {
        if (s3.h) {
            s3.d(obj, j, b);
        } else {
            s3.e(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.measurement.r3
    public final void e(Object obj, long j, double d) {
        o(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.measurement.r3
    public final void f(Object obj, long j, float f) {
        n(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.measurement.r3
    public final boolean g(Object obj, long j) {
        return s3.h ? s3.y(obj, j) : s3.z(obj, j);
    }
}
