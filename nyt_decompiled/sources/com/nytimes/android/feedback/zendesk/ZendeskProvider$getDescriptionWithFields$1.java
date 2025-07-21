package com.nytimes.android.feedback.zendesk;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.feedback.zendesk.ZendeskProvider", f = "ZendeskProvider.kt", l = {105}, m = "getDescriptionWithFields")
/* loaded from: classes4.dex */
final class ZendeskProvider$getDescriptionWithFields$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ZendeskProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ZendeskProvider$getDescriptionWithFields$1(ZendeskProvider zendeskProvider, by0 by0Var) {
        super(by0Var);
        this.this$0 = zendeskProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.d(null, null, this);
    }
}
