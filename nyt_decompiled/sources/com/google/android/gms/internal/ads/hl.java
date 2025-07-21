package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class hl extends yh implements x1f {
    private static final hl zzb;
    private int zzd;
    private int zze;
    private gl zzf;
    private gl zzg;

    static {
        hl hlVar = new hl();
        zzb = hlVar;
        yh.D(hl.class, hlVar);
    }

    private hl() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", el.a, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new hl();
        }
        wj wjVar = null;
        if (i2 == 4) {
            return new dl(wjVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
