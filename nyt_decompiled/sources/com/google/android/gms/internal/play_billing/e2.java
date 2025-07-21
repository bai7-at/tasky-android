package com.google.android.gms.internal.play_billing;

import defpackage.ycc;

/* loaded from: classes3.dex */
public final class e2 extends z implements ycc {
    private static final e2 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        e2 e2Var = new e2();
        zzb = e2Var;
        z.m(e2.class, e2Var);
    }

    private e2() {
    }

    @Override // com.google.android.gms.internal.play_billing.z
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return z.j(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", b2.a, "zzf"});
        }
        if (i2 == 3) {
            return new e2();
        }
        c2 c2Var = null;
        if (i2 == 4) {
            return new d2(c2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
