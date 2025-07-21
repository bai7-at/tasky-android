package com.google.android.gms.internal.ads;

import defpackage.x1f;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes3.dex */
public final class h5 extends yh implements x1f {
    private static final h5 zzb;
    private int zzd;
    private int zze = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private z4 zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private long zzj;

    static {
        h5 h5Var = new h5();
        zzb = h5Var;
        yh.D(h5.class, h5Var);
    }

    private h5() {
    }

    @Override // com.google.android.gms.internal.ads.yh
    protected final Object I(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return yh.A(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzd", "zze", l3.a, "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new h5();
        }
        i2 i2Var = null;
        if (i2 == 4) {
            return new g5(i2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
