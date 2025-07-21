package com.google.android.gms.internal.pal;

import defpackage.by9;

/* loaded from: classes3.dex */
public final class f2 extends c0 implements by9 {
    private static final f2 zzb;
    private int zze;
    private long zzf;
    private String zzg = "";
    private zzaby zzh = zzaby.a;

    static {
        f2 f2Var = new f2();
        zzb = f2Var;
        c0.h(f2.class, f2Var);
    }

    private f2() {
    }

    public static f2 u() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new f2();
        }
        g3 g3Var = null;
        if (i2 == 4) {
            return new e2(g3Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final long s() {
        return this.zzf;
    }

    public final boolean v() {
        return (this.zze & 1) != 0;
    }
}
