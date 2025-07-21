package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.tzf;

/* loaded from: classes3.dex */
public final class h6 extends c0 implements by9 {
    private static final h6 zzb;
    private int zze;
    private int zzf;
    private zzaby zzg = zzaby.a;

    static {
        h6 h6Var = new h6();
        zzb = h6Var;
        c0.h(h6.class, h6Var);
    }

    private h6() {
    }

    public static g6 s() {
        return (g6) zzb.j();
    }

    public static h6 u() {
        return zzb;
    }

    public final int C() {
        int b = tzf.b(this.zzf);
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
            return c0.g(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new h6();
        }
        f6 f6Var = null;
        if (i2 == 4) {
            return new g6(f6Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzaby v() {
        return this.zzg;
    }

    public final int x() {
        int i = this.zze;
        int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 7 : 6 : 5 : 4 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
