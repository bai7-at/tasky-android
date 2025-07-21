package com.nytimes.android.productlanding.adapters;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.productlanding.adapters.GrowthUISubscriptionAdapter", f = "GrowthUISubscriptionAdapter.kt", l = {41}, m = "launchPurchase")
/* loaded from: classes4.dex */
final class GrowthUISubscriptionAdapter$launchPurchase$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GrowthUISubscriptionAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GrowthUISubscriptionAdapter$launchPurchase$1(GrowthUISubscriptionAdapter growthUISubscriptionAdapter, by0 by0Var) {
        super(by0Var);
        this.this$0 = growthUISubscriptionAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.b(null, null, this);
    }
}
