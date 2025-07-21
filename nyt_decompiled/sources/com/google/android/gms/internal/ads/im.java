package com.google.android.gms.internal.ads;

import defpackage.n1f;
import defpackage.p0f;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class im extends yh implements x1f {
    private static final im zzb;
    private int zzd;
    private int zze;
    private int zzh;
    private String zzf = "";
    private p0f zzg = yh.t();
    private n1f zzi = yh.x();
    private zzgyl zzj = zzgyl.a;

    static {
        im imVar = new im();
        zzb = imVar;
        yh.D(im.class, imVar);
    }

    private im() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", gm.class, "zzj"});
        }
        if (i2 == 3) {
            return new im();
        }
        wj wjVar = null;
        if (i2 == 4) {
            return new hm(wjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
