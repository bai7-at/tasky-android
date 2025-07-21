package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class j4 extends c0 implements by9 {
    private static final j4 zzb;
    private int zze;
    private p4 zzf;
    private zzaby zzg = zzaby.a;

    static {
        j4 j4Var = new j4();
        zzb = j4Var;
        c0.h(j4.class, j4Var);
    }

    private j4() {
    }

    static /* synthetic */ void E(j4 j4Var, p4 p4Var) {
        p4Var.getClass();
        j4Var.zzf = p4Var;
    }

    public static i4 t() {
        return (i4) zzb.j();
    }

    public static j4 v(zzaby zzabyVar, ev9 ev9Var) {
        return (j4) c0.l(zzb, zzabyVar, ev9Var);
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new j4();
        }
        h4 h4Var = null;
        if (i2 == 4) {
            return new i4(h4Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int s() {
        return this.zze;
    }

    public final p4 w() {
        p4 p4Var = this.zzf;
        return p4Var == null ? p4.v() : p4Var;
    }

    public final zzaby x() {
        return this.zzg;
    }
}
