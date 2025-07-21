package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class f1 extends g1 {
    f1(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final double a(Object obj, long j) {
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final float b(Object obj, long j) {
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final void c(Object obj, long j, boolean z) {
        if (h1.h) {
            h1.d(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            h1.e(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final void d(Object obj, long j, byte b) {
        if (h1.h) {
            h1.d(obj, j, b);
        } else {
            h1.e(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final void e(Object obj, long j, double d) {
        this.a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final void f(Object obj, long j, float f) {
        this.a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    public final boolean g(Object obj, long j) {
        return h1.h ? h1.y(obj, j) : h1.z(obj, j);
    }
}
