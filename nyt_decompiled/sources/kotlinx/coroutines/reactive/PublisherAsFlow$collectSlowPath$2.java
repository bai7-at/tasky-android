package kotlinx.coroutines.reactive;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlow;

@fc1(c = "kotlinx.coroutines.reactive.PublisherAsFlow$collectSlowPath$2", f = "ReactiveFlow.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class PublisherAsFlow$collectSlowPath$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ FlowCollector<T> $collector;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PublisherAsFlow<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PublisherAsFlow$collectSlowPath$2(FlowCollector<? super T> flowCollector, PublisherAsFlow<T> publisherAsFlow, by0<? super PublisherAsFlow$collectSlowPath$2> by0Var) {
        super(2, by0Var);
        this.$collector = flowCollector;
        this.this$0 = publisherAsFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        PublisherAsFlow$collectSlowPath$2 publisherAsFlow$collectSlowPath$2 = new PublisherAsFlow$collectSlowPath$2(this.$collector, this.this$0, by0Var);
        publisherAsFlow$collectSlowPath$2.L$0 = obj;
        return publisherAsFlow$collectSlowPath$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            FlowCollector<T> flowCollector = this.$collector;
            ChannelFlow channelFlow = this.this$0;
            ReceiveChannel produceImpl = channelFlow.produceImpl(CoroutineScopeKt.plus(coroutineScope, channelFlow.context));
            this.label = 1;
            if (kotlinx.coroutines.flow.FlowKt.emitAll(flowCollector, produceImpl, this) == h) {
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
    public final Object invoke(CoroutineScope coroutineScope, by0<? super ww8> by0Var) {
        return ((PublisherAsFlow$collectSlowPath$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
