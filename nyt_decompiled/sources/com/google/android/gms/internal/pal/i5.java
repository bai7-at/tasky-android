package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class i5 extends c0 implements by9 {
    private static final i5 zzb;
    private int zze;
    private int zzf;

    static {
        i5 i5Var = new i5();
        zzb = i5Var;
        c0.h(i5.class, i5Var);
    }

    private i5() {
    }

    public static h5 t() {
        return (h5) zzb.j();
    }

    public static i5 v(zzaby zzabyVar, ev9 ev9Var) {
        return (i5) c0.l(zzb, zzabyVar, ev9Var);
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new i5();
        }
        g5 g5Var = null;
        if (i2 == 4) {
            return new h5(g5Var);
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
