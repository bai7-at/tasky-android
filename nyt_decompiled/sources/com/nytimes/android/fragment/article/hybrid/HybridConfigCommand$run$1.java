package com.nytimes.android.fragment.article.hybrid;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.fragment.article.hybrid.HybridConfigCommand", f = "HybridConfigCommand.kt", l = {19}, m = "run")
/* loaded from: classes4.dex */
final class HybridConfigCommand$run$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HybridConfigCommand this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridConfigCommand$run$1(HybridConfigCommand hybridConfigCommand, by0 by0Var) {
        super(by0Var);
        this.this$0 = hybridConfigCommand;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.b(null, 0, null, this);
    }
}
