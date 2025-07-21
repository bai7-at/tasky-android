package com.nytimes.android.api.cms.graphql;

import com.nytimes.android.api.cms.Addendum;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetData;
import com.nytimes.android.api.cms.AssetSection;
import com.nytimes.android.api.cms.Author;
import com.nytimes.android.api.cms.Column;
import com.nytimes.android.api.cms.ContentSeries;
import com.nytimes.android.api.cms.DfpAssetMetaData;
import com.nytimes.android.api.cms.DisplaySizeType;
import com.nytimes.android.api.cms.Image;
import com.nytimes.android.api.cms.ImageAsset;
import com.nytimes.android.api.cms.ParsedHtmlText;
import com.nytimes.android.api.cms.PlaylistRef;
import com.nytimes.android.api.cms.Region;
import com.nytimes.android.api.cms.Subsection;
import com.nytimes.android.api.cms.Video;
import com.nytimes.android.api.cms.VideoAsset;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.threeten.bp.Instant;
import org.threeten.bp.OffsetDateTime;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class GraphQlVideoAsset implements VideoAsset, Asset {
    private final AssetData assetData;
    private final Video video;

    public GraphQlVideoAsset(AssetData assetData, Video video) {
        zq3.h(assetData, "assetData");
        this.assetData = assetData;
        this.video = video;
    }

    public static /* synthetic */ GraphQlVideoAsset copy$default(GraphQlVideoAsset graphQlVideoAsset, AssetData assetData, Video video, int i, Object obj) {
        if ((i & 1) != 0) {
            assetData = graphQlVideoAsset.assetData;
        }
        if ((i & 2) != 0) {
            video = graphQlVideoAsset.video;
        }
        return graphQlVideoAsset.copy(assetData, video);
    }

    public final AssetData component1() {
        return this.assetData;
    }

    public final Video component2() {
        return this.video;
    }

    @Override // com.nytimes.android.api.cms.VideoAsset
    public ContentSeries contentSeries() {
        return VideoAsset.DefaultImpls.contentSeries(this);
    }

    public final GraphQlVideoAsset copy(AssetData assetData, Video video) {
        zq3.h(assetData, "assetData");
        return new GraphQlVideoAsset(assetData, video);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphQlVideoAsset)) {
            return false;
        }
        GraphQlVideoAsset graphQlVideoAsset = (GraphQlVideoAsset) obj;
        return zq3.c(this.assetData, graphQlVideoAsset.assetData) && zq3.c(this.video, graphQlVideoAsset.video);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public Image extractImage() {
        return this.assetData.extractImage();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String extractKicker() {
        return this.assetData.extractKicker();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public List<Addendum> getAddendums() {
        return this.assetData.getAddendums();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getAdvertisingSensitivity() {
        return this.assetData.getAdvertisingSensitivity();
    }

    @Override // com.nytimes.android.api.cms.VideoAsset
    public String getAspectRatio() {
        return VideoAsset.DefaultImpls.getAspectRatio(this);
    }

    public final AssetData getAssetData() {
        return this.assetData;
    }

    @Override // com.nytimes.android.api.cms.Asset
    public long getAssetId() {
        return this.assetData.getAssetId();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public AssetSection getAssetSection() {
        return this.assetData.getAssetSection();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getAssetType() {
        return this.assetData.getAssetType();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public List<Author> getAuthors() {
        return this.assetData.getAuthors();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getByline() {
        return this.assetData.getByline();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean getCanBeSaved() {
        return this.assetData.getCanBeSaved();
    }

    @Override // com.nytimes.android.api.cms.VideoAsset
    public String getChannel() {
        return VideoAsset.DefaultImpls.getChannel(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public Column getColumn() {
        return this.assetData.getColumn();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getColumnDisplayName() {
        return this.assetData.getColumnDisplayName();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getColumnName() {
        return this.assetData.getColumnName();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getDataName() {
        return this.assetData.getDataName();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getDesk() {
        return this.assetData.getDesk();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public DfpAssetMetaData getDfp() {
        return this.assetData.getDfp();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getDisplaySize() {
        return this.assetData.getDisplaySize();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getDisplayTitle() {
        return this.assetData.getDisplayTitle();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public long getFirstPublished() {
        return this.assetData.getFirstPublished();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getHtml() {
        return this.assetData.getHtml();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public Map<String, Object> getHtmlMedia() {
        return this.assetData.getHtmlMedia();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getKicker() {
        return this.assetData.getKicker();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public long getLastMajorModified() {
        return this.assetData.getLastMajorModified();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public long getLastModified() {
        return this.assetData.getLastModified();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public Instant getLastModifiedInstant() {
        return this.assetData.getLastModifiedInstant();
    }

    @Override // com.nytimes.android.api.cms.VideoAsset
    public String getLiveUrl() {
        return VideoAsset.DefaultImpls.getLiveUrl(this);
    }

    @Override // com.nytimes.android.api.cms.VideoAsset
    public List<Video.LiveUrl> getLiveUrls() {
        return VideoAsset.DefaultImpls.getLiveUrls(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public ImageAsset getMediaImage() {
        return this.assetData.getMediaImage();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getMeterAccessType() {
        return this.assetData.getMeterAccessType();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public ParsedHtmlText getParsedHtmlSummary() {
        return this.assetData.getParsedHtmlSummary();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public Asset getPromotionalMedia() {
        return this.assetData.getPromotionalMedia();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public DisplaySizeType getPromotionalMediaSize() {
        return this.assetData.getPromotionalMediaSize();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public long getRealLastModified() {
        return this.assetData.getRealLastModified();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public Map<String, Region> getRegions() {
        return this.assetData.getRegions();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSafeUri() {
        return this.assetData.getSafeUri();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean getSectionBranded() {
        return this.assetData.getSectionBranded();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSectionContentName() {
        return this.assetData.getSectionContentName();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSectionDisplayName() {
        return this.assetData.getSectionDisplayName();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSectionNameOptional() {
        return this.assetData.getSectionNameOptional();
    }

    @Override // com.nytimes.android.api.cms.VideoAsset
    public String getShow() {
        return VideoAsset.DefaultImpls.getShow(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSubHeadline() {
        return this.assetData.getSubHeadline();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSubSectionNameOptional() {
        return this.assetData.getSubSectionNameOptional();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public Subsection getSubsection() {
        return this.assetData.getSubsection();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSubsectionContentName() {
        return this.assetData.getSubsectionContentName();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSubsectionDisplayName() {
        return this.assetData.getSubsectionDisplayName();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getSummary() {
        return this.assetData.getSummary();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getTitle() {
        return this.assetData.getTitle();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getTone() {
        return this.assetData.getTone();
    }

    @Override // com.nytimes.android.api.cms.VideoAsset
    public String getUniqueId() {
        return VideoAsset.DefaultImpls.getUniqueId(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getUri() {
        return this.assetData.getUri();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getUrl() {
        return this.assetData.getUrl();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getUrlOrEmpty() {
        return this.assetData.getUrlOrEmpty();
    }

    @Override // com.nytimes.android.api.cms.VideoAsset
    public Video getVideo() {
        return this.video;
    }

    @Override // com.nytimes.android.api.cms.VideoAsset
    public long getVideoDuration() {
        return VideoAsset.DefaultImpls.getVideoDuration(this);
    }

    @Override // com.nytimes.android.api.cms.VideoAsset
    public String getVideoDurationFormatted() {
        return VideoAsset.DefaultImpls.getVideoDurationFormatted(this);
    }

    @Override // com.nytimes.android.api.cms.VideoAsset
    public List<Video.VideoFiles> getVideoFiles() {
        return VideoAsset.DefaultImpls.getVideoFiles(this);
    }

    public int hashCode() {
        int hashCode = this.assetData.hashCode() * 31;
        Video video = this.video;
        return hashCode + (video == null ? 0 : video.hashCode());
    }

    @Override // com.nytimes.android.api.cms.VideoAsset
    public String hlsUrl() {
        return VideoAsset.DefaultImpls.hlsUrl(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isColumn() {
        return this.assetData.isColumn();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isCommentsEnabled() {
        return this.assetData.isCommentsEnabled();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isDailyBriefing() {
        return this.assetData.isDailyBriefing();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isKickerHidden() {
        return this.assetData.isKickerHidden();
    }

    @Override // com.nytimes.android.api.cms.VideoAsset
    public boolean isLive() {
        return VideoAsset.DefaultImpls.isLive(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isMetered() {
        return this.assetData.isMetered();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isOak() {
        return this.assetData.isOak();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isPromotionalMediaHidden() {
        return this.assetData.isPromotionalMediaHidden();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isShowPicture() {
        return this.assetData.isShowPicture();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isSummaryHidden() {
        return this.assetData.isSummaryHidden();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isTitleHidden() {
        return this.assetData.isTitleHidden();
    }

    @Override // com.nytimes.android.api.cms.VideoAsset
    public boolean isVertical() {
        return VideoAsset.DefaultImpls.isVertical(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public OffsetDateTime lastUpdated() {
        return this.assetData.lastUpdated();
    }

    @Override // com.nytimes.android.api.cms.VideoAsset
    public PlaylistRef playlist() {
        return VideoAsset.DefaultImpls.playlist(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String recentlyViewedImageUrl() {
        return this.assetData.recentlyViewedImageUrl();
    }

    public String toString() {
        return "GraphQlVideoAsset(assetData=" + this.assetData + ", video=" + this.video + ")";
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String youTabImageUrl() {
        return this.assetData.youTabImageUrl();
    }

    public /* synthetic */ GraphQlVideoAsset(AssetData assetData, Video video, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(assetData, (i & 2) != 0 ? null : video);
    }
}
