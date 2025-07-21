package com.google.android.gms.internal.play_billing;

import defpackage.ycc;

/* loaded from: classes3.dex */
public final class p1 extends z implements ycc {
    private static final p1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private x1 zzh;
    private e2 zzi;

    static {
        p1 p1Var = new p1();
        zzb = p1Var;
        z.m(p1.class, p1Var);
    }

    private p1() {
    }

    static /* synthetic */ void t(p1 p1Var, int i) {
        p1Var.zzg = i - 1;
        p1Var.zzd |= 1;
    }

    public static o1 u() {
        return (o1) zzb.e();
    }

    public static p1 w(byte[] bArr, r rVar) {
        return (p1) z.h(zzb, bArr, rVar);
    }

    static /* synthetic */ void x(p1 p1Var, x1 x1Var) {
        x1Var.getClass();
        p1Var.zzh = x1Var;
        p1Var.zzd |= 2;
    }

    static /* synthetic */ void y(p1 p1Var, i2 i2Var) {
        i2Var.getClass();
        p1Var.zzf = i2Var;
        p1Var.zze = 4;
    }

    @Override // com.google.android.gms.internal.play_billing.z
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return z.j(zzb, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", q1.a, "zzh", "zzi", i2.class});
        }
        if (i2 == 3) {
            return new p1();
        }
        n1 n1Var = null;
        if (i2 == 4) {
            return new o1(n1Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
