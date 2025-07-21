package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzqy;
import com.google.android.gms.common.annotation.KeepForSdk;

@zzqy(zza = zzq.class)
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class CuePointData {
    @KeepForSdk
    private static CuePointData create(double d, double d2, boolean z) {
        return new zzq(d, d2, z);
    }

    public abstract double end();

    public abstract boolean played();

    public abstract double start();
}
