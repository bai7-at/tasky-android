package com.nytimes.android.push;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.push.PushMessagingFactory", f = "PushMessagingFactory.kt", l = {31, 51}, m = "make")
/* loaded from: classes4.dex */
final class PushMessagingFactory$make$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PushMessagingFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushMessagingFactory$make$1(PushMessagingFactory pushMessagingFactory, by0 by0Var) {
        super(by0Var);
        this.this$0 = pushMessagingFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.c(this);
    }
}
