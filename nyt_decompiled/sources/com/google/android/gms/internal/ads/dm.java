package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class dm extends yh implements x1f {
    private static final dm zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        dm dmVar = new dm();
        zzb = dmVar;
        yh.D(dm.class, dmVar);
    }

    private dm() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", cm.a, "zzf"});
        }
        if (i2 == 3) {
            return new dm();
        }
        wj wjVar = null;
        if (i2 == 4) {
            return new bm(wjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
