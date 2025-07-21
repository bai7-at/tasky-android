package com.nytimes.android.feedback.workmanager;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.feedback.workmanager.FeedbackUploadJob", f = "FeedbackUploadJob.kt", l = {49, 51, 58}, m = "doWork")
/* loaded from: classes4.dex */
final class FeedbackUploadJob$doWork$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FeedbackUploadJob this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FeedbackUploadJob$doWork$1(FeedbackUploadJob feedbackUploadJob, by0 by0Var) {
        super(by0Var);
        this.this$0 = feedbackUploadJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.b(this);
    }
}
