package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class k3 extends yh implements x1f {
    private static final k3 zzb;
    private int zzd;
    private int zze;
    private s4 zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        k3 k3Var = new k3();
        zzb = k3Var;
        yh.D(k3.class, k3Var);
    }

    private k3() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzd", "zze", j3.a, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new k3();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new i3(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
