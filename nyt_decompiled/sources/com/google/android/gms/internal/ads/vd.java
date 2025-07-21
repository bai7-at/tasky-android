package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class vd extends yh implements x1f {
    private static final vd zzb;
    private int zzd;
    private yd zze;
    private int zzf;

    static {
        vd vdVar = new vd();
        zzb = vdVar;
        yh.D(vd.class, vdVar);
    }

    private vd() {
    }

    public static ud M() {
        return (ud) zzb.k();
    }

    public static vd O(zzgyl zzgylVar, ph phVar) {
        return (vd) yh.q(zzb, zzgylVar, phVar);
    }

    static /* synthetic */ void Q(vd vdVar, yd ydVar) {
        ydVar.getClass();
        vdVar.zze = ydVar;
        vdVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new vd();
        }
        td tdVar = null;
        if (i2 == 4) {
            return new ud(tdVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int L() {
        return this.zzf;
    }

    public final yd P() {
        yd ydVar = this.zze;
        return ydVar == null ? yd.O() : ydVar;
    }
}
