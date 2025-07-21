package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class n6 extends c0 implements by9 {
    private static final n6 zzb;
    private q6 zze;
    private int zzf;
    private int zzg;

    static {
        n6 n6Var = new n6();
        zzb = n6Var;
        c0.h(n6.class, n6Var);
    }

    private n6() {
    }

    static /* synthetic */ void C(n6 n6Var, q6 q6Var) {
        q6Var.getClass();
        n6Var.zze = q6Var;
    }

    public static m6 t() {
        return (m6) zzb.j();
    }

    public static n6 v() {
        return zzb;
    }

    public static n6 w(zzaby zzabyVar, ev9 ev9Var) {
        return (n6) c0.l(zzb, zzabyVar, ev9Var);
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new n6();
        }
        l6 l6Var = null;
        if (i2 == 4) {
            return new m6(l6Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int s() {
        return this.zzf;
    }

    public final q6 x() {
        q6 q6Var = this.zze;
        return q6Var == null ? q6.v() : q6Var;
    }
}
