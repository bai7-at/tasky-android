package com.nytimes.android.media.video.presenter;

import android.content.Intent;
import com.nytimes.android.assetretriever.AssetRetriever;
import com.nytimes.android.video.viewmodels.VideoAssetToVideoItemFunc;
import defpackage.j89;
import defpackage.r57;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class FullscreenVideoFetcher {
    private final Intent a;
    private final j89 b;
    private final VideoAssetToVideoItemFunc c;
    private final AssetRetriever d;
    private final r57 e;

    public FullscreenVideoFetcher(Intent intent, j89 j89Var, VideoAssetToVideoItemFunc videoAssetToVideoItemFunc, AssetRetriever assetRetriever, r57 r57Var) {
        zq3.h(intent, "intent");
        zq3.h(j89Var, "videoReferringMapper");
        zq3.h(videoAssetToVideoItemFunc, "videoAssetToVideoItemFunc");
        zq3.h(assetRetriever, "assetRetriever");
        zq3.h(r57Var, "sectionFrontStore");
        this.a = intent;
        this.b = j89Var;
        this.c = videoAssetToVideoItemFunc;
        this.d = assetRetriever;
        this.e = r57Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0143 A[PHI: r1
      0x0143: PHI (r1v23 java.lang.Object) = (r1v15 java.lang.Object), (r1v1 java.lang.Object) binds: [B:26:0x0140, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0142 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.nytimes.android.media.util.VideoUtil.VideoRes r22, defpackage.by0 r23) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.media.video.presenter.FullscreenVideoFetcher.a(com.nytimes.android.media.util.VideoUtil$VideoRes, by0):java.lang.Object");
    }
}
