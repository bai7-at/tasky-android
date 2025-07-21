package com.google.android.gms.internal.play_billing;

import defpackage.ycc;

/* loaded from: classes3.dex */
public final class l2 extends z implements ycc {
    private static final l2 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private a2 zzg;

    static {
        l2 l2Var = new l2();
        zzb = l2Var;
        z.m(l2.class, l2Var);
    }

    private l2() {
    }

    static /* synthetic */ void t(l2 l2Var, t1 t1Var) {
        t1Var.getClass();
        l2Var.zzf = t1Var;
        l2Var.zze = 3;
    }

    public static k2 u() {
        return (k2) zzb.e();
    }

    static /* synthetic */ void w(l2 l2Var, p2 p2Var) {
        p2Var.getClass();
        l2Var.zzf = p2Var;
        l2Var.zze = 4;
    }

    static /* synthetic */ void x(l2 l2Var, a2 a2Var) {
        l2Var.zzg = a2Var;
        l2Var.zzd |= 1;
    }

    static /* synthetic */ void y(l2 l2Var, p1 p1Var) {
        p1Var.getClass();
        l2Var.zzf = p1Var;
        l2Var.zze = 2;
    }

    @Override // com.google.android.gms.internal.play_billing.z
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return z.j(zzb, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", p1.class, t1.class, p2.class});
        }
        if (i2 == 3) {
            return new l2();
        }
        j2 j2Var = null;
        if (i2 == 4) {
            return new k2(j2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
