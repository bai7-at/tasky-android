package com.google.android.gms.internal.icing;

import defpackage.m5d;

/* loaded from: classes3.dex */
public final class u1 extends z implements m5d {
    private static final u1 zzj;
    private int zzb;
    private boolean zze;
    private String zzf = "";
    private long zzg;
    private double zzh;
    private s1 zzi;

    static {
        u1 u1Var = new u1();
        zzj = u1Var;
        z.i(u1.class, u1Var);
    }

    private u1() {
    }

    public static t1 o() {
        return (t1) zzj.g();
    }

    static /* synthetic */ void q(u1 u1Var, boolean z) {
        u1Var.zzb |= 1;
        u1Var.zze = z;
    }

    static /* synthetic */ void r(u1 u1Var, String str) {
        str.getClass();
        u1Var.zzb |= 2;
        u1Var.zzf = str;
    }

    static /* synthetic */ void s(u1 u1Var, s1 s1Var) {
        s1Var.getClass();
        u1Var.zzi = s1Var;
        u1Var.zzb |= 16;
    }

    @Override // com.google.android.gms.internal.icing.z
    protected final Object f(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return z.j(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004က\u0003\u0005ဉ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new u1();
        }
        o1 o1Var = null;
        if (i2 == 4) {
            return new t1(o1Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzj;
    }
}
