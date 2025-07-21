package com.google.android.gms.internal.ads;

import com.amazonaws.event.ProgressEvent;
import defpackage.e0f;
import java.io.InputStream;

/* loaded from: classes3.dex */
public abstract class gh {
    private static volatile int d = 100;
    public static final /* synthetic */ int e = 0;
    int a;
    final int b = d;
    hh c;

    /* synthetic */ gh(e0f e0fVar) {
    }

    public static int e(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long f(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static gh g(InputStream inputStream, int i) {
        return new fh(inputStream, ProgressEvent.PART_FAILED_EVENT_CODE, null);
    }

    static gh h(byte[] bArr, int i, int i2, boolean z) {
        dh dhVar = new dh(bArr, i, i2, z, null);
        try {
            dhVar.l(i2);
            return dhVar;
        } catch (zzhag e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract String A();

    public abstract void B(int i);

    public abstract void a(int i);

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d(int i);

    public abstract double i();

    public abstract float j();

    public abstract int k();

    public abstract int l(int i);

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract int p();

    public abstract int q();

    public abstract int r();

    public abstract int s();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract long w();

    public abstract long x();

    public abstract zzgyl y();

    public abstract String z();
}
