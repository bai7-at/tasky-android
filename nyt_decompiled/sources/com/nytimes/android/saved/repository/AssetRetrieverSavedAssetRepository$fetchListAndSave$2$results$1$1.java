package com.nytimes.android.saved.repository;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.s87;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.saved.repository.AssetRetrieverSavedAssetRepository$fetchListAndSave$2$results$1$1", f = "AssetRetrieverSavedAssetRepository.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AssetRetrieverSavedAssetRepository$fetchListAndSave$2$results$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ s87 $it;
    int label;
    final /* synthetic */ AssetRetrieverSavedAssetRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetRetrieverSavedAssetRepository$fetchListAndSave$2$results$1$1(AssetRetrieverSavedAssetRepository assetRetrieverSavedAssetRepository, s87 s87Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = assetRetrieverSavedAssetRepository;
        this.$it = s87Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new AssetRetrieverSavedAssetRepository$fetchListAndSave$2$results$1$1(this.this$0, this.$it, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            AssetRetrieverSavedAssetRepository assetRetrieverSavedAssetRepository = this.this$0;
            s87 s87Var = this.$it;
            this.label = 1;
            obj = assetRetrieverSavedAssetRepository.d(s87Var, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((AssetRetrieverSavedAssetRepository$fetchListAndSave$2$results$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
