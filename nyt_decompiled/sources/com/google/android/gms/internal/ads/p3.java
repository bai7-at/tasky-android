package com.google.android.gms.internal.ads;

import defpackage.p0f;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class p3 extends yh implements x1f {
    private static final p3 zzb;
    private int zzd;
    private int zzf;
    private q4 zzh;
    private String zze = "";
    private p0f zzg = yh.t();

    static {
        p3 p3Var = new p3();
        zzb = p3Var;
        yh.D(p3.class, p3Var);
    }

    private p3() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", l3.a, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new p3();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new o3(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
