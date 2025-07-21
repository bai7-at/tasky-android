package com.nytimes.android.eventtracker.buffer;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.eventtracker.buffer.DefaultEventReporter", f = "DefaultEventReporter.kt", l = {78, 82, 91, 94}, m = "triggerUpload")
/* loaded from: classes4.dex */
final class DefaultEventReporter$triggerUpload$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultEventReporter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultEventReporter$triggerUpload$1(DefaultEventReporter defaultEventReporter, by0 by0Var) {
        super(by0Var);
        this.this$0 = defaultEventReporter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.f(this);
    }
}
