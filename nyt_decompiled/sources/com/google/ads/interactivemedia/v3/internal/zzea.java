package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.StreamRequest;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

/* loaded from: classes2.dex */
final class zzea implements zzfi {
    final /* synthetic */ zzec zza;

    zzea(zzec zzecVar) {
        this.zza = zzecVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzfi
    public final void zza(String str, AdError.AdErrorType adErrorType, int i, String str2) {
        Map map;
        Map map2;
        Object obj;
        Map map3;
        zzex zzexVar;
        Map map4;
        map = this.zza.zzh;
        if (map.get(str) != null) {
            map4 = this.zza.zzh;
            obj = ((AdsRequest) map4.get(str)).getUserRequestContext();
        } else {
            map2 = this.zza.zzi;
            if (map2.get(str) != null) {
                map3 = this.zza.zzi;
                obj = ((StreamRequest) map3.get(str)).getUserRequestContext();
            } else {
                obj = new Object();
            }
        }
        zzdl zzdlVar = new zzdl(new AdError(adErrorType, i, str2), obj);
        zzexVar = this.zza.zzf;
        zzexVar.zzc(zzdlVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzfi
    public final void zzb(String str, AdError.AdErrorType adErrorType, AdError.AdErrorCode adErrorCode, String str2) {
        Map map;
        Map map2;
        Object obj;
        Map map3;
        zzex zzexVar;
        Map map4;
        map = this.zza.zzh;
        if (map.get(str) != null) {
            map4 = this.zza.zzh;
            obj = ((AdsRequest) map4.get(str)).getUserRequestContext();
        } else {
            map2 = this.zza.zzi;
            if (map2.get(str) != null) {
                map3 = this.zza.zzi;
                obj = ((StreamRequest) map3.get(str)).getUserRequestContext();
            } else {
                obj = new Object();
            }
        }
        zzdl zzdlVar = new zzdl(new AdError(adErrorType, adErrorCode, "adsLoaded message did not contain cue points."), obj);
        zzexVar = this.zza.zzf;
        zzexVar.zzc(zzdlVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzfi
    public final void zzc(String str, List list, SortedSet sortedSet, boolean z) {
        BaseDisplayContainer baseDisplayContainer;
        Map map;
        zzge zzgeVar;
        zzfm zzfmVar;
        zzge zzgeVar2;
        zzhc zzhcVar;
        Context context;
        zzex zzexVar;
        zzex zzexVar2;
        zzec zzecVar = this.zza;
        baseDisplayContainer = zzecVar.zzl;
        AdDisplayContainer adDisplayContainer = (AdDisplayContainer) baseDisplayContainer;
        map = zzecVar.zzh;
        AdsRequest adsRequest = (AdsRequest) map.get(str);
        if (adsRequest == null) {
            zzexVar2 = this.zza.zzf;
            zzexVar2.zzc(new zzdl(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Request not found for session id: ".concat(String.valueOf(str))), new Object()));
            return;
        }
        ContentProgressProvider contentProgressProvider = adsRequest.getContentProgressProvider();
        AdError adError = null;
        zzev zzevVar = contentProgressProvider != null ? new zzev(contentProgressProvider, 200L) : null;
        zzgeVar = this.zza.zzj;
        zzgeVar.zze(adsRequest.getContentUrl());
        if (sortedSet != null && !sortedSet.isEmpty() && zzevVar == null) {
            adError = new AdError(AdError.AdErrorType.PLAY, AdError.AdErrorCode.PLAYLIST_NO_CONTENT_TRACKING, "Unable to handle cue points, no content progress provider configured.");
        }
        if (adError != null) {
            zzexVar = this.zza.zzf;
            zzexVar.zzc(new zzdl(adError, adsRequest.getUserRequestContext()));
            return;
        }
        zzec zzecVar2 = this.zza;
        zzfmVar = zzecVar2.zzd;
        zzgeVar2 = zzecVar2.zzj;
        zzhcVar = zzecVar2.zzq;
        zzex zzexVar3 = new zzex(zzhcVar);
        context = this.zza.zzb;
        zzec.zzm(zzecVar2, new zzee(new zzed(str, zzfmVar, adDisplayContainer, zzevVar, list, sortedSet, zzgeVar2, zzexVar3, context, z), adsRequest.getUserRequestContext()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzfi
    public final void zzd(String str, String str2, boolean z) {
        BaseDisplayContainer baseDisplayContainer;
        Map map;
        zzge zzgeVar;
        zzge zzgeVar2;
        zzfm zzfmVar;
        zzge zzgeVar3;
        zzhc zzhcVar;
        Context context;
        zzex zzexVar;
        zzec zzecVar = this.zza;
        baseDisplayContainer = zzecVar.zzl;
        StreamDisplayContainer streamDisplayContainer = (StreamDisplayContainer) baseDisplayContainer;
        map = zzecVar.zzi;
        StreamRequest streamRequest = (StreamRequest) map.get(str);
        if (streamRequest == null) {
            zzexVar = this.zza.zzf;
            zzexVar.zzc(new zzdl(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Request not found for session id: ".concat(String.valueOf(str))), new Object()));
            return;
        }
        zzgeVar = this.zza.zzj;
        zzgeVar.zze(streamRequest.getContentUrl());
        zzgeVar2 = this.zza.zzj;
        zzgeVar2.zzf(true);
        zzec zzecVar2 = this.zza;
        zzfmVar = zzecVar2.zzd;
        String manifestSuffix = streamRequest.getManifestSuffix();
        zzec zzecVar3 = this.zza;
        zzgeVar3 = zzecVar3.zzj;
        zzhcVar = zzecVar3.zzq;
        zzex zzexVar2 = new zzex(zzhcVar);
        context = this.zza.zzb;
        zzec.zzm(zzecVar2, new zzee(new zzgj(str, zzfmVar, streamDisplayContainer, new zzgm(str, zzfmVar, zzexVar2, streamDisplayContainer, manifestSuffix, context), new zzdj(str, zzfmVar, streamDisplayContainer.getAdContainer()), zzgeVar3, zzexVar2, context, str2, z), streamRequest.getUserRequestContext()));
    }
}
