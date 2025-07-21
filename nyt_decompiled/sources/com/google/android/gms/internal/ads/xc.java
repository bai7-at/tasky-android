package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class xc extends yh implements x1f {
    private static final xc zzb;
    private int zzd;
    private int zze;
    private ad zzf;

    static {
        xc xcVar = new xc();
        zzb = xcVar;
        yh.D(xc.class, xcVar);
    }

    private xc() {
    }

    public static wc M() {
        return (wc) zzb.k();
    }

    public static xc O(zzgyl zzgylVar, ph phVar) {
        return (xc) yh.q(zzb, zzgylVar, phVar);
    }

    static /* synthetic */ void R(xc xcVar, ad adVar) {
        adVar.getClass();
        xcVar.zzf = adVar;
        xcVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new xc();
        }
        vc vcVar = null;
        if (i2 == 4) {
            return new wc(vcVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int L() {
        return this.zze;
    }

    public final ad P() {
        ad adVar = this.zzf;
        return adVar == null ? ad.O() : adVar;
    }
}
