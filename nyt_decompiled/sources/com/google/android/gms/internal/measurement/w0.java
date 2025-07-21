package com.google.android.gms.internal.measurement;

import defpackage.eef;
import defpackage.tbf;

/* loaded from: classes3.dex */
public final class w0 extends j2 implements eef {
    private static final w0 zza;
    private int zze;
    private int zzf = 1;
    private tbf zzg = j2.l();

    static {
        w0 w0Var = new w0();
        zza = w0Var;
        j2.p(w0.class, w0Var);
    }

    private w0() {
    }

    public static u0 r() {
        return (u0) zza.f();
    }

    static /* synthetic */ void t(w0 w0Var, l0 l0Var) {
        l0Var.getClass();
        tbf tbfVar = w0Var.zzg;
        if (!tbfVar.zzc()) {
            w0Var.zzg = j2.m(tbfVar);
        }
        w0Var.zzg.add(l0Var);
    }

    @Override // com.google.android.gms.internal.measurement.j2
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return j2.o(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", v0.a, "zzg", l0.class});
        }
        if (i2 == 3) {
            return new w0();
        }
        a0 a0Var = null;
        if (i2 == 4) {
            return new u0(a0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}
