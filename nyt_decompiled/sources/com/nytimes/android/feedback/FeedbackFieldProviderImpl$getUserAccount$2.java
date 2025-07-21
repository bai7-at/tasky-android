package com.nytimes.android.feedback;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.tc2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.feedback.FeedbackFieldProviderImpl$getUserAccount$2", f = "FeedbackFieldProviderImpl.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FeedbackFieldProviderImpl$getUserAccount$2 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ FeedbackFieldProviderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedbackFieldProviderImpl$getUserAccount$2(FeedbackFieldProviderImpl feedbackFieldProviderImpl, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = feedbackFieldProviderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FeedbackFieldProviderImpl$getUserAccount$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tc2 tc2Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            tc2Var = this.this$0.d;
            this.label = 1;
            obj = tc2Var.e(this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        }
        String str = (String) obj;
        return str == null ? "" : str;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((FeedbackFieldProviderImpl$getUserAccount$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
