package com.google.android.gms.internal.pal;

import defpackage.by9;

/* loaded from: classes3.dex */
public final class x7 extends c0 implements by9 {
    private static final x7 zzb;
    private String zze = "";
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        x7 x7Var = new x7();
        zzb = x7Var;
        c0.h(x7.class, x7Var);
    }

    private x7() {
    }

    public static w7 s() {
        return (w7) zzb.j();
    }

    static /* synthetic */ void u(x7 x7Var, String str) {
        str.getClass();
        x7Var.zze = str;
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new x7();
        }
        u7 u7Var = null;
        if (i2 == 4) {
            return new w7(u7Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
