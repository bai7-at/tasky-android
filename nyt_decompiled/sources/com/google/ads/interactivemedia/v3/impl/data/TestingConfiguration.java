package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzqy;

@zzqy(zza = zzan.class, zzb = {"extraParams", "isTv", "ignoreStrictModeFalsePositives"})
/* loaded from: classes2.dex */
public abstract class TestingConfiguration {

    public interface Builder {
    }

    TestingConfiguration() {
    }

    public abstract boolean forceAndroidTvMode();

    public abstract boolean forceTvMode();

    public abstract boolean ignoreStrictModeFalsePositives();
}
