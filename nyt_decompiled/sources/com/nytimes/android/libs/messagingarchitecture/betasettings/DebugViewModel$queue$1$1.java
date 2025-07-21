package com.nytimes.android.libs.messagingarchitecture.betasettings;

import defpackage.by0;
import defpackage.ec1;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.u14;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.libs.messagingarchitecture.betasettings.DebugViewModel$queue$1$1", f = "DebugViewModel.kt", l = {74, 72}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DebugViewModel$queue$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $unitValue;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DebugViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebugViewModel$queue$1$1(DebugViewModel debugViewModel, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = debugViewModel;
        this.$unitValue = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        DebugViewModel$queue$1$1 debugViewModel$queue$1$1 = new DebugViewModel$queue$1$1(this.this$0, this.$unitValue, by0Var);
        debugViewModel$queue$1$1.L$0 = obj;
        return debugViewModel$queue$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        ec1 ec1Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            flowCollector = (FlowCollector) this.L$0;
            ec1Var = this.this$0.a;
            String str = this.$unitValue;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = ec1Var.g(str, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return ww8.a;
            }
            flowCollector = (FlowCollector) this.L$0;
            f.b(obj);
        }
        u14.c cVar = new u14.c(obj);
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(cVar, this) == h) {
            return h;
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((DebugViewModel$queue$1$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
