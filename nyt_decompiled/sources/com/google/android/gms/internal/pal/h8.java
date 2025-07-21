package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class h8 extends c0 implements by9 {
    private static final h8 zzb;
    private int zze;
    private k8 zzf;

    static {
        h8 h8Var = new h8();
        zzb = h8Var;
        c0.h(h8.class, h8Var);
    }

    private h8() {
    }

    static /* synthetic */ void C(h8 h8Var, k8 k8Var) {
        k8Var.getClass();
        h8Var.zzf = k8Var;
    }

    public static g8 t() {
        return (g8) zzb.j();
    }

    public static h8 v(zzaby zzabyVar, ev9 ev9Var) {
        return (h8) c0.l(zzb, zzabyVar, ev9Var);
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
            return new h8();
        }
        f8 f8Var = null;
        if (i2 == 4) {
            return new g8(f8Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int s() {
        return this.zze;
    }

    public final k8 w() {
        k8 k8Var = this.zzf;
        return k8Var == null ? k8.t() : k8Var;
    }
}
