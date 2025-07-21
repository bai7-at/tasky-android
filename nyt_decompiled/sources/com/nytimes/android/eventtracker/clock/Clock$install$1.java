package com.nytimes.android.eventtracker.clock;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.fc1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@fc1(c = "com.nytimes.android.eventtracker.clock.Clock", f = "Clock.kt", l = {47}, m = "install")
/* loaded from: classes4.dex */
final class Clock$install$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Clock this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Clock$install$1(Clock clock, by0 by0Var) {
        super(by0Var);
        this.this$0 = clock;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.a(null, this);
    }
}
