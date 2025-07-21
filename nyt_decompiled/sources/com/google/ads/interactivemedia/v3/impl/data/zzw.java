package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.internal.zzeb;
import com.google.ads.interactivemedia.v3.internal.zzef;
import com.google.ads.interactivemedia.v3.internal.zzeg;
import com.google.ads.interactivemedia.v3.internal.zzeh;
import com.google.ads.interactivemedia.v3.internal.zzso;
import com.google.ads.interactivemedia.v3.internal.zzsr;

/* loaded from: classes2.dex */
final class zzw extends zzba {
    private final zzsr<String, String> adTagParameters;
    private final String adTagUrl;
    private final String adsResponse;
    private final String apiKey;
    private final String assetKey;
    private final String authToken;
    private final zzsr<String, String> companionSlots;
    private final zzaw consentSettings;
    private final Float contentDuration;
    private final zzso<String> contentKeywords;
    private final String contentSourceId;
    private final String contentSourceUrl;
    private final String contentTitle;
    private final String contentUrl;
    private final String customAssetKey;
    private final Boolean enableNonce;
    private final String env;
    private final zzsr<String, String> extraParameters;
    private final String format;
    private final zzbc identifierInfo;
    private final Boolean isAndroidTvAdsFramework;
    private final Boolean isTv;
    private final Integer linearAdSlotHeight;
    private final Integer linearAdSlotWidth;
    private final String liveStreamEventId;
    private final Float liveStreamPrefetchSeconds;
    private final zzeb marketAppInfo;
    private final String msParameter;
    private final String network;
    private final String networkCode;
    private final String oAuthToken;
    private final Boolean omidAdSessionsOnStartedOnly;
    private final zzsr<String, String> platformSignals;
    private final String projectNumber;
    private final String region;
    private final zzso<zzbo> secureSignals;
    private final ImaSdkSettings settings;
    private final String streamActivityMonitorId;
    private final Boolean supportsExternalNavigation;
    private final Boolean supportsIconClickFallback;
    private final Boolean supportsNativeNetworking;
    private final Boolean supportsResizing;
    private final Boolean useQAStreamBaseUrl;
    private final Boolean usesCustomVideoPlayback;
    private final Float vastLoadTimeout;
    private final zzeg videoContinuousPlay;
    private final zzbu videoEnvironment;
    private final String videoId;
    private final zzef videoPlayActivation;
    private final zzeh videoPlayMuted;

