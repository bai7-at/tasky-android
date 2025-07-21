package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzqy;
import com.google.android.gms.common.annotation.KeepForSdk;

@zzqy(zza = zzab.class)
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class NetworkRequestData {

    @KeepForSdk
    public enum RequestType {
        GET,
        POST
    }

    @KeepForSdk
    public static NetworkRequestData create(RequestType requestType, String str, String str2, String str3, String str4, int i, int i2) {
        return new zzab(requestType, str, str2, str4, str3, i, i2);
    }

    public abstract int connectionTimeoutMs();

    public abstract String content();

    public abstract String id();

    public abstract int readTimeoutMs();

    public abstract RequestType requestType();

    public abstract String url();

    public abstract String userAgent();
}
