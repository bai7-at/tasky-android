package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class v4 extends c0 implements by9 {
    private static final v4 zzb;
    private int zze;
    private int zzf;

    static {
        v4 v4Var = new v4();
        zzb = v4Var;
        c0.h(v4.class, v4Var);
    }

    private v4() {
    }

    public static u4 t() {
        return (u4) zzb.j();
    }

    public static v4 v(zzaby zzabyVar, ev9 ev9Var) {
        return (v4) c0.l(zzb, zzabyVar, ev9Var);
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new v4();
        }
        t4 t4Var = null;
        if (i2 == 4) {
            return new u4(t4Var);
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
