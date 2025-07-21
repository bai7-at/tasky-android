package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class w3 extends c0 implements by9 {
    private static final w3 zzb;
    private d4 zze;
    private n6 zzf;

    static {
        w3 w3Var = new w3();
        zzb = w3Var;
        c0.h(w3.class, w3Var);
    }

    private w3() {
    }

    static /* synthetic */ void C(w3 w3Var, n6 n6Var) {
        n6Var.getClass();
        w3Var.zzf = n6Var;
    }

    public static v3 s() {
        return (v3) zzb.j();
    }

    public static w3 u(zzaby zzabyVar, ev9 ev9Var) {
        return (w3) c0.l(zzb, zzabyVar, ev9Var);
    }

    static /* synthetic */ void x(w3 w3Var, d4 d4Var) {
        d4Var.getClass();
        w3Var.zze = d4Var;
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new w3();
        }
        u3 u3Var = null;
        if (i2 == 4) {
            return new v3(u3Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final d4 v() {
        d4 d4Var = this.zze;
        return d4Var == null ? d4.v() : d4Var;
    }

    public final n6 w() {
        n6 n6Var = this.zzf;
        return n6Var == null ? n6.v() : n6Var;
    }
}
