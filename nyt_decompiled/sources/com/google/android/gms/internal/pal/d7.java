package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class d7 extends c0 implements by9 {
    private static final d7 zzb;
    private int zze;
    private x6 zzf;
    private zzaby zzg = zzaby.a;

    static {
        d7 d7Var = new d7();
        zzb = d7Var;
        c0.h(d7.class, d7Var);
    }

    private d7() {
    }

    static /* synthetic */ void F(d7 d7Var, x6 x6Var) {
        x6Var.getClass();
        d7Var.zzf = x6Var;
    }

    public static c7 u() {
        return (c7) zzb.j();
    }

    public static d7 w() {
        return zzb;
    }

    public static d7 x(zzaby zzabyVar, ev9 ev9Var) {
        return (d7) c0.l(zzb, zzabyVar, ev9Var);
    }

    public final zzaby C() {
        return this.zzg;
    }

    public final boolean H() {
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
            return new d7();
        }
        b7 b7Var = null;
        if (i2 == 4) {
            return new c7(b7Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int s() {
        return this.zze;
    }

    public final x6 t() {
        x6 x6Var = this.zzf;
        return x6Var == null ? x6.u() : x6Var;
    }
}
