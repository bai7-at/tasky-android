package com.google.ads.interactivemedia.v3.api;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer;
import com.google.ads.interactivemedia.v3.impl.data.zzax;
import com.google.ads.interactivemedia.v3.impl.data.zzay;
import com.google.ads.interactivemedia.v3.impl.data.zze;
import com.google.ads.interactivemedia.v3.internal.zzdk;
import com.google.ads.interactivemedia.v3.internal.zzec;
import com.google.ads.interactivemedia.v3.internal.zzei;
import com.google.ads.interactivemedia.v3.internal.zzek;
import com.google.ads.interactivemedia.v3.internal.zzeq;
import com.google.ads.interactivemedia.v3.internal.zzey;
import com.google.ads.interactivemedia.v3.internal.zzez;
import com.google.ads.interactivemedia.v3.internal.zzgi;
import com.google.ads.interactivemedia.v3.internal.zzgk;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class ImaSdkFactory {
    private static ImaSdkFactory zza;

    private ImaSdkFactory() {
    }

    @KeepForSdk
    private AdsLoader createAdsLoader(Context context, Uri uri, BaseDisplayContainer baseDisplayContainer, ImaSdkSettings imaSdkSettings) {
        if (uri == null) {
            uri = zza(imaSdkSettings);
        }
        zzec zzecVar = new zzec(context, uri, imaSdkSettings, baseDisplayContainer, Executors.newCachedThreadPool());
        zzecVar.zzq();
        return zzecVar;
    }

    public static ImaSdkFactory getInstance() {
        if (zza == null) {
            zza = new ImaSdkFactory();
        }
        return zza;
    }

    private static final Uri zza(ImaSdkSettings imaSdkSettings) {
        return (imaSdkSettings == null || !imaSdkSettings.isDebugMode()) ? zzey.zza : zzey.zzb;
    }

    @Deprecated
    public AdDisplayContainer createAdDisplayContainer() {
        return new zzdk(null, null);
    }

    public AdsRenderingSettings createAdsRenderingSettings() {
        return new zze();
    }

    public AdsRequest createAdsRequest() {
        return new zzei();
    }

    @Deprecated
    public AdDisplayContainer createAudioAdDisplayContainer(Context context) {
        context.getClass();
        return new zzek(context, null);
    }

    public CompanionAdSlot createCompanionAdSlot() {
        return new zzeq();
    }

    public FriendlyObstruction createFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        zzax builder = zzay.builder();
        builder.view(view);
        builder.purpose(friendlyObstructionPurpose);
        builder.detailedReason(str);
        return builder.build();
    }

    public ImaSdkSettings createImaSdkSettings() {
        return new zzez();
    }

    public StreamRequest createLiveStreamRequest(String str, String str2) {
        zzgk zzgkVar = new zzgk();
        zzgkVar.zzd(str);
        zzgkVar.zzc(str2);
        return zzgkVar;
    }

    public StreamRequest createPodStreamRequest(String str, String str2, String str3) {
        zzgk zzgkVar = new zzgk();
        zzgkVar.zzi(str);
        zzgkVar.zzg(str2);
        zzgkVar.zzc(str3);
        return zzgkVar;
    }

    @Deprecated
    public StreamDisplayContainer createStreamDisplayContainer() {
        return new zzgi(null, null);
    }

    public StreamRequest createVideoStitcherLiveStreamRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        zzgk zzgkVar = new zzgk();
        zzgkVar.zzi(str);
        zzgkVar.zzg(str2);
        zzgkVar.zzh(str3);
        zzgkVar.zzl(str4);
        zzgkVar.zzk(str5);
        zzgkVar.zzj(str6);
        return zzgkVar;
    }

    public StreamRequest createVideoStitcherVodStreamRequest(String str, String str2, String str3, String str4, String str5, String str6) {
        zzgk zzgkVar = new zzgk();
        zzgkVar.zzf(str);
        zzgkVar.zzi(str2);
        zzgkVar.zzl(str3);
        zzgkVar.zzk(str4);
        zzgkVar.zzj(str5);
        zzgkVar.zzb(str6);
        return zzgkVar;
    }

    public StreamRequest createVodStreamRequest(String str, String str2, String str3) {
        zzgk zzgkVar = new zzgk();
        zzgkVar.zze(str);
        zzgkVar.zzm(str2);
        zzgkVar.zzc(str3);
        return zzgkVar;
    }

    public static AdDisplayContainer createAdDisplayContainer(ViewGroup viewGroup, VideoAdPlayer videoAdPlayer) {
        viewGroup.getClass();
        videoAdPlayer.getClass();
        return new zzdk(viewGroup, videoAdPlayer);
    }

    public static StreamDisplayContainer createStreamDisplayContainer(ViewGroup viewGroup, VideoStreamPlayer videoStreamPlayer) {
        viewGroup.getClass();
        videoStreamPlayer.getClass();
        return new zzgi(viewGroup, videoStreamPlayer);
    }

    public static AdDisplayContainer createAudioAdDisplayContainer(Context context, VideoAdPlayer videoAdPlayer) {
        context.getClass();
        videoAdPlayer.getClass();
        return new zzek(context, videoAdPlayer);
    }

    public AdsLoader createAdsLoader(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer) {
        zzec zzecVar = new zzec(context, zza(imaSdkSettings), imaSdkSettings, adDisplayContainer, Executors.newCachedThreadPool());
        zzecVar.zzq();
        return zzecVar;
    }

    public AdsLoader createAdsLoader(Context context, ImaSdkSettings imaSdkSettings, StreamDisplayContainer streamDisplayContainer) {
        zzec zzecVar = new zzec(context, zza(imaSdkSettings), imaSdkSettings, streamDisplayContainer, Executors.newCachedThreadPool());
        zzecVar.zzq();
        return zzecVar;
    }
}
