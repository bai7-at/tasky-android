package com.google.android.gms.internal.pal;

import defpackage.by9;
import defpackage.ohf;

/* loaded from: classes3.dex */
public final class c3 extends c0 implements by9 {
    private static final c3 zzb;
    private int zze;
    private int zzf = 2;

    static {
        c3 c3Var = new c3();
        zzb = c3Var;
        c0.h(c3.class, c3Var);
    }

    private c3() {
    }

    public static c3 t() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zze", "zzf", d3.a});
        }
        if (i2 == 3) {
            return new c3();
        }
        p2 p2Var = null;
        if (i2 == 4) {
            return new y2(p2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final int u() {
        int a = ohf.a(this.zzf);
        if (a == 0) {
            return 3;
        }
        return a;
    }
}
