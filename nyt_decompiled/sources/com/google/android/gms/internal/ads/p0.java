package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class p0 extends yh implements x1f {
    private static final p0 zzb;
    private int zzd;
    private int zze = 2;

    static {
        p0 p0Var = new p0();
        zzb = p0Var;
        yh.D(p0.class, p0Var);
    }

    private p0() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zzd", "zze", q0.a});
        }
        if (i2 == 3) {
            return new p0();
        }
        l0 l0Var = null;
        if (i2 == 4) {
            return new o0(l0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
