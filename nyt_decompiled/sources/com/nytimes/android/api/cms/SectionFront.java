package com.nytimes.android.api.cms;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.facebook.AuthenticationTokenClaims;
import defpackage.et3;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class SectionFront {
    public static final Companion Companion = new Companion(null);
    private List<? extends Asset> assets;
    private final String hash;
    private final String iconUrl;
    private PackageAsset ledePackage;
    private final String name;
    private final String path;
    private PackageAsset photoSpot;
    private Map<Long, ? extends Asset> promotionalMediaOverrideMap;
    private final Date pubDate;
    private String queryId;
    private final SectionConfigEntry sectionConfig;
    private String sectionName;
    private String subsectionName;
    private final String title;
    private List<? extends Map<String, String>> trackingParams;
    private final String uri;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SectionFront from$default(Companion companion, SectionMeta sectionMeta, String str, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 16) != 0) {
                z = false;
            }
            return companion.from(sectionMeta, str, str2, str3, z);
        }

        public final SectionFront from(String str, String str2, String str3, String str4, String str5, SectionMeta sectionMeta) {
            zq3.h(str, "title");
            zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(str4, "sectionName");
            zq3.h(str5, "subsectionName");
            zq3.h(sectionMeta, "sectionMeta");
            return new SectionFront(str, str2, str3, null, null, null, null, null, str4, str5, null, null, null, null, sectionMeta.getQueryId(), null, 48256, null);
        }

        private Companion() {
        }

        public final SectionFront from(SectionMeta sectionMeta, String str, String str2, String str3, boolean z) {
            zq3.h(sectionMeta, "meta");
            return new SectionFront(sectionMeta.getTitle(), sectionMeta.getName(), str, sectionMeta.getIconUrl(), sectionMeta.getPubDate(), z ? sectionMeta.getPath() : sectionMeta.getQueryId(), sectionMeta.getHash(), sectionMeta.getSectionConfig(), str2, str3, null, null, null, null, sectionMeta.getQueryId(), null, 48128, null);
        }

        public final SectionFront from(String str, String str2, String str3, String str4) {
            zq3.h(str, "title");
            zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
            zq3.h(str3, "sectionName");
            zq3.h(str4, "subsectionName");
            return new SectionFront(str, str2, null, null, null, null, null, null, str3, str4, null, null, null, null, null, null, 48256, null);
        }
    }

    public SectionFront(String str, String str2, String str3, String str4, Date date, String str5, String str6, SectionConfigEntry sectionConfigEntry, String str7, String str8, List<? extends Asset> list, PackageAsset packageAsset, PackageAsset packageAsset2, Map<Long, ? extends Asset> map, String str9, List<? extends Map<String, String>> list2) {
        zq3.h(str, "title");
        zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(list, "assets");
        zq3.h(list2, "trackingParams");
        this.title = str;
        this.name = str2;
        this.uri = str3;
        this.iconUrl = str4;
        this.pubDate = date;
        this.path = str5;
        this.hash = str6;
        this.sectionConfig = sectionConfigEntry;
        this.sectionName = str7;
        this.subsectionName = str8;
        this.assets = list;
        this.ledePackage = packageAsset;
        this.photoSpot = packageAsset2;
        this.promotionalMediaOverrideMap = map;
        this.queryId = str9;
        this.trackingParams = list2;
    }

    public static final SectionFront from(SectionMeta sectionMeta, String str, String str2, String str3, boolean z) {
        return Companion.from(sectionMeta, str, str2, str3, z);
    }

    public final String component1() {
        return this.title;
    }

    public final String component10() {
        return this.subsectionName;
    }

    public final List<Asset> component11() {
        return this.assets;
    }

    public final PackageAsset component12() {
        return this.ledePackage;
    }

    public final PackageAsset component13() {
        return this.photoSpot;
    }

    public final Map<Long, Asset> component14() {
        return this.promotionalMediaOverrideMap;
    }

    public final String component15() {
        return this.queryId;
    }

    public final List<Map<String, String>> component16() {
        return this.trackingParams;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.uri;
    }

    public final String component4() {
        return this.iconUrl;
    }

    public final Date component5() {
        return this.pubDate;
    }

    public final String component6() {
        return this.path;
    }

    public final String component7() {
        return this.hash;
    }

    public final SectionConfigEntry component8() {
        return this.sectionConfig;
    }

    public final String component9() {
        return this.sectionName;
    }

    public final SectionFront copy(String str, String str2, String str3, String str4, Date date, String str5, String str6, SectionConfigEntry sectionConfigEntry, String str7, String str8, List<? extends Asset> list, PackageAsset packageAsset, PackageAsset packageAsset2, Map<Long, ? extends Asset> map, String str9, List<? extends Map<String, String>> list2) {
        zq3.h(str, "title");
        zq3.h(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(list, "assets");
        zq3.h(list2, "trackingParams");
        return new SectionFront(str, str2, str3, str4, date, str5, str6, sectionConfigEntry, str7, str8, list, packageAsset, packageAsset2, map, str9, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionFront)) {
            return false;
        }
        SectionFront sectionFront = (SectionFront) obj;
        return zq3.c(this.title, sectionFront.title) && zq3.c(this.name, sectionFront.name) && zq3.c(this.uri, sectionFront.uri) && zq3.c(this.iconUrl, sectionFront.iconUrl) && zq3.c(this.pubDate, sectionFront.pubDate) && zq3.c(this.path, sectionFront.path) && zq3.c(this.hash, sectionFront.hash) && zq3.c(this.sectionConfig, sectionFront.sectionConfig) && zq3.c(this.sectionName, sectionFront.sectionName) && zq3.c(this.subsectionName, sectionFront.subsectionName) && zq3.c(this.assets, sectionFront.assets) && zq3.c(this.ledePackage, sectionFront.ledePackage) && zq3.c(this.photoSpot, sectionFront.photoSpot) && zq3.c(this.promotionalMediaOverrideMap, sectionFront.promotionalMediaOverrideMap) && zq3.c(this.queryId, sectionFront.queryId) && zq3.c(this.trackingParams, sectionFront.trackingParams);
    }

    public final List<Asset> getAssets() {
        return this.assets;
    }

    public final String getHash() {
        return this.hash;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final PackageAsset getLedePackage() {
        return this.ledePackage;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final PackageAsset getPhotoSpot() {
        return this.photoSpot;
    }

    public final <T extends Asset> T getPromotionalMediaOverride(long j) {
        Long valueOf = Long.valueOf(j);
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        long longValue = valueOf.longValue();
        Map<Long, ? extends Asset> map = this.promotionalMediaOverrideMap;
        Asset asset = map != null ? map.get(Long.valueOf(longValue)) : null;
        if (asset != null) {
            return (T) asset;
        }
        return null;
    }

    public final Map<Long, Asset> getPromotionalMediaOverrideMap() {
        return this.promotionalMediaOverrideMap;
    }

    public final Date getPubDate() {
        return this.pubDate;
    }

    public final String getQueryId() {
        return this.queryId;
    }

    public final Integer getRank() {
        SectionConfigEntry sectionConfigEntry = this.sectionConfig;
        if (sectionConfigEntry != null) {
            return sectionConfigEntry.getRank();
        }
        return null;
    }

    public final SectionConfigEntry getSectionConfig() {
        return this.sectionConfig;
    }

    public final String getSectionName() {
        return this.sectionName;
    }

    public final String getSubsectionName() {
        return this.subsectionName;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<Map<String, String>> getTrackingParams() {
        return this.trackingParams;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        int hashCode = ((this.title.hashCode() * 31) + this.name.hashCode()) * 31;
        String str = this.uri;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconUrl;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date = this.pubDate;
        int hashCode4 = (hashCode3 + (date == null ? 0 : date.hashCode())) * 31;
        String str3 = this.path;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.hash;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SectionConfigEntry sectionConfigEntry = this.sectionConfig;
        int hashCode7 = (hashCode6 + (sectionConfigEntry == null ? 0 : sectionConfigEntry.hashCode())) * 31;
        String str5 = this.sectionName;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.subsectionName;
        int hashCode9 = (((hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.assets.hashCode()) * 31;
        PackageAsset packageAsset = this.ledePackage;
        int hashCode10 = (hashCode9 + (packageAsset == null ? 0 : packageAsset.hashCode())) * 31;
        PackageAsset packageAsset2 = this.photoSpot;
        int hashCode11 = (hashCode10 + (packageAsset2 == null ? 0 : packageAsset2.hashCode())) * 31;
        Map<Long, ? extends Asset> map = this.promotionalMediaOverrideMap;
        int hashCode12 = (hashCode11 + (map == null ? 0 : map.hashCode())) * 31;
        String str7 = this.queryId;
        return ((hashCode12 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.trackingParams.hashCode();
    }

    public final boolean isAlwaysDefault() {
        SectionConfigEntry sectionConfigEntry = this.sectionConfig;
        if (sectionConfigEntry != null) {
            return sectionConfigEntry.isAlwaysDefault();
        }
        return false;
    }

    public final boolean isDefault() {
        SectionConfigEntry sectionConfigEntry = this.sectionConfig;
        if (sectionConfigEntry != null) {
            return sectionConfigEntry.isDefaultSection();
        }
        return false;
    }

    public final void setAssets(List<? extends Asset> list) {
        zq3.h(list, "<set-?>");
        this.assets = list;
    }

    public final void setLedePackage(PackageAsset packageAsset) {
        this.ledePackage = packageAsset;
    }

    public final void setPhotoSpot(PackageAsset packageAsset) {
        this.photoSpot = packageAsset;
    }

    public final void setPromotionalMediaOverrideMap(Map<Long, ? extends Asset> map) {
        this.promotionalMediaOverrideMap = map;
    }

    public final void setQueryId(String str) {
        this.queryId = str;
    }

    public final void setSectionName(String str) {
        this.sectionName = str;
    }

    public final void setSubsectionName(String str) {
        this.subsectionName = str;
    }

    public final void setTrackingParams(List<? extends Map<String, String>> list) {
        zq3.h(list, "<set-?>");
        this.trackingParams = list;
    }

    public String toString() {
        return "SectionFront(title=" + this.title + ", name=" + this.name + ", uri=" + this.uri + ", iconUrl=" + this.iconUrl + ", pubDate=" + this.pubDate + ", path=" + this.path + ", hash=" + this.hash + ", sectionConfig=" + this.sectionConfig + ", sectionName=" + this.sectionName + ", subsectionName=" + this.subsectionName + ", assets=" + this.assets + ", ledePackage=" + this.ledePackage + ", photoSpot=" + this.photoSpot + ", promotionalMediaOverrideMap=" + this.promotionalMediaOverrideMap + ", queryId=" + this.queryId + ", trackingParams=" + this.trackingParams + ")";
    }

    public static final SectionFront from(String str, String str2, String str3, String str4) {
        return Companion.from(str, str2, str3, str4);
    }

    public static final SectionFront from(String str, String str2, String str3, String str4, String str5, SectionMeta sectionMeta) {
        return Companion.from(str, str2, str3, str4, str5, sectionMeta);
    }

    public /* synthetic */ SectionFront(String str, String str2, String str3, String str4, Date date, String str5, String str6, SectionConfigEntry sectionConfigEntry, String str7, String str8, List list, PackageAsset packageAsset, PackageAsset packageAsset2, Map map, String str9, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, date, str5, str6, (i & 128) != 0 ? null : sectionConfigEntry, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? new ArrayList() : list, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? null : packageAsset, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : packageAsset2, (i & 8192) != 0 ? new LinkedHashMap() : map, str9, (i & 32768) != 0 ? new ArrayList() : list2);
    }
}
