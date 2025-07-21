package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;
import com.google.ads.interactivemedia.v3.internal.zzqy;

@zzqy(zza = zzai.class)
/* loaded from: classes2.dex */
public abstract class zzbm {
    public static zzbl builder() {
        return new zzag();
    }

    abstract boolean attached();

    abstract zzau bounds();

    abstract String detailedReason();

    abstract boolean hidden();

    abstract FriendlyObstructionPurpose purpose();

    abstract String type();
}
