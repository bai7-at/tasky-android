package com.nytimes.android.eventtracker.buffer;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.eventtracker.buffer.DefaultEventBuffer", f = "DefaultEventBuffer.kt", l = {82}, m = "fetchPendingUpload")
/* loaded from: classes4.dex */
final class DefaultEventBuffer$fetchPendingUpload$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultEventBuffer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultEventBuffer$fetchPendingUpload$1(DefaultEventBuffer defaultEventBuffer, by0 by0Var) {
        super(by0Var);
        this.this$0 = defaultEventBuffer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.b(this);
    }
}
