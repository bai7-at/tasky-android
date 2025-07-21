package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.VersionInfo;
import com.google.ads.interactivemedia.v3.internal.zzqy;

@zzqy(zza = zzal.class)
/* loaded from: classes2.dex */
public abstract class zzbp {
    public static zzbp create(int i, int i2, int i3) {
        return new zzal(i, i2, i3);
    }

    public abstract int major();

    public abstract int micro();

    public abstract int minor();

    public static zzbp create(VersionInfo versionInfo) {
        return create(versionInfo.getMajorVersion(), versionInfo.getMinorVersion(), versionInfo.getMicroVersion());
    }
}
