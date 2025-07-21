package com.google.android.gms.internal.icing;

import defpackage.m5d;

/* loaded from: classes3.dex */
public final class q1 extends z implements m5d {
    private static final q1 zzg;
    private int zzb;
    private String zze = "";
    private u1 zzf;

    static {
        q1 q1Var = new q1();
        zzg = q1Var;
        z.i(q1.class, q1Var);
    }

    private q1() {
    }

    public static p1 o() {
        return (p1) zzg.g();
    }

    static /* synthetic */ void q(q1 q1Var, String str) {
        str.getClass();
        q1Var.zzb |= 1;
        q1Var.zze = str;
    }

    static /* synthetic */ void r(q1 q1Var, u1 u1Var) {
        u1Var.getClass();
        q1Var.zzf = u1Var;
        q1Var.zzb |= 2;
    }

    @Override // com.google.android.gms.internal.icing.z
    protected final Object f(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return z.j(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new q1();
        }
        o1 o1Var = null;
        if (i2 == 4) {
            return new p1(o1Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzg;
    }
}
