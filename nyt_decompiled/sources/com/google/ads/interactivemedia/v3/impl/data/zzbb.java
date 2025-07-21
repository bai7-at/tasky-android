package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzqy;

@zzqy(zza = zzx.class)
/* loaded from: classes2.dex */
public abstract class zzbb {
    public abstract String alternateText();

    public abstract String creativeType();

    public abstract int height();

    public abstract String imageUrl();

    public final String toString() {
        return "IconClickFallbackImageMsgData [width=" + width() + ", height=" + height() + ", imageUrl=" + imageUrl() + ", alternateText=" + alternateText() + ", creativeType=" + creativeType() + "]";
    }

    public abstract int width();
}
