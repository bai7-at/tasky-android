package com.dropbox.flow.multicast;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

@fc1(c = "com.dropbox.flow.multicast.Multicaster$newDownstream$2", f = "Multicaster.kt", l = {117}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class Multicaster$newDownstream$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ boolean $piggybackOnly;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Multicaster this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Multicaster$newDownstream$2(Multicaster multicaster, boolean z, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = multicaster;
        this.$piggybackOnly = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        Multicaster$newDownstream$2 multicaster$newDownstream$2 = new Multicaster$newDownstream$2(this.this$0, this.$piggybackOnly, by0Var);
        multicaster$newDownstream$2.L$0 = obj;
        return multicaster$newDownstream$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            Channel Channel$default = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
            Flow onCompletion = FlowKt.onCompletion(FlowKt.flow(new Multicaster$newDownstream$2$invokeSuspend$$inlined$transform$1(FlowKt.onStart(FlowKt.consumeAsFlow(Channel$default), new Multicaster$newDownstream$2$subFlow$1(this.this$0, Channel$default, this.$piggybackOnly, null)), null)), new Multicaster$newDownstream$2$subFlow$3(this.this$0, Channel$default, null));
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, onCompletion, this) == h) {
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
    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
        return ((Multicaster$newDownstream$2) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
