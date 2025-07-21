package com.google.android.gms.internal.measurement;

import defpackage.eef;

/* loaded from: classes3.dex */
public final class f0 extends j2 implements eef {
    private static final f0 zza;
    private int zze;
    private int zzf;
    private y0 zzg;
    private y0 zzh;
    private boolean zzi;

    static {
        f0 f0Var = new f0();
        zza = f0Var;
        j2.p(f0.class, f0Var);
    }

    private f0() {
    }

    public static e0 s() {
        return (e0) zza.f();
    }

    static /* synthetic */ void w(f0 f0Var, int i) {
        f0Var.zze |= 1;
        f0Var.zzf = i;
    }

    static /* synthetic */ void x(f0 f0Var, y0 y0Var) {
        y0Var.getClass();
        f0Var.zzg = y0Var;
        f0Var.zze |= 2;
    }

    static /* synthetic */ void y(f0 f0Var, y0 y0Var) {
        f0Var.zzh = y0Var;
        f0Var.zze |= 4;
    }

    static /* synthetic */ void z(f0 f0Var, boolean z) {
        f0Var.zze |= 8;
        f0Var.zzi = z;
    }

    public final boolean A() {
        return this.zzi;
    }

    public final boolean B() {
        return (this.zze & 1) != 0;
    }

    public final boolean C() {
        return (this.zze & 8) != 0;
    }

    public final boolean D() {
        return (this.zze & 4) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.j2
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return j2.o(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new f0();
        }
        a0 a0Var = null;
        if (i2 == 4) {
            return new e0(a0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int r() {
        return this.zzf;
    }

    public final y0 u() {
        y0 y0Var = this.zzg;
        return y0Var == null ? y0.y() : y0Var;
    }

    public final y0 v() {
        y0 y0Var = this.zzh;
        return y0Var == null ? y0.y() : y0Var;
    }
}
