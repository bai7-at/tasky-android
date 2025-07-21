package com.google.android.gms.internal.ads;

import defpackage.k0f;
import defpackage.x1f;
import defpackage.y1f;

/* loaded from: classes3.dex */
public final class dg extends yh implements x1f {
    private static final dg zzb;
    private static volatile y1f zzd;
    private int zze;
    private int zzf;
    private gg zzg;

    static {
        dg dgVar = new dg();
        zzb = dgVar;
        yh.D(dg.class, dgVar);
    }

    private dg() {
    }

    public static cg M() {
        return (cg) zzb.k();
    }

    public static dg O(zzgyl zzgylVar, ph phVar) {
        return (dg) yh.q(zzb, zzgylVar, phVar);
    }

    public static y1f Q() {
        return (y1f) zzb.I(7, null, null);
    }

    static /* synthetic */ void R(dg dgVar, gg ggVar) {
        ggVar.getClass();
        dgVar.zzg = ggVar;
        dgVar.zze |= 1;
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
            return new dg();
        }
        bg bgVar = null;
        if (i2 == 4) {
            return new cg(bgVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            return null;
        }
        y1f y1fVar = zzd;
        if (y1fVar == null) {
            synchronized (dg.class) {
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

    public final gg P() {
        gg ggVar = this.zzg;
        return ggVar == null ? gg.O() : ggVar;
    }
}
