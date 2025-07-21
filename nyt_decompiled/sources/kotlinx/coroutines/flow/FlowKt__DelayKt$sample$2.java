package kotlinx.coroutines.flow;

import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.selects.SelectImplementation;

@fc1(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", l = {414}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class FlowKt__DelayKt$sample$2 extends SuspendLambda implements it2 {
    final /* synthetic */ long $periodMillis;
    final /* synthetic */ Flow<T> $this_sample;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__DelayKt$sample$2(long j, Flow<? extends T> flow, by0<? super FlowKt__DelayKt$sample$2> by0Var) {
        super(3, by0Var);
        this.$periodMillis = j;
        this.$this_sample = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        ReceiveChannel<ww8> fixedPeriodTicker;
        ReceiveChannel receiveChannel;
        Ref$ObjectRef ref$ObjectRef;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            FlowCollector flowCollector2 = (FlowCollector) this.L$1;
            ReceiveChannel produce$default = ProduceKt.produce$default(coroutineScope, null, -1, new FlowKt__DelayKt$sample$2$values$1(this.$this_sample, null), 1, null);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            flowCollector = flowCollector2;
            fixedPeriodTicker = FlowKt.fixedPeriodTicker(coroutineScope, this.$periodMillis);
            receiveChannel = produce$default;
            ref$ObjectRef = ref$ObjectRef2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fixedPeriodTicker = (ReceiveChannel) this.L$3;
            ref$ObjectRef = (Ref$ObjectRef) this.L$2;
            receiveChannel = (ReceiveChannel) this.L$1;
            flowCollector = (FlowCollector) this.L$0;
            f.b(obj);
        }
        while (ref$ObjectRef.element != NullSurrogateKt.DONE) {
            SelectImplementation selectImplementation = new SelectImplementation(getContext());
            selectImplementation.invoke(receiveChannel.getOnReceiveCatching(), new FlowKt__DelayKt$sample$2$1$1(ref$ObjectRef, fixedPeriodTicker, null));
            selectImplementation.invoke(fixedPeriodTicker.getOnReceive(), new FlowKt__DelayKt$sample$2$1$2(ref$ObjectRef, flowCollector, null));
            this.L$0 = flowCollector;
            this.L$1 = receiveChannel;
            this.L$2 = ref$ObjectRef;
            this.L$3 = fixedPeriodTicker;
            this.label = 1;
            if (selectImplementation.doSelect(this) == h) {
                return h;
            }
        }
        return ww8.a;
    }

    @Override // defpackage.it2
    public final Object invoke(CoroutineScope coroutineScope, FlowCollector<? super T> flowCollector, by0<? super ww8> by0Var) {
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.$periodMillis, this.$this_sample, by0Var);
        flowKt__DelayKt$sample$2.L$0 = coroutineScope;
        flowKt__DelayKt$sample$2.L$1 = flowCollector;
        return flowKt__DelayKt$sample$2.invokeSuspend(ww8.a);
    }
}
