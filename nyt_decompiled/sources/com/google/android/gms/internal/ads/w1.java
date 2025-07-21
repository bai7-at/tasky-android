package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class w1 extends yh implements x1f {
    private static final w1 zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private zzgyl zzg = zzgyl.a;

    static {
        w1 w1Var = new w1();
        zzb = w1Var;
        yh.D(w1.class, w1Var);
    }

    private w1() {
    }

    public static w1 N() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new w1();
        }
        t0 t0Var = null;
        if (i2 == 4) {
            return new v1(t0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final long L() {
        return this.zze;
    }

    public final boolean O() {
        return (this.zzd & 1) != 0;
    }
}
