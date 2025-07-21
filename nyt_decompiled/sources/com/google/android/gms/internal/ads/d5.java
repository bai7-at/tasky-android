package com.google.android.gms.internal.ads;

import defpackage.x1f;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes3.dex */
public final class d5 extends yh implements x1f {
    private static final d5 zzb;
    private int zzd;
    private int zze = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private z4 zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        d5 d5Var = new d5();
        zzb = d5Var;
        yh.D(d5.class, d5Var);
    }

    private d5() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", l3.a, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new d5();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new c5(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
