package com.google.android.gms.internal.ads;

import defpackage.n1f;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class yk extends yh implements x1f {
    private static final yk zzb;
    private int zzd;
    private xk zze;
    private zzgyl zzg;
    private zzgyl zzh;
    private int zzi;
    private byte zzj = 2;
    private n1f zzf = yh.x();

    static {
        yk ykVar = new yk();
        zzb = ykVar;
        yh.D(yk.class, ykVar);
    }

    private yk() {
        zzgyl zzgylVar = zzgyl.a;
        this.zzg = zzgylVar;
        this.zzh = zzgylVar;
    }

    public static vk L() {
        return (vk) zzb.k();
    }

    static /* synthetic */ void N(yk ykVar, uk ukVar) {
        ukVar.getClass();
        n1f n1fVar = ykVar.zzf;
        if (!n1fVar.zzc()) {
            ykVar.zzf = yh.y(n1fVar);
        }
        ykVar.zzf.add(ukVar);
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzd", "zze", "zzf", uk.class, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new yk();
        }
        wj wjVar = null;
        if (i2 == 4) {
            return new vk(wjVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
