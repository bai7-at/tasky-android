package com.google.android.gms.internal.pal;

import defpackage.pu9;

/* loaded from: classes3.dex */
public abstract class p {
    private static volatile int d = 100;
    int a;
    final int b = d;
    q c;

    /* synthetic */ p(pu9 pu9Var) {
    }

    public static int l(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long m(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    static p n(byte[] bArr, int i, int i2, boolean z) {
        o oVar = new o(bArr, 0, i2, z, null);
        try {
            oVar.b(i2);
            return oVar;
        } catch (zzadi e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract int a();

    public abstract int b(int i);

    public abstract int c();

    public abstract zzaby d();

    public abstract String e();

    public abstract String f();

    public abstract void g(int i);

    public abstract void h(int i);

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k(int i);
}
