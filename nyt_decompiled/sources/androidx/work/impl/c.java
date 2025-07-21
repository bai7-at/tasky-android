package androidx.work.impl;

import defpackage.j64;
import defpackage.zq3;
import java.util.concurrent.ExecutionException;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;

/* loaded from: classes.dex */
final class c implements Runnable {
    private final j64 a;
    private final CancellableContinuation b;

    public c(j64 j64Var, CancellableContinuation cancellableContinuation) {
        zq3.h(j64Var, "futureToObserve");
        zq3.h(cancellableContinuation, "continuation");
        this.a = j64Var;
        this.b = cancellableContinuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable f;
        Object e;
        if (this.a.isCancelled()) {
            CancellableContinuation.DefaultImpls.cancel$default(this.b, null, 1, null);
            return;
        }
        try {
            CancellableContinuation cancellableContinuation = this.b;
            Result.a aVar = Result.a;
            e = WorkerWrapperKt.e(this.a);
            cancellableContinuation.resumeWith(Result.b(e));
        } catch (ExecutionException e2) {
            CancellableContinuation cancellableContinuation2 = this.b;
            Result.a aVar2 = Result.a;
            f = WorkerWrapperKt.f(e2);
            cancellableContinuation2.resumeWith(Result.b(kotlin.f.a(f)));
        }
    }
}
