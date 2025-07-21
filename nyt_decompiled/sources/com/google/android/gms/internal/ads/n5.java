package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class n5 extends yh implements x1f {
    private static final n5 zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        n5 n5Var = new n5();
        zzb = n5Var;
        yh.D(n5.class, n5Var);
    }

    private n5() {
    }

    public static m5 L() {
        return (m5) zzb.k();
    }

    static /* synthetic */ void N(n5 n5Var, boolean z) {
        n5Var.zzd |= 1;
        n5Var.zze = z;
    }

    static /* synthetic */ void O(n5 n5Var, int i) {
        n5Var.zzd |= 2;
        n5Var.zzf = i;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new n5();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new m5(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean P() {
        return this.zze;
    }
}
