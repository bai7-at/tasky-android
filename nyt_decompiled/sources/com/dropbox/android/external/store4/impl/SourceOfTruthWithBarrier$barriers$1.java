package com.dropbox.android.external.store4.impl;

import com.dropbox.android.external.store4.impl.SourceOfTruthWithBarrier;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.StateFlowKt;

@fc1(c = "com.dropbox.android.external.store4.impl.SourceOfTruthWithBarrier$barriers$1", f = "SourceOfTruthWithBarrier.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SourceOfTruthWithBarrier$barriers$1 extends SuspendLambda implements gt2 {
    int label;

    SourceOfTruthWithBarrier$barriers$1(by0 by0Var) {
        super(2, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SourceOfTruthWithBarrier$barriers$1(by0Var);
    }

    @Override // defpackage.gt2
    public final Object invoke(Object obj, by0 by0Var) {
        return ((SourceOfTruthWithBarrier$barriers$1) create(obj, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        return StateFlowKt.MutableStateFlow(SourceOfTruthWithBarrier.a.b.c.a());
    }
}
