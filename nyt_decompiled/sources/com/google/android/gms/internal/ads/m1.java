package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class m1 extends yh implements x1f {
    private static final m1 zzb;
    private int zzd;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;

    static {
        m1 m1Var = new m1();
        zzb = m1Var;
        yh.D(m1.class, m1Var);
    }

    private m1() {
    }

    public static l1 L() {
        return (l1) zzb.k();
    }

    static /* synthetic */ void N(m1 m1Var, long j) {
        m1Var.zzd |= 1;
        m1Var.zze = j;
    }

    static /* synthetic */ void O(m1 m1Var, long j) {
        m1Var.zzd |= 4;
        m1Var.zzg = j;
    }

    static /* synthetic */ void P(m1 m1Var, long j) {
        m1Var.zzd |= 8;
        m1Var.zzh = j;
    }

    static /* synthetic */ void Q(m1 m1Var, long j) {
        m1Var.zzd |= 16;
        m1Var.zzi = j;
    }

    static /* synthetic */ void R(m1 m1Var, long j) {
        m1Var.zzd |= 32;
        m1Var.zzj = j;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new m1();
        }
        t0 t0Var = null;
        if (i2 == 4) {
            return new l1(t0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
