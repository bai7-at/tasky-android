package com.google.android.gms.internal.ads;

import defpackage.k0f;
import defpackage.x1f;
import defpackage.y1f;

/* loaded from: classes3.dex */
public final class uc extends yh implements x1f {
    private static final uc zzb;
    private static volatile y1f zzd;
    private int zze;
    private int zzf;
    private zzgyl zzg = zzgyl.a;
    private ad zzh;

    static {
        uc ucVar = new uc();
        zzb = ucVar;
        yh.D(uc.class, ucVar);
    }

    private uc() {
    }

    public static tc M() {
        return (tc) zzb.k();
    }

    public static uc O(zzgyl zzgylVar, ph phVar) {
        return (uc) yh.q(zzb, zzgylVar, phVar);
    }

    public static y1f R() {
        return (y1f) zzb.I(7, null, null);
    }

    static /* synthetic */ void T(uc ucVar, ad adVar) {
        adVar.getClass();
        ucVar.zzh = adVar;
        ucVar.zze |= 1;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new uc();
        }
        sc scVar = null;
        if (i2 == 4) {
            return new tc(scVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            return null;
        }
        y1f y1fVar = zzd;
        if (y1fVar == null) {
            synchronized (uc.class) {
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

    public final ad P() {
        ad adVar = this.zzh;
        return adVar == null ? ad.O() : adVar;
    }

    public final zzgyl Q() {
        return this.zzg;
    }
}
