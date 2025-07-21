package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class am extends yh implements x1f {
    private static final am zzb;
    private int zzd;
    private String zze = "";
    private zzgyl zzf = zzgyl.a;

    static {
        am amVar = new am();
        zzb = amVar;
        yh.D(am.class, amVar);
    }

    private am() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new am();
        }
        wj wjVar = null;
        if (i2 == 4) {
            return new zl(wjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
