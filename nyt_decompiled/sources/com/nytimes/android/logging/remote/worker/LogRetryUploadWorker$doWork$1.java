package com.nytimes.android.logging.remote.worker;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.logging.remote.worker.LogRetryUploadWorker", f = "LogRetryUploadWorker.kt", l = {33, 44}, m = "doWork")
/* loaded from: classes4.dex */
final class LogRetryUploadWorker$doWork$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LogRetryUploadWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LogRetryUploadWorker$doWork$1(LogRetryUploadWorker logRetryUploadWorker, by0 by0Var) {
        super(by0Var);
        this.this$0 = logRetryUploadWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.b(this);
    }
}
