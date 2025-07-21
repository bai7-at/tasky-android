package com.google.ads.interactivemedia.v3.api.player;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class VideoProgressUpdate {
    public static final VideoProgressUpdate VIDEO_TIME_NOT_READY = new VideoProgressUpdate(-1, -1);
    private final long zza;
    private final long zzb;

    public VideoProgressUpdate(long j, long j2) {
        this.zza = j;
        this.zzb = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VideoProgressUpdate.class != obj.getClass()) {
            return false;
        }
        VideoProgressUpdate videoProgressUpdate = (VideoProgressUpdate) obj;
        return this.zza == videoProgressUpdate.zza && this.zzb == videoProgressUpdate.zzb;
    }

    @Deprecated
    public float getCurrentTime() {
        return this.zza / 1000.0f;
    }

    public long getCurrentTimeMs() {
        return this.zza;
    }

    @Deprecated
    public float getDuration() {
        return this.zzb / 1000.0f;
    }

    public long getDurationMs() {
        return this.zzb;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), Long.valueOf(this.zzb)});
    }
}
