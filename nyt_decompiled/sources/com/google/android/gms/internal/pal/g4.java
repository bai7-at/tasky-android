package com.google.android.gms.internal.pal;

import defpackage.by9;

/* loaded from: classes3.dex */
public final class g4 extends c0 implements by9 {
    private static final g4 zzb;
    private int zze;

    static {
        g4 g4Var = new g4();
        zzb = g4Var;
        c0.h(g4.class, g4Var);
    }

    private g4() {
    }

    public static f4 t() {
        return (f4) zzb.j();
    }

    public static g4 v() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        if (i2 == 3) {
            return new g4();
        }
        e4 e4Var = null;
        if (i2 == 4) {
            return new f4(e4Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int s() {
        return this.zze;
    }
}
