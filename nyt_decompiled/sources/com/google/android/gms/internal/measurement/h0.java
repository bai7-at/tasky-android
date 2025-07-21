package com.google.android.gms.internal.measurement;

import defpackage.eef;

/* loaded from: classes3.dex */
public final class h0 extends j2 implements eef {
    private static final h0 zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        h0 h0Var = new h0();
        zza = h0Var;
        j2.p(h0.class, h0Var);
    }

    private h0() {
    }

    public static g0 t() {
        return (g0) zza.f();
    }

    static /* synthetic */ void v(h0 h0Var, int i) {
        h0Var.zze |= 1;
        h0Var.zzf = i;
    }

    static /* synthetic */ void w(h0 h0Var, long j) {
        h0Var.zze |= 2;
        h0Var.zzg = j;
    }

    @Override // com.google.android.gms.internal.measurement.j2
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return j2.o(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new h0();
        }
        a0 a0Var = null;
        if (i2 == 4) {
            return new g0(a0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int r() {
        return this.zzf;
    }

    public final long s() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zze & 2) != 0;
    }

    public final boolean y() {
        return (this.zze & 1) != 0;
    }
}
