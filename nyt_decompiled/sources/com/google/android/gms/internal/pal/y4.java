package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class y4 extends c0 implements by9 {
    private static final y4 zzb;
    private int zze;
    private zzaby zzf = zzaby.a;

    static {
        y4 y4Var = new y4();
        zzb = y4Var;
        c0.h(y4.class, y4Var);
    }

    private y4() {
    }

    public static x4 t() {
        return (x4) zzb.j();
    }

    public static y4 v(zzaby zzabyVar, ev9 ev9Var) {
        return (y4) c0.l(zzb, zzabyVar, ev9Var);
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new y4();
        }
        w4 w4Var = null;
        if (i2 == 4) {
            return new x4(w4Var);
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
