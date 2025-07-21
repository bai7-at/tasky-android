package com.google.android.gms.internal.measurement;

import defpackage.eef;
import defpackage.tbf;
import java.util.List;

/* loaded from: classes3.dex */
public final class j0 extends j2 implements eef {
    private static final j0 zza;
    private int zze;
    private tbf zzf = j2.l();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        j0 j0Var = new j0();
        zza = j0Var;
        j2.p(j0.class, j0Var);
    }

    private j0() {
    }

    static /* synthetic */ void A(j0 j0Var, int i, n0 n0Var) {
        n0Var.getClass();
        j0Var.M();
        j0Var.zzf.set(i, n0Var);
    }

    static /* synthetic */ void B(j0 j0Var, n0 n0Var) {
        n0Var.getClass();
        j0Var.M();
        j0Var.zzf.add(n0Var);
    }

    static /* synthetic */ void C(j0 j0Var, Iterable iterable) {
        j0Var.M();
        p1.c(iterable, j0Var.zzf);
    }

    static /* synthetic */ void E(j0 j0Var, int i) {
        j0Var.M();
        j0Var.zzf.remove(i);
    }

    static /* synthetic */ void F(j0 j0Var, String str) {
        str.getClass();
        j0Var.zze |= 1;
        j0Var.zzg = str;
    }

    static /* synthetic */ void G(j0 j0Var, long j) {
        j0Var.zze |= 2;
        j0Var.zzh = j;
    }

    static /* synthetic */ void H(j0 j0Var, long j) {
        j0Var.zze |= 4;
        j0Var.zzi = j;
    }

    private final void M() {
        tbf tbfVar = this.zzf;
        if (tbfVar.zzc()) {
            return;
        }
        this.zzf = j2.m(tbfVar);
    }

    public static i0 v() {
        return (i0) zza.f();
    }

    public final boolean I() {
        return (this.zze & 8) != 0;
    }

    public final boolean J() {
        return (this.zze & 4) != 0;
    }

    public final boolean K() {
        return (this.zze & 2) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.j2
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return j2.o(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", n0.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new j0();
        }
        a0 a0Var = null;
        if (i2 == 4) {
            return new i0(a0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int r() {
        return this.zzj;
    }

    public final int s() {
        return this.zzf.size();
    }

    public final long t() {
        return this.zzi;
    }

    public final long u() {
        return this.zzh;
    }

    public final n0 x(int i) {
        return (n0) this.zzf.get(i);
    }

    public final String y() {
        return this.zzg;
    }

    public final List z() {
        return this.zzf;
    }
}
