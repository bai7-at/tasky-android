package com.nytimes.android.ribbon.config;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.ribbon.config.RibbonTabConfigRepository", f = "RibbonTabConfigRepository.kt", l = {34}, m = "getRibbonConfig")
/* loaded from: classes4.dex */
final class RibbonTabConfigRepository$getRibbonConfig$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RibbonTabConfigRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RibbonTabConfigRepository$getRibbonConfig$1(RibbonTabConfigRepository ribbonTabConfigRepository, by0 by0Var) {
        super(by0Var);
        this.this$0 = ribbonTabConfigRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(this);
    }
}
