package com.google.android.gms.internal.measurement;

import defpackage.eef;
import defpackage.qbf;
import defpackage.tbf;
import java.util.List;

/* loaded from: classes3.dex */
public final class y0 extends j2 implements eef {
    private static final y0 zza;
    private qbf zze = j2.j();
    private qbf zzf = j2.j();
    private tbf zzg = j2.l();
    private tbf zzh = j2.l();

    static {
        y0 y0Var = new y0();
        zza = y0Var;
        j2.p(y0.class, y0Var);
    }

    private y0() {
    }

    static /* synthetic */ void E(y0 y0Var, Iterable iterable) {
        qbf qbfVar = y0Var.zze;
        if (!qbfVar.zzc()) {
            y0Var.zze = j2.k(qbfVar);
        }
        p1.c(iterable, y0Var.zze);
    }

    static /* synthetic */ void G(y0 y0Var, Iterable iterable) {
        qbf qbfVar = y0Var.zzf;
        if (!qbfVar.zzc()) {
            y0Var.zzf = j2.k(qbfVar);
        }
        p1.c(iterable, y0Var.zzf);
    }

    static /* synthetic */ void I(y0 y0Var, Iterable iterable) {
        y0Var.T();
        p1.c(iterable, y0Var.zzg);
    }

    static /* synthetic */ void K(y0 y0Var, int i) {
        y0Var.T();
        y0Var.zzg.remove(i);
    }

    static /* synthetic */ void M(y0 y0Var, Iterable iterable) {
        y0Var.U();
        p1.c(iterable, y0Var.zzh);
    }

    static /* synthetic */ void S(y0 y0Var, int i) {
        y0Var.U();
        y0Var.zzh.remove(i);
    }

    private final void T() {
        tbf tbfVar = this.zzg;
        if (tbfVar.zzc()) {
            return;
        }
        this.zzg = j2.m(tbfVar);
    }

    private final void U() {
        tbf tbfVar = this.zzh;
        if (tbfVar.zzc()) {
            return;
        }
        this.zzh = j2.m(tbfVar);
    }

    public static x0 w() {
        return (x0) zza.f();
    }

    public static y0 y() {
        return zza;
    }

    public final List A() {
        return this.zzg;
    }

    public final List B() {
        return this.zzf;
    }

    public final List C() {
        return this.zzh;
    }

    public final List D() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.j2
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return j2.o(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", h0.class, "zzh", a1.class});
        }
        if (i2 == 3) {
            return new y0();
        }
        a0 a0Var = null;
        if (i2 == 4) {
            return new x0(a0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int r() {
        return this.zzg.size();
    }

    public final int s() {
        return this.zzf.size();
    }

    public final int t() {
        return this.zzh.size();
    }

    public final int u() {
        return this.zze.size();
    }

    public final h0 v(int i) {
        return (h0) this.zzg.get(i);
    }

    public final a1 z(int i) {
        return (a1) this.zzh.get(i);
    }
}
