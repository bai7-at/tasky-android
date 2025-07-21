package com.nytimes.android.video.viewmodels;

import com.comscore.streaming.ContentMediaFormat;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.ContentSeries;
import com.nytimes.android.api.cms.PlaylistRef;
import com.nytimes.android.api.cms.Video;
import com.nytimes.android.api.cms.VideoAsset;
import com.nytimes.android.media.common.NYTMediaItem;
import com.nytimes.android.media.util.VideoRendition;
import com.nytimes.android.media.util.VideoUtil;
import defpackage.tb1;
import defpackage.xo4;
import defpackage.z79;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import type.VideoProductionType;

/* loaded from: classes4.dex */
public final class VideoAssetToVideoItemFunc {
    private final VideoUtil a;
    private final xo4 b;

    public VideoAssetToVideoItemFunc(VideoUtil videoUtil, xo4 xo4Var) {
        zq3.h(videoUtil, "videoUtil");
        zq3.h(xo4Var, "mediaVideoAdManager");
        this.a = videoUtil;
        this.b = xo4Var;
    }

    private final String b(VideoAsset videoAsset, VideoUtil.VideoRes videoRes) {
        List<Video.VideoFiles> videoFiles = videoAsset.getVideoFiles();
        ArrayList arrayList = new ArrayList(i.w(videoFiles, 10));
        for (Video.VideoFiles videoFiles2 : videoFiles) {
            String url = videoFiles2.getUrl();
            String str = url == null ? "" : url;
            String videoEncoding = videoFiles2.getVideoEncoding();
            String str2 = videoEncoding == null ? "" : videoEncoding;
            int width = videoFiles2.getWidth();
            int height = videoFiles2.getHeight();
            String type2 = videoFiles2.getType();
            if (type2 == null) {
                type2 = "";
            }
            arrayList.add(new VideoRendition(str, str2, width, height, type2, null));
        }
        VideoRendition extractVideoFile$default = VideoUtil.extractVideoFile$default(this.a, arrayList, videoRes, false, false, 12, null);
        if (extractVideoFile$default != null) {
            return extractVideoFile$default.getVideoUrl();
        }
        return null;
    }

    private final boolean d(VideoAsset videoAsset, Asset asset) {
        String advertisingSensitivity = videoAsset.getAdvertisingSensitivity();
        String advertisingSensitivity2 = asset != null ? asset.getAdvertisingSensitivity() : null;
        return zq3.c(AssetConstants.NO_ADS, advertisingSensitivity) || zq3.c(AssetConstants.TRAGEDY, advertisingSensitivity) || zq3.c(AssetConstants.NO_ADS, advertisingSensitivity2) || zq3.c(AssetConstants.TRAGEDY, advertisingSensitivity2);
    }

