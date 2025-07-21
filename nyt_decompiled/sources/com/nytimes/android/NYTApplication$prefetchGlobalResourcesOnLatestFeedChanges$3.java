package com.nytimes.android;

import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.NYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$3", f = "NYTApplication.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$3 extends SuspendLambda implements it2 {
    /* synthetic */ Object L$0;
    int label;

    NYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$3(by0 by0Var) {
        super(3, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.f.b(obj);
        NYTLogger.i((Throwable) this.L$0, "Failed to update hybrid resources on latest feed change", new Object[0]);
        return ww8.a;
    }

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Throwable th, by0 by0Var) {
        NYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$3 nYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$3 = new NYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$3(by0Var);
        nYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$3.L$0 = th;
        return nYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$3.invokeSuspend(ww8.a);
    }
}
