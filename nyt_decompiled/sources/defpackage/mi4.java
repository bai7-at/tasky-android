package defpackage;

import com.nytimes.android.ad.a;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.LatestFeed;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.api.cms.Video;
import com.nytimes.android.api.cms.VideoAsset;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.util.VideoUtil;
import com.nytimes.android.media.video.VideoReferringSource;
import com.nytimes.android.utils.ShareOrigin;
import com.nytimes.android.video.viewmodels.VideoAssetToVideoItemFunc;

/* loaded from: classes4.dex */
public final class mi4 {
    private final VideoAssetToVideoItemFunc a;
    private final a b;

    public mi4(VideoAssetToVideoItemFunc videoAssetToVideoItemFunc, a aVar) {
        zq3.h(videoAssetToVideoItemFunc, "videoAssetToVideoItemFunc");
        zq3.h(aVar, "adTaxonomy");
        this.a = videoAssetToVideoItemFunc;
        this.b = aVar;
    }

    public final NYTMediaItem a(Asset asset, VideoAsset videoAsset, SectionFront sectionFront, VideoReferringSource videoReferringSource, LatestFeed latestFeed) {
        zq3.h(videoAsset, "videoAsset");
        zq3.h(sectionFront, "section");
        zq3.h(videoReferringSource, "videoReferringSource");
        zq3.h(latestFeed, "latestFeed");
        z79 z79Var = new z79(videoAsset, VideoUtil.VideoRes.HIGH, sectionFront.getName(), null, true, asset, videoReferringSource.getTitle(), videoAsset.getUniqueId());
        return this.a.a(z79Var, yo4.a(this.b, (VideoAsset) z79Var.h(), latestFeed, z79Var.a(), z79Var.b(), z79Var.i()));
    }

    public final e79 b(VideoAsset videoAsset, ShareOrigin shareOrigin, String str, boolean z) {
        zq3.h(videoAsset, "videoAsset");
        zq3.h(shareOrigin, "shareOrigin");
        zq3.h(str, "uniqueId");
        String valueOf = String.valueOf(videoAsset.getAssetId());
        String displayTitle = videoAsset.getDisplayTitle();
        long videoDuration = videoAsset.getVideoDuration();
        String url = videoAsset.getUrl();
        if (url == null) {
            url = "";
        }
        String str2 = url;
        String assetType = videoAsset.getAssetType();
        if (assetType == null) {
            assetType = AssetConstants.VIDEO_TYPE;
        }
        String str3 = assetType;
        Video video = videoAsset.getVideo();
        return new e79(valueOf, str, str2, displayTitle, str3, videoDuration, shareOrigin, video != null ? video.getAspectRatio() : null, videoAsset.isLive(), z);
    }
}
