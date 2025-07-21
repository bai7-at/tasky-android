package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class o4 extends yh implements x1f {
    private static final o4 zzb;
    private int zzd;
    private String zze = "";
    private int zzf;
    private q4 zzg;

    static {
        o4 o4Var = new o4();
        zzb = o4Var;
        yh.D(o4.class, o4Var);
    }

    private o4() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", l3.a, "zzg"});
        }
        if (i2 == 3) {
            return new o4();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new n4(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
