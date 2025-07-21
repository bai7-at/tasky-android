package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class e6 extends c0 implements by9 {
    private static final e6 zzb;
    private int zze;
    private x5 zzf;
    private zzaby zzg;
    private zzaby zzh;

    static {
        e6 e6Var = new e6();
        zzb = e6Var;
        c0.h(e6.class, e6Var);
    }

    private e6() {
        zzaby zzabyVar = zzaby.a;
        this.zzg = zzabyVar;
        this.zzh = zzabyVar;
    }

    static /* synthetic */ void G(e6 e6Var, x5 x5Var) {
        x5Var.getClass();
        e6Var.zzf = x5Var;
    }

    public static d6 u() {
        return (d6) zzb.j();
    }

    public static e6 w() {
        return zzb;
    }

    public static e6 x(zzaby zzabyVar, ev9 ev9Var) {
        return (e6) c0.l(zzb, zzabyVar, ev9Var);
    }

    public final zzaby C() {
        return this.zzg;
    }

    public final zzaby E() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new e6();
        }
        c6 c6Var = null;
        if (i2 == 4) {
            return new d6(c6Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int s() {
        return this.zze;
    }

    public final x5 t() {
        x5 x5Var = this.zzf;
        return x5Var == null ? x5.v() : x5Var;
    }
}
