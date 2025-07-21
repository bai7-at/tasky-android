package com.google.android.gms.internal.ads;

import defpackage.x1f;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes3.dex */
public final class b5 extends yh implements x1f {
    private static final b5 zzb;
    private int zzd;
    private s4 zze;
    private int zzf = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private z4 zzg;
    private q4 zzh;

    static {
        b5 b5Var = new b5();
        zzb = b5Var;
        yh.D(b5.class, b5Var);
    }

    private b5() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", l3.a, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new b5();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new a5(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
