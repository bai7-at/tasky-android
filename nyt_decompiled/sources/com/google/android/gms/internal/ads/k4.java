package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class k4 extends yh implements x1f {
    private static final k4 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        k4 k4Var = new k4();
        zzb = k4Var;
        yh.D(k4.class, k4Var);
    }

    private k4() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new k4();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new j4(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
