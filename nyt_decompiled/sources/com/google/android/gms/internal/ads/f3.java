package com.google.android.gms.internal.ads;

import defpackage.n1f;
import defpackage.x1f;

/* loaded from: classes3.dex */
public final class f3 extends yh implements x1f {
    private static final f3 zzb;
    private int zzd;
    private int zze;
    private q4 zzf;
    private q4 zzg;
    private q4 zzh;
    private n1f zzi = yh.x();
    private int zzj;

    static {
        f3 f3Var = new f3();
        zzb = f3Var;
        yh.D(f3.class, f3Var);
    }

    private f3() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", q4.class, "zzj"});
        }
        if (i2 == 3) {
            return new f3();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new e3(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
