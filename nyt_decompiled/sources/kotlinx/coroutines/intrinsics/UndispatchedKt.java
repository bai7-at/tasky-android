package kotlinx.coroutines.intrinsics;

import defpackage.by0;
import defpackage.gt2;
import defpackage.hc1;
import defpackage.ku8;
import defpackage.qs2;
import defpackage.ss2;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.f;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.JobSupportKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes5.dex */
public final class UndispatchedKt {
    public static final <R, T> void startCoroutineUndispatched(gt2 gt2Var, R r, by0<? super T> by0Var) {
        by0 a = hc1.a(by0Var);
        try {
            CoroutineContext context = by0Var.getContext();
            Object updateThreadContext = ThreadContextKt.updateThreadContext(context, null);
            try {
                Object f = !(gt2Var instanceof BaseContinuationImpl) ? a.f(gt2Var, r, a) : ((gt2) ku8.f(gt2Var, 2)).invoke(r, a);
                ThreadContextKt.restoreThreadContext(context, updateThreadContext);
                if (f != a.h()) {
                    a.resumeWith(Result.b(f));
                }
            } catch (Throwable th) {
                ThreadContextKt.restoreThreadContext(context, updateThreadContext);
                throw th;
            }
        } catch (Throwable th2) {
            Result.a aVar = Result.a;
            a.resumeWith(Result.b(f.a(th2)));
        }
    }

    public static final <T> void startCoroutineUnintercepted(ss2 ss2Var, by0<? super T> by0Var) {
        by0 a = hc1.a(by0Var);
        try {
            Object e = !(ss2Var instanceof BaseContinuationImpl) ? a.e(ss2Var, a) : ((ss2) ku8.f(ss2Var, 1)).invoke(a);
            if (e != a.h()) {
                a.resumeWith(Result.b(e));
            }
        } catch (Throwable th) {
            Result.a aVar = Result.a;
            a.resumeWith(Result.b(f.a(th)));
        }
    }

    private static final <T> void startDirect(by0<? super T> by0Var, ss2 ss2Var) {
        by0 a = hc1.a(by0Var);
        try {
            Object invoke = ss2Var.invoke(a);
            if (invoke != a.h()) {
                a.resumeWith(Result.b(invoke));
            }
        } catch (Throwable th) {
            Result.a aVar = Result.a;
            a.resumeWith(Result.b(f.a(th)));
        }
    }

    public static final <T, R> Object startUndispatchedOrReturn(ScopeCoroutine<? super T> scopeCoroutine, R r, gt2 gt2Var) {
        Object completedExceptionally;
        Object makeCompletingOnce$kotlinx_coroutines_core;
        try {
            completedExceptionally = !(gt2Var instanceof BaseContinuationImpl) ? a.f(gt2Var, r, scopeCoroutine) : ((gt2) ku8.f(gt2Var, 2)).invoke(r, scopeCoroutine);
        } catch (Throwable th) {
            completedExceptionally = new CompletedExceptionally(th, false, 2, null);
        }
        if (completedExceptionally != a.h() && (makeCompletingOnce$kotlinx_coroutines_core = scopeCoroutine.makeCompletingOnce$kotlinx_coroutines_core(completedExceptionally)) != JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            if (makeCompletingOnce$kotlinx_coroutines_core instanceof CompletedExceptionally) {
                throw ((CompletedExceptionally) makeCompletingOnce$kotlinx_coroutines_core).cause;
            }
            return JobSupportKt.unboxState(makeCompletingOnce$kotlinx_coroutines_core);
        }
        return a.h();
    }

    public static final <T, R> Object startUndispatchedOrReturnIgnoreTimeout(ScopeCoroutine<? super T> scopeCoroutine, R r, gt2 gt2Var) {
        Object completedExceptionally;
        Object makeCompletingOnce$kotlinx_coroutines_core;
        try {
            completedExceptionally = !(gt2Var instanceof BaseContinuationImpl) ? a.f(gt2Var, r, scopeCoroutine) : ((gt2) ku8.f(gt2Var, 2)).invoke(r, scopeCoroutine);
        } catch (Throwable th) {
            completedExceptionally = new CompletedExceptionally(th, false, 2, null);
        }
        if (completedExceptionally != a.h() && (makeCompletingOnce$kotlinx_coroutines_core = scopeCoroutine.makeCompletingOnce$kotlinx_coroutines_core(completedExceptionally)) != JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            if (makeCompletingOnce$kotlinx_coroutines_core instanceof CompletedExceptionally) {
                Throwable th2 = ((CompletedExceptionally) makeCompletingOnce$kotlinx_coroutines_core).cause;
                if (!(th2 instanceof TimeoutCancellationException)) {
                    throw th2;
                }
                if (((TimeoutCancellationException) th2).coroutine != scopeCoroutine) {
                    throw th2;
                }
                if (completedExceptionally instanceof CompletedExceptionally) {
                    throw ((CompletedExceptionally) completedExceptionally).cause;
                }
            } else {
                completedExceptionally = JobSupportKt.unboxState(makeCompletingOnce$kotlinx_coroutines_core);
            }
            return completedExceptionally;
        }
        return a.h();
    }

    private static final <T> Object undispatchedResult(ScopeCoroutine<? super T> scopeCoroutine, ss2 ss2Var, qs2 qs2Var) {
        Object completedExceptionally;
        Object makeCompletingOnce$kotlinx_coroutines_core;
        try {
            completedExceptionally = qs2Var.mo865invoke();
        } catch (Throwable th) {
            completedExceptionally = new CompletedExceptionally(th, false, 2, null);
        }
        if (completedExceptionally != a.h() && (makeCompletingOnce$kotlinx_coroutines_core = scopeCoroutine.makeCompletingOnce$kotlinx_coroutines_core(completedExceptionally)) != JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            if (!(makeCompletingOnce$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
                return JobSupportKt.unboxState(makeCompletingOnce$kotlinx_coroutines_core);
            }
            CompletedExceptionally completedExceptionally2 = (CompletedExceptionally) makeCompletingOnce$kotlinx_coroutines_core;
            if (((Boolean) ss2Var.invoke(completedExceptionally2.cause)).booleanValue()) {
                throw completedExceptionally2.cause;
            }
            if (completedExceptionally instanceof CompletedExceptionally) {
                throw ((CompletedExceptionally) completedExceptionally).cause;
            }
            return completedExceptionally;
        }
        return a.h();
    }
}
