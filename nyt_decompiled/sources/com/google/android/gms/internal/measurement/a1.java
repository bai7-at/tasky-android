package com.google.android.gms.internal.measurement;

import defpackage.eef;
import defpackage.qbf;
import java.util.List;

/* loaded from: classes3.dex */
public final class a1 extends j2 implements eef {
    private static final a1 zza;
    private int zze;
    private int zzf;
    private qbf zzg = j2.j();

    static {
        a1 a1Var = new a1();
        zza = a1Var;
        j2.p(a1.class, a1Var);
    }

    private a1() {
    }

    public static z0 u() {
        return (z0) zza.f();
    }

    static /* synthetic */ void x(a1 a1Var, int i) {
        a1Var.zze |= 1;
        a1Var.zzf = i;
    }

    static /* synthetic */ void y(a1 a1Var, Iterable iterable) {
        qbf qbfVar = a1Var.zzg;
        if (!qbfVar.zzc()) {
            a1Var.zzg = j2.k(qbfVar);
        }
        p1.c(iterable, a1Var.zzg);
    }

    @Override // com.google.android.gms.internal.measurement.j2
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return j2.o(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new a1();
        }
        a0 a0Var = null;
        if (i2 == 4) {
            return new z0(a0Var);
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
        return this.zzf;
    }

    public final long t(int i) {
        return this.zzg.zza(i);
    }

    public final List w() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zze & 1) != 0;
    }
}
