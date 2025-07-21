package com.google.android.gms.internal.play_billing;

import defpackage.ycc;

/* loaded from: classes3.dex */
public final class i2 extends z implements ycc {
    private static final i2 zzb;
    private int zzd;
    private int zze;

    static {
        i2 i2Var = new i2();
        zzb = i2Var;
        z.m(i2.class, i2Var);
    }

    private i2() {
    }

    public static g2 t() {
        return (g2) zzb.e();
    }

    static /* synthetic */ void v(i2 i2Var, int i) {
        i2Var.zze = i - 1;
        i2Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.z
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return z.j(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", h2.a});
        }
        if (i2 == 3) {
            return new i2();
        }
        f2 f2Var = null;
        if (i2 == 4) {
            return new g2(f2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
