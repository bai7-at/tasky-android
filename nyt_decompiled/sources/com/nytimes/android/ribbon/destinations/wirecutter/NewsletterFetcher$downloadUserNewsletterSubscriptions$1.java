package com.nytimes.android.ribbon.destinations.wirecutter;

import androidx.recyclerview.widget.RecyclerView;
import com.comscore.streaming.EventType;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.ribbon.destinations.wirecutter.NewsletterFetcher", f = "NewsletterFetcher.kt", l = {EventType.SUBS}, m = "downloadUserNewsletterSubscriptions")
/* loaded from: classes4.dex */
final class NewsletterFetcher$downloadUserNewsletterSubscriptions$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NewsletterFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NewsletterFetcher$downloadUserNewsletterSubscriptions$1(NewsletterFetcher newsletterFetcher, by0 by0Var) {
        super(by0Var);
        this.this$0 = newsletterFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.b(this);
    }
}
