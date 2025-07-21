package kotlinx.coroutines.rx2;

import defpackage.g62;
import defpackage.ww8;
import io.reactivex.CompletableEmitter;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractCoroutine;

/* loaded from: classes5.dex */
final class RxCompletableCoroutine extends AbstractCoroutine<ww8> {
    private final CompletableEmitter subscriber;

    public RxCompletableCoroutine(CoroutineContext coroutineContext, CompletableEmitter completableEmitter) {
        super(coroutineContext, false, true);
        this.subscriber = completableEmitter;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    protected void onCancelled(Throwable th, boolean z) {
        try {
            if (this.subscriber.tryOnError(th)) {
                return;
            }
        } catch (Throwable th2) {
            g62.a(th, th2);
        }
        RxCancellableKt.handleUndeliverableException(th, getContext());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.AbstractCoroutine
    public void onCompleted(ww8 ww8Var) {
        try {
            this.subscriber.onComplete();
        } catch (Throwable th) {
            RxCancellableKt.handleUndeliverableException(th, getContext());
        }
    }
}
