package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.HashMap;

/* loaded from: classes2.dex */
final class zzdo implements VideoAdPlayer.VideoAdPlayerCallback {
    private zzdn zzb;
    private boolean zzc = false;
    private final HashMap zza = zztd.zzb(2);

    zzdo() {
    }

    private final void zzd(zzfe zzfeVar, AdMediaInfo adMediaInfo, Object obj) {
        zzdn zzdnVar = this.zzb;
        if (zzdnVar != null) {
            zzdnVar.zzb(zzfeVar, adMediaInfo, obj);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onAdProgress(AdMediaInfo adMediaInfo, VideoProgressUpdate videoProgressUpdate) {
        if (this.zzc && videoProgressUpdate != null && videoProgressUpdate.getDuration() > 0.0f) {
            if (this.zza.get(adMediaInfo) == null && videoProgressUpdate.getCurrentTime() > 0.0f) {
                zzd(zzfe.start, adMediaInfo, null);
                this.zza.put(adMediaInfo, Boolean.TRUE);
            }
            zzd(zzfe.timeupdate, adMediaInfo, com.google.ads.interactivemedia.v3.impl.data.zzbr.create(videoProgressUpdate));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onBuffering(AdMediaInfo adMediaInfo) {
        if (this.zzc) {
            zzd(zzfe.waiting, adMediaInfo, null);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onContentComplete() {
        zzdn zzdnVar = this.zzb;
        if (zzdnVar != null) {
            zzdnVar.zza(zzfd.adsLoader, zzfe.contentComplete);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onEnded(AdMediaInfo adMediaInfo) {
        if (this.zzc) {
            zzd(zzfe.end, adMediaInfo, null);
            this.zza.remove(adMediaInfo);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onError(AdMediaInfo adMediaInfo) {
        if (this.zzc) {
            zzd(zzfe.error, adMediaInfo, null);
            this.zza.remove(adMediaInfo);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onLoaded(AdMediaInfo adMediaInfo) {
        if (this.zzc) {
            zzd(zzfe.loaded, adMediaInfo, null);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onPause(AdMediaInfo adMediaInfo) {
        if (this.zzc) {
            zzd(zzfe.pause, adMediaInfo, null);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onPlay(AdMediaInfo adMediaInfo) {
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onResume(AdMediaInfo adMediaInfo) {
        if (this.zzc) {
            zzd(zzfe.play, adMediaInfo, null);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onVolumeChanged(AdMediaInfo adMediaInfo, int i) {
        if (this.zzc) {
            zzd(zzfe.volumeChange, adMediaInfo, com.google.ads.interactivemedia.v3.impl.data.zzbw.builder().volumePercentage(i).build());
        }
    }

    final void zza(zzdn zzdnVar) {
        this.zzb = zzdnVar;
    }

    final void zzb() {
        this.zzc = true;
    }

    final void zzc() {
        this.zzc = false;
    }
}
