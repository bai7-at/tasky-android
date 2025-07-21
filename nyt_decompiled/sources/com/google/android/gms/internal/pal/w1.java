package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.kw9;

/* loaded from: classes3.dex */
public final class w1 extends c0 implements by9 {
    private static final w1 zzb;
    private int zze;
    private long zzf;
    private int zzg;
    private boolean zzh;
    private kw9 zzi = c0.n();
    private long zzj;

    static {
        w1 w1Var = new w1();
        zzb = w1Var;
        c0.h(w1.class, w1Var);
    }

    private w1() {
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new w1();
        }
        g3 g3Var = null;
        if (i2 == 4) {
            return new u1(g3Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
