package com.google.android.gms.internal.ads;

import defpackage.x1f;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes3.dex */
public final class i1 extends yh implements x1f {
    private static final i1 zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;

    static {
        i1 i1Var = new i1();
        zzb = i1Var;
        yh.D(i1.class, i1Var);
    }

    private i1() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", "zzf", t1.a});
        }
        if (i2 == 3) {
            return new i1();
        }
        t0 t0Var = null;
        if (i2 == 4) {
            return new h1(t0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
