package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ev9;

/* loaded from: classes3.dex */
public final class m4 extends c0 implements by9 {
    private static final m4 zzb;
    private p4 zze;
    private int zzf;

    static {
        m4 m4Var = new m4();
        zzb = m4Var;
        c0.h(m4.class, m4Var);
    }

    private m4() {
    }

    public static l4 t() {
        return (l4) zzb.j();
    }

    public static m4 v(zzaby zzabyVar, ev9 ev9Var) {
        return (m4) c0.l(zzb, zzabyVar, ev9Var);
    }

    static /* synthetic */ void x(m4 m4Var, p4 p4Var) {
        p4Var.getClass();
        m4Var.zze = p4Var;
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
            return new m4();
        }
        k4 k4Var = null;
        if (i2 == 4) {
            return new l4(k4Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int s() {
        return this.zzf;
    }

    public final p4 w() {
        p4 p4Var = this.zze;
        return p4Var == null ? p4.v() : p4Var;
    }
}
