package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class qe extends yh implements x1f {
    private static final qe zzb;

    static {
        qe qeVar = new qe();
        zzb = qeVar;
        yh.D(qe.class, qeVar);
    }

    private qe() {
    }

    public static qe M() {
        return zzb;
    }

    public static qe N(zzgyl zzgylVar, ph phVar) {
        return (qe) yh.q(zzb, zzgylVar, phVar);
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        oe oeVar = null;
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new qe();
        }
        if (i2 == 4) {
            return new pe(oeVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
