package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class r8 extends c0 implements by9 {
    private static final r8 zzb;
    private int zze;
    private zzaby zzf = zzaby.a;

    static {
        r8 r8Var = new r8();
        zzb = r8Var;
        c0.h(r8.class, r8Var);
    }

    private r8() {
    }

    public static p8 t() {
        return (p8) zzb.j();
    }

    public static r8 v(zzaby zzabyVar, ev9 ev9Var) {
        return (r8) c0.l(zzb, zzabyVar, ev9Var);
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
            return new r8();
        }
        o8 o8Var = null;
        if (i2 == 4) {
            return new p8(o8Var);
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
