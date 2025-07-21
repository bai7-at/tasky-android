package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class bl extends yh implements x1f {
    private static final bl zzb;
    private int zzd;
    private int zze;
    private zzgyl zzf;
    private zzgyl zzg;

    static {
        bl blVar = new bl();
        zzb = blVar;
        yh.D(bl.class, blVar);
    }

    private bl() {
        zzgyl zzgylVar = zzgyl.a;
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
            return yh.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new bl();
        }
        wj wjVar = null;
        if (i2 == 4) {
            return new al(wjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
