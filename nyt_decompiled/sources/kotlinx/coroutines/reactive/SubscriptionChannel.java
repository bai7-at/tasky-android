package kotlinx.coroutines.reactive;

import defpackage.hb8;
import defpackage.ss2;
import defpackage.va8;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.channels.BufferedChannel;

/* loaded from: classes5.dex */
final class SubscriptionChannel<T> extends BufferedChannel<T> implements va8 {
    private volatile /* synthetic */ int _requested$volatile;
    private volatile /* synthetic */ Object _subscription$volatile;
    private final int request;
    private static final /* synthetic */ AtomicReferenceFieldUpdater _subscription$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SubscriptionChannel.class, Object.class, "_subscription$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater _requested$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(SubscriptionChannel.class, "_requested$volatile");

    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionChannel(int i) {
        super(Integer.MAX_VALUE, null, 2, 0 == true ? 1 : 0);
        this.request = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Invalid request size: " + i).toString());
    }

    private final /* synthetic */ int get_requested$volatile() {
        return this._requested$volatile;
    }

    private final /* synthetic */ Object get_subscription$volatile() {
        return this._subscription$volatile;
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, ss2 ss2Var) {
        while (true) {
            ss2Var.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void set_requested$volatile(int i) {
        this._requested$volatile = i;
    }

    private final /* synthetic */ void set_subscription$volatile(Object obj) {
        this._subscription$volatile = obj;
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public void onClosedIdempotent() {
        hb8 hb8Var = (hb8) _subscription$volatile$FU.getAndSet(this, null);
        if (hb8Var != null) {
            hb8Var.cancel();
        }
    }

    @Override // defpackage.va8
    public void onComplete() {
        close(null);
    }

    @Override // defpackage.va8
    public void onError(Throwable th) {
        close(th);
    }

    @Override // defpackage.va8
    public void onNext(T t) {
        _requested$volatile$FU.decrementAndGet(this);
        mo129trySendJP2dKIU(t);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public void onReceiveDequeued() {
        _requested$volatile$FU.incrementAndGet(this);
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public void onReceiveEnqueued() {
        hb8 hb8Var;
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _requested$volatile$FU;
        while (true) {
            int i2 = atomicIntegerFieldUpdater.get(this);
            hb8Var = (hb8) _subscription$volatile$FU.get(this);
            i = i2 - 1;
            if (hb8Var == null || i >= 0) {
                if (_requested$volatile$FU.compareAndSet(this, i2, i)) {
                    return;
                }
            } else if (i2 == this.request || _requested$volatile$FU.compareAndSet(this, i2, this.request)) {
                break;
            }
        }
        hb8Var.request(this.request - i);
    }

    @Override // defpackage.va8
    public void onSubscribe(hb8 hb8Var) {
        _subscription$volatile$FU.set(this, hb8Var);
        while (!isClosedForSend()) {
            int i = _requested$volatile$FU.get(this);
            if (i >= this.request) {
                return;
            }
            if (_requested$volatile$FU.compareAndSet(this, i, this.request)) {
                hb8Var.request(this.request - i);
                return;
            }
        }
        hb8Var.cancel();
    }
}
