package com.google.android.gms.internal.measurement;

import defpackage.eef;

/* loaded from: classes3.dex */
public final class c1 extends j2 implements eef {
    private static final c1 zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        c1 c1Var = new c1();
        zza = c1Var;
        j2.p(c1.class, c1Var);
    }

    private c1() {
    }

    static /* synthetic */ void A(c1 c1Var, String str) {
        str.getClass();
        c1Var.zze |= 4;
        c1Var.zzh = str;
    }

    static /* synthetic */ void B(c1 c1Var) {
        c1Var.zze &= -5;
        c1Var.zzh = zza.zzh;
    }

    static /* synthetic */ void C(c1 c1Var, long j) {
        c1Var.zze |= 8;
        c1Var.zzi = j;
    }

    static /* synthetic */ void D(c1 c1Var) {
        c1Var.zze &= -9;
        c1Var.zzi = 0L;
    }

    static /* synthetic */ void E(c1 c1Var, double d) {
        c1Var.zze |= 32;
        c1Var.zzk = d;
    }

    static /* synthetic */ void F(c1 c1Var) {
        c1Var.zze &= -33;
        c1Var.zzk = 0.0d;
    }

    public static b1 u() {
        return (b1) zza.f();
    }

    static /* synthetic */ void y(c1 c1Var, long j) {
        c1Var.zze |= 1;
        c1Var.zzf = j;
    }

    static /* synthetic */ void z(c1 c1Var, String str) {
        str.getClass();
        c1Var.zze |= 2;
        c1Var.zzg = str;
    }

    public final boolean G() {
        return (this.zze & 32) != 0;
    }

    public final boolean H() {
        return (this.zze & 8) != 0;
    }

    public final boolean I() {
        return (this.zze & 1) != 0;
    }

    public final boolean J() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.j2
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return j2.o(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new c1();
        }
        a0 a0Var = null;
        if (i2 == 4) {
            return new b1(a0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final double r() {
        return this.zzk;
    }

    public final long s() {
        return this.zzi;
    }

    public final long t() {
        return this.zzf;
    }

    public final String w() {
        return this.zzg;
    }

    public final String x() {
        return this.zzh;
    }
}
