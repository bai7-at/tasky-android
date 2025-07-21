package com.google.android.gms.internal.pal;

import defpackage.by9;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes3.dex */
public final class b extends c0 implements by9 {
    private static final b zzb;
    private int zze;
    private long zzf = -1;
    private int zzg = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;

    static {
        b bVar = new b();
        zzb = bVar;
        c0.h(b.class, bVar);
    }

    private b() {
    }

    @Override // com.google.android.gms.internal.pal.c0
    protected final Object q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return c0.g(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg", c2.a});
        }
        if (i2 == 3) {
            return new b();
        }
        g3 g3Var = null;
        if (i2 == 4) {
            return new w8(g3Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
