package com.dropbox.android.external.store4.impl;

import com.dropbox.android.external.store4.ResponseOrigin;
import defpackage.b38;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "com.dropbox.android.external.store4.impl.SourceOfTruthWithBarrier$reader$1$1$1", f = "SourceOfTruthWithBarrier.kt", l = {116}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SourceOfTruthWithBarrier$reader$1$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Throwable $writeError;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SourceOfTruthWithBarrier$reader$1$1$1(Throwable th, by0 by0Var) {
        super(2, by0Var);
        this.$writeError = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SourceOfTruthWithBarrier$reader$1$1$1 sourceOfTruthWithBarrier$reader$1$1$1 = new SourceOfTruthWithBarrier$reader$1$1$1(this.$writeError, by0Var);
        sourceOfTruthWithBarrier$reader$1$1$1.L$0 = obj;
        return sourceOfTruthWithBarrier$reader$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Throwable th = this.$writeError;
            if (th != null) {
                b38.b.a aVar = new b38.b.a(th, ResponseOrigin.SourceOfTruth);
                this.label = 1;
                if (flowCollector.emit(aVar, this) == h) {
                    return h;
                }
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
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((SourceOfTruthWithBarrier$reader$1$1$1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
