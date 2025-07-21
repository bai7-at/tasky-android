package androidx.concurrent.futures;

import defpackage.by0;
import defpackage.hc1;
import defpackage.j64;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.concurrent.ExecutionException;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes.dex */
public abstract class ListenableFutureKt {
    public static final Object b(final j64 j64Var, by0 by0Var) {
        try {
            if (j64Var.isDone()) {
                return AbstractResolvableFuture.j(j64Var);
            }
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
            j64Var.a(new a(j64Var, cancellableContinuationImpl), DirectExecutor.INSTANCE);
            cancellableContinuationImpl.invokeOnCancellation(new ss2() { // from class: androidx.concurrent.futures.ListenableFutureKt$await$$inlined$suspendCancellableCoroutine$lambda$1
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return ww8.a;
                }

                public final void invoke(Throwable th) {
                    j64.this.cancel(false);
                }
            });
            Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.a.h()) {
                hc1.c(by0Var);
            }
            return result;
        } catch (ExecutionException e) {
            throw c(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable c(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        if (cause == null) {
            zq3.t();
        }
        return cause;
    }
}
