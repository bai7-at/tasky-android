package com.google.android.gms.internal.measurement;

import defpackage.eef;

/* loaded from: classes3.dex */
public final class l0 extends j2 implements eef {
    private static final l0 zza;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        l0 l0Var = new l0();
        zza = l0Var;
        j2.p(l0.class, l0Var);
    }

    private l0() {
    }

    public static k0 r() {
        return (k0) zza.f();
    }

    static /* synthetic */ void t(l0 l0Var, String str) {
        str.getClass();
        l0Var.zze |= 1;
        l0Var.zzf = str;
    }

    static /* synthetic */ void u(l0 l0Var, long j) {
        l0Var.zze |= 2;
        l0Var.zzg = j;
    }

    @Override // com.google.android.gms.internal.measurement.j2
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return j2.o(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new l0();
        }
        a0 a0Var = null;
        if (i2 == 4) {
            return new k0(a0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}
