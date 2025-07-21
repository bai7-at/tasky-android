package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class u5 extends c0 implements by9 {
    private static final u5 zzb;
    private x5 zze;

    static {
        u5 u5Var = new u5();
        zzb = u5Var;
        c0.h(u5.class, u5Var);
    }

    private u5() {
    }

    public static t5 s() {
        return (t5) zzb.j();
    }

    public static u5 u(zzaby zzabyVar, ev9 ev9Var) {
        return (u5) c0.l(zzb, zzabyVar, ev9Var);
    }

    static /* synthetic */ void w(u5 u5Var, x5 x5Var) {
        x5Var.getClass();
        u5Var.zze = x5Var;
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new u5();
        }
        s5 s5Var = null;
        if (i2 == 4) {
            return new t5(s5Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final x5 v() {
        x5 x5Var = this.zze;
        return x5Var == null ? x5.v() : x5Var;
    }
}
