package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.internal.zzeb;
import com.google.ads.interactivemedia.v3.internal.zzef;
import com.google.ads.interactivemedia.v3.internal.zzeg;
import com.google.ads.interactivemedia.v3.internal.zzeh;
import com.google.ads.interactivemedia.v3.internal.zzso;
import com.google.ads.interactivemedia.v3.internal.zzsr;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzu implements zzaz {
    private zzsr<String, String> adTagParameters;
    private String adTagUrl;
    private String adsResponse;
    private String apiKey;
    private String assetKey;
    private String authToken;
    private zzsr<String, String> companionSlots;
    private zzaw consentSettings;
    private Float contentDuration;
    private zzso<String> contentKeywords;
    private String contentSourceId;
    private String contentSourceUrl;
    private String contentTitle;
    private String contentUrl;
    private String customAssetKey;
    private Boolean enableNonce;
    private String env;
    private zzsr<String, String> extraParameters;
    private String format;
    private zzbc identifierInfo;
    private Boolean isAndroidTvAdsFramework;
    private Boolean isTv;
    private Integer linearAdSlotHeight;
    private Integer linearAdSlotWidth;
    private String liveStreamEventId;
    private Float liveStreamPrefetchSeconds;
    private zzeb marketAppInfo;
    private String msParameter;
    private String network;
    private String networkCode;
    private String oAuthToken;
    private Boolean omidAdSessionsOnStartedOnly;
    private zzsr<String, String> platformSignals;
    private String projectNumber;
    private String region;
    private zzso<zzbo> secureSignals;
    private ImaSdkSettings settings;
    private String streamActivityMonitorId;
    private Boolean supportsExternalNavigation;
    private Boolean supportsIconClickFallback;
    private Boolean supportsNativeNetworking;
    private Boolean supportsResizing;
    private Boolean useQAStreamBaseUrl;
    private Boolean usesCustomVideoPlayback;
    private Float vastLoadTimeout;
    private zzeg videoContinuousPlay;
    private zzbu videoEnvironment;
    private String videoId;
    private zzef videoPlayActivation;
    private zzeh videoPlayMuted;

    zzu() {
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz adTagParameters(Map<String, String> map) {
        this.adTagParameters = map == null ? null : zzsr.zzc(map);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz adTagUrl(String str) {
        this.adTagUrl = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz adsResponse(String str) {
        this.adsResponse = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz apiKey(String str) {
        this.apiKey = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz assetKey(String str) {
        this.assetKey = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz authToken(String str) {
        this.authToken = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzba build() {
        return new zzw(this.adTagParameters, this.adTagUrl, this.adsResponse, this.apiKey, this.assetKey, this.authToken, this.companionSlots, this.contentDuration, this.contentKeywords, this.contentSourceUrl, this.contentTitle, this.contentUrl, this.contentSourceId, this.consentSettings, this.customAssetKey, this.enableNonce, this.env, this.secureSignals, this.extraParameters, this.format, this.identifierInfo, this.isTv, this.isAndroidTvAdsFramework, this.linearAdSlotWidth, this.linearAdSlotHeight, this.liveStreamEventId, this.liveStreamPrefetchSeconds, this.marketAppInfo, this.msParameter, this.network, this.videoEnvironment, this.networkCode, this.oAuthToken, this.omidAdSessionsOnStartedOnly, this.platformSignals, this.projectNumber, this.region, this.settings, this.supportsExternalNavigation, this.supportsIconClickFallback, this.supportsNativeNetworking, this.streamActivityMonitorId, this.supportsResizing, this.useQAStreamBaseUrl, this.usesCustomVideoPlayback, this.vastLoadTimeout, this.videoId, this.videoPlayActivation, this.videoContinuousPlay, this.videoPlayMuted);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz companionSlots(Map<String, String> map) {
        this.companionSlots = map == null ? null : zzsr.zzc(map);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz consentSettings(zzaw zzawVar) {
        this.consentSettings = zzawVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz contentDuration(Float f) {
        this.contentDuration = f;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz contentKeywords(List<String> list) {
        this.contentKeywords = list == null ? null : zzso.zzk(list);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz contentSourceId(String str) {
        this.contentSourceId = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz contentSourceUrl(String str) {
        this.contentSourceUrl = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz contentTitle(String str) {
        this.contentTitle = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz contentUrl(String str) {
        this.contentUrl = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz customAssetKey(String str) {
        this.customAssetKey = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz enableNonce(Boolean bool) {
        this.enableNonce = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz env(String str) {
        this.env = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz extraParameters(Map<String, String> map) {
        this.extraParameters = map == null ? null : zzsr.zzc(map);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz format(String str) {
        this.format = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz identifierInfo(zzbc zzbcVar) {
        this.identifierInfo = zzbcVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz isAndroidTvAdsFramework(Boolean bool) {
        this.isAndroidTvAdsFramework = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz isTv(Boolean bool) {
        this.isTv = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz linearAdSlotHeight(Integer num) {
        this.linearAdSlotHeight = num;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz linearAdSlotWidth(Integer num) {
        this.linearAdSlotWidth = num;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz liveStreamEventId(String str) {
        this.liveStreamEventId = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz liveStreamPrefetchSeconds(Float f) {
        this.liveStreamPrefetchSeconds = f;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz marketAppInfo(zzeb zzebVar) {
        this.marketAppInfo = zzebVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz msParameter(String str) {
        this.msParameter = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz network(String str) {
        this.network = "android:0";
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz networkCode(String str) {
        this.networkCode = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz oAuthToken(String str) {
        this.oAuthToken = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz omidAdSessionsOnStartedOnly(Boolean bool) {
        this.omidAdSessionsOnStartedOnly = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz platformSignals(Map<String, String> map) {
        this.platformSignals = map == null ? null : zzsr.zzc(map);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz projectNumber(String str) {
        this.projectNumber = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz region(String str) {
        this.region = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz secureSignals(List<zzbo> list) {
        this.secureSignals = list == null ? null : zzso.zzk(list);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz settings(ImaSdkSettings imaSdkSettings) {
        this.settings = imaSdkSettings;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz streamActivityMonitorId(String str) {
        this.streamActivityMonitorId = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz supportsExternalNavigation(Boolean bool) {
        this.supportsExternalNavigation = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz supportsIconClickFallback(Boolean bool) {
        this.supportsIconClickFallback = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz supportsNativeNetworking(Boolean bool) {
        this.supportsNativeNetworking = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz supportsResizing(Boolean bool) {
        this.supportsResizing = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz useQAStreamBaseUrl(Boolean bool) {
        this.useQAStreamBaseUrl = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz usesCustomVideoPlayback(Boolean bool) {
        this.usesCustomVideoPlayback = bool;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz vastLoadTimeout(Float f) {
        this.vastLoadTimeout = f;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz videoContinuousPlay(zzeg zzegVar) {
        this.videoContinuousPlay = zzegVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz videoEnvironment(zzbu zzbuVar) {
        this.videoEnvironment = zzbuVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz videoId(String str) {
        this.videoId = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz videoPlayActivation(zzef zzefVar) {
        this.videoPlayActivation = zzefVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzaz
    public zzaz videoPlayMuted(zzeh zzehVar) {
        this.videoPlayMuted = zzehVar;
        return this;
    }
}
