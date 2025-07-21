package kotlinx.coroutines.flow;

import defpackage.by0;
import defpackage.hc1;
import defpackage.ss2;
import defpackage.v1;
import defpackage.ww8;
import defpackage.zq3;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes5.dex */
final class StateFlowSlot extends AbstractSharedFlowSlot<StateFlowImpl<?>> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(StateFlowSlot.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    private final /* synthetic */ Object get_state$volatile() {
        return this._state$volatile;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ss2 ss2Var) {
        while (true) {
            ss2Var.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void set_state$volatile(Object obj) {
        this._state$volatile = obj;
    }

    public final Object awaitPending(by0<? super ww8> by0Var) {
        Symbol symbol;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        symbol = StateFlowKt.NONE;
        if (!v1.a(atomicReferenceFieldUpdater, this, symbol, cancellableContinuationImpl)) {
            Result.a aVar = Result.a;
            cancellableContinuationImpl.resumeWith(Result.b(ww8.a));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == a.h()) {
            hc1.c(by0Var);
        }
        return result == a.h() ? result : ww8.a;
    }

    public final void makePending() {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return;
            }
            symbol = StateFlowKt.PENDING;
            if (obj == symbol) {
                return;
            }
            symbol2 = StateFlowKt.NONE;
            if (obj == symbol2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$volatile$FU;
                symbol3 = StateFlowKt.PENDING;
                if (v1.a(atomicReferenceFieldUpdater2, this, obj, symbol3)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _state$volatile$FU;
                symbol4 = StateFlowKt.NONE;
                if (v1.a(atomicReferenceFieldUpdater3, this, obj, symbol4)) {
                    Result.a aVar = Result.a;
                    ((CancellableContinuationImpl) obj).resumeWith(Result.b(ww8.a));
                    return;
                }
            }
        }
    }

    public final boolean takePending() {
        Symbol symbol;
        Symbol symbol2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        symbol = StateFlowKt.NONE;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, symbol);
        zq3.e(andSet);
        symbol2 = StateFlowKt.PENDING;
        return andSet == symbol2;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public boolean allocateLocked(StateFlowImpl<?> stateFlowImpl) {
        Symbol symbol;
        if (_state$volatile$FU.get(this) != null) {
            return false;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        symbol = StateFlowKt.NONE;
        atomicReferenceFieldUpdater.set(this, symbol);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public by0<ww8>[] freeLocked(StateFlowImpl<?> stateFlowImpl) {
        _state$volatile$FU.set(this, null);
        return AbstractSharedFlowKt.EMPTY_RESUMES;
    }
}
