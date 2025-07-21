package com.nytimes.android.saved.repository;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.saved.repository.AssetRetrieverSavedAssetRepository", f = "AssetRetrieverSavedAssetRepository.kt", l = {52, 50}, m = "fetch")
/* loaded from: classes4.dex */
final class AssetRetrieverSavedAssetRepository$fetch$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AssetRetrieverSavedAssetRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetRetrieverSavedAssetRepository$fetch$1(AssetRetrieverSavedAssetRepository assetRetrieverSavedAssetRepository, by0 by0Var) {
        super(by0Var);
        this.this$0 = assetRetrieverSavedAssetRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.b(null, this);
    }
}
