package com.google.android.gms.internal.pal;

import defpackage.by9;

/* loaded from: classes3.dex */
public final class h2 extends c0 implements by9 {
    private static final h2 zzb;
    private int zze;
    private String zzf = "";

    static {
        h2 h2Var = new h2();
        zzb = h2Var;
        c0.h(h2.class, h2Var);
    }

    private h2() {
    }

    public static g2 s() {
        return (g2) zzb.j();
    }

    static /* synthetic */ void u(h2 h2Var, String str) {
        str.getClass();
        h2Var.zze |= 1;
        h2Var.zzf = str;
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i2 == 3) {
            return new h2();
        }
        g3 g3Var = null;
        if (i2 == 4) {
            return new g2(g3Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
