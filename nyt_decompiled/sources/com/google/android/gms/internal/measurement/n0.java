package com.google.android.gms.internal.measurement;

import defpackage.eef;
import defpackage.tbf;
import java.util.List;

/* loaded from: classes3.dex */
public final class n0 extends j2 implements eef {
    private static final n0 zza;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private tbf zzk = j2.l();

    static {
        n0 n0Var = new n0();
        zza = n0Var;
        j2.p(n0.class, n0Var);
    }

    private n0() {
    }

    static /* synthetic */ void A(n0 n0Var, String str) {
        str.getClass();
        n0Var.zze |= 1;
        n0Var.zzf = str;
    }

    static /* synthetic */ void B(n0 n0Var, String str) {
        str.getClass();
        n0Var.zze |= 2;
        n0Var.zzg = str;
    }

    static /* synthetic */ void C(n0 n0Var) {
        n0Var.zze &= -3;
        n0Var.zzg = zza.zzg;
    }

    static /* synthetic */ void D(n0 n0Var, long j) {
        n0Var.zze |= 4;
        n0Var.zzh = j;
    }

    static /* synthetic */ void E(n0 n0Var) {
        n0Var.zze &= -5;
        n0Var.zzh = 0L;
    }

    static /* synthetic */ void F(n0 n0Var, double d) {
        n0Var.zze |= 16;
        n0Var.zzj = d;
    }

    static /* synthetic */ void G(n0 n0Var) {
        n0Var.zze &= -17;
        n0Var.zzj = 0.0d;
    }

    static /* synthetic */ void H(n0 n0Var, n0 n0Var2) {
        n0Var2.getClass();
        n0Var.U();
        n0Var.zzk.add(n0Var2);
    }

    static /* synthetic */ void I(n0 n0Var, Iterable iterable) {
        n0Var.U();
        p1.c(iterable, n0Var.zzk);
    }

    private final void U() {
        tbf tbfVar = this.zzk;
        if (tbfVar.zzc()) {
            return;
        }
        this.zzk = j2.m(tbfVar);
    }

    public static m0 v() {
        return (m0) zza.f();
    }

    public final boolean K() {
        return (this.zze & 16) != 0;
    }

    public final boolean M() {
        return (this.zze & 8) != 0;
    }

    public final boolean N() {
        return (this.zze & 4) != 0;
    }

    public final boolean S() {
        return (this.zze & 1) != 0;
    }

    public final boolean T() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.j2
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return j2.o(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", n0.class});
        }
        if (i2 == 3) {
            return new n0();
        }
        a0 a0Var = null;
        if (i2 == 4) {
            return new m0(a0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final double r() {
        return this.zzj;
    }

    public final float s() {
        return this.zzi;
    }

    public final int t() {
        return this.zzk.size();
    }

    public final long u() {
        return this.zzh;
    }

    public final String x() {
        return this.zzf;
    }

    public final String y() {
        return this.zzg;
    }

    public final List z() {
        return this.zzk;
    }
}
