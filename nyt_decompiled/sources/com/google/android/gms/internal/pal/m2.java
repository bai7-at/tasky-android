package com.google.android.gms.internal.pal;

import defpackage.by9;

/* loaded from: classes3.dex */
public final class m2 extends c0 implements by9 {
    private static final m2 zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        m2 m2Var = new m2();
        zzb = m2Var;
        c0.h(m2.class, m2Var);
    }

    private m2() {
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new m2();
        }
        a aVar = null;
        if (i2 == 4) {
            return new l2(aVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
