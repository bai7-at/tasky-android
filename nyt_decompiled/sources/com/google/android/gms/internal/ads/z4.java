package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class z4 extends yh implements x1f {
    private static final z4 zzb;
    private int zzd;
    private int zze;

    static {
        z4 z4Var = new z4();
        zzb = z4Var;
        yh.D(z4.class, z4Var);
    }

    private z4() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", y4.a});
        }
        if (i2 == 3) {
            return new z4();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new x4(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
