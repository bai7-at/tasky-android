package com.google.ads.interactivemedia.v3.internal;

import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes2.dex */
public final class zzao extends zzaet implements zzaga {
    private static final zzao zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private int zzg = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;

    static {
        zzao zzaoVar = new zzao();
        zzb = zzaoVar;
        zzaet.zzaM(zzao.class, zzaoVar);
    }

    private zzao() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzaex zzaexVar = zzbi.zza;
            return zzaet.zzaJ(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"zzd", "zze", "zzf", zzaexVar, "zzg", zzaexVar});
        }
        if (i2 == 3) {
            return new zzao();
        }
        zzae zzaeVar = null;
        if (i2 == 4) {
            return new zzan(zzaeVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
