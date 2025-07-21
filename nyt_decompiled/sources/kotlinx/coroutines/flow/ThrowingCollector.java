package kotlinx.coroutines.flow;

import defpackage.by0;
import defpackage.ww8;

/* loaded from: classes5.dex */
public final class ThrowingCollector implements FlowCollector<Object> {
    public final Throwable e;

    public ThrowingCollector(Throwable th) {
        this.e = th;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(Object obj, by0<? super ww8> by0Var) {
        throw this.e;
    }
}
