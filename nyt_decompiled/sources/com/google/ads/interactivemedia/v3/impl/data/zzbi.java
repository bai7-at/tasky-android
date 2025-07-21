package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzqy;

@zzqy(zza = zzaa.class)
/* loaded from: classes2.dex */
public abstract class zzbi {
    public static zzbi create(Throwable th) {
        return new zzaa(th.getClass().getName(), th.getMessage());
    }

    public abstract String message();

    public abstract String name();
}
