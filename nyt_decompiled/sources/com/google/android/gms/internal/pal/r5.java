package com.google.android.gms.internal.pal;

import defpackage.by9;

/* loaded from: classes3.dex */
public final class r5 extends c0 implements by9 {
    private static final r5 zzb;
    private k7 zze;

    static {
        r5 r5Var = new r5();
        zzb = r5Var;
        c0.h(r5.class, r5Var);
    }

    private r5() {
    }

    public static q5 s() {
        return (q5) zzb.j();
    }

    public static r5 u() {
        return zzb;
    }

    static /* synthetic */ void w(r5 r5Var, k7 k7Var) {
        k7Var.getClass();
        r5Var.zze = k7Var;
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new r5();
        }
        p5 p5Var = null;
        if (i2 == 4) {
            return new q5(p5Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final k7 v() {
        k7 k7Var = this.zze;
        return k7Var == null ? k7.u() : k7Var;
    }
}
