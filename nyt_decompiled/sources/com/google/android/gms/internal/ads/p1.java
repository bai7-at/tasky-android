package com.google.android.gms.internal.ads;

import defpackage.p0f;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class p1 extends yh implements x1f {
    private static final p1 zzb;
    private int zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private p0f zzh = yh.t();
    private long zzi;

    static {
        p1 p1Var = new p1();
        zzb = p1Var;
        yh.D(p1.class, p1Var);
    }

    private p1() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new p1();
        }
        t0 t0Var = null;
        if (i2 == 4) {
            return new o1(t0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
