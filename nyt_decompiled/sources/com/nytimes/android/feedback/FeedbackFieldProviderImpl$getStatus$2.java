package com.nytimes.android.feedback;

import com.nytimes.android.feedback.Status;
import defpackage.by0;
import defpackage.ed2;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.tc2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.feedback.FeedbackFieldProviderImpl$getStatus$2", f = "FeedbackFieldProviderImpl.kt", l = {93}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FeedbackFieldProviderImpl$getStatus$2 extends SuspendLambda implements gt2 {
    Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ FeedbackFieldProviderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedbackFieldProviderImpl$getStatus$2(FeedbackFieldProviderImpl feedbackFieldProviderImpl, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = feedbackFieldProviderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FeedbackFieldProviderImpl$getStatus$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Status.a aVar;
        tc2 tc2Var;
        boolean z;
        ed2 ed2Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            kotlin.f.b(obj);
            aVar = Status.Companion;
            tc2Var = this.this$0.d;
            boolean a = tc2Var.h().a();
            FeedbackFieldProviderImpl feedbackFieldProviderImpl = this.this$0;
            this.L$0 = aVar;
            this.Z$0 = a;
            this.label = 1;
            Object e = feedbackFieldProviderImpl.e(this);
            if (e == h) {
                return h;
            }
            z = a;
            obj = e;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.Z$0;
            aVar = (Status.a) this.L$0;
            kotlin.f.b(obj);
        }
        Status a2 = aVar.a(z, (String) obj);
        ed2Var = this.this$0.e;
        return a2.getResString(ed2Var).a();
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((FeedbackFieldProviderImpl$getStatus$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
