package defpackage;

import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes.dex */
final class ey4 implements dy4 {
    private final MutableSharedFlow a = SharedFlowKt.MutableSharedFlow$default(0, 16, BufferOverflow.DROP_OLDEST, 1, null);

    @Override // defpackage.dy4
    public Object a(bo3 bo3Var, by0 by0Var) {
        Object emit = b().emit(bo3Var, by0Var);
        return emit == a.h() ? emit : ww8.a;
    }

    @Override // defpackage.dy4
    public boolean c(bo3 bo3Var) {
        return b().tryEmit(bo3Var);
    }

    @Override // defpackage.eo3
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public MutableSharedFlow b() {
        return this.a;
    }
}
