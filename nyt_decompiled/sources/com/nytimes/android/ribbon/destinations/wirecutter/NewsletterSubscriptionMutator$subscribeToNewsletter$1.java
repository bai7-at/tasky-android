package com.nytimes.android.ribbon.destinations.wirecutter;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.EventType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.ribbon.destinations.wirecutter.NewsletterSubscriptionMutator", f = "NewsletterSubscriptionMutator.kt", l = {EventType.SUBS}, m = "subscribeToNewsletter")
/* loaded from: classes4.dex */
final class NewsletterSubscriptionMutator$subscribeToNewsletter$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NewsletterSubscriptionMutator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NewsletterSubscriptionMutator$subscribeToNewsletter$1(NewsletterSubscriptionMutator newsletterSubscriptionMutator, by0 by0Var) {
        super(by0Var);
        this.this$0 = newsletterSubscriptionMutator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.c(null, this);
    }
}
