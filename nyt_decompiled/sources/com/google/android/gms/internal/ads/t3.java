package com.google.android.gms.internal.ads;

import defpackage.n1f;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class t3 extends yh implements x1f {
    private static final t3 zzb;
    private int zzd;
    private p3 zze;
    private n1f zzf = yh.x();
    private int zzg;
    private q4 zzh;

    static {
        t3 t3Var = new t3();
        zzb = t3Var;
        yh.D(t3.class, t3Var);
    }

    private t3() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", o4.class, "zzg", l3.a, "zzh"});
        }
        if (i2 == 3) {
            return new t3();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new s3(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
