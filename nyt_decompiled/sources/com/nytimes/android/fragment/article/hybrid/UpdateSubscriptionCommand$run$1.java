package com.nytimes.android.fragment.article.hybrid;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.fragment.article.hybrid.UpdateSubscriptionCommand", f = "UpdateSubscriptionCommand.kt", l = {42}, m = "run")
/* loaded from: classes4.dex */
final class UpdateSubscriptionCommand$run$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdateSubscriptionCommand this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateSubscriptionCommand$run$1(UpdateSubscriptionCommand updateSubscriptionCommand, by0 by0Var) {
        super(by0Var);
        this.this$0 = updateSubscriptionCommand;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.b(null, 0, null, this);
    }
}
