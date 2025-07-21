package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class jj extends lj {
    jj(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.lj
    public final byte a(long j) {
        return Memory.peekByte((int) j);
    }

    @Override // com.google.android.gms.internal.ads.lj
    public final double b(Object obj, long j) {
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.lj
    public final float c(Object obj, long j) {
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.lj
    public final void d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray((int) j, bArr, (int) j2, (int) j3);
    }

    @Override // com.google.android.gms.internal.ads.lj
    public final void e(Object obj, long j, boolean z) {
        if (mj.i) {
            mj.g(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            mj.h(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.lj
    public final void f(Object obj, long j, byte b) {
        if (mj.i) {
            mj.g(obj, j, b);
        } else {
            mj.h(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.ads.lj
    public final void g(Object obj, long j, double d) {
        this.a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.lj
    public final void h(Object obj, long j, float f) {
        this.a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.lj
    public final boolean i(Object obj, long j) {
        return mj.i ? mj.E(obj, j) : mj.F(obj, j);
    }
}
