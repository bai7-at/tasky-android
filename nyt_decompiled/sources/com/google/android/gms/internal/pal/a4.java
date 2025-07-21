package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class a4 extends c0 implements by9 {
    private static final a4 zzb;
    private int zze;
    private g4 zzf;
    private zzaby zzg = zzaby.a;

    static {
        a4 a4Var = new a4();
        zzb = a4Var;
        c0.h(a4.class, a4Var);
    }

    private a4() {
    }

    static /* synthetic */ void F(a4 a4Var, g4 g4Var) {
        g4Var.getClass();
        a4Var.zzf = g4Var;
    }

    public static z3 t() {
        return (z3) zzb.j();
    }

    public static a4 v() {
        return zzb;
    }

    public static a4 w(zzaby zzabyVar, ev9 ev9Var) {
        return (a4) c0.l(zzb, zzabyVar, ev9Var);
    }

    public final zzaby C() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new a4();
        }
        x3 x3Var = null;
        if (i2 == 4) {
            return new z3(x3Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int s() {
        return this.zze;
    }

    public final g4 x() {
        g4 g4Var = this.zzf;
        return g4Var == null ? g4.v() : g4Var;
    }
}
