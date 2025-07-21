package com.google.ads.interactivemedia.v3.internal;

import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes2.dex */
public final class zzax extends zzaet implements zzaga {
    private static final zzax zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;

    static {
        zzax zzaxVar = new zzax();
        zzb = zzaxVar;
        zzaet.zzaM(zzax.class, zzaxVar);
    }

    private zzax() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    protected final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaet.zzaJ(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", "zzf", zzbi.zza});
        }
        if (i2 == 3) {
            return new zzax();
        }
        zzae zzaeVar = null;
        if (i2 == 4) {
            return new zzaw(zzaeVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
