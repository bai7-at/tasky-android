package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class ee extends yh implements x1f {
    private static final ee zzb;
    private int zzd;
    private int zze;

    static {
        ee eeVar = new ee();
        zzb = eeVar;
        yh.D(ee.class, eeVar);
    }

    private ee() {
    }

    public static de N() {
        return (de) zzb.k();
    }

    public static ee P(zzgyl zzgylVar, ph phVar) {
        return (ee) yh.q(zzb, zzgylVar, phVar);
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new ee();
        }
        ce ceVar = null;
        if (i2 == 4) {
            return new de(ceVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int L() {
        return this.zzd;
    }

    public final int M() {
        return this.zze;
    }
}
