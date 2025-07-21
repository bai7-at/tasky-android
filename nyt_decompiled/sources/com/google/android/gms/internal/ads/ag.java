package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class ag extends yh implements x1f {
    private static final ag zzb;
    private String zzd = "";

    static {
        ag agVar = new ag();
        zzb = agVar;
        yh.D(ag.class, agVar);
    }

    private ag() {
    }

    public static zf L() {
        return (zf) zzb.k();
    }

    public static ag N() {
        return zzb;
    }

    public static ag O(zzgyl zzgylVar, ph phVar) {
        return (ag) yh.q(zzb, zzgylVar, phVar);
    }

    static /* synthetic */ void Q(ag agVar, String str) {
        str.getClass();
        agVar.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new ag();
        }
        yf yfVar = null;
        if (i2 == 4) {
            return new zf(yfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String P() {
        return this.zzd;
    }
}
