package com.nytimes.android.articlefront.hybrid;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.nytimes.android.FullscreenMediaActivity;
import com.nytimes.android.assetretriever.AssetRetriever;
import com.nytimes.android.media.video.VideoReferringSource;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.navigation.deeplink.DeepLinkManager;
import defpackage.ex;
import defpackage.h51;
import defpackage.ic3;
import defpackage.wb6;
import defpackage.zq3;

/* loaded from: classes3.dex */
public final class HybridLinkHandlerImpl implements ic3 {
    private final AssetRetriever a;
    private final DeepLinkManager b;
    private final NetworkStatus c;
    private final ex d;

    public HybridLinkHandlerImpl(AssetRetriever assetRetriever, DeepLinkManager deepLinkManager, NetworkStatus networkStatus, ex exVar) {
        zq3.h(assetRetriever, "assetRetriever");
        zq3.h(deepLinkManager, "deepLinkManager");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(exVar, "audioHybridLinkHandler");
        this.a = assetRetriever;
        this.b = deepLinkManager;
        this.c = networkStatus;
        this.d = exVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(android.content.Intent r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.articlefront.hybrid.HybridLinkHandlerImpl$retrieveAsset$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.articlefront.hybrid.HybridLinkHandlerImpl$retrieveAsset$1 r0 = (com.nytimes.android.articlefront.hybrid.HybridLinkHandlerImpl$retrieveAsset$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.articlefront.hybrid.HybridLinkHandlerImpl$retrieveAsset$1 r0 = new com.nytimes.android.articlefront.hybrid.HybridLinkHandlerImpl$retrieveAsset$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.f.b(r7)     // Catch: java.lang.Exception -> L2a
            goto L4b
        L2a:
            r5 = move-exception
            goto L4f
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            kotlin.f.b(r7)
            com.nytimes.android.assetretriever.AssetRetriever r5 = r5.a     // Catch: java.lang.Exception -> L2a
            com.nytimes.android.assetretriever.e$a r7 = com.nytimes.android.assetretriever.e.Companion     // Catch: java.lang.Exception -> L2a
            com.nytimes.android.assetretriever.e r6 = r7.b(r6)     // Catch: java.lang.Exception -> L2a
            r7 = 0
            st[] r7 = new defpackage.st[r7]     // Catch: java.lang.Exception -> L2a
            r0.label = r4     // Catch: java.lang.Exception -> L2a
            java.lang.Object r7 = r5.o(r6, r3, r7, r0)     // Catch: java.lang.Exception -> L2a
            if (r7 != r1) goto L4b
            return r1
        L4b:
            com.nytimes.android.api.cms.Asset r7 = (com.nytimes.android.api.cms.Asset) r7     // Catch: java.lang.Exception -> L2a
            r3 = r7
            goto L53
        L4f:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 != 0) goto L54
        L53:
            return r3
        L54:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.articlefront.hybrid.HybridLinkHandlerImpl.e(android.content.Intent, by0):java.lang.Object");
    }

    private final void f(Context context, Intent intent) {
        Intent intent2 = new Intent(context, (Class<?>) FullscreenMediaActivity.class);
        intent2.putExtra("com.nytimes.android.extra.FULLSCREEN_VIDEO_REFERRING_SOURCE", VideoReferringSource.ARTICLE_FRONT.ordinal());
        intent2.fillIn(intent, 2);
        context.startActivity(intent2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.ic3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(androidx.fragment.app.f r9, java.lang.String r10, java.lang.String r11, defpackage.by0 r12) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.articlefront.hybrid.HybridLinkHandlerImpl.a(androidx.fragment.app.f, java.lang.String, java.lang.String, by0):java.lang.Object");
    }

    @Override // defpackage.ic3
    public void b(Context context, String str) {
        zq3.h(context, "context");
        zq3.h(str, "url");
        h51 a = new h51.b().h(context, wb6.slide_in_bottom, 0).c(context, 0, wb6.slide_out_bottom).g(true).i(true).f(2).a();
        zq3.g(a, "build(...)");
        a.a(context, Uri.parse(str));
    }
}
