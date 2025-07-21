package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class b7 extends yh implements x1f {
    private static final b7 zzb;
    private int zzd;
    private x6 zze;

    static {
        b7 b7Var = new b7();
        zzb = b7Var;
        yh.D(b7.class, b7Var);
    }

    private b7() {
    }

    public static a7 L() {
        return (a7) zzb.k();
    }

    static /* synthetic */ void N(b7 b7Var, x6 x6Var) {
        x6Var.getClass();
        b7Var.zze = x6Var;
        b7Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new b7();
        }
        y6 y6Var = null;
        if (i2 == 4) {
            return new a7(y6Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
