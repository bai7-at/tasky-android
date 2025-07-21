package com.nytimes.android.api.cms;

import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.api.cms.Asset;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import org.threeten.bp.Instant;
import org.threeten.bp.OffsetDateTime;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class AssetData implements Asset {
    private final List<Addendum> addendums;
    private final String advertisingSensitivity;
    private final long assetId;
    private final AssetSection assetSection;
    private final String assetType;
    private final List<Author> authors;
    private final String byline;
    private final Column column;
    private final String dataName;
    private String desk;
    private final DfpAssetMetaData dfp;
    private final String displaySize;
    private final long firstPublished;
    private final Map<String, Object> htmlMedia;
    private final boolean isCommentsEnabled;
    private final boolean isKickerHidden;
    private final boolean isOak;
    private final boolean isPromotionalMediaHidden;
    private final boolean isSummaryHidden;
    private final boolean isTitleHidden;
    private final String kicker;
    private final long lastMajorModified;
    private final long lastModified;
    private final String meterAccessType;
    private final ParsedHtmlText parsedHtmlSummary;
    private Asset promotionalMedia;
    private final DisplaySizeType promotionalMediaSize;
    private Map<String, Region> regions;
    private final String subHeadline;
    private final Subsection subsection;
    private final String summary;
    private final String title;
    private final String tone;
    private final String uri;
    private final String url;

    public AssetData() {
        this(null, null, null, null, null, null, null, null, false, 0L, 0L, 0L, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, 0L, -1, 7, null);
    }

    public static /* synthetic */ void getAssetId$annotations() {
    }

    public final String component1() {
        return this.uri;
    }

    public final long component10() {
        return this.lastModified;
    }

    public final long component11() {
        return this.lastMajorModified;
    }

    public final long component12() {
        return this.firstPublished;
    }

    public final String component13() {
        return this.subHeadline;
    }

    public final String component14() {
        return this.advertisingSensitivity;
    }

    public final String component15() {
        return this.dataName;
    }

    public final AssetSection component16() {
        return this.assetSection;
    }

    public final DfpAssetMetaData component17() {
        return this.dfp;
    }

    public final DisplaySizeType component18() {
        return this.promotionalMediaSize;
    }

    public final boolean component19() {
        return this.isSummaryHidden;
    }

    public final String component2() {
        return this.assetType;
    }

    public final boolean component20() {
        return this.isPromotionalMediaHidden;
    }

    public final boolean component21() {
        return this.isTitleHidden;
    }

    public final boolean component22() {
        return this.isKickerHidden;
    }

    public final boolean component23() {
        return this.isOak;
    }

    public final Map<String, Object> component24() {
        return this.htmlMedia;
    }

    public final String component25() {
        return this.summary;
    }

    public final String component26() {
        return this.url;
    }

    public final String component27() {
        return this.kicker;
    }

    public final String component28() {
        return this.byline;
    }

    public final String component29() {
        return this.tone;
    }

    public final String component3() {
        return this.title;
    }

    public final List<Addendum> component30() {
        return this.addendums;
    }

    public final Subsection component31() {
        return this.subsection;
    }

    public final Asset component32() {
        return this.promotionalMedia;
    }

    public final String component33() {
        return this.desk;
    }

    public final Map<String, Region> component34() {
        return this.regions;
    }

    public final long component35() {
        return this.assetId;
    }

    public final String component4() {
        return this.meterAccessType;
    }

    public final ParsedHtmlText component5() {
        return this.parsedHtmlSummary;
    }

    public final List<Author> component6() {
        return this.authors;
    }

    public final Column component7() {
        return this.column;
    }

    public final String component8() {
        return this.displaySize;
    }

    public final boolean component9() {
        return this.isCommentsEnabled;
    }

    public final AssetData copy(String str, String str2, String str3, String str4, ParsedHtmlText parsedHtmlText, List<Author> list, Column column, String str5, boolean z, long j, long j2, long j3, String str6, String str7, String str8, AssetSection assetSection, DfpAssetMetaData dfpAssetMetaData, DisplaySizeType displaySizeType, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Map<String, ? extends Object> map, String str9, String str10, String str11, String str12, String str13, List<Addendum> list2, Subsection subsection, Asset asset, String str14, Map<String, Region> map2, long j4) {
        return new AssetData(str, str2, str3, str4, parsedHtmlText, list, column, str5, z, j, j2, j3, str6, str7, str8, assetSection, dfpAssetMetaData, displaySizeType, z2, z3, z4, z5, z6, map, str9, str10, str11, str12, str13, list2, subsection, asset, str14, map2, j4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetData)) {
            return false;
        }
        AssetData assetData = (AssetData) obj;
        return zq3.c(this.uri, assetData.uri) && zq3.c(this.assetType, assetData.assetType) && zq3.c(this.title, assetData.title) && zq3.c(this.meterAccessType, assetData.meterAccessType) && zq3.c(this.parsedHtmlSummary, assetData.parsedHtmlSummary) && zq3.c(this.authors, assetData.authors) && zq3.c(this.column, assetData.column) && zq3.c(this.displaySize, assetData.displaySize) && this.isCommentsEnabled == assetData.isCommentsEnabled && this.lastModified == assetData.lastModified && this.lastMajorModified == assetData.lastMajorModified && this.firstPublished == assetData.firstPublished && zq3.c(this.subHeadline, assetData.subHeadline) && zq3.c(this.advertisingSensitivity, assetData.advertisingSensitivity) && zq3.c(this.dataName, assetData.dataName) && zq3.c(this.assetSection, assetData.assetSection) && zq3.c(this.dfp, assetData.dfp) && this.promotionalMediaSize == assetData.promotionalMediaSize && this.isSummaryHidden == assetData.isSummaryHidden && this.isPromotionalMediaHidden == assetData.isPromotionalMediaHidden && this.isTitleHidden == assetData.isTitleHidden && this.isKickerHidden == assetData.isKickerHidden && this.isOak == assetData.isOak && zq3.c(this.htmlMedia, assetData.htmlMedia) && zq3.c(this.summary, assetData.summary) && zq3.c(this.url, assetData.url) && zq3.c(this.kicker, assetData.kicker) && zq3.c(this.byline, assetData.byline) && zq3.c(this.tone, assetData.tone) && zq3.c(this.addendums, assetData.addendums) && zq3.c(this.subsection, assetData.subsection) && zq3.c(this.promotionalMedia, assetData.promotionalMedia) && zq3.c(this.desk, assetData.desk) && zq3.c(this.regions, assetData.regions) && this.assetId == assetData.assetId;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public Image extractImage() {
        return Asset.DefaultImpls.extractImage(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String extractKicker() {
        return Asset.DefaultImpls.extractKicker(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public List<Addendum> getAddendums() {
        return this.addendums;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getAdvertisingSensitivity() {
        return this.advertisingSensitivity;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public long getAssetId() {
        return this.assetId;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public AssetSection getAssetSection() {
        return this.assetSection;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getAssetType() {
        return this.assetType;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public List<Author> getAuthors() {
        return this.authors;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getByline() {
        return this.byline;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean getCanBeSaved() {
        return Asset.DefaultImpls.getCanBeSaved(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public Column getColumn() {
        return this.column;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getColumnDisplayName() {
        return Asset.DefaultImpls.getColumnDisplayName(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getColumnName() {
        return Asset.DefaultImpls.getColumnName(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getDataName() {
        return this.dataName;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getDesk() {
        return this.desk;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public DfpAssetMetaData getDfp() {
        return this.dfp;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getDisplaySize() {
        return this.displaySize;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getDisplayTitle() {
        return Asset.DefaultImpls.getDisplayTitle(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public long getFirstPublished() {
        return this.firstPublished;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getHtml() {
        return Asset.DefaultImpls.getHtml(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public Map<String, Object> getHtmlMedia() {
        return this.htmlMedia;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getKicker() {
        return this.kicker;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public long getLastMajorModified() {
        return this.lastMajorModified;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public long getLastModified() {
        return this.lastModified;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public Instant getLastModifiedInstant() {
        return Asset.DefaultImpls.getLastModifiedInstant(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public ImageAsset getMediaImage() {
        return Asset.DefaultImpls.getMediaImage(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getMeterAccessType() {
        return this.meterAccessType;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public ParsedHtmlText getParsedHtmlSummary() {
        return this.parsedHtmlSummary;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public Asset getPromotionalMedia() {
        return this.promotionalMedia;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public DisplaySizeType getPromotionalMediaSize() {
        return this.promotionalMediaSize;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public long getRealLastModified() {
        return Asset.DefaultImpls.getRealLastModified(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public Map<String, Region> getRegions() {
        return this.regions;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSafeUri() {
        return Asset.DefaultImpls.getSafeUri(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean getSectionBranded() {
        return Asset.DefaultImpls.getSectionBranded(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSectionContentName() {
        return Asset.DefaultImpls.getSectionContentName(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSectionDisplayName() {
        return Asset.DefaultImpls.getSectionDisplayName(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSectionNameOptional() {
        return Asset.DefaultImpls.getSectionNameOptional(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSubHeadline() {
        return this.subHeadline;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSubSectionNameOptional() {
        return Asset.DefaultImpls.getSubSectionNameOptional(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public Subsection getSubsection() {
        return this.subsection;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSubsectionContentName() {
        return Asset.DefaultImpls.getSubsectionContentName(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSubsectionDisplayName() {
        return Asset.DefaultImpls.getSubsectionDisplayName(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSummary() {
        return this.summary;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getTitle() {
        return this.title;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getTone() {
        return this.tone;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getUri() {
        return this.uri;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getUrl() {
        return this.url;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getUrlOrEmpty() {
        return Asset.DefaultImpls.getUrlOrEmpty(this);
    }

    public int hashCode() {
        String str = this.uri;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.assetType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.meterAccessType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ParsedHtmlText parsedHtmlText = this.parsedHtmlSummary;
        int hashCode5 = (hashCode4 + (parsedHtmlText == null ? 0 : parsedHtmlText.hashCode())) * 31;
        List<Author> list = this.authors;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Column column = this.column;
        int hashCode7 = (hashCode6 + (column == null ? 0 : column.hashCode())) * 31;
        String str5 = this.displaySize;
        int hashCode8 = (((((((((hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31) + Boolean.hashCode(this.isCommentsEnabled)) * 31) + Long.hashCode(this.lastModified)) * 31) + Long.hashCode(this.lastMajorModified)) * 31) + Long.hashCode(this.firstPublished)) * 31;
        String str6 = this.subHeadline;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.advertisingSensitivity;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.dataName;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        AssetSection assetSection = this.assetSection;
        int hashCode12 = (hashCode11 + (assetSection == null ? 0 : assetSection.hashCode())) * 31;
        DfpAssetMetaData dfpAssetMetaData = this.dfp;
        int hashCode13 = (hashCode12 + (dfpAssetMetaData == null ? 0 : dfpAssetMetaData.hashCode())) * 31;
        DisplaySizeType displaySizeType = this.promotionalMediaSize;
        int hashCode14 = (((((((((((hashCode13 + (displaySizeType == null ? 0 : displaySizeType.hashCode())) * 31) + Boolean.hashCode(this.isSummaryHidden)) * 31) + Boolean.hashCode(this.isPromotionalMediaHidden)) * 31) + Boolean.hashCode(this.isTitleHidden)) * 31) + Boolean.hashCode(this.isKickerHidden)) * 31) + Boolean.hashCode(this.isOak)) * 31;
        Map<String, Object> map = this.htmlMedia;
        int hashCode15 = (hashCode14 + (map == null ? 0 : map.hashCode())) * 31;
        String str9 = this.summary;
        int hashCode16 = (hashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.url;
        int hashCode17 = (hashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.kicker;
        int hashCode18 = (hashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.byline;
        int hashCode19 = (hashCode18 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.tone;
        int hashCode20 = (hashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        List<Addendum> list2 = this.addendums;
        int hashCode21 = (hashCode20 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Subsection subsection = this.subsection;
        int hashCode22 = (hashCode21 + (subsection == null ? 0 : subsection.hashCode())) * 31;
        Asset asset = this.promotionalMedia;
        int hashCode23 = (hashCode22 + (asset == null ? 0 : asset.hashCode())) * 31;
        String str14 = this.desk;
        int hashCode24 = (hashCode23 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Map<String, Region> map2 = this.regions;
        return ((hashCode24 + (map2 != null ? map2.hashCode() : 0)) * 31) + Long.hashCode(this.assetId);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isColumn() {
        return Asset.DefaultImpls.isColumn(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isCommentsEnabled() {
        return this.isCommentsEnabled;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isDailyBriefing() {
        return Asset.DefaultImpls.isDailyBriefing(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isKickerHidden() {
        return this.isKickerHidden;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isMetered() {
        return Asset.DefaultImpls.isMetered(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isOak() {
        return this.isOak;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isPromotionalMediaHidden() {
        return this.isPromotionalMediaHidden;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isShowPicture() {
        return Asset.DefaultImpls.isShowPicture(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isSummaryHidden() {
        return this.isSummaryHidden;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isTitleHidden() {
        return this.isTitleHidden;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public OffsetDateTime lastUpdated() {
        return Asset.DefaultImpls.lastUpdated(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String recentlyViewedImageUrl() {
        return Asset.DefaultImpls.recentlyViewedImageUrl(this);
    }

    public void setDesk(String str) {
        this.desk = str;
    }

    public void setPromotionalMedia(Asset asset) {
        this.promotionalMedia = asset;
    }

    public void setRegions(Map<String, Region> map) {
        this.regions = map;
    }

    public String toString() {
        return "AssetData(uri=" + this.uri + ", assetType=" + this.assetType + ", title=" + this.title + ", meterAccessType=" + this.meterAccessType + ", parsedHtmlSummary=" + this.parsedHtmlSummary + ", authors=" + this.authors + ", column=" + this.column + ", displaySize=" + this.displaySize + ", isCommentsEnabled=" + this.isCommentsEnabled + ", lastModified=" + this.lastModified + ", lastMajorModified=" + this.lastMajorModified + ", firstPublished=" + this.firstPublished + ", subHeadline=" + this.subHeadline + ", advertisingSensitivity=" + this.advertisingSensitivity + ", dataName=" + this.dataName + ", assetSection=" + this.assetSection + ", dfp=" + this.dfp + ", promotionalMediaSize=" + this.promotionalMediaSize + ", isSummaryHidden=" + this.isSummaryHidden + ", isPromotionalMediaHidden=" + this.isPromotionalMediaHidden + ", isTitleHidden=" + this.isTitleHidden + ", isKickerHidden=" + this.isKickerHidden + ", isOak=" + this.isOak + ", htmlMedia=" + this.htmlMedia + ", summary=" + this.summary + ", url=" + this.url + ", kicker=" + this.kicker + ", byline=" + this.byline + ", tone=" + this.tone + ", addendums=" + this.addendums + ", subsection=" + this.subsection + ", promotionalMedia=" + this.promotionalMedia + ", desk=" + this.desk + ", regions=" + this.regions + ", assetId=" + this.assetId + ")";
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String youTabImageUrl() {
        return Asset.DefaultImpls.youTabImageUrl(this);
    }

    public AssetData(String str, String str2, String str3, String str4, ParsedHtmlText parsedHtmlText, List<Author> list, Column column, String str5, boolean z, long j, long j2, long j3, String str6, String str7, String str8, AssetSection assetSection, DfpAssetMetaData dfpAssetMetaData, DisplaySizeType displaySizeType, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Map<String, ? extends Object> map, String str9, String str10, String str11, String str12, String str13, List<Addendum> list2, Subsection subsection, Asset asset, String str14, Map<String, Region> map2, long j4) {
        this.uri = str;
        this.assetType = str2;
        this.title = str3;
        this.meterAccessType = str4;
        this.parsedHtmlSummary = parsedHtmlText;
        this.authors = list;
        this.column = column;
        this.displaySize = str5;
        this.isCommentsEnabled = z;
        this.lastModified = j;
        this.lastMajorModified = j2;
        this.firstPublished = j3;
        this.subHeadline = str6;
        this.advertisingSensitivity = str7;
        this.dataName = str8;
        this.assetSection = assetSection;
        this.dfp = dfpAssetMetaData;
        this.promotionalMediaSize = displaySizeType;
        this.isSummaryHidden = z2;
        this.isPromotionalMediaHidden = z3;
        this.isTitleHidden = z4;
        this.isKickerHidden = z5;
        this.isOak = z6;
        this.htmlMedia = map;
        this.summary = str9;
        this.url = str10;
        this.kicker = str11;
        this.byline = str12;
        this.tone = str13;
        this.addendums = list2;
        this.subsection = subsection;
        this.promotionalMedia = asset;
        this.desk = str14;
        this.regions = map2;
        this.assetId = j4;
    }

    public /* synthetic */ AssetData(String str, String str2, String str3, String str4, ParsedHtmlText parsedHtmlText, List list, Column column, String str5, boolean z, long j, long j2, long j3, String str6, String str7, String str8, AssetSection assetSection, DfpAssetMetaData dfpAssetMetaData, DisplaySizeType displaySizeType, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, Map map, String str9, String str10, String str11, String str12, String str13, List list2, Subsection subsection, Asset asset, String str14, Map map2, long j4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : parsedHtmlText, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : column, (i & 128) != 0 ? null : str5, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? false : z, (i & 512) != 0 ? 0L : j, (i & 1024) != 0 ? 0L : j2, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) == 0 ? j3 : 0L, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? null : str6, (i & 8192) != 0 ? null : str7, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str8, (i & 32768) != 0 ? null : assetSection, (i & 65536) != 0 ? null : dfpAssetMetaData, (i & 131072) != 0 ? null : displaySizeType, (i & 262144) != 0 ? false : z2, (i & 524288) != 0 ? false : z3, (i & Constants.MB) != 0 ? false : z4, (i & 2097152) != 0 ? false : z5, (i & 4194304) != 0 ? false : z6, (i & 8388608) != 0 ? null : map, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : str9, (i & 33554432) != 0 ? null : str10, (i & 67108864) != 0 ? null : str11, (i & 134217728) != 0 ? null : str12, (i & 268435456) != 0 ? null : str13, (i & 536870912) != 0 ? null : list2, (i & 1073741824) != 0 ? null : subsection, (i & RecyclerView.UNDEFINED_DURATION) != 0 ? null : asset, (i2 & 1) != 0 ? null : str14, (i2 & 2) != 0 ? null : map2, (i2 & 4) != 0 ? -1L : j4);
    }
}
