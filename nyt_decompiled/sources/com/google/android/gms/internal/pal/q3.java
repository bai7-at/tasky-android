package com.google.android.gms.internal.pal;

import defpackage.by9;

/* loaded from: classes3.dex */
public final class q3 extends c0 implements by9 {
    private static final q3 zzb;
    private int zze;

    static {
        q3 q3Var = new q3();
        zzb = q3Var;
        c0.h(q3.class, q3Var);
    }

    private q3() {
    }

    public static p3 t() {
        return (p3) zzb.j();
    }

    public static q3 v() {
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
            return new q3();
        }
        o3 o3Var = null;
        if (i2 == 4) {
            return new p3(o3Var);
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
