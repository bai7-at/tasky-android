package defpackage;

import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;

/* loaded from: classes4.dex */
public final class sb3 {
    private final MutableSharedFlow a = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    public final SharedFlow a(CoroutineScope coroutineScope) {
        zq3.h(coroutineScope, "scope");
        return FlowKt.shareIn(this.a, coroutineScope, SharingStarted.Companion.getLazily(), 0);
    }

    public final Object b(by0 by0Var) {
        Object emit = this.a.emit(ia4.a, by0Var);
        return emit == a.h() ? emit : ww8.a;
    }

    public final Object c(by0 by0Var) {
        Object emit = this.a.emit(ib8.a, by0Var);
        return emit == a.h() ? emit : ww8.a;
    }
}
