package com.nytimes.android.api.cms;

import com.google.gson.annotations.SerializedName;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class PodcastSeries {
    private final Asset image;

    @SerializedName("link_url")
    private final String linkUrl;
    private final String name;

    @SerializedName("id")
    private final long seriesId;

    @SerializedName("subscribe_url")
    private final List<SubscribeUrl> subscribeUrls;

    @SerializedName("subtitle")
    private final String subtitle;
    private final String summary;
    private final String title;

    public PodcastSeries() {
        this(0L, null, null, null, null, null, null, null, 255, null);
    }

    public final long component1() {
        return this.seriesId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.subtitle;
    }

    public final String component5() {
        return this.summary;
    }

    public final String component6() {
        return this.linkUrl;
    }

    public final List<SubscribeUrl> component7() {
        return this.subscribeUrls;
    }

    public final Asset component8() {
        return this.image;
    }

    public final PodcastSeries copy(long j, String str, String str2, String str3, String str4, String str5, List<SubscribeUrl> list, Asset asset) {
        return new PodcastSeries(j, str, str2, str3, str4, str5, list, asset);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PodcastSeries)) {
            return false;
        }
        PodcastSeries podcastSeries = (PodcastSeries) obj;
        return this.seriesId == podcastSeries.seriesId && zq3.c(this.name, podcastSeries.name) && zq3.c(this.title, podcastSeries.title) && zq3.c(this.subtitle, podcastSeries.subtitle) && zq3.c(this.summary, podcastSeries.summary) && zq3.c(this.linkUrl, podcastSeries.linkUrl) && zq3.c(this.subscribeUrls, podcastSeries.subscribeUrls) && zq3.c(this.image, podcastSeries.image);
    }

    public final Asset getImage() {
        return this.image;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final long getSeriesId() {
        return this.seriesId;
    }

    public final List<SubscribeUrl> getSubscribeUrls() {
        return this.subscribeUrls;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.seriesId) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitle;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.summary;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.linkUrl;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<SubscribeUrl> list = this.subscribeUrls;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Asset asset = this.image;
        return hashCode7 + (asset != null ? asset.hashCode() : 0);
    }

    public String toString() {
        return "PodcastSeries(seriesId=" + this.seriesId + ", name=" + this.name + ", title=" + this.title + ", subtitle=" + this.subtitle + ", summary=" + this.summary + ", linkUrl=" + this.linkUrl + ", subscribeUrls=" + this.subscribeUrls + ", image=" + this.image + ")";
    }

    public PodcastSeries(long j, String str, String str2, String str3, String str4, String str5, List<SubscribeUrl> list, Asset asset) {
        this.seriesId = j;
        this.name = str;
        this.title = str2;
        this.subtitle = str3;
        this.summary = str4;
        this.linkUrl = str5;
        this.subscribeUrls = list;
        this.image = asset;
    }

    public /* synthetic */ PodcastSeries(long j, String str, String str2, String str3, String str4, String str5, List list, Asset asset, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : list, (i & 128) == 0 ? asset : null);
    }
}
