package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class x0 extends yh implements x1f {
    private static final x0 zzb;
    private int zzd;
    private int zze;

    static {
        x0 x0Var = new x0();
        zzb = x0Var;
        yh.D(x0.class, x0Var);
    }

    private x0() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", z0.a});
        }
        if (i2 == 3) {
            return new x0();
        }
        t0 t0Var = null;
        if (i2 == 4) {
            return new w0(t0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
