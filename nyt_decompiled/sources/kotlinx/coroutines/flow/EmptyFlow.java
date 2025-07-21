package kotlinx.coroutines.flow;

import defpackage.by0;
import defpackage.ww8;

/* loaded from: classes5.dex */
final class EmptyFlow implements Flow {
    public static final EmptyFlow INSTANCE = new EmptyFlow();

    private EmptyFlow() {
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<?> flowCollector, by0<? super ww8> by0Var) {
        return ww8.a;
    }
}
