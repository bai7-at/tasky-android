package com.google.android.gms.internal.measurement;

import defpackage.eef;
import defpackage.tbf;
import java.util.List;

/* loaded from: classes3.dex */
public final class r0 extends j2 implements eef {
    private static final r0 zza;
    private tbf zze = j2.l();

    static {
        r0 r0Var = new r0();
        zza = r0Var;
        j2.p(r0.class, r0Var);
    }

    private r0() {
    }

    public static q0 r() {
        return (q0) zza.f();
    }

    static /* synthetic */ void v(r0 r0Var, t0 t0Var) {
        t0Var.getClass();
        tbf tbfVar = r0Var.zze;
        if (!tbfVar.zzc()) {
            r0Var.zze = j2.m(tbfVar);
        }
        r0Var.zze.add(t0Var);
    }

    @Override // com.google.android.gms.internal.measurement.j2
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return j2.o(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", t0.class});
        }
        if (i2 == 3) {
            return new r0();
        }
        a0 a0Var = null;
        if (i2 == 4) {
            return new q0(a0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final t0 t(int i) {
        return (t0) this.zze.get(0);
    }

    public final List u() {
        return this.zze;
    }
}
