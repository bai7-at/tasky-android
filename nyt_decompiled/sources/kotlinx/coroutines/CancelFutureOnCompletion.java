package kotlinx.coroutines;

import defpackage.ww8;
import java.util.concurrent.Future;

/* loaded from: classes5.dex */
final class CancelFutureOnCompletion extends JobNode {
    private final Future<?> future;

    public CancelFutureOnCompletion(Future<?> future) {
        this.future = future;
    }

    @Override // kotlinx.coroutines.JobNode, kotlinx.coroutines.CompletionHandlerBase, defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return ww8.a;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    public void invoke(Throwable th) {
        if (th != null) {
            this.future.cancel(false);
        }
    }
}
