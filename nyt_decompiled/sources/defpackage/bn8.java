package defpackage;

import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class bn8 {
    private final MutableStateFlow a;
    private final StateFlow b;

    public bn8() {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.a = MutableStateFlow;
        this.b = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final StateFlow a() {
        return this.b;
    }

    public final void b() {
        MutableStateFlow mutableStateFlow = this.a;
        ((Boolean) mutableStateFlow.getValue()).booleanValue();
        mutableStateFlow.setValue(Boolean.TRUE);
    }
}
