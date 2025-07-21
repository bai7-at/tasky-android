package com.nytimes.android.readerhybrid;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.readerhybrid.HybridUserInfoBuilder", f = "HybridUserInfoBuilder.kt", l = {20}, m = "buildUserInfo")
/* loaded from: classes4.dex */
final class HybridUserInfoBuilder$buildUserInfo$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HybridUserInfoBuilder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridUserInfoBuilder$buildUserInfo$1(HybridUserInfoBuilder hybridUserInfoBuilder, by0 by0Var) {
        super(by0Var);
        this.this$0 = hybridUserInfoBuilder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.c(this);
    }
}
