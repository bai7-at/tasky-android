package com.nytimes.android.section.asset;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.HasHybridProperties;
import com.nytimes.android.resourcedownloader.model.AssetResourceSource;
import com.nytimes.android.resourcedownloader.model.HybridProperties;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.h07;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.section.asset.GraphQlAssetFetcher$fetchHybridResources$1", f = "GraphQlAssetFetcher.kt", l = {64}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GraphQlAssetFetcher$fetchHybridResources$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Asset $asset;
    int label;
    final /* synthetic */ GraphQlAssetFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphQlAssetFetcher$fetchHybridResources$1(GraphQlAssetFetcher graphQlAssetFetcher, Asset asset, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = graphQlAssetFetcher;
        this.$asset = asset;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GraphQlAssetFetcher$fetchHybridResources$1(this.this$0, this.$asset, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        h07 h07Var;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            h07Var = this.this$0.f;
            HybridProperties hybridProperties = ((HasHybridProperties) this.$asset).toHybridProperties();
            AssetResourceSource assetResourceSource = new AssetResourceSource(this.$asset.getSafeUri());
            this.label = 1;
            if (h07Var.a(hybridProperties, assetResourceSource, true, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((GraphQlAssetFetcher$fetchHybridResources$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
