package com.nytimes.android.hybrid;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.hybrid.HybridEventListener", f = "HybridEventListener.kt", l = {50}, m = "collapseAd")
/* loaded from: classes4.dex */
final class HybridEventListener$collapseAd$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HybridEventListener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridEventListener$collapseAd$1(HybridEventListener hybridEventListener, by0 by0Var) {
        super(by0Var);
        this.this$0 = hybridEventListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.e(null, this);
    }
}
