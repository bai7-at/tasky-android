package com.google.ads.interactivemedia.v3.internal;

import android.app.Application;
import android.content.Context;
import com.google.ads.interactivemedia.v3.api.Ad;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdProgressInfo;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.BaseManager;
import com.google.ads.interactivemedia.v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.impl.data.AdImpl;
import com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
abstract class zzep implements BaseManager, zzfk, zzgr {
    private final zzfm zza;
    private final String zzb;
    private final List zzc;
    private final zzex zzd;
    private final Context zze;
    private final zzdj zzf;
    private final zzge zzg;
    private final zzgn zzh;
    private AdImpl zzi;
    private AdProgressInfo zzj;
    private AdsRenderingSettings zzk;
    private boolean zzl;
    private final zzhy zzm;
    private zzgs zzn;

    zzep(String str, zzfm zzfmVar, zzgn zzgnVar, BaseDisplayContainer baseDisplayContainer, zzdj zzdjVar, zzge zzgeVar, zzex zzexVar, Context context, boolean z) {
        ArrayList arrayList = new ArrayList(1);
        this.zzc = arrayList;
        this.zzl = false;
        this.zzb = str;
        this.zza = zzfmVar;
        this.zzh = zzgnVar;
        this.zze = context;
        this.zzd = zzexVar;
        this.zzk = new com.google.ads.interactivemedia.v3.impl.data.zze();
        this.zzf = zzdjVar;
        zzdjVar.zzj(z);
        if (zzgeVar == null) {
            zzgeVar = null;
        } else {
            zzgeVar.zzg(str);
            zzgeVar.zzd(baseDisplayContainer.getAdContainer());
            arrayList.add(zzgeVar);
            zzexVar.zza(zzgeVar);
            zzeo zzeoVar = (zzeo) baseDisplayContainer;
            Iterator it2 = zzeoVar.zzb().iterator();
            while (it2.hasNext()) {
                zzgeVar.zzc((FriendlyObstruction) it2.next());
            }
            zzeoVar.zzc(zzgeVar);
        }
        this.zzg = zzgeVar;
        this.zzm = new zzhy(context, this.zzk);
        zzfmVar.zzg(this, str);
        zzfmVar.zzi(this.zzh, str);
        zzdjVar.zzf();
        Application zza = zzgq.zza(context);
        if (zza != null) {
            zzgs zzgsVar = new zzgs(zza);
            this.zzn = zzgsVar;
            zzgsVar.zza(this);
        }
    }

    private final void zzo(String str) {
        if (zzgq.zzc(this.zze, this.zza.zzb())) {
            this.zza.zza().requestFocus();
            this.zza.zzp(new zzff(zzfd.userInteraction, zzfe.focusUiElement, str, null));
        }
    }

