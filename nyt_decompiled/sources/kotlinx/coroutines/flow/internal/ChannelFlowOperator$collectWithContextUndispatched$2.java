package kotlinx.coroutines.flow.internal;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;

@fc1(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {148}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class ChannelFlowOperator$collectWithContextUndispatched$2 extends SuspendLambda implements gt2 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChannelFlowOperator<S, T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelFlowOperator$collectWithContextUndispatched$2(ChannelFlowOperator<S, T> channelFlowOperator, by0<? super ChannelFlowOperator$collectWithContextUndispatched$2> by0Var) {
        super(2, by0Var);
        this.this$0 = channelFlowOperator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        ChannelFlowOperator$collectWithContextUndispatched$2 channelFlowOperator$collectWithContextUndispatched$2 = new ChannelFlowOperator$collectWithContextUndispatched$2(this.this$0, by0Var);
        channelFlowOperator$collectWithContextUndispatched$2.L$0 = obj;
        return channelFlowOperator$collectWithContextUndispatched$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            ChannelFlowOperator<S, T> channelFlowOperator = this.this$0;
            this.label = 1;
            if (channelFlowOperator.flowCollect(flowCollector, this) == h) {
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
    public final Object invoke(FlowCollector<? super T> flowCollector, by0<? super ww8> by0Var) {
        return ((ChannelFlowOperator$collectWithContextUndispatched$2) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
    }
}
