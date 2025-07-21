package com.nytimes.android;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.h07;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.android.NYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$2", f = "NYTApplication.kt", l = {383}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$2 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NYTApplication this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$2(NYTApplication nYTApplication, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = nYTApplication;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(List list, by0 by0Var) {
        return ((NYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$2) create(list, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        NYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$2 nYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$2 = new NYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$2(this.this$0, by0Var);
        nYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$2.L$0 = obj;
        return nYTApplication$prefetchGlobalResourcesOnLatestFeedChanges$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            List list = (List) this.L$0;
            h07 h07Var = (h07) this.this$0.K().get();
            this.label = 1;
            if (h07Var.b(list, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return ww8.a;
    }
}
