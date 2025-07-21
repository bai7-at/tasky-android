package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class y1 extends yh implements x1f {
    private static final y1 zzb;
    private int zzd;
    private String zze = "";

    static {
        y1 y1Var = new y1();
        zzb = y1Var;
        yh.D(y1.class, y1Var);
    }

    private y1() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new y1();
        }
        t0 t0Var = null;
        if (i2 == 4) {
            return new x1(t0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
