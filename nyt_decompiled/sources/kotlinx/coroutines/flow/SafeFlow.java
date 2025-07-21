package kotlinx.coroutines.flow;

import defpackage.by0;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;

/* loaded from: classes5.dex */
final class SafeFlow<T> extends AbstractFlow<T> {
    private final gt2 block;

    public SafeFlow(gt2 gt2Var) {
        this.block = gt2Var;
    }

    @Override // kotlinx.coroutines.flow.AbstractFlow
    public Object collectSafely(FlowCollector<? super T> flowCollector, by0<? super ww8> by0Var) {
        Object invoke = this.block.invoke(flowCollector, by0Var);
        return invoke == a.h() ? invoke : ww8.a;
    }
}
