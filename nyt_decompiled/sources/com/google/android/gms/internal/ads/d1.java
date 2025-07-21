package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class d1 extends yh implements x1f {
    private static final d1 zzb;
    private int zzd;
    private long zze = -1;

    static {
        d1 d1Var = new d1();
        zzb = d1Var;
        yh.D(d1.class, d1Var);
    }

    private d1() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new d1();
        }
        t0 t0Var = null;
        if (i2 == 4) {
            return new c1(t0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
