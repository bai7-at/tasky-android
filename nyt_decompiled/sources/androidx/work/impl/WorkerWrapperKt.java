package androidx.work.impl;

import androidx.work.DirectExecutor;
import defpackage.by0;
import defpackage.h94;
import defpackage.hc1;
import defpackage.j64;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes.dex */
public abstract class WorkerWrapperKt {
    private static final String a;

    static {
        String i = h94.i("WorkerWrapper");
        zq3.g(i, "tagWithPrefix(\"WorkerWrapper\")");
        a = i;
    }

    public static final Object d(final j64 j64Var, final androidx.work.b bVar, by0 by0Var) {
        try {
            if (j64Var.isDone()) {
                return e(j64Var);
            }
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
            cancellableContinuationImpl.initCancellability();
            j64Var.a(new c(j64Var, cancellableContinuationImpl), DirectExecutor.INSTANCE);
            cancellableContinuationImpl.invokeOnCancellation(new ss2() { // from class: androidx.work.impl.WorkerWrapperKt$awaitWithin$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return ww8.a;
                }

                public final void invoke(Throwable th) {
                    if (th instanceof WorkerStoppedException) {
                        androidx.work.b.this.stop(((WorkerStoppedException) th).a());
                    }
                    j64Var.cancel(false);
                }
            });
            Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.a.h()) {
                hc1.c(by0Var);
            }
            return result;
        } catch (ExecutionException e) {
            throw f(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object e(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable f(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        zq3.e(cause);
        return cause;
    }
}
