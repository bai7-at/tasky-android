package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzqy;

@zzqy(zza = zzy.class)
/* loaded from: classes2.dex */
public abstract class zzbc {
    public static zzbc create(String str, String str2, boolean z, String str3, int i, String str4) {
        return new zzy(str, str2, z, str3, i, str4);
    }

    public abstract String adsIdentityToken();

    public abstract String appSetId();

    public abstract int appSetIdScope();

    public abstract String deviceId();

    public abstract String idType();

    public abstract boolean isLimitedAdTracking();
}
