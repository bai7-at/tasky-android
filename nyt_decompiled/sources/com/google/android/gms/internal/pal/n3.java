package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class n3 extends c0 implements by9 {
    private static final n3 zzb;
    private int zze;
    private q3 zzf;

    static {
        n3 n3Var = new n3();
        zzb = n3Var;
        c0.h(n3.class, n3Var);
    }

    private n3() {
    }

    static /* synthetic */ void C(n3 n3Var, q3 q3Var) {
        q3Var.getClass();
        n3Var.zzf = q3Var;
    }

    public static m3 t() {
        return (m3) zzb.j();
    }

    public static n3 v(zzaby zzabyVar, ev9 ev9Var) {
        return (n3) c0.l(zzb, zzabyVar, ev9Var);
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
            return new n3();
        }
        l3 l3Var = null;
        if (i2 == 4) {
            return new m3(l3Var);
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
        q3 q3Var = this.zzf;
        return q3Var == null ? q3.v() : q3Var;
    }
}
