package com.google.android.gms.internal.ads;

import defpackage.x1f;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes3.dex */
public final class l5 extends yh implements x1f {
    private static final l5 zzb;
    private int zzd;
    private int zze = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private z4 zzf;

    static {
        l5 l5Var = new l5();
        zzb = l5Var;
        yh.D(l5.class, l5Var);
    }

    private l5() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", l3.a, "zzf"});
        }
        if (i2 == 3) {
            return new l5();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new k5(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
