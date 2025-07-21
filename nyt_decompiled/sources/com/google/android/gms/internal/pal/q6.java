package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.tzf;

/* loaded from: classes3.dex */
public final class q6 extends c0 implements by9 {
    private static final q6 zzb;
    private int zze;
    private int zzf;

    static {
        q6 q6Var = new q6();
        zzb = q6Var;
        c0.h(q6.class, q6Var);
    }

    private q6() {
    }

    public static p6 t() {
        return (p6) zzb.j();
    }

    public static q6 v() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new q6();
        }
        o6 o6Var = null;
        if (i2 == 4) {
            return new p6(o6Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int s() {
        return this.zzf;
    }

    public final int x() {
        int b = tzf.b(this.zze);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