    private final boolean zzp() {
        return this.zzk.getFocusSkipButtonWhenAvailable();
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void addAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener) {
        this.zzd.zza(adErrorListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void addAdEventListener(AdEvent.AdEventListener adEventListener) {
        this.zzc.add(adEventListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public void destroy() {
        this.zzl = true;
        this.zzg.zzi();
        this.zzf.zzg();
        this.zzf.zzk();
        zzgs zzgsVar = this.zzn;
        if (zzgsVar != null) {
            zzgsVar.zzb();
        }
        this.zzh.zzc();
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void focus() {
        zzo(this.zzb);
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.AdProgressProvider
    public final VideoProgressUpdate getAdProgress() {
        return this.zzl ? VideoProgressUpdate.VIDEO_TIME_NOT_READY : this.zzh.getAdProgress();
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final AdProgressInfo getAdProgressInfo() {
        return this.zzj;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final Ad getCurrentAd() {
        return this.zzi;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void init() {
        this.zza.zzp(new zzff(zzfd.adsManager, zzfe.init, this.zzb, zza(this.zzk)));
        this.zzh.zzd();
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void removeAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener) {
        this.zzd.zzd(adErrorListener);
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void removeAdEventListener(AdEvent.AdEventListener adEventListener) {
        this.zzc.remove(adEventListener);
    }

    Map zza(AdsRenderingSettings adsRenderingSettings) {
        HashMap hashMap = new HashMap();
        hashMap.put("adsRenderingSettings", com.google.ads.interactivemedia.v3.impl.data.zzd.builder(adsRenderingSettings).build());
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00f1 A[LOOP:0: B:25:0x00eb->B:27:0x00f1, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zzb(com.google.ads.interactivemedia.v3.internal.zzfj r9) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzep.zzb(com.google.ads.interactivemedia.v3.internal.zzfj):void");
    }

    protected final zzgn zzc() {
        return this.zzh;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzfk
    public final void zzd(AdError.AdErrorType adErrorType, int i, String str) {
        zze(adErrorType, AdError.AdErrorCode.getErrorCodeByNumber(i), str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzfk
    public final void zze(AdError.AdErrorType adErrorType, AdError.AdErrorCode adErrorCode, String str) {
        this.zzj = null;
        this.zzd.zzc(new zzdl(new AdError(adErrorType, adErrorCode, str)));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgr
    public final void zzf() {
        this.zza.zzp(new zzff(zzfd.adsManager, zzfe.appBackgrounding, this.zzb, null));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzgr
    public final void zzg() {
        this.zza.zzp(new zzff(zzfd.adsManager, zzfe.appForegrounding, this.zzb, null));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzfk
    public final void zzh(String str) {
        this.zzm.zza(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r0 != 2) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0076  */
    @Override // com.google.ads.interactivemedia.v3.internal.zzfk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzi(android.view.ViewGroup r10, com.google.ads.interactivemedia.v3.impl.data.CompanionData r11, java.lang.String r12, com.google.ads.interactivemedia.v3.api.CompanionAdSlot r13, com.google.ads.interactivemedia.v3.internal.zzfm r14, com.google.ads.interactivemedia.v3.internal.zzha r15) {
        /*
            r9 = this;
            r10.removeAllViews()
            com.google.ads.interactivemedia.v3.internal.zzeq r13 = (com.google.ads.interactivemedia.v3.internal.zzeq) r13
            java.util.List r6 = r13.zza()
            com.google.ads.interactivemedia.v3.impl.data.zzav r0 = com.google.ads.interactivemedia.v3.impl.data.zzav.Html
            com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r0 = com.google.ads.interactivemedia.v3.api.AdEvent.AdEventType.ALL_ADS_COMPLETED
            com.google.ads.interactivemedia.v3.impl.data.zzav r0 = r11.type()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L64
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L1f
            if (r0 == r2) goto L64
            goto L74
        L1f:
            android.content.Context r4 = r10.getContext()
            java.lang.String r0 = r11.src()
            java.lang.String r5 = r11.size()
            if (r5 != 0) goto L2e
            goto L51
        L2e:
            java.lang.String r1 = "x"
            r7 = -1
            java.lang.String[] r1 = r5.split(r1, r7)
            int r5 = r1.length
            r7 = 0
            if (r5 == r2) goto L3f
            com.google.ads.interactivemedia.v3.impl.data.zzbd r1 = new com.google.ads.interactivemedia.v3.impl.data.zzbd
            r1.<init>(r7, r7)
            goto L51
        L3f:
            com.google.ads.interactivemedia.v3.impl.data.zzbd r2 = new com.google.ads.interactivemedia.v3.impl.data.zzbd
            r5 = r1[r7]
            int r5 = java.lang.Integer.parseInt(r5)
            r1 = r1[r3]
            int r1 = java.lang.Integer.parseInt(r1)
            r2.<init>(r5, r1)
            r1 = r2
        L51:
            og8 r15 = r15.zzb(r0, r1)
            com.google.ads.interactivemedia.v3.internal.zzfb r8 = new com.google.ads.interactivemedia.v3.internal.zzfb
            com.google.ads.interactivemedia.v3.internal.zzhy r7 = r9.zzm
            r0 = r8
            r1 = r4
            r2 = r14
            r3 = r11
            r4 = r15
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r1 = r8
            goto L74
        L64:
            com.google.ads.interactivemedia.v3.internal.zzet r15 = new com.google.ads.interactivemedia.v3.internal.zzet
            android.content.Context r1 = r10.getContext()
            com.google.ads.interactivemedia.v3.internal.zzhy r5 = r9.zzm
            r0 = r15
            r2 = r14
            r3 = r11
            r4 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r15
        L74:
            if (r1 == 0) goto L7f
            r1.setTag(r12)
            r13.zzb(r12)
            r10.addView(r1)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzep.zzi(android.view.ViewGroup, com.google.ads.interactivemedia.v3.impl.data.CompanionData, java.lang.String, com.google.ads.interactivemedia.v3.api.CompanionAdSlot, com.google.ads.interactivemedia.v3.internal.zzfm, com.google.ads.interactivemedia.v3.internal.zzha):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzfk
    public final void zzj(ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData) {
        this.zzh.zzg(resizeAndPositionVideoMsgData);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzfk
    public final void zzk() {
        this.zzh.zzh();
    }

    final void zzl() {
        this.zza.zzo(this.zzb);
        this.zzc.clear();
        this.zzd.zzb();
    }

    protected final void zzm(zzfd zzfdVar, zzfe zzfeVar, Object obj) {
        this.zza.zzp(new zzff(zzfdVar, zzfeVar, this.zzb, obj));
    }

    protected final void zzn(zzfe zzfeVar) {
        this.zza.zzp(new zzff(zzfd.adsManager, zzfeVar, this.zzb, null));
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final void init(AdsRenderingSettings adsRenderingSettings) {
        if (adsRenderingSettings != null) {
            this.zzk = adsRenderingSettings;
            this.zzm.zzb(adsRenderingSettings);
        }
        this.zza.zzp(new zzff(zzfd.adsManager, zzfe.init, this.zzb, zza(this.zzk)));
        this.zzh.zzd();
    }
}
