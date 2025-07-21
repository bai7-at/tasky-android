package com.google.android.gms.internal.measurement;

import defpackage.eef;
import defpackage.tbf;
import java.util.List;

/* loaded from: classes3.dex */
public final class h1 extends j2 implements eef {
    private static final h1 zza;
    private int zze;
    private String zzf = "";
    private tbf zzg = j2.l();

    static {
        h1 h1Var = new h1();
        zza = h1Var;
        j2.p(h1.class, h1Var);
    }

    private h1() {
    }

    @Override // com.google.android.gms.internal.measurement.j2
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return j2.o(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", m1.class});
        }
        if (i2 == 3) {
            return new h1();
        }
        d1 d1Var = null;
        if (i2 == 4) {
            return new g1(d1Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final String s() {
        return this.zzf;
    }

    public final List t() {
        return this.zzg;
    }
}
