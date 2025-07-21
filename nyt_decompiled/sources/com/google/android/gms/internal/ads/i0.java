package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class i0 extends yh implements x1f {
    private static final i0 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        i0 i0Var = new i0();
        zzb = i0Var;
        yh.D(i0.class, i0Var);
    }

    private i0() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new i0();
        }
        f0 f0Var = null;
        if (i2 == 4) {
            return new h0(f0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
