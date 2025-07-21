package com.nytimes.android.ribbon.destinations;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.ribbon.destinations.DestinationAssetRepository", f = "DestinationAssetRepository.kt", l = {76}, m = "getPersonalizedSectionFront")
/* loaded from: classes4.dex */
final class DestinationAssetRepository$getPersonalizedSectionFront$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DestinationAssetRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DestinationAssetRepository$getPersonalizedSectionFront$1(DestinationAssetRepository destinationAssetRepository, by0 by0Var) {
        super(by0Var);
        this.this$0 = destinationAssetRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.j(null, null, null, false, this);
    }
}
