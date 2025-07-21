package defpackage;

import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes4.dex */
public final class p82 implements o82 {
    public static final p82 a = new p82();
    private static final MutableSharedFlow b = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);

    private p82() {
    }

    @Override // defpackage.o82
    public Flow a() {
        return FlowKt.distinctUntilChanged(b);
    }

    public final Object b(w05 w05Var, by0 by0Var) {
        Object emit = b.emit(w05Var, by0Var);
        return emit == a.h() ? emit : ww8.a;
    }
}
