package com.nytimes.android.feedback.zendesk;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.feedback.zendesk.ZendeskProvider", f = "ZendeskProvider.kt", l = {55, 59}, m = "sendFeedback")
/* loaded from: classes4.dex */
final class ZendeskProvider$sendFeedback$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ZendeskProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ZendeskProvider$sendFeedback$1(ZendeskProvider zendeskProvider, by0 by0Var) {
        super(by0Var);
        this.this$0 = zendeskProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(null, null, null, null, this);
    }
}
