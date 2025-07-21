package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class b8 extends c0 implements by9 {
    private static final b8 zzb;
    private int zze;
    private e8 zzf;

    static {
        b8 b8Var = new b8();
        zzb = b8Var;
        c0.h(b8.class, b8Var);
    }

    private b8() {
    }

    static /* synthetic */ void C(b8 b8Var, e8 e8Var) {
        e8Var.getClass();
        b8Var.zzf = e8Var;
    }

    public static a8 t() {
        return (a8) zzb.j();
    }

    public static b8 v(zzaby zzabyVar, ev9 ev9Var) {
        return (b8) c0.l(zzb, zzabyVar, ev9Var);
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new b8();
        }
        z7 z7Var = null;
        if (i2 == 4) {
            return new a8(z7Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int s() {
        return this.zze;
    }

    public final e8 w() {
        e8 e8Var = this.zzf;
        return e8Var == null ? e8.t() : e8Var;
    }
}
