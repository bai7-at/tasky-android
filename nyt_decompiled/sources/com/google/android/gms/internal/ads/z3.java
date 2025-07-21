package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class z3 extends yh implements x1f {
    private static final z3 zzb;
    private int zzd;
    private int zze;
    private q4 zzf;

    static {
        z3 z3Var = new z3();
        zzb = z3Var;
        yh.D(z3.class, z3Var);
    }

    private z3() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", l3.a, "zzf"});
        }
        if (i2 == 3) {
            return new z3();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new y3(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
