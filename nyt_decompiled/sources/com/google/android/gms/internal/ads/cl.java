package com.google.android.gms.internal.ads;

import defpackage.n1f;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class cl extends yh implements x1f {
    private static final cl zzb;
    private int zzd;
    private bl zze;
    private zzgyl zzg;
    private zzgyl zzh;
    private int zzi;
    private zzgyl zzj;
    private byte zzk = 2;
    private n1f zzf = yh.x();

    static {
        cl clVar = new cl();
        zzb = clVar;
        yh.D(cl.class, clVar);
    }

    private cl() {
        zzgyl zzgylVar = zzgyl.a;
        this.zzg = zzgylVar;
        this.zzh = zzgylVar;
        this.zzj = zzgylVar;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzd", "zze", "zzf", uk.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new cl();
        }
        wj wjVar = null;
        if (i2 == 4) {
            return new zk(wjVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
