package kotlinx.coroutines;

import defpackage.bk3;
import defpackage.by0;
import defpackage.hc1;
import defpackage.ss2;
import kotlinx.coroutines.internal.DispatchedContinuation;

/* loaded from: classes5.dex */
public final class CancellableContinuationKt {
    @InternalCoroutinesApi
    public static final void disposeOnCancellation(CancellableContinuation<?> cancellableContinuation, DisposableHandle disposableHandle) {
        cancellableContinuation.invokeOnCancellation(new DisposeOnCancel(disposableHandle));
    }

    public static final <T> CancellableContinuationImpl<T> getOrCreateCancellableContinuation(by0<? super T> by0Var) {
        if (!(by0Var instanceof DispatchedContinuation)) {
            return new CancellableContinuationImpl<>(by0Var, 1);
        }
        CancellableContinuationImpl<T> claimReusableCancellableContinuation$kotlinx_coroutines_core = ((DispatchedContinuation) by0Var).claimReusableCancellableContinuation$kotlinx_coroutines_core();
        if (claimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
            if (!claimReusableCancellableContinuation$kotlinx_coroutines_core.resetStateReusable()) {
                claimReusableCancellableContinuation$kotlinx_coroutines_core = null;
            }
            if (claimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
                return claimReusableCancellableContinuation$kotlinx_coroutines_core;
            }
        }
        return new CancellableContinuationImpl<>(by0Var, 2);
    }

    public static final <T> Object suspendCancellableCoroutine(ss2 ss2Var, by0<? super T> by0Var) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        ss2Var.invoke(cancellableContinuationImpl);
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }

    private static final <T> Object suspendCancellableCoroutine$$forInline(ss2 ss2Var, by0<? super T> by0Var) {
        bk3.c(0);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        ss2Var.invoke(cancellableContinuationImpl);
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.h()) {
            hc1.c(by0Var);
        }
        bk3.c(1);
        return result;
    }

    public static final <T> Object suspendCancellableCoroutineReusable(ss2 ss2Var, by0<? super T> by0Var) {
        CancellableContinuationImpl orCreateCancellableContinuation = getOrCreateCancellableContinuation(kotlin.coroutines.intrinsics.a.d(by0Var));
        try {
            ss2Var.invoke(orCreateCancellableContinuation);
            Object result = orCreateCancellableContinuation.getResult();
            if (result == kotlin.coroutines.intrinsics.a.h()) {
                hc1.c(by0Var);
            }
            return result;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    private static final <T> Object suspendCancellableCoroutineReusable$$forInline(ss2 ss2Var, by0<? super T> by0Var) {
        bk3.c(0);
        CancellableContinuationImpl orCreateCancellableContinuation = getOrCreateCancellableContinuation(kotlin.coroutines.intrinsics.a.d(by0Var));
        try {
            ss2Var.invoke(orCreateCancellableContinuation);
            Object result = orCreateCancellableContinuation.getResult();
            if (result == kotlin.coroutines.intrinsics.a.h()) {
                hc1.c(by0Var);
            }
            bk3.c(1);
            return result;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }
}
