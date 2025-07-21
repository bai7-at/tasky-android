package com.nytimes.android.eventtracker.buffer;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.eventtracker.buffer.DefaultEventBuffer", f = "DefaultEventBuffer.kt", l = {44}, m = "captureEvent")
/* loaded from: classes4.dex */
final class DefaultEventBuffer$captureEvent$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultEventBuffer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultEventBuffer$captureEvent$1(DefaultEventBuffer defaultEventBuffer, by0 by0Var) {
        super(by0Var);
        this.this$0 = defaultEventBuffer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.f(null, null, this);
    }
}
