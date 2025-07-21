package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.mw9;

/* loaded from: classes3.dex */
public final class y7 extends c0 implements by9 {
    private static final y7 zzb;
    private int zze;
    private mw9 zzf = c0.o();

    static {
        y7 y7Var = new y7();
        zzb = y7Var;
        c0.h(y7.class, y7Var);
    }

    private y7() {
    }

    public static v7 s() {
        return (v7) zzb.j();
    }

    static /* synthetic */ void v(y7 y7Var, x7 x7Var) {
        x7Var.getClass();
        mw9 mw9Var = y7Var.zzf;
        if (!mw9Var.zzc()) {
            y7Var.zzf = c0.e(mw9Var);
        }
        y7Var.zzf.add(x7Var);
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", x7.class});
        }
        if (i2 == 3) {
            return new y7();
        }
        u7 u7Var = null;
        if (i2 == 4) {
            return new v7(u7Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
