package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.Uri;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.player.ResizablePlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer;
import com.google.ads.interactivemedia.v3.impl.data.AdImpl;
import com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData;
import com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgm implements VideoStreamPlayer.VideoStreamPlayerCallback, zzgn, zzgg {
    private final VideoStreamPlayer zza;
    private final zzfm zzb;
    private final zzex zzc;
    private boolean zzd;
    private final zzev zze;
    private final zzgo zzf;
    private final String zzg;
    private final String zzh;
    private final StreamDisplayContainer zzi;

    zzgm(String str, zzfm zzfmVar, zzex zzexVar, StreamDisplayContainer streamDisplayContainer, String str2, Context context) {
        zzev zzevVar = new zzev(streamDisplayContainer.getVideoStreamPlayer(), 200L);
        zzgo zzgoVar = new zzgo(zzfmVar.zza(), streamDisplayContainer.getAdContainer());
        this.zzd = false;
        this.zza = streamDisplayContainer.getVideoStreamPlayer();
        this.zzc = zzexVar;
        this.zzg = str;
        this.zzb = zzfmVar;
        this.zzh = str2;
        this.zzd = false;
        this.zzi = streamDisplayContainer;
        this.zze = zzevVar;
        this.zzf = zzgoVar;
    }

    private final void zzo(zzfe zzfeVar, Object obj) {
        this.zzb.zzp(new zzff(zzfd.videoDisplay1, zzfeVar, this.zzg, obj));
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.AdProgressProvider
    public final VideoProgressUpdate getAdProgress() {
        return this.zza.getContentProgress();
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer.VideoStreamPlayerCallback
    public final void onContentComplete() {
        this.zzb.zzp(new zzff(zzfd.adsLoader, zzfe.contentComplete, "*", null));
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer.VideoStreamPlayerCallback
    public final void onPause() {
        zzo(zzfe.pause, null);
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer.VideoStreamPlayerCallback
    public final void onResume() {
        zzo(zzfe.play, null);
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer.VideoStreamPlayerCallback
    public final void onUserTextReceived(String str) {
        zzo(zzfe.timedMetadata, zzgl.create(str));
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer.VideoStreamPlayerCallback
    public final void onVolumeChanged(int i) {
        zzo(zzfe.volumeChange, com.google.ads.interactivemedia.v3.impl.data.zzbw.builder().volumePercentage(i).build());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgg
    public final void zza(VideoProgressUpdate videoProgressUpdate) {
        if (!this.zzd) {
            zzo(zzfe.start, com.google.ads.interactivemedia.v3.impl.data.zzbw.builder().volumePercentage(this.zza.getVolume()).build());
            this.zzd = true;
        }
        zzo(zzfe.timeupdate, com.google.ads.interactivemedia.v3.impl.data.zzbr.create(videoProgressUpdate));
    }

    public final void zzb() {
        this.zza.onAdBreakEnded();
        this.zzf.zza();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgn
    public final void zzc() {
        zzhd.zzc("Destroying StreamVideoDisplay");
        this.zza.removeCallback(this);
        this.zze.zzf();
        this.zze.zzd(this);
        this.zzf.zza();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgn
    public final void zzd() {
        this.zze.zzc(this);
        this.zze.zze();
    }

    public final void zze() {
        this.zza.onAdBreakStarted();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgn
    public final void zzf(zzfd zzfdVar, zzfe zzfeVar, JavaScriptMsgData javaScriptMsgData) {
        String str;
        zzfe zzfeVar2 = zzfe.activate;
        int ordinal = zzfeVar.ordinal();
        if (ordinal != 45) {
            if (ordinal == 52) {
                this.zza.pause();
                return;
            } else {
                if (ordinal != 53) {
                    return;
                }
                this.zza.resume();
                return;
            }
        }
        if (javaScriptMsgData == null || (str = javaScriptMsgData.streamUrl) == null) {
            this.zzc.zzc(new zzdl(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Load message must contain video url.")));
            return;
        }
        int i = 0;
        this.zzd = false;
        String str2 = this.zzh;
        if (str2 != null && str2.length() != 0) {
            String str3 = "";
            String replaceAll = str2.trim().replaceAll("\\s+", "");
            if (replaceAll.charAt(0) == '?') {
                replaceAll = replaceAll.substring(1);
            }
            if (replaceAll.length() != 0) {
                Map zza = zzhx.zza(Uri.parse(str));
                HashMap hashMap = new HashMap();
                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                buildUpon.clearQuery();
                Map zza2 = zzhx.zza(Uri.parse("http://www.dom.com/path?".concat(replaceAll)));
                hashMap.putAll(zza2);
                if (!zza.isEmpty()) {
                    for (String str4 : zza.keySet()) {
                        if (!zza2.containsKey(str4)) {
                            hashMap.put(str4, (String) zza.get(str4));
                        }
                    }
                }
                if (!hashMap.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String str5 = (String) entry.getKey();
                        String str6 = (String) entry.getValue();
                        sb.append(str5);
                        sb.append("=");
                        sb.append(str6);
                        if (i < hashMap.size() - 1) {
                            sb.append("&");
                        }
                        i++;
                    }
                    str3 = sb.toString();
                }
                buildUpon.encodedQuery(str3);
                str = buildUpon.build().toString();
            }
        }
        this.zza.loadUrl(str, javaScriptMsgData.subtitles);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgn
    public final void zzg(ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData) {
        if (!(this.zza instanceof ResizablePlayer)) {
            zzhd.zza("Stream player does not support resizing.");
            return;
        }
        if (!zzhh.zza(this.zzi, resizeAndPositionVideoMsgData)) {
            zzhd.zza("Video resize parameters were not within the container bounds.");
            return;
        }
        int width = this.zzi.getAdContainer().getWidth();
        int height = this.zzi.getAdContainer().getHeight();
        ((ResizablePlayer) this.zza).resize(resizeAndPositionVideoMsgData.x().intValue(), resizeAndPositionVideoMsgData.y().intValue(), (width - resizeAndPositionVideoMsgData.x().intValue()) - resizeAndPositionVideoMsgData.width().intValue(), (height - resizeAndPositionVideoMsgData.y().intValue()) - resizeAndPositionVideoMsgData.height().intValue());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgn
    public final void zzh() {
        VideoStreamPlayer videoStreamPlayer = this.zza;
        if (videoStreamPlayer instanceof ResizablePlayer) {
            ((ResizablePlayer) videoStreamPlayer).resize(0, 0, 0, 0);
        }
    }

    public final void zzi() {
        this.zza.onAdPeriodEnded();
    }

    public final void zzj() {
        this.zza.onAdPeriodStarted();
    }

    public final void zzk() {
        this.zza.addCallback(this);
    }

    public final void zzl(long j) {
        this.zza.seek(j);
    }

    final void zzm(AdImpl adImpl) {
        if (adImpl.isLinear()) {
            this.zzf.zzb();
        }
    }

    final void zzn() {
        this.zzf.zza();
    }
}
