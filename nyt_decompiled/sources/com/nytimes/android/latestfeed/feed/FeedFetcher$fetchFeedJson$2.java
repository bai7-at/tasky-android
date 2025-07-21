package com.nytimes.android.latestfeed.feed;

import defpackage.b04;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.s77;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.latestfeed.feed.FeedFetcher$fetchFeedJson$2", f = "FeedFetcher.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FeedFetcher$fetchFeedJson$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ FeedFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedFetcher$fetchFeedJson$2(FeedFetcher feedFetcher, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = feedFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FeedFetcher$fetchFeedJson$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b04 b04Var;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            b04Var = this.this$0.c;
            s77 s77Var = (s77) b04Var.get();
            this.label = 1;
            obj = s77Var.fetch("latestfeed.json", this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((FeedFetcher$fetchFeedJson$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