    private zzw(zzsr<String, String> zzsrVar, String str, String str2, String str3, String str4, String str5, zzsr<String, String> zzsrVar2, Float f, zzso<String> zzsoVar, String str6, String str7, String str8, String str9, zzaw zzawVar, String str10, Boolean bool, String str11, zzso<zzbo> zzsoVar2, zzsr<String, String> zzsrVar3, String str12, zzbc zzbcVar, Boolean bool2, Boolean bool3, Integer num, Integer num2, String str13, Float f2, zzeb zzebVar, String str14, String str15, zzbu zzbuVar, String str16, String str17, Boolean bool4, zzsr<String, String> zzsrVar4, String str18, String str19, ImaSdkSettings imaSdkSettings, Boolean bool5, Boolean bool6, Boolean bool7, String str20, Boolean bool8, Boolean bool9, Boolean bool10, Float f3, String str21, zzef zzefVar, zzeg zzegVar, zzeh zzehVar) {
        this.adTagParameters = zzsrVar;
        this.adTagUrl = str;
        this.adsResponse = str2;
        this.apiKey = str3;
        this.assetKey = str4;
        this.authToken = str5;
        this.companionSlots = zzsrVar2;
        this.contentDuration = f;
        this.contentKeywords = zzsoVar;
        this.contentSourceUrl = str6;
        this.contentTitle = str7;
        this.contentUrl = str8;
        this.contentSourceId = str9;
        this.consentSettings = zzawVar;
        this.customAssetKey = str10;
        this.enableNonce = bool;
        this.env = str11;
        this.secureSignals = zzsoVar2;
        this.extraParameters = zzsrVar3;
        this.format = str12;
        this.identifierInfo = zzbcVar;
        this.isTv = bool2;
        this.isAndroidTvAdsFramework = bool3;
        this.linearAdSlotWidth = num;
        this.linearAdSlotHeight = num2;
        this.liveStreamEventId = str13;
        this.liveStreamPrefetchSeconds = f2;
        this.marketAppInfo = zzebVar;
        this.msParameter = str14;
        this.network = str15;
        this.videoEnvironment = zzbuVar;
        this.networkCode = str16;
        this.oAuthToken = str17;
        this.omidAdSessionsOnStartedOnly = bool4;
        this.platformSignals = zzsrVar4;
        this.projectNumber = str18;
        this.region = str19;
        this.settings = imaSdkSettings;
        this.supportsExternalNavigation = bool5;
        this.supportsIconClickFallback = bool6;
        this.supportsNativeNetworking = bool7;
        this.streamActivityMonitorId = str20;
        this.supportsResizing = bool8;
        this.useQAStreamBaseUrl = bool9;
        this.usesCustomVideoPlayback = bool10;
        this.vastLoadTimeout = f3;
        this.videoId = str21;
        this.videoPlayActivation = zzefVar;
        this.videoContinuousPlay = zzegVar;
        this.videoPlayMuted = zzehVar;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzsr<String, String> adTagParameters() {
        return this.adTagParameters;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String adTagUrl() {
        return this.adTagUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String adsResponse() {
        return this.adsResponse;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String apiKey() {
        return this.apiKey;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String assetKey() {
        return this.assetKey;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String authToken() {
        return this.authToken;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzsr<String, String> companionSlots() {
        return this.companionSlots;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzaw consentSettings() {
        return this.consentSettings;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Float contentDuration() {
        return this.contentDuration;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzso<String> contentKeywords() {
        return this.contentKeywords;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String contentSourceId() {
        return this.contentSourceId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String contentSourceUrl() {
        return this.contentSourceUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String contentTitle() {
        return this.contentTitle;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String contentUrl() {
        return this.contentUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    String customAssetKey() {
        return this.customAssetKey;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Boolean enableNonce() {
        return this.enableNonce;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String env() {
        return this.env;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            zzsr<String, String> zzsrVar = this.adTagParameters;
            if (zzsrVar != null ? zzsrVar.equals(zzbaVar.adTagParameters()) : zzbaVar.adTagParameters() == null) {
                String str = this.adTagUrl;
                if (str != null ? str.equals(zzbaVar.adTagUrl()) : zzbaVar.adTagUrl() == null) {
                    String str2 = this.adsResponse;
                    if (str2 != null ? str2.equals(zzbaVar.adsResponse()) : zzbaVar.adsResponse() == null) {
                        String str3 = this.apiKey;
                        if (str3 != null ? str3.equals(zzbaVar.apiKey()) : zzbaVar.apiKey() == null) {
                            String str4 = this.assetKey;
                            if (str4 != null ? str4.equals(zzbaVar.assetKey()) : zzbaVar.assetKey() == null) {
                                String str5 = this.authToken;
                                if (str5 != null ? str5.equals(zzbaVar.authToken()) : zzbaVar.authToken() == null) {
                                    zzsr<String, String> zzsrVar2 = this.companionSlots;
                                    if (zzsrVar2 != null ? zzsrVar2.equals(zzbaVar.companionSlots()) : zzbaVar.companionSlots() == null) {
                                        Float f = this.contentDuration;
                                        if (f != null ? f.equals(zzbaVar.contentDuration()) : zzbaVar.contentDuration() == null) {
                                            zzso<String> zzsoVar = this.contentKeywords;
                                            if (zzsoVar != null ? zzsoVar.equals(zzbaVar.contentKeywords()) : zzbaVar.contentKeywords() == null) {
                                                String str6 = this.contentSourceUrl;
                                                if (str6 != null ? str6.equals(zzbaVar.contentSourceUrl()) : zzbaVar.contentSourceUrl() == null) {
                                                    String str7 = this.contentTitle;
                                                    if (str7 != null ? str7.equals(zzbaVar.contentTitle()) : zzbaVar.contentTitle() == null) {
                                                        String str8 = this.contentUrl;
                                                        if (str8 != null ? str8.equals(zzbaVar.contentUrl()) : zzbaVar.contentUrl() == null) {
                                                            String str9 = this.contentSourceId;
                                                            if (str9 != null ? str9.equals(zzbaVar.contentSourceId()) : zzbaVar.contentSourceId() == null) {
                                                                zzaw zzawVar = this.consentSettings;
                                                                if (zzawVar != null ? zzawVar.equals(zzbaVar.consentSettings()) : zzbaVar.consentSettings() == null) {
                                                                    String str10 = this.customAssetKey;
                                                                    if (str10 != null ? str10.equals(zzbaVar.customAssetKey()) : zzbaVar.customAssetKey() == null) {
                                                                        Boolean bool = this.enableNonce;
                                                                        if (bool != null ? bool.equals(zzbaVar.enableNonce()) : zzbaVar.enableNonce() == null) {
                                                                            String str11 = this.env;
                                                                            if (str11 != null ? str11.equals(zzbaVar.env()) : zzbaVar.env() == null) {
                                                                                zzso<zzbo> zzsoVar2 = this.secureSignals;
                                                                                if (zzsoVar2 != null ? zzsoVar2.equals(zzbaVar.secureSignals()) : zzbaVar.secureSignals() == null) {
                                                                                    zzsr<String, String> zzsrVar3 = this.extraParameters;
                                                                                    if (zzsrVar3 != null ? zzsrVar3.equals(zzbaVar.extraParameters()) : zzbaVar.extraParameters() == null) {
                                                                                        String str12 = this.format;
                                                                                        if (str12 != null ? str12.equals(zzbaVar.format()) : zzbaVar.format() == null) {
                                                                                            zzbc zzbcVar = this.identifierInfo;
                                                                                            if (zzbcVar != null ? zzbcVar.equals(zzbaVar.identifierInfo()) : zzbaVar.identifierInfo() == null) {
                                                                                                Boolean bool2 = this.isTv;
                                                                                                if (bool2 != null ? bool2.equals(zzbaVar.isTv()) : zzbaVar.isTv() == null) {
                                                                                                    Boolean bool3 = this.isAndroidTvAdsFramework;
                                                                                                    if (bool3 != null ? bool3.equals(zzbaVar.isAndroidTvAdsFramework()) : zzbaVar.isAndroidTvAdsFramework() == null) {
                                                                                                        Integer num = this.linearAdSlotWidth;
                                                                                                        if (num != null ? num.equals(zzbaVar.linearAdSlotWidth()) : zzbaVar.linearAdSlotWidth() == null) {
                                                                                                            Integer num2 = this.linearAdSlotHeight;
                                                                                                            if (num2 != null ? num2.equals(zzbaVar.linearAdSlotHeight()) : zzbaVar.linearAdSlotHeight() == null) {
                                                                                                                String str13 = this.liveStreamEventId;
                                                                                                                if (str13 != null ? str13.equals(zzbaVar.liveStreamEventId()) : zzbaVar.liveStreamEventId() == null) {
                                                                                                                    Float f2 = this.liveStreamPrefetchSeconds;
                                                                                                                    if (f2 != null ? f2.equals(zzbaVar.liveStreamPrefetchSeconds()) : zzbaVar.liveStreamPrefetchSeconds() == null) {
                                                                                                                        zzeb zzebVar = this.marketAppInfo;
                                                                                                                        if (zzebVar != null ? zzebVar.equals(zzbaVar.marketAppInfo()) : zzbaVar.marketAppInfo() == null) {
                                                                                                                            String str14 = this.msParameter;
                                                                                                                            if (str14 != null ? str14.equals(zzbaVar.msParameter()) : zzbaVar.msParameter() == null) {
                                                                                                                                String str15 = this.network;
                                                                                                                                if (str15 != null ? str15.equals(zzbaVar.network()) : zzbaVar.network() == null) {
                                                                                                                                    zzbu zzbuVar = this.videoEnvironment;
                                                                                                                                    if (zzbuVar != null ? zzbuVar.equals(zzbaVar.videoEnvironment()) : zzbaVar.videoEnvironment() == null) {
                                                                                                                                        String str16 = this.networkCode;
                                                                                                                                        if (str16 != null ? str16.equals(zzbaVar.networkCode()) : zzbaVar.networkCode() == null) {
                                                                                                                                            String str17 = this.oAuthToken;
                                                                                                                                            if (str17 != null ? str17.equals(zzbaVar.oAuthToken()) : zzbaVar.oAuthToken() == null) {
                                                                                                                                                Boolean bool4 = this.omidAdSessionsOnStartedOnly;
                                                                                                                                                if (bool4 != null ? bool4.equals(zzbaVar.omidAdSessionsOnStartedOnly()) : zzbaVar.omidAdSessionsOnStartedOnly() == null) {
                                                                                                                                                    zzsr<String, String> zzsrVar4 = this.platformSignals;
                                                                                                                                                    if (zzsrVar4 != null ? zzsrVar4.equals(zzbaVar.platformSignals()) : zzbaVar.platformSignals() == null) {
                                                                                                                                                        String str18 = this.projectNumber;
                                                                                                                                                        if (str18 != null ? str18.equals(zzbaVar.projectNumber()) : zzbaVar.projectNumber() == null) {
                                                                                                                                                            String str19 = this.region;
                                                                                                                                                            if (str19 != null ? str19.equals(zzbaVar.region()) : zzbaVar.region() == null) {
                                                                                                                                                                ImaSdkSettings imaSdkSettings = this.settings;
                                                                                                                                                                if (imaSdkSettings != null ? imaSdkSettings.equals(zzbaVar.settings()) : zzbaVar.settings() == null) {
                                                                                                                                                                    Boolean bool5 = this.supportsExternalNavigation;
                                                                                                                                                                    if (bool5 != null ? bool5.equals(zzbaVar.supportsExternalNavigation()) : zzbaVar.supportsExternalNavigation() == null) {
                                                                                                                                                                        Boolean bool6 = this.supportsIconClickFallback;
                                                                                                                                                                        if (bool6 != null ? bool6.equals(zzbaVar.supportsIconClickFallback()) : zzbaVar.supportsIconClickFallback() == null) {
                                                                                                                                                                            Boolean bool7 = this.supportsNativeNetworking;
                                                                                                                                                                            if (bool7 != null ? bool7.equals(zzbaVar.supportsNativeNetworking()) : zzbaVar.supportsNativeNetworking() == null) {
                                                                                                                                                                                String str20 = this.streamActivityMonitorId;
                                                                                                                                                                                if (str20 != null ? str20.equals(zzbaVar.streamActivityMonitorId()) : zzbaVar.streamActivityMonitorId() == null) {
                                                                                                                                                                                    Boolean bool8 = this.supportsResizing;
                                                                                                                                                                                    if (bool8 != null ? bool8.equals(zzbaVar.supportsResizing()) : zzbaVar.supportsResizing() == null) {
                                                                                                                                                                                        Boolean bool9 = this.useQAStreamBaseUrl;
                                                                                                                                                                                        if (bool9 != null ? bool9.equals(zzbaVar.useQAStreamBaseUrl()) : zzbaVar.useQAStreamBaseUrl() == null) {
                                                                                                                                                                                            Boolean bool10 = this.usesCustomVideoPlayback;
                                                                                                                                                                                            if (bool10 != null ? bool10.equals(zzbaVar.usesCustomVideoPlayback()) : zzbaVar.usesCustomVideoPlayback() == null) {
                                                                                                                                                                                                Float f3 = this.vastLoadTimeout;
                                                                                                                                                                                                if (f3 != null ? f3.equals(zzbaVar.vastLoadTimeout()) : zzbaVar.vastLoadTimeout() == null) {
                                                                                                                                                                                                    String str21 = this.videoId;
                                                                                                                                                                                                    if (str21 != null ? str21.equals(zzbaVar.videoId()) : zzbaVar.videoId() == null) {
                                                                                                                                                                                                        zzef zzefVar = this.videoPlayActivation;
                                                                                                                                                                                                        if (zzefVar != null ? zzefVar.equals(zzbaVar.videoPlayActivation()) : zzbaVar.videoPlayActivation() == null) {
                                                                                                                                                                                                            zzeg zzegVar = this.videoContinuousPlay;
                                                                                                                                                                                                            if (zzegVar != null ? zzegVar.equals(zzbaVar.videoContinuousPlay()) : zzbaVar.videoContinuousPlay() == null) {
                                                                                                                                                                                                                zzeh zzehVar = this.videoPlayMuted;
                                                                                                                                                                                                                if (zzehVar != null ? zzehVar.equals(zzbaVar.videoPlayMuted()) : zzbaVar.videoPlayMuted() == null) {
                                                                                                                                                                                                                    return true;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzsr<String, String> extraParameters() {
        return this.extraParameters;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String format() {
        return this.format;
    }

    public int hashCode() {
        zzsr<String, String> zzsrVar = this.adTagParameters;
        int hashCode = zzsrVar == null ? 0 : zzsrVar.hashCode();
        String str = this.adTagUrl;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int i = hashCode ^ 1000003;
        String str2 = this.adsResponse;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.apiKey;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.assetKey;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.authToken;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        zzsr<String, String> zzsrVar2 = this.companionSlots;
        int hashCode7 = (hashCode6 ^ (zzsrVar2 == null ? 0 : zzsrVar2.hashCode())) * 1000003;
        Float f = this.contentDuration;
        int hashCode8 = (hashCode7 ^ (f == null ? 0 : f.hashCode())) * 1000003;
        zzso<String> zzsoVar = this.contentKeywords;
        int hashCode9 = (hashCode8 ^ (zzsoVar == null ? 0 : zzsoVar.hashCode())) * 1000003;
        String str6 = this.contentSourceUrl;
        int hashCode10 = (hashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.contentTitle;
        int hashCode11 = (hashCode10 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.contentUrl;
        int hashCode12 = (hashCode11 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.contentSourceId;
        int hashCode13 = (hashCode12 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        zzaw zzawVar = this.consentSettings;
        int hashCode14 = (hashCode13 ^ (zzawVar == null ? 0 : zzawVar.hashCode())) * 1000003;
        String str10 = this.customAssetKey;
        int hashCode15 = (hashCode14 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        Boolean bool = this.enableNonce;
        int hashCode16 = (hashCode15 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        String str11 = this.env;
        int hashCode17 = (hashCode16 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
        zzso<zzbo> zzsoVar2 = this.secureSignals;
        int hashCode18 = (hashCode17 ^ (zzsoVar2 == null ? 0 : zzsoVar2.hashCode())) * 1000003;
        zzsr<String, String> zzsrVar3 = this.extraParameters;
        int hashCode19 = (hashCode18 ^ (zzsrVar3 == null ? 0 : zzsrVar3.hashCode())) * 1000003;
        String str12 = this.format;
        int hashCode20 = (hashCode19 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
        zzbc zzbcVar = this.identifierInfo;
        int hashCode21 = (hashCode20 ^ (zzbcVar == null ? 0 : zzbcVar.hashCode())) * 1000003;
        Boolean bool2 = this.isTv;
        int hashCode22 = (hashCode21 ^ (bool2 == null ? 0 : bool2.hashCode())) * 1000003;
        Boolean bool3 = this.isAndroidTvAdsFramework;
        int hashCode23 = (hashCode22 ^ (bool3 == null ? 0 : bool3.hashCode())) * 1000003;
        Integer num = this.linearAdSlotWidth;
        int hashCode24 = (hashCode23 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.linearAdSlotHeight;
        int hashCode25 = (hashCode24 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str13 = this.liveStreamEventId;
        int hashCode26 = (hashCode25 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
        Float f2 = this.liveStreamPrefetchSeconds;
        int hashCode27 = (hashCode26 ^ (f2 == null ? 0 : f2.hashCode())) * 1000003;
        zzeb zzebVar = this.marketAppInfo;
        int hashCode28 = (hashCode27 ^ (zzebVar == null ? 0 : zzebVar.hashCode())) * 1000003;
        String str14 = this.msParameter;
        int hashCode29 = (hashCode28 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
        String str15 = this.network;
        int hashCode30 = (hashCode29 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
        zzbu zzbuVar = this.videoEnvironment;
        int hashCode31 = (hashCode30 ^ (zzbuVar == null ? 0 : zzbuVar.hashCode())) * 1000003;
        String str16 = this.networkCode;
        int hashCode32 = (hashCode31 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
        String str17 = this.oAuthToken;
        int hashCode33 = (hashCode32 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
        Boolean bool4 = this.omidAdSessionsOnStartedOnly;
        int hashCode34 = (hashCode33 ^ (bool4 == null ? 0 : bool4.hashCode())) * 1000003;
        zzsr<String, String> zzsrVar4 = this.platformSignals;
        int hashCode35 = (hashCode34 ^ (zzsrVar4 == null ? 0 : zzsrVar4.hashCode())) * 1000003;
        String str18 = this.projectNumber;
        int hashCode36 = (hashCode35 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
        String str19 = this.region;
        int hashCode37 = (hashCode36 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
        ImaSdkSettings imaSdkSettings = this.settings;
        int hashCode38 = (hashCode37 ^ (imaSdkSettings == null ? 0 : imaSdkSettings.hashCode())) * 1000003;
        Boolean bool5 = this.supportsExternalNavigation;
        int hashCode39 = (hashCode38 ^ (bool5 == null ? 0 : bool5.hashCode())) * 1000003;
        Boolean bool6 = this.supportsIconClickFallback;
        int hashCode40 = (hashCode39 ^ (bool6 == null ? 0 : bool6.hashCode())) * 1000003;
        Boolean bool7 = this.supportsNativeNetworking;
        int hashCode41 = (hashCode40 ^ (bool7 == null ? 0 : bool7.hashCode())) * 1000003;
        String str20 = this.streamActivityMonitorId;
        int hashCode42 = (hashCode41 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
        Boolean bool8 = this.supportsResizing;
        int hashCode43 = (hashCode42 ^ (bool8 == null ? 0 : bool8.hashCode())) * 1000003;
        Boolean bool9 = this.useQAStreamBaseUrl;
        int hashCode44 = (hashCode43 ^ (bool9 == null ? 0 : bool9.hashCode())) * 1000003;
        Boolean bool10 = this.usesCustomVideoPlayback;
        int hashCode45 = (hashCode44 ^ (bool10 == null ? 0 : bool10.hashCode())) * 1000003;
        Float f3 = this.vastLoadTimeout;
        int hashCode46 = (hashCode45 ^ (f3 == null ? 0 : f3.hashCode())) * 1000003;
        String str21 = this.videoId;
        int hashCode47 = (hashCode46 ^ (str21 == null ? 0 : str21.hashCode())) * 1000003;
        zzef zzefVar = this.videoPlayActivation;
        int hashCode48 = (hashCode47 ^ (zzefVar == null ? 0 : zzefVar.hashCode())) * 1000003;
        zzeg zzegVar = this.videoContinuousPlay;
        int hashCode49 = (hashCode48 ^ (zzegVar == null ? 0 : zzegVar.hashCode())) * 1000003;
        zzeh zzehVar = this.videoPlayMuted;
        return hashCode49 ^ (zzehVar != null ? zzehVar.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzbc identifierInfo() {
        return this.identifierInfo;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Boolean isAndroidTvAdsFramework() {
        return this.isAndroidTvAdsFramework;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Boolean isTv() {
        return this.isTv;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Integer linearAdSlotHeight() {
        return this.linearAdSlotHeight;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Integer linearAdSlotWidth() {
        return this.linearAdSlotWidth;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String liveStreamEventId() {
        return this.liveStreamEventId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Float liveStreamPrefetchSeconds() {
        return this.liveStreamPrefetchSeconds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzeb marketAppInfo() {
        return this.marketAppInfo;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String msParameter() {
        return this.msParameter;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String network() {
        return this.network;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String networkCode() {
        return this.networkCode;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String oAuthToken() {
        return this.oAuthToken;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Boolean omidAdSessionsOnStartedOnly() {
        return this.omidAdSessionsOnStartedOnly;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzsr<String, String> platformSignals() {
        return this.platformSignals;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String projectNumber() {
        return this.projectNumber;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String region() {
        return this.region;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzso<zzbo> secureSignals() {
        return this.secureSignals;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public ImaSdkSettings settings() {
        return this.settings;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String streamActivityMonitorId() {
        return this.streamActivityMonitorId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Boolean supportsExternalNavigation() {
        return this.supportsExternalNavigation;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Boolean supportsIconClickFallback() {
        return this.supportsIconClickFallback;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Boolean supportsNativeNetworking() {
        return this.supportsNativeNetworking;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Boolean supportsResizing() {
        return this.supportsResizing;
    }

    public String toString() {
        return "GsonAdsRequest{adTagParameters=" + String.valueOf(this.adTagParameters) + ", adTagUrl=" + this.adTagUrl + ", adsResponse=" + this.adsResponse + ", apiKey=" + this.apiKey + ", assetKey=" + this.assetKey + ", authToken=" + this.authToken + ", companionSlots=" + String.valueOf(this.companionSlots) + ", contentDuration=" + this.contentDuration + ", contentKeywords=" + String.valueOf(this.contentKeywords) + ", contentSourceUrl=" + this.contentSourceUrl + ", contentTitle=" + this.contentTitle + ", contentUrl=" + this.contentUrl + ", contentSourceId=" + this.contentSourceId + ", consentSettings=" + String.valueOf(this.consentSettings) + ", customAssetKey=" + this.customAssetKey + ", enableNonce=" + this.enableNonce + ", env=" + this.env + ", secureSignals=" + String.valueOf(this.secureSignals) + ", extraParameters=" + String.valueOf(this.extraParameters) + ", format=" + this.format + ", identifierInfo=" + String.valueOf(this.identifierInfo) + ", isTv=" + this.isTv + ", isAndroidTvAdsFramework=" + this.isAndroidTvAdsFramework + ", linearAdSlotWidth=" + this.linearAdSlotWidth + ", linearAdSlotHeight=" + this.linearAdSlotHeight + ", liveStreamEventId=" + this.liveStreamEventId + ", liveStreamPrefetchSeconds=" + this.liveStreamPrefetchSeconds + ", marketAppInfo=" + String.valueOf(this.marketAppInfo) + ", msParameter=" + this.msParameter + ", network=" + this.network + ", videoEnvironment=" + String.valueOf(this.videoEnvironment) + ", networkCode=" + this.networkCode + ", oAuthToken=" + this.oAuthToken + ", omidAdSessionsOnStartedOnly=" + this.omidAdSessionsOnStartedOnly + ", platformSignals=" + String.valueOf(this.platformSignals) + ", projectNumber=" + this.projectNumber + ", region=" + this.region + ", settings=" + String.valueOf(this.settings) + ", supportsExternalNavigation=" + this.supportsExternalNavigation + ", supportsIconClickFallback=" + this.supportsIconClickFallback + ", supportsNativeNetworking=" + this.supportsNativeNetworking + ", streamActivityMonitorId=" + this.streamActivityMonitorId + ", supportsResizing=" + this.supportsResizing + ", useQAStreamBaseUrl=" + this.useQAStreamBaseUrl + ", usesCustomVideoPlayback=" + this.usesCustomVideoPlayback + ", vastLoadTimeout=" + this.vastLoadTimeout + ", videoId=" + this.videoId + ", videoPlayActivation=" + String.valueOf(this.videoPlayActivation) + ", videoContinuousPlay=" + String.valueOf(this.videoContinuousPlay) + ", videoPlayMuted=" + String.valueOf(this.videoPlayMuted) + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Boolean useQAStreamBaseUrl() {
        return this.useQAStreamBaseUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Boolean usesCustomVideoPlayback() {
        return this.usesCustomVideoPlayback;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public Float vastLoadTimeout() {
        return this.vastLoadTimeout;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzeg videoContinuousPlay() {
        return this.videoContinuousPlay;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzbu videoEnvironment() {
        return this.videoEnvironment;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public String videoId() {
        return this.videoId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzef videoPlayActivation() {
        return this.videoPlayActivation;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzba
    public zzeh videoPlayMuted() {
        return this.videoPlayMuted;
    }
}
