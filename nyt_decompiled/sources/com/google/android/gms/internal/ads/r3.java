package com.google.android.gms.internal.ads;

import defpackage.p0f;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class r3 extends yh implements x1f {
    private static final r3 zzb;
    private int zzd;
    private int zze;
    private p0f zzf = yh.t();

    static {
        r3 r3Var = new r3();
        zzb = r3Var;
        yh.D(r3.class, r3Var);
    }

    private r3() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zzd", "zze", l3.a, "zzf"});
        }
        if (i2 == 3) {
            return new r3();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new q3(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
