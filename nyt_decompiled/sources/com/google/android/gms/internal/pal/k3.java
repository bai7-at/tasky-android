package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class k3 extends c0 implements by9 {
    private static final k3 zzb;
    private int zze;
    private zzaby zzf = zzaby.a;
    private q3 zzg;

    static {
        k3 k3Var = new k3();
        zzb = k3Var;
        c0.h(k3.class, k3Var);
    }

    private k3() {
    }

    static /* synthetic */ void F(k3 k3Var, q3 q3Var) {
        q3Var.getClass();
        k3Var.zzg = q3Var;
    }

    public static j3 t() {
        return (j3) zzb.j();
    }

    public static k3 v(zzaby zzabyVar, ev9 ev9Var) {
        return (k3) c0.l(zzb, zzabyVar, ev9Var);
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new k3();
        }
        i3 i3Var = null;
        if (i2 == 4) {
            return new j3(i3Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int s() {
        return this.zze;
    }

    public final q3 w() {
        q3 q3Var = this.zzg;
        return q3Var == null ? q3.v() : q3Var;
    }

    public final zzaby x() {
        return this.zzf;
    }
}
