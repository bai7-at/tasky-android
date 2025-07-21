package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class c5 extends c0 implements by9 {
    private static final c5 zzb;
    private int zze;
    private int zzf;

    static {
        c5 c5Var = new c5();
        zzb = c5Var;
        c0.h(c5.class, c5Var);
    }

    private c5() {
    }

    public static b5 t() {
        return (b5) zzb.j();
    }

    public static c5 v(zzaby zzabyVar, ev9 ev9Var) {
        return (c5) c0.l(zzb, zzabyVar, ev9Var);
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
        }
        if (i2 == 3) {
            return new c5();
        }
        a5 a5Var = null;
        if (i2 == 4) {
            return new b5(a5Var);
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
