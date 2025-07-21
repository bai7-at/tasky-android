package com.nytimes.android.readerhybrid;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.readerhybrid.HybridConfigBuilder", f = "HybridConfigBuilder.kt", l = {46}, m = "buildHybridConfig")
/* loaded from: classes4.dex */
final class HybridConfigBuilder$buildHybridConfig$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HybridConfigBuilder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridConfigBuilder$buildHybridConfig$2(HybridConfigBuilder hybridConfigBuilder, by0 by0Var) {
        super(by0Var);
        this.this$0 = hybridConfigBuilder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        c = this.this$0.c(null, this);
        return c;
    }
}
