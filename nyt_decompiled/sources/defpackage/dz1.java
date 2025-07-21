package defpackage;

import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;

/* loaded from: classes4.dex */
public final class dz1 {
    private final MutableSharedFlow a = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);

    public final Object a(pj7 pj7Var, by0 by0Var) {
        Object emit = this.a.emit(pj7Var, by0Var);
        return emit == a.h() ? emit : ww8.a;
    }

    public final SharedFlow b(CoroutineScope coroutineScope) {
        zq3.h(coroutineScope, "scope");
        return FlowKt.shareIn(this.a, coroutineScope, SharingStarted.Companion.getLazily(), 0);
    }
}
