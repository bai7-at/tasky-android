package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class n0 extends yh implements x1f {
    private static final n0 zzb;
    private int zzd;
    private p0 zze;
    private s0 zzf;

    static {
        n0 n0Var = new n0();
        zzb = n0Var;
        yh.D(n0.class, n0Var);
    }

    private n0() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new n0();
        }
        l0 l0Var = null;
        if (i2 == 4) {
            return new m0(l0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
