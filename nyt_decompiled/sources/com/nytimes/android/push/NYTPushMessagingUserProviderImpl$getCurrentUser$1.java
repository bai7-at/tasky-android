package com.nytimes.android.push;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.push.NYTPushMessagingUserProviderImpl", f = "NYTPushMessagingUserProviderImpl.kt", l = {49, 58}, m = "getCurrentUser")
/* loaded from: classes4.dex */
final class NYTPushMessagingUserProviderImpl$getCurrentUser$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NYTPushMessagingUserProviderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NYTPushMessagingUserProviderImpl$getCurrentUser$1(NYTPushMessagingUserProviderImpl nYTPushMessagingUserProviderImpl, by0 by0Var) {
        super(by0Var);
        this.this$0 = nYTPushMessagingUserProviderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.g(this);
    }
}
