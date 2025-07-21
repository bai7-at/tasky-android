package androidx.core.os;

import android.os.OutcomeReceiver;
import defpackage.by0;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.f;

/* loaded from: classes.dex */
final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {
    private final by0<R> continuation;

    public ContinuationOutcomeReceiver(by0 by0Var) {
        super(false);
        this.continuation = by0Var;
    }

    public void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            by0<R> by0Var = this.continuation;
            Result.a aVar = Result.a;
            by0Var.resumeWith(Result.b(f.a(th)));
        }
    }

    public void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(Result.b(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
