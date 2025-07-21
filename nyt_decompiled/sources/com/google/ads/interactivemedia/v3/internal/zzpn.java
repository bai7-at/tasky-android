package com.google.ads.interactivemedia.v3.internal;

import com.chartbeat.androidsdk.QueryKeys;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes2.dex */
final class zzpn implements zzpo {
    private static final zzbc zza;

    static {
        zzaf zza2 = zzbc.zza();
        zza2.zzx(QueryKeys.ENGAGED_SECONDS);
        zza = (zzbc) zza2.zzak();
    }

    zzpn() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpo
    public final zzbc zza() {
        return zza;
    }
}
