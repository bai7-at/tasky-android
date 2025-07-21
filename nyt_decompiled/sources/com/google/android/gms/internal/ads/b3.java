package com.google.android.gms.internal.ads;

import defpackage.n1f;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class b3 extends yh implements x1f {
    private static final b3 zzb;
    private int zzd;
    private String zze = "";
    private n1f zzf = yh.x();
    private int zzg;

    static {
        b3 b3Var = new b3();
        zzb = b3Var;
        yh.D(b3.class, b3Var);
    }

    private b3() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzf", z2.class, "zzg", l3.a});
        }
        if (i2 == 3) {
            return new b3();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new a3(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
