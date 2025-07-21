package com.google.ads.interactivemedia.v3.impl.data;

import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.google.ads.interactivemedia.v3.internal.zzqy;

@zzqy(zza = zzac.class)
/* loaded from: classes2.dex */
public abstract class zzbj {
    private static zzbj create(String str, String str2, String str3, int i) {
        return new zzac(str, str2, str3, i);
    }

    public static zzbj forError(String str, int i) {
        return create(str, "", DatasetUtils.UNKNOWN_IDENTITY_ID, i);
    }

    public static zzbj forResponse(String str, String str2) {
        return forResponse(str, str2, DatasetUtils.UNKNOWN_IDENTITY_ID);
    }

    public abstract String content();

    public abstract String contentType();

    public abstract int errorCode();

    public abstract String id();

    public static zzbj forResponse(String str, String str2, String str3) {
        return create(str, str2, str3, 0);
    }
}
