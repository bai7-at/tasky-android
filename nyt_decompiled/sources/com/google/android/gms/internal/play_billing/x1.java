package com.google.android.gms.internal.play_billing;

import defpackage.ycc;

/* loaded from: classes3.dex */
public final class x1 extends z implements ycc {
    private static final x1 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        x1 x1Var = new x1();
        zzb = x1Var;
        z.m(x1.class, x1Var);
    }

    private x1() {
    }

    public static v1 t() {
        return (v1) zzb.e();
    }

    static /* synthetic */ void v(x1 x1Var, int i) {
        x1Var.zzd |= 1;
        x1Var.zze = i;
    }

    static /* synthetic */ void w(x1 x1Var, String str) {
        str.getClass();
        x1Var.zzd |= 2;
        x1Var.zzf = str;
    }

    static /* synthetic */ void x(x1 x1Var, int i) {
        x1Var.zzg = i - 1;
        x1Var.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.z
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return z.j(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", w1.a, "zzh"});
        }
        if (i2 == 3) {
            return new x1();
        }
        u1 u1Var = null;
        if (i2 == 4) {
            return new v1(u1Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
