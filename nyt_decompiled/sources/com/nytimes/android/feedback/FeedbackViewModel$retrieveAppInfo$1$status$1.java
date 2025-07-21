package com.nytimes.android.feedback;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.wc2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.feedback.FeedbackViewModel$retrieveAppInfo$1$status$1", f = "FeedbackViewModel.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FeedbackViewModel$retrieveAppInfo$1$status$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ FeedbackViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedbackViewModel$retrieveAppInfo$1$status$1(FeedbackViewModel feedbackViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = feedbackViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FeedbackViewModel$retrieveAppInfo$1$status$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        wc2 wc2Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            wc2Var = this.this$0.b;
            this.label = 1;
            obj = wc2Var.d(this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        return obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((FeedbackViewModel$retrieveAppInfo$1$status$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
