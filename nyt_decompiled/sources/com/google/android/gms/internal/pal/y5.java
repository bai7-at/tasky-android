package com.google.android.gms.internal.pal;

import defpackage.by9;

/* loaded from: classes3.dex */
public final class y5 extends c0 implements by9 {
    private static final y5 zzb;
    private int zze;
    private int zzf;

    static {
        y5 y5Var = new y5();
        zzb = y5Var;
        c0.h(y5.class, y5Var);
    }

    private y5() {
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zze", "zzf", r7.a});
        }
        if (i2 == 3) {
            return new y5();
        }
        g3 g3Var = null;
        if (i2 == 4) {
            return new z4(g3Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
