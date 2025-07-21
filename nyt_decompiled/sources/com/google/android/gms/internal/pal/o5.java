package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class o5 extends c0 implements by9 {
    private static final o5 zzb;

    static {
        o5 o5Var = new o5();
        zzb = o5Var;
        c0.h(o5.class, o5Var);
    }

    private o5() {
    }

    public static o5 t() {
        return zzb;
    }

    public static o5 u(zzaby zzabyVar, ev9 ev9Var) {
        return (o5) c0.l(zzb, zzabyVar, ev9Var);
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        m5 m5Var = null;
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new o5();
        }
        if (i2 == 4) {
            return new n5(m5Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
