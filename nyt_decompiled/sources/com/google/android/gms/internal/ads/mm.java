package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class mm extends yh implements x1f {
    private static final mm zzb;
    private int zzd;
    private String zze = "";

    static {
        mm mmVar = new mm();
        zzb = mmVar;
        yh.D(mm.class, mmVar);
    }

    private mm() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new mm();
        }
        wj wjVar = null;
        if (i2 == 4) {
            return new lm(wjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
