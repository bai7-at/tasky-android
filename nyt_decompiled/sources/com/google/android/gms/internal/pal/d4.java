package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class d4 extends c0 implements by9 {
    private static final d4 zzb;
    private g4 zze;
    private int zzf;

    static {
        d4 d4Var = new d4();
        zzb = d4Var;
        c0.h(d4.class, d4Var);
    }

    private d4() {
    }

    static /* synthetic */ void C(d4 d4Var, g4 g4Var) {
        g4Var.getClass();
        d4Var.zze = g4Var;
    }

    public static c4 t() {
        return (c4) zzb.j();
    }

    public static d4 v() {
        return zzb;
    }

    public static d4 w(zzaby zzabyVar, ev9 ev9Var) {
        return (d4) c0.l(zzb, zzabyVar, ev9Var);
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new d4();
        }
        b4 b4Var = null;
        if (i2 == 4) {
            return new c4(b4Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int s() {
        return this.zzf;
    }

    public final g4 x() {
        g4 g4Var = this.zze;
        return g4Var == null ? g4.v() : g4Var;
    }
}
