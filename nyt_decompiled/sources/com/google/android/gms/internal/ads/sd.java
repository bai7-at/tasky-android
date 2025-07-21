package com.google.android.gms.internal.ads;

import defpackage.k0f;
import defpackage.x1f;
import defpackage.y1f;

/* loaded from: classes3.dex */
public final class sd extends yh implements x1f {
    private static final sd zzb;
    private static volatile y1f zzd;
    private int zze;
    private int zzf;
    private yd zzg;
    private zzgyl zzh = zzgyl.a;

    static {
        sd sdVar = new sd();
        zzb = sdVar;
        yh.D(sd.class, sdVar);
    }

    private sd() {
    }

    public static rd M() {
        return (rd) zzb.k();
    }

    public static sd O(zzgyl zzgylVar, ph phVar) {
        return (sd) yh.q(zzb, zzgylVar, phVar);
    }

    public static y1f R() {
        return (y1f) zzb.I(7, null, null);
    }

    static /* synthetic */ void S(sd sdVar, yd ydVar) {
        ydVar.getClass();
        sdVar.zzg = ydVar;
        sdVar.zze |= 1;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new sd();
        }
        qd qdVar = null;
        if (i2 == 4) {
            return new rd(qdVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            return null;
        }
        y1f y1fVar = zzd;
        if (y1fVar == null) {
            synchronized (sd.class) {
                try {
                    y1fVar = zzd;
                    if (y1fVar == null) {
                        y1fVar = new k0f(zzb);
                        zzd = y1fVar;
                    }
                } finally {
                }
            }
        }
        return y1fVar;
    }

    public final int L() {
        return this.zzf;
    }

    public final yd P() {
        yd ydVar = this.zzg;
        return ydVar == null ? yd.O() : ydVar;
    }

    public final zzgyl Q() {
        return this.zzh;
    }
}
