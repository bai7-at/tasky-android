package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class u2 extends yh implements x1f {
    private static final u2 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        u2 u2Var = new u2();
        zzb = u2Var;
        yh.D(u2.class, u2Var);
    }

    private u2() {
    }

    public static t2 L() {
        return (t2) zzb.k();
    }

    static /* synthetic */ void N(u2 u2Var, boolean z) {
        u2Var.zzd |= 1;
        u2Var.zze = z;
    }

    static /* synthetic */ void O(u2 u2Var, boolean z) {
        u2Var.zzd |= 2;
        u2Var.zzf = z;
    }

    static /* synthetic */ void P(u2 u2Var, int i) {
        u2Var.zzd |= 4;
        u2Var.zzg = i;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new u2();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new t2(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
