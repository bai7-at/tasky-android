package com.google.android.gms.internal.pal;

import defpackage.by9;

/* loaded from: classes3.dex */
public final class p4 extends c0 implements by9 {
    private static final p4 zzb;
    private int zze;

    static {
        p4 p4Var = new p4();
        zzb = p4Var;
        c0.h(p4.class, p4Var);
    }

    private p4() {
    }

    public static o4 t() {
        return (o4) zzb.j();
    }

    public static p4 v() {
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
            return new p4();
        }
        n4 n4Var = null;
        if (i2 == 4) {
            return new o4(n4Var);
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
