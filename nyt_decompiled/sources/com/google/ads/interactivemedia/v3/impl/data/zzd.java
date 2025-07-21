package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.internal.zzqy;
import com.google.ads.interactivemedia.v3.internal.zzso;
import com.google.ads.interactivemedia.v3.internal.zzst;

@zzqy(zza = zzk.class)
/* loaded from: classes2.dex */
public abstract class zzd {
    public static zzc builder(AdsRenderingSettings adsRenderingSettings) {
        zze zzeVar = (zze) adsRenderingSettings;
        zzi zziVar = new zzi();
        zziVar.setBitrate(zzeVar.getBitrateKbps());
        zziVar.setDisableUi(zzeVar.getDisableUi());
        zziVar.setEnablePreloading(zzeVar.getEnablePreloading());
        zziVar.setEnableFocusSkipButton(zzeVar.getFocusSkipButtonWhenAvailable());
        zziVar.setLoadVideoTimeout(zzeVar.getLoadVideoTimeout());
        zziVar.setMimeTypes(zzeVar.getMimeTypes());
        zziVar.setPlayAdsAfterTime(zzeVar.getPlayAdsAfterTime());
        zziVar.setUiElements(zzeVar.getUiElements());
        return zziVar;
    }

    public abstract int bitrate();

    public abstract boolean disableUi();

    public abstract boolean enableFocusSkipButton();

    public abstract boolean enablePreloading();

    public abstract int loadVideoTimeout();

    public abstract zzso<String> mimeTypes();

    public abstract double playAdsAfterTime();

    public abstract zzst<UiElement> uiElements();
}
