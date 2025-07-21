package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class qg extends yh implements x1f {
    private static final qg zzb;
    private int zzd;

    static {
        qg qgVar = new qg();
        zzb = qgVar;
        yh.D(qg.class, qgVar);
    }

    private qg() {
    }

    public static qg N() {
        return zzb;
    }

    public static qg O(zzgyl zzgylVar, ph phVar) {
        return (qg) yh.q(zzb, zzgylVar, phVar);
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new qg();
        }
        og ogVar = null;
        if (i2 == 4) {
            return new pg(ogVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int L() {
        return this.zzd;
    }
}
