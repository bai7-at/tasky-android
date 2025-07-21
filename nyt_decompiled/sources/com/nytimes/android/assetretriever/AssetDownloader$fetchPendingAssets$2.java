package com.nytimes.android.assetretriever;

import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@fc1(c = "com.nytimes.android.assetretriever.AssetDownloader$fetchPendingAssets$2", f = "AssetDownloader.kt", l = {LockFreeTaskQueueCore.CLOSED_SHIFT, MdtaMetadataEntry.TYPE_INDICATOR_INT32}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AssetDownloader$fetchPendingAssets$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ AtomicInteger $downloadingCount;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AssetDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetDownloader$fetchPendingAssets$2(AssetDownloader assetDownloader, AtomicInteger atomicInteger, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = assetDownloader;
        this.$downloadingCount = atomicInteger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        AssetDownloader$fetchPendingAssets$2 assetDownloader$fetchPendingAssets$2 = new AssetDownloader$fetchPendingAssets$2(this.this$0, this.$downloadingCount, by0Var);
        assetDownloader$fetchPendingAssets$2.L$0 = obj;
        return assetDownloader$fetchPendingAssets$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b6, code lost:
    
        if (r9.g() != false) goto L11;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0067 -> B:9:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0070 -> B:9:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009f -> B:9:0x00a2). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r8.label
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L18
            if (r1 != r2) goto L10
            goto L18
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L18:
            java.lang.Object r1 = r8.L$1
            com.nytimes.android.assetretriever.e r1 = (com.nytimes.android.assetretriever.e) r1
            java.lang.Object r5 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            kotlin.f.b(r9)
            goto La2
        L25:
            kotlin.f.b(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
            r5 = r9
        L2d:
            com.nytimes.android.assetretriever.AssetDownloader r9 = r8.this$0
            com.nytimes.android.assetretriever.h r9 = com.nytimes.android.assetretriever.AssetDownloader.b(r9)
            com.nytimes.android.assetretriever.e r1 = r9.v()
            if (r1 == 0) goto L6a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r6 = "Downloading asset "
            r9.append(r6)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            java.lang.Object[] r6 = new java.lang.Object[r3]
            com.nytimes.android.logging.NYTLogger.d(r9, r6)
            com.nytimes.android.assetretriever.AssetDownloader r9 = r8.this$0
            com.nytimes.android.assetretriever.h r9 = com.nytimes.android.assetretriever.AssetDownloader.b(r9)
            r9.o(r1, r4)
            java.util.concurrent.atomic.AtomicInteger r9 = r8.$downloadingCount
            r9.incrementAndGet()
            r8.L$0 = r5
            r8.L$1 = r1
            r8.label = r4
            java.lang.Object r9 = r5.emit(r1, r8)
            if (r9 != r0) goto La2
            return r0
        L6a:
            java.util.concurrent.atomic.AtomicInteger r9 = r8.$downloadingCount
            int r9 = r9.get()
            if (r9 <= 0) goto La2
            java.util.concurrent.atomic.AtomicInteger r9 = r8.$downloadingCount
            int r9 = r9.get()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "No uri found, waiting for "
            r6.append(r7)
            r6.append(r9)
            java.lang.String r9 = " assets to download"
            r6.append(r9)
            java.lang.String r9 = r6.toString()
            java.lang.Object[] r6 = new java.lang.Object[r3]
            com.nytimes.android.logging.NYTLogger.d(r9, r6)
            r8.L$0 = r5
            r8.L$1 = r1
            r8.label = r2
            r6 = 200(0xc8, double:9.9E-322)
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.delay(r6, r8)
            if (r9 != r0) goto La2
            return r0
        La2:
            if (r1 != 0) goto Lac
            java.util.concurrent.atomic.AtomicInteger r9 = r8.$downloadingCount
            int r9 = r9.get()
            if (r9 <= 0) goto Lb8
        Lac:
            com.nytimes.android.assetretriever.AssetDownloader r9 = r8.this$0
            com.nytimes.android.utils.NetworkStatus r9 = com.nytimes.android.assetretriever.AssetDownloader.a(r9)
            boolean r9 = r9.g()
            if (r9 != 0) goto L2d
        Lb8:
            java.lang.String r8 = "No more assets to download found"
            java.lang.Object[] r9 = new java.lang.Object[r3]
            com.nytimes.android.logging.NYTLogger.d(r8, r9)
            ww8 r8 = defpackage.ww8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.assetretriever.AssetDownloader$fetchPendingAssets$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((AssetDownloader$fetchPendingAssets$2) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
