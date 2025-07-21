package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.Ad;
import com.google.ads.interactivemedia.v3.api.AdPodInfo;
import com.google.ads.interactivemedia.v3.api.CompanionAd;
import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.api.UniversalAdId;
import com.google.ads.interactivemedia.v3.internal.zzaie;
import com.google.ads.interactivemedia.v3.internal.zzaif;
import com.google.ads.interactivemedia.v3.internal.zzaig;
import com.google.ads.interactivemedia.v3.internal.zzaih;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@KeepForSdk
/* loaded from: classes2.dex */
public class AdImpl implements Ad {
    private String adId;
    private String adSystem;

    @zzaif
    @zzaih
    private String[] adWrapperCreativeIds;

    @zzaif
    @zzaih
    private String[] adWrapperIds;

    @zzaif
    @zzaih
    private String[] adWrapperSystems;
    private String advertiserName;
    private String clickThroughUrl;

    @zzaif
    @zzaih
    private List<CompanionAdImpl> companions;
    private String contentType;
    private String creativeAdId;
    private String creativeId;
    private String dealId;
    private String description;
    private boolean disableUi;
    private double duration;
    private int height;
    private String surveyUrl;
    private String title;
    private String traffickingParameters;

    @zzaif
    @zzaih
    private Set<UiElement> uiElements;
    private String universalAdIdRegistry;
    private String universalAdIdValue;

    @zzaif
    @zzaih
    private UniversalAdIdImpl[] universalAdIds;
    private int vastMediaBitrate;
    private int vastMediaHeight;
    private int vastMediaWidth;
    private int width;
    private boolean linear = false;
    private boolean skippable = false;
    private double skipTimeOffset = -1.0d;

