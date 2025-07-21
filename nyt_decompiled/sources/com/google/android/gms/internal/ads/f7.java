package com.google.android.gms.internal.ads;

import defpackage.x1f;

/* loaded from: classes3.dex */
public final class f7 extends yh implements x1f {
    private static final f7 zzb;
    private int zzd;
    private int zzf;
    private String zze = "";
    private String zzg = "";

    static {
        f7 f7Var = new f7();
        zzb = f7Var;
        yh.D(f7.class, f7Var);
    }

    private f7() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new f7();
        }
        d7 d7Var = null;
        if (i2 == 4) {
            return new e7(d7Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
