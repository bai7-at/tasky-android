package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.internal.zzeb;
import com.google.ads.interactivemedia.v3.internal.zzef;
import com.google.ads.interactivemedia.v3.internal.zzeg;
import com.google.ads.interactivemedia.v3.internal.zzeh;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface zzaz {
    zzaz adTagParameters(Map<String, String> map);

    zzaz adTagUrl(String str);

    zzaz adsResponse(String str);

    zzaz apiKey(String str);

    zzaz assetKey(String str);

    zzaz authToken(String str);

    zzba build();

    zzaz companionSlots(Map<String, String> map);

    zzaz consentSettings(zzaw zzawVar);

    zzaz contentDuration(Float f);

    zzaz contentKeywords(List<String> list);

    zzaz contentSourceId(String str);

    zzaz contentSourceUrl(String str);

    zzaz contentTitle(String str);

    zzaz contentUrl(String str);

    zzaz customAssetKey(String str);

    zzaz enableNonce(Boolean bool);

    zzaz env(String str);

    zzaz extraParameters(Map<String, String> map);

    zzaz format(String str);

    zzaz identifierInfo(zzbc zzbcVar);

    zzaz isAndroidTvAdsFramework(Boolean bool);

    zzaz isTv(Boolean bool);

    zzaz linearAdSlotHeight(Integer num);

    zzaz linearAdSlotWidth(Integer num);

    zzaz liveStreamEventId(String str);

    zzaz liveStreamPrefetchSeconds(Float f);

    zzaz marketAppInfo(zzeb zzebVar);

    zzaz msParameter(String str);

    zzaz network(String str);

    zzaz networkCode(String str);

    zzaz oAuthToken(String str);

    zzaz omidAdSessionsOnStartedOnly(Boolean bool);

    zzaz platformSignals(Map<String, String> map);

    zzaz projectNumber(String str);

    zzaz region(String str);

    zzaz secureSignals(List<zzbo> list);

    zzaz settings(ImaSdkSettings imaSdkSettings);

    zzaz streamActivityMonitorId(String str);

    zzaz supportsExternalNavigation(Boolean bool);

    zzaz supportsIconClickFallback(Boolean bool);

    zzaz supportsNativeNetworking(Boolean bool);

    zzaz supportsResizing(Boolean bool);

    zzaz useQAStreamBaseUrl(Boolean bool);

    zzaz usesCustomVideoPlayback(Boolean bool);

    zzaz vastLoadTimeout(Float f);

    zzaz videoContinuousPlay(zzeg zzegVar);

    zzaz videoEnvironment(zzbu zzbuVar);

    zzaz videoId(String str);

    zzaz videoPlayActivation(zzef zzefVar);

    zzaz videoPlayMuted(zzeh zzehVar);
}
