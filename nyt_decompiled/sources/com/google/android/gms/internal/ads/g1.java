package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class g1 extends yh implements x1f {
    private static final g1 zzb;
    private int zzd;
    private int zze;
    private long zzf = -1;

    static {
        g1 g1Var = new g1();
        zzb = g1Var;
        yh.D(g1.class, g1Var);
    }

    private g1() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", y0.a, "zzf"});
        }
        if (i2 == 3) {
            return new g1();
        }
        t0 t0Var = null;
        if (i2 == 4) {
            return new f1(t0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
