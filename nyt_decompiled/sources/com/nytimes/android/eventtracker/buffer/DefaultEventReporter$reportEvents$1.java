package com.nytimes.android.eventtracker.buffer;

import com.nytimes.android.eventtracker.buffer.DefaultEventReporter;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@fc1(c = "com.nytimes.android.eventtracker.buffer.DefaultEventReporter$reportEvents$1", f = "DefaultEventReporter.kt", l = {64}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DefaultEventReporter$reportEvents$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ DefaultEventReporter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultEventReporter$reportEvents$1(DefaultEventReporter defaultEventReporter, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = defaultEventReporter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DefaultEventReporter$reportEvents$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            mutableSharedFlow = this.this$0.f;
            DefaultEventReporter.b bVar = new DefaultEventReporter.b();
            this.label = 1;
            if (mutableSharedFlow.emit(bVar, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DefaultEventReporter$reportEvents$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
