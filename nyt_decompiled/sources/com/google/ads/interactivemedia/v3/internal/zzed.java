package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdsManager;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzed extends zzep implements AdsManager, AdErrorEvent.AdErrorListener {
    private final List zza;
    private final zzgo zzb;
    private zzeu zzc;
    private zzev zzd;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    zzed(java.lang.String r16, com.google.ads.interactivemedia.v3.internal.zzfm r17, com.google.ads.interactivemedia.v3.api.AdDisplayContainer r18, com.google.ads.interactivemedia.v3.internal.zzev r19, java.util.List r20, java.util.SortedSet r21, com.google.ads.interactivemedia.v3.internal.zzge r22, com.google.ads.interactivemedia.v3.internal.zzex r23, android.content.Context r24, boolean r25) {
        /*
            r15 = this;
            r10 = r15
            r11 = r16
            r12 = r17
            r13 = r19
            com.google.ads.interactivemedia.v3.internal.zzfu r6 = new com.google.ads.interactivemedia.v3.internal.zzfu
            r0 = r6
            r1 = r16
            r2 = r17
            r3 = r23
            r4 = r18
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.ads.interactivemedia.v3.internal.zzdj r5 = new com.google.ads.interactivemedia.v3.internal.zzdj
            android.view.ViewGroup r0 = r18.getAdContainer()
            r5.<init>(r11, r12, r0)
            com.google.ads.interactivemedia.v3.internal.zzgo r14 = new com.google.ads.interactivemedia.v3.internal.zzgo
            android.webkit.WebView r0 = r17.zza()
            android.view.ViewGroup r1 = r18.getAdContainer()
            r14.<init>(r0, r1)
            r0 = r15
            r1 = r16
            r3 = r6
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r20
            r10.zza = r0
            r10.zzd = r13
            r10.zzb = r14
            if (r13 == 0) goto L55
            com.google.ads.interactivemedia.v3.internal.zzeu r0 = new com.google.ads.interactivemedia.v3.internal.zzeu
            r1 = r21
            r0.<init>(r12, r1, r11)
            r10.zzc = r0
            r13.zzc(r0)
            r19.zze()
        L55:
            r15.addAdErrorListener(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzed.<init>(java.lang.String, com.google.ads.interactivemedia.v3.internal.zzfm, com.google.ads.interactivemedia.v3.api.AdDisplayContainer, com.google.ads.interactivemedia.v3.internal.zzev, java.util.List, java.util.SortedSet, com.google.ads.interactivemedia.v3.internal.zzge, com.google.ads.interactivemedia.v3.internal.zzex, android.content.Context, boolean):void");
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void clicked() {
        zzn(zzfe.click);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzep, com.google.ads.interactivemedia.v3.api.BaseManager
    public final void destroy() {
        super.destroy();
        zzev zzevVar = this.zzd;
        if (zzevVar != null) {
            zzevVar.zzf();
            this.zzd = null;
        }
        this.zzb.zza();
        zzn(zzfe.destroy);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void discardAdBreak() {
        zzn(zzfe.discardAdBreak);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final List<Float> getAdCuePoints() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final boolean isCustomPlaybackUsed() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener
    public final void onAdError(AdErrorEvent adErrorEvent) {
        this.zzb.zza();
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void pause() {
        zzn(zzfe.pause);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void requestNextAdBreak() {
        zzev zzevVar = this.zzd;
        if (zzevVar != null) {
            zzm(zzfd.contentTimeUpdate, zzfe.contentTimeUpdate, com.google.ads.interactivemedia.v3.impl.data.zzbr.create(zzevVar.zza()));
            zzn(zzfe.requestNextAdBreak);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void resume() {
        zzn(zzfe.resume);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void skip() {
        zzn(zzfe.skip);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManager
    public final void start() {
        zzn(zzfe.start);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzep
    final Map zza(AdsRenderingSettings adsRenderingSettings) {
        Map zza = super.zza(adsRenderingSettings);
        zzev zzevVar = this.zzd;
        if (zzevVar != null) {
            VideoProgressUpdate zza2 = zzevVar.zza();
            if (!zza2.equals(VideoProgressUpdate.VIDEO_TIME_NOT_READY)) {
                float currentTimeMs = zza2.getCurrentTimeMs();
                StringBuilder sb = new StringBuilder();
                sb.append("AdsManager.init -> Setting contentStartTime ");
                double d = currentTimeMs / 1000.0f;
                sb.append(d);
                zzhd.zzc(sb.toString());
                zza.put("contentStartTime", Double.valueOf(d));
            }
        }
        return zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzep, com.google.ads.interactivemedia.v3.internal.zzfk
    public final void zzb(zzfj zzfjVar) {
        zzfu zzfuVar = (zzfu) zzc();
        AdEvent.AdEventType adEventType = zzfjVar.zza;
        AdEvent.AdEventType adEventType2 = AdEvent.AdEventType.ALL_ADS_COMPLETED;
        int ordinal = adEventType.ordinal();
        if (ordinal == 0) {
            super.destroy();
            zzev zzevVar = this.zzd;
            if (zzevVar != null) {
                zzevVar.zzf();
                this.zzd = null;
            }
            this.zzb.zza();
            zzn(zzfe.destroy);
            super.zzb(zzfjVar);
            zzl();
            return;
        }
        if (ordinal == 5) {
            zzev zzevVar2 = this.zzd;
            if (zzevVar2 != null) {
                zzevVar2.zzf();
            }
        } else if (ordinal == 6) {
            this.zzb.zza();
            zzfuVar.zze();
            zzev zzevVar3 = this.zzd;
            if (zzevVar3 != null) {
                zzevVar3.zze();
            }
        } else if (ordinal == 14) {
            this.zzb.zza();
        } else if (ordinal == 15) {
            this.zzb.zzb();
        }
        super.zzb(zzfjVar);
    }
}
