package com.google.android.gms.internal.ads;

import defpackage.k0f;
import defpackage.x1f;
import defpackage.y1f;

/* loaded from: classes3.dex */
public final class dd extends yh implements x1f {
    private static final dd zzb;
    private static volatile y1f zzd;
    private int zze;
    private int zzf;
    private jd zzg;
    private ue zzh;

    static {
        dd ddVar = new dd();
        zzb = ddVar;
        yh.D(dd.class, ddVar);
    }

    private dd() {
    }

    public static cd M() {
        return (cd) zzb.k();
    }

    public static dd O(zzgyl zzgylVar, ph phVar) {
        return (dd) yh.q(zzb, zzgylVar, phVar);
    }

    public static y1f R() {
        return (y1f) zzb.I(7, null, null);
    }

    static /* synthetic */ void S(dd ddVar, jd jdVar) {
        jdVar.getClass();
        ddVar.zzg = jdVar;
        ddVar.zze |= 1;
    }

    static /* synthetic */ void T(dd ddVar, ue ueVar) {
        ueVar.getClass();
        ddVar.zzh = ueVar;
        ddVar.zze |= 2;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new dd();
        }
        bd bdVar = null;
        if (i2 == 4) {
            return new cd(bdVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            return null;
        }
        y1f y1fVar = zzd;
        if (y1fVar == null) {
            synchronized (dd.class) {
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

    public final jd P() {
        jd jdVar = this.zzg;
        return jdVar == null ? jd.O() : jdVar;
    }

    public final ue Q() {
        ue ueVar = this.zzh;
        return ueVar == null ? ue.O() : ueVar;
    }
}
