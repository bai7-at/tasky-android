package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class b6 extends c0 implements by9 {
    private static final b6 zzb;
    private int zze;
    private e6 zzf;
    private zzaby zzg = zzaby.a;

    static {
        b6 b6Var = new b6();
        zzb = b6Var;
        c0.h(b6.class, b6Var);
    }

    private b6() {
    }

    static /* synthetic */ void E(b6 b6Var, e6 e6Var) {
        e6Var.getClass();
        b6Var.zzf = e6Var;
    }

    public static a6 t() {
        return (a6) zzb.j();
    }

    public static b6 v(zzaby zzabyVar, ev9 ev9Var) {
        return (b6) c0.l(zzb, zzabyVar, ev9Var);
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
            return new b6();
        }
        z5 z5Var = null;
        if (i2 == 4) {
            return new a6(z5Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int s() {
        return this.zze;
    }

    public final e6 w() {
        e6 e6Var = this.zzf;
        return e6Var == null ? e6.w() : e6Var;
    }

    public final zzaby x() {
        return this.zzg;
    }
}
