package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class kl extends yh implements x1f {
    private static final kl zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    static {
        kl klVar = new kl();
        zzb = klVar;
        yh.D(kl.class, klVar);
    }

    private kl() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", jl.a, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new kl();
        }
        wj wjVar = null;
        if (i2 == 4) {
            return new il(wjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
