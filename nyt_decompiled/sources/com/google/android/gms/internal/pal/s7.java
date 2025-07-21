package com.google.android.gms.internal.pal;

import defpackage.b3g;
import defpackage.by9;

/* loaded from: classes3.dex */
public final class s7 extends c0 implements by9 {
    private static final s7 zzb;
    private h7 zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        s7 s7Var = new s7();
        zzb = s7Var;
        c0.h(s7.class, s7Var);
    }

    private s7() {
    }

    public static q7 u() {
        return (q7) zzb.j();
    }

    static /* synthetic */ void w(s7 s7Var, h7 h7Var) {
        h7Var.getClass();
        s7Var.zze = h7Var;
    }

    public final boolean C() {
        return this.zze != null;
    }

    public final int E() {
        int i = this.zzf;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public final int F() {
        int b = b3g.b(this.zzh);
        if (b == 0) {
            return 1;
        }
        return b;
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new s7();
        }
        o7 o7Var = null;
        if (i2 == 4) {
            return new q7(o7Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int s() {
        return this.zzg;
    }

    public final h7 t() {
        h7 h7Var = this.zze;
        return h7Var == null ? h7.v() : h7Var;
    }
}
