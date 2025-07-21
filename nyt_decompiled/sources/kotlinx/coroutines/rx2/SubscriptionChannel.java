package kotlinx.coroutines.rx2;

import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.channels.BufferedChannel;

/* loaded from: classes5.dex */
final class SubscriptionChannel<T> extends BufferedChannel<T> implements Observer<T>, MaybeObserver<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _subscription$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SubscriptionChannel.class, Object.class, "_subscription$volatile");
    private volatile /* synthetic */ Object _subscription$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionChannel() {
        super(Integer.MAX_VALUE, null, 2, 0 == true ? 1 : 0);
    }

    private final /* synthetic */ Object get_subscription$volatile() {
        return this._subscription$volatile;
    }

    private final /* synthetic */ void set_subscription$volatile(Object obj) {
        this._subscription$volatile = obj;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public void onClosedIdempotent() {
        Disposable disposable = (Disposable) _subscription$volatile$FU.getAndSet(this, null);
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        close(null);
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        close(th);
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        mo129trySendJP2dKIU(t);
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        _subscription$volatile$FU.set(this, disposable);
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(T t) {
        mo129trySendJP2dKIU(t);
        close(null);
    }
}
