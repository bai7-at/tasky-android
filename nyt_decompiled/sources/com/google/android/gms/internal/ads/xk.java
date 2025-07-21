package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class xk extends yh implements x1f {
    private static final xk zzb;
    private int zzd;
    private zzgyl zze;
    private zzgyl zzf;
    private zzgyl zzg;

    static {
        xk xkVar = new xk();
        zzb = xkVar;
        yh.D(xk.class, xkVar);
    }

    private xk() {
        zzgyl zzgylVar = zzgyl.a;
        this.zze = zzgylVar;
        this.zzf = zzgylVar;
        this.zzg = zzgylVar;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new xk();
        }
        wj wjVar = null;
        if (i2 == 4) {
            return new wk(wjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
