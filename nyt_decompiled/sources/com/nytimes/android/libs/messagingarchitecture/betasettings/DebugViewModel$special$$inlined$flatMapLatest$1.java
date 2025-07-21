package com.nytimes.android.libs.messagingarchitecture.betasettings;

import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.betasettings.DebugViewModel$special$$inlined$flatMapLatest$1", f = "DebugViewModel.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class DebugViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements it2 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ DebugViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugViewModel$special$$inlined$flatMapLatest$1(by0 by0Var, DebugViewModel debugViewModel) {
        super(3, by0Var);
        this.this$0 = debugViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Flow flow = FlowKt.flow(new DebugViewModel$queue$1$1(this.this$0, (String) this.L$1, null));
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flow, this) == h) {
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

    @Override // defpackage.it2
    public final Object invoke(FlowCollector flowCollector, Object obj, by0 by0Var) {
        DebugViewModel$special$$inlined$flatMapLatest$1 debugViewModel$special$$inlined$flatMapLatest$1 = new DebugViewModel$special$$inlined$flatMapLatest$1(by0Var, this.this$0);
        debugViewModel$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
        debugViewModel$special$$inlined$flatMapLatest$1.L$1 = obj;
        return debugViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(ww8.a);
    }
}
