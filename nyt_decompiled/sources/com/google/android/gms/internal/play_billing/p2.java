package com.google.android.gms.internal.play_billing;

import defpackage.ycc;

/* loaded from: classes3.dex */
public final class p2 extends z implements ycc {
    private static final p2 zzb;
    private int zzd;
    private int zze;

    static {
        p2 p2Var = new p2();
        zzb = p2Var;
        z.m(p2.class, p2Var);
    }

    private p2() {
    }

    public static p2 u() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.z
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return z.j(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", o2.a});
        }
        if (i2 == 3) {
            return new p2();
        }
        m2 m2Var = null;
        if (i2 == 4) {
            return new n2(m2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
