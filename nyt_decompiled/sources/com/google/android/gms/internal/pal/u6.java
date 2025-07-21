package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class u6 extends c0 implements by9 {
    private static final u6 zzb;
    private x6 zze;

    static {
        u6 u6Var = new u6();
        zzb = u6Var;
        c0.h(u6.class, u6Var);
    }

    private u6() {
    }

    public static s6 s() {
        return (s6) zzb.j();
    }

    public static u6 u(zzaby zzabyVar, ev9 ev9Var) {
        return (u6) c0.l(zzb, zzabyVar, ev9Var);
    }

    static /* synthetic */ void w(u6 u6Var, x6 x6Var) {
        x6Var.getClass();
        u6Var.zze = x6Var;
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
            return new u6();
        }
        r6 r6Var = null;
        if (i2 == 4) {
            return new s6(r6Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final x6 v() {
        x6 x6Var = this.zze;
        return x6Var == null ? x6.u() : x6Var;
    }
}