    public final NYTMediaItem a(z79 z79Var, String str) {
        String b;
        boolean z;
        VideoProductionType videoProductionType;
        String productionType;
        zq3.h(z79Var, "ingredients");
        zq3.h(str, "adUnitTaxonomy");
        VideoAsset videoAsset = (VideoAsset) z79Var.h();
        VideoUtil.VideoRes g = z79Var.g();
        String liveUrl = videoAsset.getLiveUrl();
        if (liveUrl == null || liveUrl.length() == 0) {
            b = b(videoAsset, g);
            z = false;
        } else {
            z = true;
            b = liveUrl;
        }
        if (b == null || b.length() == 0) {
            throw new IllegalArgumentException("videoUrl cannot be null or empty");
        }
        long a = tb1.a(videoAsset.getVideoDuration());
        String urlOrEmpty = videoAsset.getUrlOrEmpty();
        String byline = videoAsset.getByline() == null ? "" : videoAsset.getByline();
        String safeUri = videoAsset.getSafeUri();
        String displayTitle = videoAsset.getDisplayTitle();
        String displayTitle2 = videoAsset.getDisplayTitle();
        String valueOf = String.valueOf(videoAsset.getAssetId());
        ContentSeries contentSeries = videoAsset.contentSeries();
        String name = contentSeries != null ? contentSeries.getName() : null;
        PlaylistRef playlist = videoAsset.playlist();
        Long valueOf2 = playlist != null ? Long.valueOf(playlist.getId()) : null;
        PlaylistRef playlist2 = videoAsset.playlist();
        String headline = playlist2 != null ? playlist2.getHeadline() : null;
        String aspectRatio = videoAsset.getAspectRatio();
        Map b2 = this.b.b(videoAsset, z79Var.c());
        String e = z79Var.e();
        if (e == null) {
            e = videoAsset.getSectionDisplayName();
        }
        String str2 = e;
        String d = z79Var.d();
        Asset c = z79Var.c();
        Long valueOf3 = c != null ? Long.valueOf(c.getAssetId()) : null;
        boolean d2 = d(videoAsset, z79Var.c());
        Long valueOf4 = !z ? Long.valueOf(a) : null;
        Video video = videoAsset.getVideo();
        boolean canShowAds = video != null ? video.getCanShowAds() : false;
        Video video2 = videoAsset.getVideo();
        String transcript = video2 != null ? video2.getTranscript() : null;
        Video video3 = videoAsset.getVideo();
        if (video3 == null || (productionType = video3.getProductionType()) == null || (videoProductionType = VideoProductionType.Companion.safeValueOf(productionType)) == null) {
            videoProductionType = VideoProductionType.UNKNOWN__;
        }
        NYTMediaItem nYTMediaItem = new NYTMediaItem(valueOf, b, displayTitle2, displayTitle, 0L, false, false, safeUri, null, null, null, null, valueOf4, name, null, null, null, str2, headline, valueOf2, null, urlOrEmpty, aspectRatio, d, null, null, valueOf3, null, z, null, byline, urlOrEmpty, b2, str, d2, null, false, canShowAds, videoProductionType, transcript, g, null, 722586480, 536, null);
        String f = z79Var.f();
        return f != null ? NYTMediaItem.m(nYTMediaItem, null, null, null, null, 0L, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, f, false, false, null, null, null, null, -1, ContentMediaFormat.PARTIAL_CONTENT_PODCAST, null) : nYTMediaItem;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.z79 r8, defpackage.by0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.nytimes.android.video.viewmodels.VideoAssetToVideoItemFunc$invoke$1
            if (r0 == 0) goto L14
            r0 = r9
            com.nytimes.android.video.viewmodels.VideoAssetToVideoItemFunc$invoke$1 r0 = (com.nytimes.android.video.viewmodels.VideoAssetToVideoItemFunc$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.nytimes.android.video.viewmodels.VideoAssetToVideoItemFunc$invoke$1 r0 = new com.nytimes.android.video.viewmodels.VideoAssetToVideoItemFunc$invoke$1
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L34
            java.lang.Object r7 = r6.L$1
            r8 = r7
            z79 r8 = (defpackage.z79) r8
            java.lang.Object r7 = r6.L$0
            com.nytimes.android.video.viewmodels.VideoAssetToVideoItemFunc r7 = (com.nytimes.android.video.viewmodels.VideoAssetToVideoItemFunc) r7
            kotlin.f.b(r9)
            goto L61
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            kotlin.f.b(r9)
            xo4 r1 = r7.b
            java.lang.Object r9 = r8.h()
            com.nytimes.android.api.cms.VideoAsset r9 = (com.nytimes.android.api.cms.VideoAsset) r9
            java.lang.String r3 = r8.a()
            java.lang.String r4 = r8.b()
            boolean r5 = r8.i()
            r6.L$0 = r7
            r6.L$1 = r8
            r6.label = r2
            r2 = r9
            java.lang.Object r9 = r1.a(r2, r3, r4, r5, r6)
            if (r9 != r0) goto L61
            return r0
        L61:
            java.lang.String r9 = (java.lang.String) r9
            com.nytimes.android.media.common.NYTMediaItem r7 = r7.a(r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.video.viewmodels.VideoAssetToVideoItemFunc.c(z79, by0):java.lang.Object");
    }
}
