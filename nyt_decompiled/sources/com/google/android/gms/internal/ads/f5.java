package com.google.android.gms.internal.ads;

import defpackage.x1f;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes3.dex */
public final class f5 extends yh implements x1f {
    private static final f5 zzb;
    private int zzd;
    private int zze = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private z4 zzf;
    private q4 zzg;

    static {
        f5 f5Var = new f5();
        zzb = f5Var;
        yh.D(f5.class, f5Var);
    }

    private f5() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", l3.a, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new f5();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new e5(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
