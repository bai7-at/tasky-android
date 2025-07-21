package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class l5 extends c0 implements by9 {
    private static final l5 zzb;
    private int zze;
    private zzaby zzf = zzaby.a;

    static {
        l5 l5Var = new l5();
        zzb = l5Var;
        c0.h(l5.class, l5Var);
    }

    private l5() {
    }

    public static k5 t() {
        return (k5) zzb.j();
    }

    public static l5 v(zzaby zzabyVar, ev9 ev9Var) {
        return (l5) c0.l(zzb, zzabyVar, ev9Var);
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new l5();
        }
        j5 j5Var = null;
        if (i2 == 4) {
            return new k5(j5Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int s() {
        return this.zze;
    }

    public final zzaby w() {
        return this.zzf;
    }
}