    @zzaif
    @zzaih
    private AdPodInfoImpl adPodInfo = new AdPodInfoImpl();

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return zzaie.zzf(this, obj, false, null, false, "vastMediaBitrate", "vastMediaHeight", "vastMediaWidth");
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getAdId() {
        return this.adId;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public AdPodInfo getAdPodInfo() {
        return this.adPodInfo;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getAdSystem() {
        return this.adSystem;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String[] getAdWrapperCreativeIds() {
        return this.adWrapperCreativeIds;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String[] getAdWrapperIds() {
        return this.adWrapperIds;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String[] getAdWrapperSystems() {
        return this.adWrapperSystems;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getAdvertiserName() {
        return this.advertiserName;
    }

    @KeepForSdk
    public String getClickThruUrl() {
        return this.clickThroughUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public List<CompanionAd> getCompanionAds() {
        ArrayList arrayList = new ArrayList();
        List<CompanionAdImpl> list = this.companions;
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getContentType() {
        return this.contentType;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getCreativeAdId() {
        return this.creativeAdId;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getCreativeId() {
        return this.creativeId;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getDealId() {
        return this.dealId;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getDescription() {
        return this.description;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public double getDuration() {
        return this.duration;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public int getHeight() {
        return this.height;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public double getSkipTimeOffset() {
        return this.skipTimeOffset;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getSurveyUrl() {
        return this.surveyUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getTitle() {
        return this.title;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getTraffickingParameters() {
        return this.traffickingParameters;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public Set<UiElement> getUiElements() {
        return this.uiElements;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getUniversalAdIdRegistry() {
        return this.universalAdIdRegistry;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public String getUniversalAdIdValue() {
        return this.universalAdIdValue;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public UniversalAdId[] getUniversalAdIds() {
        return this.universalAdIds;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public int getVastMediaBitrate() {
        return this.vastMediaBitrate;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public int getVastMediaHeight() {
        return this.vastMediaHeight;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public int getVastMediaWidth() {
        return this.vastMediaWidth;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return zzaig.zza(this, new String[0]);
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public boolean isLinear() {
        return this.linear;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public boolean isSkippable() {
        return this.skippable;
    }

    @Override // com.google.ads.interactivemedia.v3.api.Ad
    public boolean isUiDisabled() {
        return this.disableUi;
    }

    @KeepForSdk
    public void setAdId(String str) {
        this.adId = str;
    }

    @KeepForSdk
    public void setAdPodInfo(AdPodInfoImpl adPodInfoImpl) {
        this.adPodInfo = adPodInfoImpl;
    }

    @KeepForSdk
    public void setAdSystem(String str) {
        this.adSystem = str;
    }

    @KeepForSdk
    public void setAdWrapperCreativeIds(String[] strArr) {
        this.adWrapperCreativeIds = strArr;
    }

    @KeepForSdk
    public void setAdWrapperIds(String[] strArr) {
        this.adWrapperIds = strArr;
    }

    @KeepForSdk
    public void setAdWrapperSystems(String[] strArr) {
        this.adWrapperSystems = strArr;
    }

    @KeepForSdk
    public void setAdvertiserName(String str) {
        this.advertiserName = str;
    }

    @KeepForSdk
    public void setClickThruUrl(String str) {
        this.clickThroughUrl = str;
    }

    @KeepForSdk
    public void setContentType(String str) {
        this.contentType = str;
    }

    @KeepForSdk
    public void setCreativeAdId(String str) {
        this.creativeAdId = str;
    }

    @KeepForSdk
    public void setCreativeId(String str) {
        this.creativeId = str;
    }

    @KeepForSdk
    public void setDealId(String str) {
        this.dealId = str;
    }

    @KeepForSdk
    public void setDescription(String str) {
        this.description = str;
    }

    @KeepForSdk
    public void setDuration(double d) {
        this.duration = d;
    }

    @KeepForSdk
    public void setHeight(int i) {
        this.height = i;
    }

    @KeepForSdk
    public void setLinear(boolean z) {
        this.linear = z;
    }

    @KeepForSdk
    public void setSkipTimeOffset(double d) {
        this.skipTimeOffset = d;
    }

    @KeepForSdk
    public void setSkippable(boolean z) {
        this.skippable = z;
    }

    @KeepForSdk
    public void setSurveyUrl(String str) {
        this.surveyUrl = str;
    }

    @KeepForSdk
    public void setTitle(String str) {
        this.title = str;
    }

    @KeepForSdk
    public void setTraffickingParameters(String str) {
        this.traffickingParameters = str;
    }

    @KeepForSdk
    public void setUiDisabled(boolean z) {
        this.disableUi = z;
    }

    @KeepForSdk
    public void setUiElements(Set<UiElement> set) {
        this.uiElements = set;
    }

    @KeepForSdk
    public void setUniversalAdIdRegistry(String str) {
        this.universalAdIdRegistry = str;
    }

    @KeepForSdk
    public void setUniversalAdIdValue(String str) {
        this.universalAdIdValue = str;
    }

    @KeepForSdk
    public void setUniversalAdIds(UniversalAdIdImpl[] universalAdIdImplArr) {
        this.universalAdIds = universalAdIdImplArr;
    }

    @KeepForSdk
    public void setVastMediaBitrate(int i) {
        this.vastMediaBitrate = i;
    }

    @KeepForSdk
    public void setVastMediaHeight(int i) {
        this.vastMediaHeight = i;
    }

    @KeepForSdk
    public void setVastMediaWidth(int i) {
        this.vastMediaWidth = i;
    }

    @KeepForSdk
    public void setWidth(int i) {
        this.width = i;
    }

    public String toString() {
        return "Ad [adId=" + this.adId + ", creativeId=" + this.creativeId + ", creativeAdId=" + this.creativeAdId + ", universalAdIdValue=" + this.universalAdIdValue + ", universalAdIdRegistry=" + this.universalAdIdRegistry + ", title=" + this.title + ", description=" + this.description + ", contentType=" + this.contentType + ", adWrapperIds=" + Arrays.toString(this.adWrapperIds) + ", adWrapperSystems=" + Arrays.toString(this.adWrapperSystems) + ", adWrapperCreativeIds=" + Arrays.toString(this.adWrapperCreativeIds) + ", adSystem=" + this.adSystem + ", advertiserName=" + this.advertiserName + ", surveyUrl=" + this.surveyUrl + ", dealId=" + this.dealId + ", linear=" + this.linear + ", skippable=" + this.skippable + ", width=" + this.width + ", height=" + this.height + ", vastMediaHeight=" + this.vastMediaHeight + ", vastMediaWidth=" + this.vastMediaWidth + ", vastMediaBitrate=" + this.vastMediaBitrate + ", traffickingParameters=" + this.traffickingParameters + ", clickThroughUrl=" + this.clickThroughUrl + ", duration=" + this.duration + ", adPodInfo=" + String.valueOf(this.adPodInfo) + ", uiElements=" + String.valueOf(this.uiElements) + ", disableUi=" + this.disableUi + ", skipTimeOffset=" + this.skipTimeOffset + "]";
    }
}
