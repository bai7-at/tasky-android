package androidx.concurrent.futures;

import defpackage.j64;
import defpackage.zq3;
import java.util.concurrent.ExecutionException;
import kotlin.Result;
import kotlin.f;
import kotlinx.coroutines.CancellableContinuation;

/* loaded from: classes.dex */
final class a implements Runnable {
    private final j64 a;
    private final CancellableContinuation b;

    public a(j64 j64Var, CancellableContinuation cancellableContinuation) {
        zq3.i(j64Var, "futureToObserve");
        zq3.i(cancellableContinuation, "continuation");
        this.a = j64Var;
        this.b = cancellableContinuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable c;
        if (this.a.isCancelled()) {
            CancellableContinuation.DefaultImpls.cancel$default(this.b, null, 1, null);
            return;
        }
        try {
            CancellableContinuation cancellableContinuation = this.b;
            Result.a aVar = Result.a;
            cancellableContinuation.resumeWith(Result.b(AbstractResolvableFuture.j(this.a)));
        } catch (ExecutionException e) {
            CancellableContinuation cancellableContinuation2 = this.b;
            c = ListenableFutureKt.c(e);
            Result.a aVar2 = Result.a;
            cancellableContinuation2.resumeWith(Result.b(f.a(c)));
        }
    }
}
