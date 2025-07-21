package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class k6 extends c0 implements by9 {
    private static final k6 zzb;
    private int zze;
    private q6 zzf;
    private zzaby zzg = zzaby.a;

    static {
        k6 k6Var = new k6();
        zzb = k6Var;
        c0.h(k6.class, k6Var);
    }

    private k6() {
    }

    static /* synthetic */ void F(k6 k6Var, q6 q6Var) {
        q6Var.getClass();
        k6Var.zzf = q6Var;
    }

    public static j6 t() {
        return (j6) zzb.j();
    }

    public static k6 v() {
        return zzb;
    }

    public static k6 w(zzaby zzabyVar, ev9 ev9Var) {
        return (k6) c0.l(zzb, zzabyVar, ev9Var);
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
            return new k6();
        }
        i6 i6Var = null;
        if (i2 == 4) {
            return new j6(i6Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int s() {
        return this.zze;
    }

    public final q6 x() {
        q6 q6Var = this.zzf;
        return q6Var == null ? q6.v() : q6Var;
    }
}
