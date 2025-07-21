package kotlinx.coroutines.reactive;

import defpackage.g86;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__ContextKt;

/* loaded from: classes5.dex */
public final class FlowKt {
    public static final /* synthetic */ g86 asPublisher(Flow flow) {
        g86 asPublisher$default;
        asPublisher$default = ReactiveFlowKt.asPublisher$default(flow, null, 1, null);
        return asPublisher$default;
    }

    public static final /* synthetic */ Flow asFlow(g86 g86Var, int i) {
        Flow buffer$default;
        buffer$default = FlowKt__ContextKt.buffer$default(ReactiveFlowKt.asFlow(g86Var), i, null, 2, null);
        return buffer$default;
    }
}
