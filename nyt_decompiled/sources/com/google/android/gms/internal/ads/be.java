package com.google.android.gms.internal.ads;

import defpackage.k0f;
import defpackage.x1f;
import defpackage.y1f;

/* loaded from: classes3.dex */
public final class be extends yh implements x1f {
    private static final be zzb;
    private static volatile y1f zzd;
    private int zze;
    private zzgyl zzf = zzgyl.a;

    static {
        be beVar = new be();
        zzb = beVar;
        yh.D(be.class, beVar);
    }

    private be() {
    }

    public static ae M() {
        return (ae) zzb.k();
    }

    public static be O(zzgyl zzgylVar, ph phVar) {
        return (be) yh.q(zzb, zzgylVar, phVar);
    }

    public static y1f Q() {
        return (y1f) zzb.I(7, null, null);
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new be();
        }
        zd zdVar = null;
        if (i2 == 4) {
            return new ae(zdVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            return null;
        }
        y1f y1fVar = zzd;
        if (y1fVar == null) {
            synchronized (be.class) {
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
        return this.zze;
    }

    public final zzgyl P() {
        return this.zzf;
    }
}
