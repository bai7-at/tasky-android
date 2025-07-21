package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class s2 extends yh implements x1f {
    private static final s2 zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        s2 s2Var = new s2();
        zzb = s2Var;
        yh.D(s2.class, s2Var);
    }

    private s2() {
    }

    public static r2 L() {
        return (r2) zzb.k();
    }

    public static s2 N() {
        return zzb;
    }

    static /* synthetic */ void O(s2 s2Var, boolean z) {
        s2Var.zzd |= 1;
        s2Var.zze = z;
    }

    static /* synthetic */ void P(s2 s2Var, int i) {
        s2Var.zzd |= 2;
        s2Var.zzf = i;
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new s2();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new r2(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
