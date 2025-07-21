package com.nytimes.android.assetretriever;

import com.comscore.android.util.AndroidTcfDataLoader;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.nytimes.android.assetretriever.AssetDownloader$fetchPendingAssets$3", f = "AssetDownloader.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AssetDownloader$fetchPendingAssets$3 extends SuspendLambda implements gt2 {
    final /* synthetic */ AtomicInteger $downloadingCount;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetDownloader this$0;

    @fc1(c = "com.nytimes.android.assetretriever.AssetDownloader$fetchPendingAssets$3$1", f = "AssetDownloader.kt", l = {75, AndroidTcfDataLoader.COMSCORE_VENDOR_INDEX}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.assetretriever.AssetDownloader$fetchPendingAssets$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ AtomicInteger $downloadingCount;
        final /* synthetic */ e $uri;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AssetDownloader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AssetDownloader assetDownloader, e eVar, AtomicInteger atomicInteger, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = assetDownloader;
            this.$uri = eVar;
            this.$downloadingCount = atomicInteger;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$uri, this.$downloadingCount, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            NetworkStatus networkStatus;
            h hVar;
            h hVar2;
            FlowCollector flowCollector;
            NetworkStatus networkStatus2;
            com.nytimes.android.coroutinesutils.d dVar;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            try {
                try {
                } catch (Exception e) {
                    NYTLogger.e(e);
                    networkStatus = this.this$0.b;
                    if (networkStatus.g()) {
                        hVar = this.this$0.c;
                        hVar.k(this.$uri);
                    }
                }
                if (i == 0) {
                    kotlin.f.b(obj);
                    flowCollector = (FlowCollector) this.L$0;
                    networkStatus2 = this.this$0.b;
                    if (networkStatus2.g()) {
                        dVar = this.this$0.a;
                        e eVar = this.$uri;
                        this.L$0 = flowCollector;
                        this.label = 1;
                        obj = dVar.b(eVar, this);
                        if (obj == h) {
                            return h;
                        }
                    }
                    return ww8.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.f.b(obj);
                    return ww8.a;
                }
                flowCollector = (FlowCollector) this.L$0;
                kotlin.f.b(obj);
                NYTLogger.d("Downloaded asset " + this.$uri, new Object[0]);
                this.L$0 = null;
                this.label = 2;
                if (flowCollector.emit((Asset) obj, this) == h) {
                    return h;
                }
                return ww8.a;
            } finally {
                this.$downloadingCount.decrementAndGet();
                hVar2 = this.this$0.c;
                hVar2.o(this.$uri, false);
            }
        }

        @Override // defpackage.gt2
        public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
            return ((AnonymousClass1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetDownloader$fetchPendingAssets$3(AssetDownloader assetDownloader, AtomicInteger atomicInteger, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = assetDownloader;
        this.$downloadingCount = atomicInteger;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(e eVar, by0 by0Var) {
        return ((AssetDownloader$fetchPendingAssets$3) create(eVar, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        AssetDownloader$fetchPendingAssets$3 assetDownloader$fetchPendingAssets$3 = new AssetDownloader$fetchPendingAssets$3(this.this$0, this.$downloadingCount, by0Var);
        assetDownloader$fetchPendingAssets$3.L$0 = obj;
        return assetDownloader$fetchPendingAssets$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        return FlowKt.flow(new AnonymousClass1(this.this$0, (e) this.L$0, this.$downloadingCount, null));
    }
}
