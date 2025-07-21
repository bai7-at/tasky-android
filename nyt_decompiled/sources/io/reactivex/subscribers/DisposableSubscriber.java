package io.reactivex.subscribers;

import defpackage.hb8;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public abstract class DisposableSubscriber<T> implements FlowableSubscriber<T>, Disposable {
    final AtomicReference<hb8> upstream = new AtomicReference<>();

    protected final void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.cancel(this.upstream);
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.upstream.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // io.reactivex.FlowableSubscriber, defpackage.va8
    public abstract /* synthetic */ void onComplete();

    @Override // io.reactivex.FlowableSubscriber, defpackage.va8
    public abstract /* synthetic */ void onError(Throwable th);

    @Override // io.reactivex.FlowableSubscriber, defpackage.va8
    public abstract /* synthetic */ void onNext(Object obj);

    protected void onStart() {
        this.upstream.get().request(Long.MAX_VALUE);
    }

    @Override // io.reactivex.FlowableSubscriber, defpackage.va8
    public final void onSubscribe(hb8 hb8Var) {
        if (EndConsumerHelper.setOnce(this.upstream, hb8Var, getClass())) {
            onStart();
        }
    }

    protected final void request(long j) {
        this.upstream.get().request(j);
    }
}
