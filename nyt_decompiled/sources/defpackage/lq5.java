package defpackage;

import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class lq5 {
    public static final lq5 a = new lq5();

    private lq5() {
    }

    public final MutableStateFlow a() {
        return StateFlowKt.MutableStateFlow(Boolean.FALSE);
    }

    public final StateFlow b(MutableStateFlow mutableStateFlow) {
        zq3.h(mutableStateFlow, "mutableFlow");
        return FlowKt.asStateFlow(mutableStateFlow);
    }
}
