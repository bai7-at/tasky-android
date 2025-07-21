package com.nytimes.android.saved.synchronization;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.saved.synchronization.AssetSynchronizer", f = "AssetSynchronizer.kt", l = {127}, m = "getAssets$saved_manager_release")
/* loaded from: classes4.dex */
final class AssetSynchronizer$getAssets$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AssetSynchronizer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AssetSynchronizer$getAssets$1(AssetSynchronizer assetSynchronizer, by0 by0Var) {
        super(by0Var);
        this.this$0 = assetSynchronizer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.e(null, 0, 0, this);
    }
}
