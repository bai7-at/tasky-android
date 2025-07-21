package defpackage;

import defpackage.r42;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class rx1 implements r42.c {
    private final MutableStateFlow a;
    private final Flow b;
    private final MutableStateFlow c;
    private final Flow d;

    public rx1() {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.a = MutableStateFlow;
        this.b = FlowKt.distinctUntilChanged(FlowKt.filterNotNull(MutableStateFlow));
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.c = MutableStateFlow2;
        this.d = FlowKt.distinctUntilChanged(FlowKt.filterNotNull(MutableStateFlow2));
    }

    @Override // r42.c
    public void a(r42.b bVar) {
        zq3.h(bVar, "milestone");
        if (bVar instanceof r42.b.c) {
            r42.b.c cVar = (r42.b.c) bVar;
            if (zq3.c(cVar.b().p(), "page") || zq3.c(cVar.b().p(), "page_soft")) {
                this.a.setValue(cVar.b().d());
                this.c.setValue(cVar.b().j());
            }
        }
    }
}
