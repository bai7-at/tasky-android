package kotlinx.coroutines.flow.internal;

import defpackage.by0;
import defpackage.ww8;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes5.dex */
public final class NopCollector implements FlowCollector<Object> {
    public static final NopCollector INSTANCE = new NopCollector();

    private NopCollector() {
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(Object obj, by0<? super ww8> by0Var) {
        return ww8.a;
    }
}
