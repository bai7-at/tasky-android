package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class z2 extends yh implements x1f {
    private static final z2 zzb;
    private int zzd;
    private int zze;
    private m4 zzf;

    static {
        z2 z2Var = new z2();
        zzb = z2Var;
        yh.D(z2.class, z2Var);
    }

    private z2() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", x2.a, "zzf"});
        }
        if (i2 == 3) {
            return new z2();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new y2(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
