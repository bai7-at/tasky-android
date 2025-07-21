package com.nytimes.android.media.video;

import com.nytimes.android.ad.a;
import com.nytimes.android.ad.params.VideoCustomAdParamProvider;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.VideoAsset;
import com.nytimes.android.latestfeed.feed.FeedStore;
import defpackage.xo4;
import defpackage.zq3;
import java.util.Map;

/* loaded from: classes4.dex */
public final class MediaVideoAdManagerImpl implements xo4 {
    private final a a;
    private final VideoCustomAdParamProvider b;
    private final FeedStore c;

    public MediaVideoAdManagerImpl(a aVar, VideoCustomAdParamProvider videoCustomAdParamProvider, FeedStore feedStore) {
        zq3.h(aVar, "adTaxonomy");
        zq3.h(videoCustomAdParamProvider, "adParamProvider");
        zq3.h(feedStore, "feedStore");
        this.a = aVar;
        this.b = videoCustomAdParamProvider;
        this.c = feedStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.xo4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.nytimes.android.api.cms.VideoAsset r9, java.lang.String r10, java.lang.String r11, boolean r12, defpackage.by0 r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof com.nytimes.android.media.video.MediaVideoAdManagerImpl$adUnitTaxonomy$1
            if (r0 == 0) goto L13
            r0 = r13
            com.nytimes.android.media.video.MediaVideoAdManagerImpl$adUnitTaxonomy$1 r0 = (com.nytimes.android.media.video.MediaVideoAdManagerImpl$adUnitTaxonomy$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.media.video.MediaVideoAdManagerImpl$adUnitTaxonomy$1 r0 = new com.nytimes.android.media.video.MediaVideoAdManagerImpl$adUnitTaxonomy$1
            r0.<init>(r8, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L4a
            if (r2 != r3) goto L42
            boolean r12 = r0.Z$0
            java.lang.Object r8 = r0.L$3
            r9 = r8
            com.nytimes.android.api.cms.VideoAsset r9 = (com.nytimes.android.api.cms.VideoAsset) r9
            java.lang.Object r8 = r0.L$2
            com.nytimes.android.ad.a r8 = (com.nytimes.android.ad.a) r8
            java.lang.Object r10 = r0.L$1
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r0.L$0
            java.lang.String r10 = (java.lang.String) r10
            kotlin.f.b(r13)
            r2 = r8
            r3 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            goto L6c
        L42:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4a:
            kotlin.f.b(r13)
            com.nytimes.android.ad.a r13 = r8.a
            com.nytimes.android.latestfeed.feed.FeedStore r8 = r8.c
            r0.L$0 = r10
            r0.L$1 = r11
            r0.L$2 = r13
            r0.L$3 = r9
            r0.Z$0 = r12
            r0.label = r3
            r2 = 0
            r4 = 0
            java.lang.Object r8 = com.nytimes.android.latestfeed.feed.FeedStore.d(r8, r2, r0, r3, r4)
            if (r8 != r1) goto L66
            return r1
        L66:
            r3 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r2 = r13
            r13 = r8
        L6c:
            r4 = r13
            com.nytimes.android.api.cms.LatestFeed r4 = (com.nytimes.android.api.cms.LatestFeed) r4
            java.lang.String r8 = defpackage.yo4.a(r2, r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.media.video.MediaVideoAdManagerImpl.a(com.nytimes.android.api.cms.VideoAsset, java.lang.String, java.lang.String, boolean, by0):java.lang.Object");
    }

    @Override // defpackage.xo4
    public Map b(VideoAsset videoAsset, Asset asset) {
        zq3.h(videoAsset, "videoAsset");
        return this.b.f(videoAsset, asset);
    }
}
