package com.dropbox.android.external.store4.impl;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.dropbox.android.external.store4.impl.PersistentNonFlowingSourceOfTruth$reader$1", f = "RealSourceOfTruth.kt", l = {51, 51}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PersistentNonFlowingSourceOfTruth$reader$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Object $key;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PersistentNonFlowingSourceOfTruth this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersistentNonFlowingSourceOfTruth$reader$1(PersistentNonFlowingSourceOfTruth persistentNonFlowingSourceOfTruth, Object obj, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = persistentNonFlowingSourceOfTruth;
        this.$key = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        PersistentNonFlowingSourceOfTruth$reader$1 persistentNonFlowingSourceOfTruth$reader$1 = new PersistentNonFlowingSourceOfTruth$reader$1(this.this$0, this.$key, by0Var);
        persistentNonFlowingSourceOfTruth$reader$1.L$0 = obj;
        return persistentNonFlowingSourceOfTruth$reader$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        gt2 gt2Var;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            flowCollector = (FlowCollector) this.L$0;
            gt2Var = this.this$0.b;
            Object obj2 = this.$key;
            this.L$0 = flowCollector;
            this.label = 1;
            obj = gt2Var.invoke(obj2, this);
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
        return ((PersistentNonFlowingSourceOfTruth$reader$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
