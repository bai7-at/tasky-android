package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class q7 extends yh implements x1f {
    private static final q7 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private m7 zzh;

    static {
        q7 q7Var = new q7();
        zzb = q7Var;
        yh.D(q7.class, q7Var);
    }

    private q7() {
    }

    public static o7 L() {
        return (o7) zzb.k();
    }

    static /* synthetic */ void N(q7 q7Var, String str) {
        str.getClass();
        q7Var.zzd |= 2;
        q7Var.zzf = str;
    }

    static /* synthetic */ void O(q7 q7Var, m7 m7Var) {
        m7Var.getClass();
        q7Var.zzh = m7Var;
        q7Var.zzd |= 8;
    }

    static /* synthetic */ void P(q7 q7Var, int i) {
        q7Var.zze = 1;
        q7Var.zzd = 1 | q7Var.zzd;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", p7.a, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new q7();
        }
        n7 n7Var = null;
        if (i2 == 4) {
            return new o7(n7Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
