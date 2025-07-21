package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.ResizablePlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.impl.data.AdPodInfoImpl;
import com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData;
import com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData;

/* loaded from: classes2.dex */
public final class zzfu implements zzgn, zzdn {
    private final AdDisplayContainer zza;
    private final VideoAdPlayer zzb;
    private final zzex zzc;
    private final zzfm zzd;
    private final String zze;
    private final zzdo zzf;
    private final zzsh zzg = zzsh.zzf(2);

    public zzfu(String str, zzfm zzfmVar, zzex zzexVar, AdDisplayContainer adDisplayContainer, Context context) {
        this.zza = adDisplayContainer;
        VideoAdPlayer player = adDisplayContainer.getPlayer();
        this.zzb = player;
        this.zzc = zzexVar;
        this.zzd = zzfmVar;
        this.zze = str;
        zzdo zzdoVar = new zzdo();
        this.zzf = zzdoVar;
        zzdoVar.zza(this);
        player.addCallback(zzdoVar);
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.AdProgressProvider
    public final VideoProgressUpdate getAdProgress() {
        return this.zzb.getAdProgress();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzdn
    public final void zza(zzfd zzfdVar, zzfe zzfeVar) {
        this.zzd.zzp(new zzff(zzfdVar, zzfeVar, "*", null));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzdn
    public final void zzb(zzfe zzfeVar, AdMediaInfo adMediaInfo, Object obj) {
        zzfd zzfdVar = (zzfd) this.zzg.zze().get(adMediaInfo);
        if (zzfdVar != null) {
            this.zzd.zzp(new zzff(zzfdVar, zzfeVar, this.zze, obj));
            return;
        }
        zzhd.zzd("The adMediaInfo for the " + String.valueOf(zzfeVar) + " event is not active. This may occur if callbacks are triggered after the ad is unloaded.");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgn
    public final void zzc() {
        zzhd.zzc("Destroying NativeVideoDisplay");
        this.zzb.removeCallback(this.zzf);
        this.zzb.release();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgn
    public final void zzd() {
    }

    public final void zze() {
        this.zzf.zzc();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgn
    public final void zzf(zzfd zzfdVar, zzfe zzfeVar, JavaScriptMsgData javaScriptMsgData) {
        AdMediaInfo adMediaInfo = (AdMediaInfo) this.zzg.get(zzfdVar);
        zzfe zzfeVar2 = zzfe.activate;
        int ordinal = zzfeVar.ordinal();
        if (ordinal != 34) {
            if (ordinal == 43) {
                if (javaScriptMsgData == null || javaScriptMsgData.videoUrl == null) {
                    this.zzc.zzc(new zzdl(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Load message must contain video url.")));
                    return;
                }
                this.zzf.zzb();
                AdMediaInfo adMediaInfo2 = new AdMediaInfo(javaScriptMsgData.videoUrl);
                AdPodInfoImpl adPodInfoImpl = javaScriptMsgData.adPodInfo;
                if (adPodInfoImpl == null) {
                    adPodInfoImpl = null;
                }
                this.zzg.put(zzfdVar, adMediaInfo2);
                this.zzb.loadAd(adMediaInfo2, adPodInfoImpl);
                return;
            }
            if (ordinal != 72) {
                if (ordinal == 52) {
                    this.zzb.pauseAd(adMediaInfo);
                    return;
                } else {
                    if (ordinal != 53) {
                        return;
                    }
                    this.zzb.playAd(adMediaInfo);
                    this.zzf.zzb();
                    return;
                }
            }
        }
        this.zzb.stopAd(adMediaInfo);
        this.zzg.remove(zzfdVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgn
    public final void zzg(ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData) {
        if (!(this.zzb instanceof ResizablePlayer)) {
            zzhd.zza("Video player does not support resizing.");
            return;
        }
        if (!zzhh.zza(this.zza, resizeAndPositionVideoMsgData)) {
            zzhd.zza("Creative resize parameters were not within the containers bounds.");
            return;
        }
        int width = this.zza.getAdContainer().getWidth();
        int height = this.zza.getAdContainer().getHeight();
        ((ResizablePlayer) this.zzb).resize(resizeAndPositionVideoMsgData.x().intValue(), resizeAndPositionVideoMsgData.y().intValue(), (width - resizeAndPositionVideoMsgData.x().intValue()) - resizeAndPositionVideoMsgData.width().intValue(), (height - resizeAndPositionVideoMsgData.y().intValue()) - resizeAndPositionVideoMsgData.height().intValue());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgn
    public final void zzh() {
        VideoAdPlayer videoAdPlayer = this.zzb;
        if (videoAdPlayer instanceof ResizablePlayer) {
            ((ResizablePlayer) videoAdPlayer).resize(0, 0, 0, 0);
        }
    }
}
