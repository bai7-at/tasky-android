package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class pd extends yh implements x1f {
    private static final pd zzb;
    private int zzd;

    static {
        pd pdVar = new pd();
        zzb = pdVar;
        yh.D(pd.class, pdVar);
    }

    private pd() {
    }

    public static od M() {
        return (od) zzb.k();
    }

    public static pd O() {
        return zzb;
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
            return new pd();
        }
        nd ndVar = null;
        if (i2 == 4) {
            return new od(ndVar);
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
