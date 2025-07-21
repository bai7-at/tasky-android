package com.google.android.gms.internal.play_billing;

import defpackage.ycc;

/* loaded from: classes3.dex */
public final class t1 extends z implements ycc {
    private static final t1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        t1 t1Var = new t1();
        zzb = t1Var;
        z.m(t1.class, t1Var);
    }

    private t1() {
    }

    public static s1 t() {
        return (s1) zzb.e();
    }

    static /* synthetic */ void v(t1 t1Var, i2 i2Var) {
        i2Var.getClass();
        t1Var.zzf = i2Var;
        t1Var.zze = 2;
    }

    static /* synthetic */ void w(t1 t1Var, int i) {
        t1Var.zzg = i - 1;
        t1Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.z
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return z.j(zzb, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", q1.a, i2.class});
        }
        if (i2 == 3) {
            return new t1();
        }
        r1 r1Var = null;
        if (i2 == 4) {
            return new s1(r1Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
