package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class f5 extends c0 implements by9 {
    private static final f5 zzb;
    private int zze;
    private zzaby zzf = zzaby.a;

    static {
        f5 f5Var = new f5();
        zzb = f5Var;
        c0.h(f5.class, f5Var);
    }

    private f5() {
    }

    public static e5 t() {
        return (e5) zzb.j();
    }

    public static f5 v(zzaby zzabyVar, ev9 ev9Var) {
        return (f5) c0.l(zzb, zzabyVar, ev9Var);
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
            return new f5();
        }
        d5 d5Var = null;
        if (i2 == 4) {
            return new e5(d5Var);
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
