package com.google.android.gms.internal.measurement;

import defpackage.eef;
import defpackage.tbf;
import java.util.List;

/* loaded from: classes3.dex */
public final class j1 extends j2 implements eef {
    private static final j1 zza;
    private int zze;
    private tbf zzf = j2.l();
    private f1 zzg;

    static {
        j1 j1Var = new j1();
        zza = j1Var;
        j2.p(j1.class, j1Var);
    }

    private j1() {
    }

    @Override // com.google.android.gms.internal.measurement.j2
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return j2.o(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", m1.class, "zzg"});
        }
        if (i2 == 3) {
            return new j1();
        }
        d1 d1Var = null;
        if (i2 == 4) {
            return new i1(d1Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final f1 r() {
        f1 f1Var = this.zzg;
        return f1Var == null ? f1.t() : f1Var;
    }

    public final List t() {
        return this.zzf;
    }
}
