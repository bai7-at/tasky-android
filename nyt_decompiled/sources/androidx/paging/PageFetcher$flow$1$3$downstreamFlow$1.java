package androidx.paging;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.yn5;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "androidx.paging.PageFetcher$flow$1$3$downstreamFlow$1", f = "PageFetcher.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PageFetcher$flow$1$3$downstreamFlow$1 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;

    PageFetcher$flow$1$3$downstreamFlow$1(by0 by0Var) {
        super(2, by0Var);
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(PageEvent pageEvent, by0 by0Var) {
        return ((PageFetcher$flow$1$3$downstreamFlow$1) create(pageEvent, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        PageFetcher$flow$1$3$downstreamFlow$1 pageFetcher$flow$1$3$downstreamFlow$1 = new PageFetcher$flow$1$3$downstreamFlow$1(by0Var);
        pageFetcher$flow$1$3$downstreamFlow$1.L$0 = obj;
        return pageFetcher$flow$1$3$downstreamFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        PageEvent pageEvent = (PageEvent) this.L$0;
        yn5 yn5Var = yn5.a;
        if (yn5Var.a(2)) {
            yn5Var.b(2, "Sent " + pageEvent, null);
        }
        return ww8.a;
    }
}
