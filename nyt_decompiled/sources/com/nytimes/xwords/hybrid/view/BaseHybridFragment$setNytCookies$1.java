package com.nytimes.xwords.hybrid.view;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.xwords.hybrid.view.BaseHybridFragment", f = "BaseHybridFragment.kt", l = {317}, m = "setNytCookies")
/* loaded from: classes4.dex */
final class BaseHybridFragment$setNytCookies$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseHybridFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseHybridFragment$setNytCookies$1(BaseHybridFragment baseHybridFragment, by0 by0Var) {
        super(by0Var);
        this.this$0 = baseHybridFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object W1;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        W1 = this.this$0.W1(this);
        return W1;
    }
}
