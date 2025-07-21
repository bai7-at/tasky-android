package com.google.android.gms.internal.ads;

import defpackage.k0f;
import defpackage.x1f;
import defpackage.y1f;

/* loaded from: classes3.dex */
public final class ue extends yh implements x1f {
    private static final ue zzb;
    private static volatile y1f zzd;
    private int zze;
    private int zzf;
    private af zzg;
    private zzgyl zzh = zzgyl.a;

    static {
        ue ueVar = new ue();
        zzb = ueVar;
        yh.D(ue.class, ueVar);
    }

    private ue() {
    }

    public static te M() {
        return (te) zzb.k();
    }

    public static ue O() {
        return zzb;
    }

    public static ue P(zzgyl zzgylVar, ph phVar) {
        return (ue) yh.q(zzb, zzgylVar, phVar);
    }

    public static y1f S() {
        return (y1f) zzb.I(7, null, null);
    }

    static /* synthetic */ void T(ue ueVar, af afVar) {
        afVar.getClass();
        ueVar.zzg = afVar;
        ueVar.zze |= 1;
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
            return new ue();
        }
        se seVar = null;
        if (i2 == 4) {
            return new te(seVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            return null;
        }
        y1f y1fVar = zzd;
        if (y1fVar == null) {
            synchronized (ue.class) {
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

    public final af Q() {
        af afVar = this.zzg;
        return afVar == null ? af.P() : afVar;
    }

    public final zzgyl R() {
        return this.zzh;
    }
}
