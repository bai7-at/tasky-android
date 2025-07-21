package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class a7 extends c0 implements by9 {
    private static final a7 zzb;
    private int zze;
    private d7 zzf;
    private zzaby zzg = zzaby.a;

    static {
        a7 a7Var = new a7();
        zzb = a7Var;
        c0.h(a7.class, a7Var);
    }

    private a7() {
    }

    static /* synthetic */ void E(a7 a7Var, d7 d7Var) {
        d7Var.getClass();
        a7Var.zzf = d7Var;
    }

    public static z6 t() {
        return (z6) zzb.j();
    }

    public static a7 v(zzaby zzabyVar, ev9 ev9Var) {
        return (a7) c0.l(zzb, zzabyVar, ev9Var);
    }

    public final boolean G() {
        return this.zzf != null;
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
            return new a7();
        }
        y6 y6Var = null;
        if (i2 == 4) {
            return new z6(y6Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int s() {
        return this.zze;
    }

    public final d7 w() {
        d7 d7Var = this.zzf;
        return d7Var == null ? d7.w() : d7Var;
    }

    public final zzaby x() {
        return this.zzg;
    }
}
