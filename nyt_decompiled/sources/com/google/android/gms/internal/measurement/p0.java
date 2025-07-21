package com.google.android.gms.internal.measurement;

import defpackage.eef;

/* loaded from: classes3.dex */
public final class p0 extends j2 implements eef {
    private static final p0 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private d0 zzh;

    static {
        p0 p0Var = new p0();
        zza = p0Var;
        j2.p(p0.class, p0Var);
    }

    private p0() {
    }

    @Override // com.google.android.gms.internal.measurement.j2
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return j2.o(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new p0();
        }
        a0 a0Var = null;
        if (i2 == 4) {
            return new o0(a0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}
