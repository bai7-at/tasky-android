package com.nytimes.android.api.cms.graphql;

import com.nytimes.android.api.cms.Addendum;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetData;
import com.nytimes.android.api.cms.AssetSection;
import com.nytimes.android.api.cms.Audio;
import com.nytimes.android.api.cms.AudioAsset;
import com.nytimes.android.api.cms.Author;
import com.nytimes.android.api.cms.Column;
import com.nytimes.android.api.cms.DfpAssetMetaData;
import com.nytimes.android.api.cms.DisplaySizeType;
import com.nytimes.android.api.cms.Image;
import com.nytimes.android.api.cms.ImageAsset;
import com.nytimes.android.api.cms.ParsedHtmlText;
import com.nytimes.android.api.cms.PodcastSeries;
import com.nytimes.android.api.cms.Region;
import com.nytimes.android.api.cms.SubscribeUrl;
import com.nytimes.android.api.cms.Subsection;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.threeten.bp.Instant;
import org.threeten.bp.OffsetDateTime;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class GraphQlAudioAsset implements AudioAsset, Asset {
    private final AssetData assetData;
    private final Audio audio;

    public GraphQlAudioAsset(AssetData assetData, Audio audio) {
        zq3.h(assetData, "assetData");
        this.assetData = assetData;
        this.audio = audio;
    }

    public static /* synthetic */ GraphQlAudioAsset copy$default(GraphQlAudioAsset graphQlAudioAsset, AssetData assetData, Audio audio, int i, Object obj) {
        if ((i & 1) != 0) {
            assetData = graphQlAudioAsset.assetData;
        }
        if ((i & 2) != 0) {
            audio = graphQlAudioAsset.audio;
        }
        return graphQlAudioAsset.copy(assetData, audio);
    }

    public final AssetData component1() {
        return this.assetData;
    }

    public final Audio component2() {
        return this.audio;
    }

    public final GraphQlAudioAsset copy(AssetData assetData, Audio audio) {
        zq3.h(assetData, "assetData");
        return new GraphQlAudioAsset(assetData, audio);
    }

    @Override // com.nytimes.android.api.cms.AudioAsset
    public Long durationInSeconds() {
        return AudioAsset.DefaultImpls.durationInSeconds(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphQlAudioAsset)) {
            return false;
        }
        GraphQlAudioAsset graphQlAudioAsset = (GraphQlAudioAsset) obj;
        return zq3.c(this.assetData, graphQlAudioAsset.assetData) && zq3.c(this.audio, graphQlAudioAsset.audio);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public Image extractImage() {
        return this.assetData.extractImage();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String extractKicker() {
        return this.assetData.extractKicker();
    }

    @Override // com.nytimes.android.api.cms.AudioAsset
    public String fileUrl() {
        return AudioAsset.DefaultImpls.fileUrl(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public List<Addendum> getAddendums() {
        return this.assetData.getAddendums();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String getAdvertisingSensitivity() {
        return this.assetData.getAdvertisingSensitivity();
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

    @Override // com.nytimes.android.api.cms.AudioAsset
    public Audio getAudio() {
        return this.audio;
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

    public int hashCode() {
        int hashCode = this.assetData.hashCode() * 31;
        Audio audio = this.audio;
        return hashCode + (audio == null ? 0 : audio.hashCode());
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

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isMetered() {
        return this.assetData.isMetered();
    }

    @Override // com.nytimes.android.api.cms.Asset
    public boolean isOak() {
        return this.assetData.isOak();
    }

    @Override // com.nytimes.android.api.cms.AudioAsset
    public boolean isPodcast() {
        return AudioAsset.DefaultImpls.isPodcast(this);
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

    @Override // com.nytimes.android.api.cms.Asset
    public OffsetDateTime lastUpdated() {
        return this.assetData.lastUpdated();
    }

    @Override // com.nytimes.android.api.cms.AudioAsset
    public PodcastSeries podcastSeries() {
        return AudioAsset.DefaultImpls.podcastSeries(this);
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String recentlyViewedImageUrl() {
        return this.assetData.recentlyViewedImageUrl();
    }

    @Override // com.nytimes.android.api.cms.AudioAsset
    public String seriesName() {
        return AudioAsset.DefaultImpls.seriesName(this);
    }

    @Override // com.nytimes.android.api.cms.AudioAsset
    public String seriesThumbUrl() {
        return AudioAsset.DefaultImpls.seriesThumbUrl(this);
    }

    @Override // com.nytimes.android.api.cms.AudioAsset
    public List<SubscribeUrl> subscribeUrls() {
        return AudioAsset.DefaultImpls.subscribeUrls(this);
    }

    public String toString() {
        return "GraphQlAudioAsset(assetData=" + this.assetData + ", audio=" + this.audio + ")";
    }

    @Override // com.nytimes.android.api.cms.Asset
    public String youTabImageUrl() {
        return this.assetData.youTabImageUrl();
    }

    public /* synthetic */ GraphQlAudioAsset(AssetData assetData, Audio audio, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(assetData, (i & 2) != 0 ? null : audio);
    }
}
