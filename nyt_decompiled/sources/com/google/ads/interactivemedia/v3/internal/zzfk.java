package com.google.ads.interactivemedia.v3.internal;

import android.view.ViewGroup;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import com.google.ads.interactivemedia.v3.impl.data.ResizeAndPositionVideoMsgData;

/* loaded from: classes2.dex */
public interface zzfk {
    void zzb(zzfj zzfjVar);

    void zzd(AdError.AdErrorType adErrorType, int i, String str);

    void zze(AdError.AdErrorType adErrorType, AdError.AdErrorCode adErrorCode, String str);

    void zzh(String str);

    void zzi(ViewGroup viewGroup, CompanionData companionData, String str, CompanionAdSlot companionAdSlot, zzfm zzfmVar, zzha zzhaVar);

    void zzj(ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData);

    void zzk();
}
