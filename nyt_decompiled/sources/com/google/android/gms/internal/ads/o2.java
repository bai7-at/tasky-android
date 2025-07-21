package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class o2 extends yh implements x1f {
    private static final o2 zzb;
    private int zzd;
    private int zze;
    private s2 zzf;
    private u2 zzg;

    static {
        o2 o2Var = new o2();
        zzb = o2Var;
        yh.D(o2.class, o2Var);
    }

    private o2() {
    }

    public static n2 L() {
        return (n2) zzb.k();
    }

    static /* synthetic */ void N(o2 o2Var, s2 s2Var) {
        s2Var.getClass();
        o2Var.zzf = s2Var;
        o2Var.zzd |= 2;
    }

    static /* synthetic */ void O(o2 o2Var, u2 u2Var) {
        u2Var.getClass();
        o2Var.zzg = u2Var;
        o2Var.zzd |= 4;
    }

    static /* synthetic */ void P(o2 o2Var, int i) {
        o2Var.zze = 1;
        o2Var.zzd = 1 | o2Var.zzd;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", q2.a, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new o2();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new n2(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
