package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;

/* loaded from: classes2.dex */
final class zzev extends zzgh {
    protected final ContentProgressProvider zza;

    zzev(ContentProgressProvider contentProgressProvider, long j) {
        super(200L);
        this.zza = contentProgressProvider;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgh
    public final VideoProgressUpdate zza() {
        VideoProgressUpdate contentProgress = this.zza.getContentProgress();
        if (contentProgress != null) {
            return contentProgress;
        }
        Log.w("IMASDK", "ContentProgressProvider.getContentProgress() is null. Use VideoProgressUpdate.VIDEO_TIME_NOT_READY instead.");
        return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
    }
}
