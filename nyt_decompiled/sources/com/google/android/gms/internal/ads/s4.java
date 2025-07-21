package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class s4 extends yh implements x1f {
    private static final s4 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        s4 s4Var = new s4();
        zzb = s4Var;
        yh.D(s4.class, s4Var);
    }

    private s4() {
    }

    public static r4 L() {
        return (r4) zzb.k();
    }

    static /* synthetic */ void N(s4 s4Var, int i) {
        s4Var.zzd |= 1;
        s4Var.zze = i;
    }

    static /* synthetic */ void O(s4 s4Var, int i) {
        s4Var.zzd |= 2;
        s4Var.zzf = i;
    }

    static /* synthetic */ void P(s4 s4Var, int i) {
        s4Var.zzd |= 4;
        s4Var.zzg = i;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new s4();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new r4(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
