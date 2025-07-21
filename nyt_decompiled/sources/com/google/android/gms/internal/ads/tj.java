package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class tj extends yh implements x1f {
    private static final tj zzb;
    private int zzd;
    private long zze;
    private long zzf;

    static {
        tj tjVar = new tj();
        zzb = tjVar;
        yh.D(tj.class, tjVar);
    }

    private tj() {
    }

    public static sj L() {
        return (sj) zzb.k();
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new tj();
        }
        rj rjVar = null;
        if (i2 == 4) {
            return new sj(rjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
