package com.google.android.gms.internal.pal;

import defpackage.by9;

/* loaded from: classes3.dex */
public final class x5 extends c0 implements by9 {
    private static final x5 zzb;
    private h6 zze;
    private r5 zzf;
    private int zzg;

    static {
        x5 x5Var = new x5();
        zzb = x5Var;
        c0.h(x5.class, x5Var);
    }

    private x5() {
    }

    static /* synthetic */ void C(x5 x5Var, r5 r5Var) {
        r5Var.getClass();
        x5Var.zzf = r5Var;
    }

    public static w5 t() {
        return (w5) zzb.j();
    }

    public static x5 v() {
        return zzb;
    }

    static /* synthetic */ void x(x5 x5Var, h6 h6Var) {
        h6Var.getClass();
        x5Var.zze = h6Var;
    }

    public final int E() {
        int i = this.zzg;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new x5();
        }
        v5 v5Var = null;
        if (i2 == 4) {
            return new w5(v5Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final r5 s() {
        r5 r5Var = this.zzf;
        return r5Var == null ? r5.u() : r5Var;
    }

    public final h6 w() {
        h6 h6Var = this.zze;
        return h6Var == null ? h6.u() : h6Var;
    }
}
