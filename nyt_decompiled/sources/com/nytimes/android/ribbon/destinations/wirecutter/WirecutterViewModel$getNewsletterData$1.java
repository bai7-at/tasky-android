package com.nytimes.android.ribbon.destinations.wirecutter;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel", f = "WirecutterViewModel.kt", l = {102}, m = "getNewsletterData")
/* loaded from: classes4.dex */
final class WirecutterViewModel$getNewsletterData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WirecutterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WirecutterViewModel$getNewsletterData$1(WirecutterViewModel wirecutterViewModel, by0 by0Var) {
        super(by0Var);
        this.this$0 = wirecutterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object n;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        n = this.this$0.n(this);
        return n;
    }
}
