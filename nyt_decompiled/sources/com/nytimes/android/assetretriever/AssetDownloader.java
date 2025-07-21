package com.nytimes.android.assetretriever;

import com.nytimes.android.utils.NetworkStatus;
import defpackage.by0;
import defpackage.pt;
import defpackage.ww8;
import defpackage.zq3;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public final class AssetDownloader {
    private final com.nytimes.android.coroutinesutils.d a;
    private final NetworkStatus b;
    private final h c;
    private final pt d;

    public AssetDownloader(com.nytimes.android.coroutinesutils.d dVar, NetworkStatus networkStatus, h hVar, pt ptVar) {
        zq3.h(dVar, "store");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(hVar, "repository");
        zq3.h(ptVar, "assetRetrieverWorkerScheduler");
        this.a = dVar;
        this.b = networkStatus;
        this.c = hVar;
        this.d = ptVar;
    }

    private final Object e(by0 by0Var) {
        this.c.e();
        this.c.q();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Object collect = FlowKt.collect(FlowKt.flatMapMerge(FlowKt.flow(new AssetDownloader$fetchPendingAssets$2(this, atomicInteger, null)), 10, new AssetDownloader$fetchPendingAssets$3(this, atomicInteger, null)), by0Var);
        return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.nytimes.android.assetretriever.e r10, org.threeten.bp.Instant r11, defpackage.by0 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.nytimes.android.assetretriever.AssetDownloader$downloadAndSaveAsset$1
            if (r0 == 0) goto L13
            r0 = r12
            com.nytimes.android.assetretriever.AssetDownloader$downloadAndSaveAsset$1 r0 = (com.nytimes.android.assetretriever.AssetDownloader$downloadAndSaveAsset$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.assetretriever.AssetDownloader$downloadAndSaveAsset$1 r0 = new com.nytimes.android.assetretriever.AssetDownloader$downloadAndSaveAsset$1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r9 = r0.L$0
            com.nytimes.android.api.cms.Asset r9 = (com.nytimes.android.api.cms.Asset) r9
            kotlin.f.b(r12)     // Catch: java.lang.Exception -> L87
            goto L83
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Object r9 = r0.L$2
            r11 = r9
            org.threeten.bp.Instant r11 = (org.threeten.bp.Instant) r11
            java.lang.Object r9 = r0.L$1
            r10 = r9
            com.nytimes.android.assetretriever.e r10 = (com.nytimes.android.assetretriever.e) r10
            java.lang.Object r9 = r0.L$0
            com.nytimes.android.assetretriever.AssetDownloader r9 = (com.nytimes.android.assetretriever.AssetDownloader) r9
            kotlin.f.b(r12)
            goto L5e
        L4a:
            kotlin.f.b(r12)
            com.nytimes.android.coroutinesutils.d r12 = r9.a
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r11
            r0.label = r4
            java.lang.Object r12 = r12.a(r10, r0)
            if (r12 != r1) goto L5e
            return r1
        L5e:
            com.nytimes.android.api.cms.Asset r12 = (com.nytimes.android.api.cms.Asset) r12
            if (r11 == 0) goto L88
            long r4 = r11.getEpochSecond()
            long r6 = r12.getLastModified()
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 <= 0) goto L88
            com.nytimes.android.coroutinesutils.d r9 = r9.a     // Catch: java.lang.Exception -> L86
            r0.L$0 = r12     // Catch: java.lang.Exception -> L86
            r11 = 0
            r0.L$1 = r11     // Catch: java.lang.Exception -> L86
            r0.L$2 = r11     // Catch: java.lang.Exception -> L86
            r0.label = r3     // Catch: java.lang.Exception -> L86
            java.lang.Object r9 = r9.b(r10, r0)     // Catch: java.lang.Exception -> L86
            if (r9 != r1) goto L80
            return r1
        L80:
            r8 = r12
            r12 = r9
            r9 = r8
        L83:
            com.nytimes.android.api.cms.Asset r12 = (com.nytimes.android.api.cms.Asset) r12     // Catch: java.lang.Exception -> L87
            goto L88
        L86:
            r9 = r12
        L87:
            r12 = r9
        L88:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.assetretriever.AssetDownloader.d(com.nytimes.android.assetretriever.e, org.threeten.bp.Instant, by0):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:(1:(1:(2:13|14)(3:16|17|18))(4:19|20|21|22))(4:23|24|21|22))(2:25|26))(3:31|32|(1:34))|27|(1:29)|24|21|22))|45|6|7|(0)(0)|27|(0)|24|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0052, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:
    
        r12 = r11;
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        r12 = r12.d;
        r0.L$0 = r11;
        r0.label = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
    
        if (r12.b(r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0057, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
    
        com.nytimes.android.logging.NYTLogger.h(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        r11 = r11.d;
        r0.L$0 = null;
        r0.label = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
    
        if (r11.b(r0) == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0090, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.nytimes.android.assetretriever.AssetDownloader, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.nytimes.android.assetretriever.AssetDownloader] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v9, types: [com.nytimes.android.assetretriever.AssetDownloader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.by0 r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.nytimes.android.assetretriever.AssetDownloader$prefetchFromService$1
            if (r0 == 0) goto L13
            r0 = r12
            com.nytimes.android.assetretriever.AssetDownloader$prefetchFromService$1 r0 = (com.nytimes.android.assetretriever.AssetDownloader$prefetchFromService$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.assetretriever.AssetDownloader$prefetchFromService$1 r0 = new com.nytimes.android.assetretriever.AssetDownloader$prefetchFromService$1
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            java.lang.String r8 = "End AssetRetrieverWorker"
            r9 = 0
            if (r2 == 0) goto L59
            if (r2 == r7) goto L4a
            if (r2 == r6) goto L46
            if (r2 == r5) goto L42
            if (r2 == r4) goto L3a
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            java.lang.Object r11 = r0.L$0
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            kotlin.f.b(r12)
            goto La6
        L42:
            kotlin.f.b(r12)
            goto L91
        L46:
            kotlin.f.b(r12)
            goto L7b
        L4a:
            java.lang.Object r11 = r0.L$0
            com.nytimes.android.assetretriever.AssetDownloader r11 = (com.nytimes.android.assetretriever.AssetDownloader) r11
            kotlin.f.b(r12)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L57
            goto L6e
        L52:
            r12 = move-exception
            r10 = r12
            r12 = r11
            r11 = r10
            goto L99
        L57:
            r12 = move-exception
            goto L81
        L59:
            kotlin.f.b(r12)
            java.lang.String r12 = "Start AssetRetrieverWorker"
            java.lang.Object[] r2 = new java.lang.Object[r9]
            com.nytimes.android.logging.NYTLogger.d(r12, r2)
            r0.L$0 = r11     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L57
            r0.label = r7     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L57
            java.lang.Object r12 = r11.e(r0)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L57
            if (r12 != r1) goto L6e
            return r1
        L6e:
            pt r11 = r11.d
            r0.L$0 = r3
            r0.label = r6
            java.lang.Object r11 = r11.b(r0)
            if (r11 != r1) goto L7b
            return r1
        L7b:
            java.lang.Object[] r11 = new java.lang.Object[r9]
            com.nytimes.android.logging.NYTLogger.d(r8, r11)
            goto L96
        L81:
            com.nytimes.android.logging.NYTLogger.h(r12)     // Catch: java.lang.Throwable -> L52
            pt r11 = r11.d
            r0.L$0 = r3
            r0.label = r5
            java.lang.Object r11 = r11.b(r0)
            if (r11 != r1) goto L91
            return r1
        L91:
            java.lang.Object[] r11 = new java.lang.Object[r9]
            com.nytimes.android.logging.NYTLogger.d(r8, r11)
        L96:
            ww8 r11 = defpackage.ww8.a
            return r11
        L99:
            pt r12 = r12.d
            r0.L$0 = r11
            r0.label = r4
            java.lang.Object r12 = r12.b(r0)
            if (r12 != r1) goto La6
            return r1
        La6:
            java.lang.Object[] r12 = new java.lang.Object[r9]
            com.nytimes.android.logging.NYTLogger.d(r8, r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.assetretriever.AssetDownloader.f(by0):java.lang.Object");
    }
}
