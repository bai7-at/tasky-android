package com.google.android.gms.internal.pal;

import defpackage.by9;

/* loaded from: classes3.dex */
public final class v8 extends c0 implements by9 {
    private static final v8 zzb;
    private int zze;
    private int zzf;
    private long zzg = -1;

    static {
        v8 v8Var = new v8();
        zzb = v8Var;
        c0.h(v8.class, v8Var);
    }

    private v8() {
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", t6.a, "zzg"});
        }
        if (i2 == 3) {
            return new v8();
        }
        g3 g3Var = null;
        if (i2 == 4) {
            return new q8(g3Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
