package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class t3 extends c0 implements by9 {
    private static final t3 zzb;
    private int zze;
    private a4 zzf;
    private k6 zzg;

    static {
        t3 t3Var = new t3();
        zzb = t3Var;
        c0.h(t3.class, t3Var);
    }

    private t3() {
    }

    static /* synthetic */ void E(t3 t3Var, a4 a4Var) {
        a4Var.getClass();
        t3Var.zzf = a4Var;
    }

    static /* synthetic */ void F(t3 t3Var, k6 k6Var) {
        k6Var.getClass();
        t3Var.zzg = k6Var;
    }

    public static s3 t() {
        return (s3) zzb.j();
    }

    public static t3 v(zzaby zzabyVar, ev9 ev9Var) {
        return (t3) c0.l(zzb, zzabyVar, ev9Var);
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new t3();
        }
        r3 r3Var = null;
        if (i2 == 4) {
            return new s3(r3Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int s() {
        return this.zze;
    }

    public final a4 w() {
        a4 a4Var = this.zzf;
        return a4Var == null ? a4.v() : a4Var;
    }

    public final k6 x() {
        k6 k6Var = this.zzg;
        return k6Var == null ? k6.v() : k6Var;
    }
}
