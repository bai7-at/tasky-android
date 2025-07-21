package com.google.android.gms.internal.ads;

import defpackage.o0f;
import defpackage.x1f;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes3.dex */
public final class b1 extends yh implements x1f {
    private static final b1 zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private int zzg = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;

    static {
        b1 b1Var = new b1();
        zzb = b1Var;
        yh.D(b1.class, b1Var);
    }

    private b1() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            o0f o0fVar = t1.a;
            return yh.A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", o0fVar, "zzg", o0fVar});
        }
        if (i2 == 3) {
            return new b1();
        }
        t0 t0Var = null;
        if (i2 == 4) {
            return new a1(t0Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
