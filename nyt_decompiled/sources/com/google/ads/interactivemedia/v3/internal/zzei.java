package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignals;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzei implements AdsRequest {
    private String zza;
    private Map zzb;
    private String zzc;
    private ContentProgressProvider zzd;
    private zzef zze = zzef.UNKNOWN;
    private zzeh zzf = zzeh.UNKNOWN;
    private zzeg zzg = zzeg.UNKNOWN;
    private Float zzh;
    private List zzi;
    private String zzj;
    private String zzk;
    private Float zzl;
    private Float zzm;
    private SecureSignals zzn;
    private transient Object zzo;

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final String getAdTagUrl() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final String getAdsResponse() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final ContentProgressProvider getContentProgressProvider() {
        return this.zzd;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final String getContentUrl() {
        return this.zzk;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final String getExtraParameter(String str) {
        Map map = this.zzb;
        if (map == null) {
            return null;
        }
        return (String) map.get(str);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final Map<String, String> getExtraParameters() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final SecureSignals getSecureSignals() {
        return this.zzn;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final Object getUserRequestContext() {
        return this.zzo;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setAdTagUrl(String str) {
        this.zza = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setAdWillAutoPlay(boolean z) {
        this.zze = z ? zzef.AUTO : zzef.CLICK;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setAdWillPlayMuted(boolean z) {
        this.zzf = z ? zzeh.MUTED : zzeh.UNMUTED;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setAdsResponse(String str) {
        this.zzc = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContentDuration(float f) {
        this.zzh = Float.valueOf(f);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContentKeywords(List<String> list) {
        this.zzi = list;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContentProgressProvider(ContentProgressProvider contentProgressProvider) {
        this.zzd = contentProgressProvider;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContentTitle(String str) {
        this.zzj = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final void setContentUrl(String str) {
        this.zzk = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContinuousPlayback(boolean z) {
        this.zzg = z ? zzeg.ON : zzeg.OFF;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setExtraParameter(String str, String str2) {
        if (this.zzb == null) {
            this.zzb = new HashMap();
        }
        this.zzb.put(str, str2);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setLiveStreamPrefetchSeconds(float f) {
        this.zzm = Float.valueOf(f);
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final void setSecureSignals(SecureSignals secureSignals) {
        this.zzn = secureSignals;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final void setUserRequestContext(Object obj) {
        this.zzo = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setVastLoadTimeout(float f) {
        this.zzl = Float.valueOf(f);
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseRequest
    public final zzgv zza() {
        return new zzgt(this.zza);
    }

    public final zzef zzb() {
        return this.zze;
    }

    public final zzeg zzc() {
        return this.zzg;
    }

    public final zzeh zzd() {
        return this.zzf;
    }

    public final Float zze() {
        return this.zzh;
    }

    public final Float zzf() {
        return this.zzm;
    }

    public final Float zzg() {
        return this.zzl;
    }

    public final String zzh() {
        return this.zzj;
    }

    public final List zzi() {
        return this.zzi;
    }
}
