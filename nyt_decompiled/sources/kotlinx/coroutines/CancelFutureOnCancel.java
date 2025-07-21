package kotlinx.coroutines;

import defpackage.ww8;
import java.util.concurrent.Future;

/* loaded from: classes5.dex */
final class CancelFutureOnCancel extends CancelHandler {
    private final Future<?> future;

    public CancelFutureOnCancel(Future<?> future) {
        this.future = future;
    }

    @Override // kotlinx.coroutines.CancelHandler, kotlinx.coroutines.CancelHandlerBase, defpackage.ss2
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return ww8.a;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.future + ']';
    }

    @Override // kotlinx.coroutines.CancelHandlerBase
    public void invoke(Throwable th) {
        if (th != null) {
            this.future.cancel(false);
        }
    }
}
