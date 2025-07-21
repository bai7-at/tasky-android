package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class ok extends yh implements x1f {
    private static final ok zzb;
    private int zzd;
    private nk zzf;
    private long zzg;
    private String zze = "";
    private String zzh = "";

    static {
        ok okVar = new ok();
        zzb = okVar;
        yh.D(ok.class, okVar);
    }

    private ok() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new ok();
        }
        wj wjVar = null;
        if (i2 == 4) {
            return new lk(wjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
