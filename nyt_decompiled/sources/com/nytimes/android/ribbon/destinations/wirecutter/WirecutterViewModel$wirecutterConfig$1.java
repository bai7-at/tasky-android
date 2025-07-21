package com.nytimes.android.ribbon.destinations.wirecutter;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.ribbon.destinations.wirecutter.WirecutterViewModel", f = "WirecutterViewModel.kt", l = {242}, m = "wirecutterConfig")
/* loaded from: classes4.dex */
final class WirecutterViewModel$wirecutterConfig$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WirecutterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WirecutterViewModel$wirecutterConfig$1(WirecutterViewModel wirecutterViewModel, by0 by0Var) {
        super(by0Var);
        this.this$0 = wirecutterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object B;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        B = this.this$0.B(this);
        return B;
    }
}
