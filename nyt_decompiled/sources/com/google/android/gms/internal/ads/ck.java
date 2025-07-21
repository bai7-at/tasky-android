package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class ck extends yh implements x1f {
    private static final ck zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private zzgyl zzg = zzgyl.a;

    static {
        ck ckVar = new ck();
        zzb = ckVar;
        yh.D(ck.class, ckVar);
    }

    private ck() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", bk.a, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new ck();
        }
        wj wjVar = null;
        if (i2 == 4) {
            return new ak(wjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
