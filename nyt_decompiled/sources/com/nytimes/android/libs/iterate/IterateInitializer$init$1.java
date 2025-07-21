package com.nytimes.android.libs.iterate;

import defpackage.by0;
import defpackage.cs3;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.nytimes.android.libs.iterate.IterateInitializer$init$1", f = "IterateInitializer.kt", l = {24, 24}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class IterateInitializer$init$1 extends SuspendLambda implements gt2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IterateInitializer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IterateInitializer$init$1(IterateInitializer iterateInitializer, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = iterateInitializer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        IterateInitializer$init$1 iterateInitializer$init$1 = new IterateInitializer$init$1(this.this$0, by0Var);
        iterateInitializer$init$1.L$0 = obj;
        return iterateInitializer$init$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        cs3 cs3Var;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            flowCollector = (FlowCollector) this.L$0;
            cs3Var = this.this$0.a;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = cs3Var.a(this);
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
        this.L$0 = null;
        this.label = 2;
        if (flowCollector.emit(obj, this) == h) {
            return h;
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((IterateInitializer$init$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
