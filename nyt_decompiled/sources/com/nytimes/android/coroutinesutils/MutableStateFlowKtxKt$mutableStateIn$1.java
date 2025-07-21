package com.nytimes.android.coroutinesutils;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.coroutinesutils.MutableStateFlowKtxKt$mutableStateIn$1", f = "MutableStateFlowKtx.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class MutableStateFlowKtxKt$mutableStateIn$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ MutableStateFlow<Object> $flow;
    final /* synthetic */ Flow<Object> $this_mutableStateIn;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MutableStateFlowKtxKt$mutableStateIn$1(Flow flow, MutableStateFlow mutableStateFlow, by0 by0Var) {
        super(2, by0Var);
        this.$this_mutableStateIn = flow;
        this.$flow = mutableStateFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new MutableStateFlowKtxKt$mutableStateIn$1(this.$this_mutableStateIn, this.$flow, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Flow<Object> flow = this.$this_mutableStateIn;
            MutableStateFlow<Object> mutableStateFlow = this.$flow;
            this.label = 1;
            if (flow.collect(mutableStateFlow, this) == h) {
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
        return ((MutableStateFlowKtxKt$mutableStateIn$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
