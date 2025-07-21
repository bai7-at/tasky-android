package kotlinx.coroutines.selects;

import defpackage.bk3;
import defpackage.by0;
import defpackage.hc1;
import defpackage.ss2;
import kotlin.Result;
import kotlin.coroutines.intrinsics.a;
import kotlin.f;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes5.dex */
public final class SelectOldKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void resumeUndispatched(CancellableContinuation<? super T> cancellableContinuation, T t) {
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) cancellableContinuation.getContext().get(CoroutineDispatcher.Key);
        if (coroutineDispatcher != null) {
            cancellableContinuation.resumeUndispatched(coroutineDispatcher, t);
        } else {
            cancellableContinuation.resumeWith(Result.b(t));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resumeUndispatchedWithException(CancellableContinuation<?> cancellableContinuation, Throwable th) {
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) cancellableContinuation.getContext().get(CoroutineDispatcher.Key);
        if (coroutineDispatcher != null) {
            cancellableContinuation.resumeUndispatchedWithException(coroutineDispatcher, th);
        } else {
            Result.a aVar = Result.a;
            cancellableContinuation.resumeWith(Result.b(f.a(th)));
        }
    }

    public static final <R> Object selectOld(ss2 ss2Var, by0<? super R> by0Var) {
        SelectBuilderImpl selectBuilderImpl = new SelectBuilderImpl(by0Var);
        try {
            ss2Var.invoke(selectBuilderImpl);
        } catch (Throwable th) {
            selectBuilderImpl.handleBuilderException(th);
        }
        Object result = selectBuilderImpl.getResult();
        if (result == a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }

    private static final <R> Object selectOld$$forInline(ss2 ss2Var, by0<? super R> by0Var) {
        bk3.c(0);
        SelectBuilderImpl selectBuilderImpl = new SelectBuilderImpl(by0Var);
        try {
            ss2Var.invoke(selectBuilderImpl);
        } catch (Throwable th) {
            selectBuilderImpl.handleBuilderException(th);
        }
        Object result = selectBuilderImpl.getResult();
        if (result == a.h()) {
            hc1.c(by0Var);
        }
        bk3.c(1);
        return result;
    }

    public static final <R> Object selectUnbiasedOld(ss2 ss2Var, by0<? super R> by0Var) {
        UnbiasedSelectBuilderImpl unbiasedSelectBuilderImpl = new UnbiasedSelectBuilderImpl(by0Var);
        try {
            ss2Var.invoke(unbiasedSelectBuilderImpl);
        } catch (Throwable th) {
            unbiasedSelectBuilderImpl.handleBuilderException(th);
        }
        Object initSelectResult = unbiasedSelectBuilderImpl.initSelectResult();
        if (initSelectResult == a.h()) {
            hc1.c(by0Var);
        }
        return initSelectResult;
    }

    private static final <R> Object selectUnbiasedOld$$forInline(ss2 ss2Var, by0<? super R> by0Var) {
        bk3.c(0);
        UnbiasedSelectBuilderImpl unbiasedSelectBuilderImpl = new UnbiasedSelectBuilderImpl(by0Var);
        try {
            ss2Var.invoke(unbiasedSelectBuilderImpl);
        } catch (Throwable th) {
            unbiasedSelectBuilderImpl.handleBuilderException(th);
        }
        Object initSelectResult = unbiasedSelectBuilderImpl.initSelectResult();
        if (initSelectResult == a.h()) {
            hc1.c(by0Var);
        }
        bk3.c(1);
        return initSelectResult;
    }
}
