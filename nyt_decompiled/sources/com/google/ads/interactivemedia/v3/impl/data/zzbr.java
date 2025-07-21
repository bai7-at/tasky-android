package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.internal.zzqy;

@zzqy(zza = zzao.class)
/* loaded from: classes2.dex */
public abstract class zzbr {
    public static zzbr create(VideoProgressUpdate videoProgressUpdate) {
        return new zzao(videoProgressUpdate.getCurrentTimeMs(), videoProgressUpdate.getDurationMs(), "ms");
    }

    public abstract long currentTime();

    public abstract long duration();

    public abstract String timeUnit();
}
