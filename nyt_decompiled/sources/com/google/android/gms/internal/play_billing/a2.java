package com.google.android.gms.internal.play_billing;

import defpackage.ycc;

/* loaded from: classes3.dex */
public final class a2 extends z implements ycc {
    private static final a2 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        a2 a2Var = new a2();
        zzb = a2Var;
        z.m(a2.class, a2Var);
    }

    private a2() {
    }

    public static z1 t() {
        return (z1) zzb.e();
    }

    static /* synthetic */ void v(a2 a2Var, String str) {
        str.getClass();
        a2Var.zzd |= 1;
        a2Var.zze = str;
    }

    static /* synthetic */ void w(a2 a2Var, String str) {
        str.getClass();
        a2Var.zzd |= 2;
        a2Var.zzf = str;
    }

    @Override // com.google.android.gms.internal.play_billing.z
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return z.j(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new a2();
        }
        y1 y1Var = null;
        if (i2 == 4) {
            return new z1(y1Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
