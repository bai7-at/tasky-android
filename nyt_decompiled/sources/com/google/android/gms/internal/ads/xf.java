package com.google.android.gms.internal.ads;

import defpackage.k0f;
import defpackage.x1f;
import defpackage.y1f;

/* loaded from: classes3.dex */
public final class xf extends yh implements x1f {
    private static final xf zzb;
    private static volatile y1f zzd;
    private int zze;
    private int zzf;
    private ag zzg;

    static {
        xf xfVar = new xf();
        zzb = xfVar;
        yh.D(xf.class, xfVar);
    }

    private xf() {
    }

    public static wf M() {
        return (wf) zzb.k();
    }

    public static xf O(zzgyl zzgylVar, ph phVar) {
        return (xf) yh.q(zzb, zzgylVar, phVar);
    }

    public static y1f Q() {
        return (y1f) zzb.I(7, null, null);
    }

    static /* synthetic */ void R(xf xfVar, ag agVar) {
        agVar.getClass();
        xfVar.zzg = agVar;
        xfVar.zze |= 1;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new xf();
        }
        vf vfVar = null;
        if (i2 == 4) {
            return new wf(vfVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            return null;
        }
        y1f y1fVar = zzd;
        if (y1fVar == null) {
            synchronized (xf.class) {
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

    public final ag P() {
        ag agVar = this.zzg;
        return agVar == null ? ag.N() : agVar;
    }
}
