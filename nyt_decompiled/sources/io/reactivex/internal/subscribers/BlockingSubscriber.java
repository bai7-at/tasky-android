package io.reactivex.internal.subscribers;

import defpackage.hb8;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class BlockingSubscriber<T> extends AtomicReference<hb8> implements FlowableSubscriber<T>, hb8 {
    public static final Object TERMINATED = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final Queue<Object> queue;

    public BlockingSubscriber(Queue<Object> queue) {
        this.queue = queue;
    }

    @Override // defpackage.hb8
    public void cancel() {
        if (SubscriptionHelper.cancel(this)) {
            this.queue.offer(TERMINATED);
        }
    }

    public boolean isCancelled() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // io.reactivex.FlowableSubscriber, defpackage.va8
    public void onComplete() {
        this.queue.offer(NotificationLite.complete());
    }

    @Override // io.reactivex.FlowableSubscriber, defpackage.va8
    public void onError(Throwable th) {
        this.queue.offer(NotificationLite.error(th));
    }

    @Override // io.reactivex.FlowableSubscriber, defpackage.va8
    public void onNext(T t) {
        this.queue.offer(NotificationLite.next(t));
    }

    @Override // io.reactivex.FlowableSubscriber, defpackage.va8
    public void onSubscribe(hb8 hb8Var) {
        if (SubscriptionHelper.setOnce(this, hb8Var)) {
            this.queue.offer(NotificationLite.subscription(this));
        }
    }

    @Override // defpackage.hb8
    public void request(long j) {
        get().request(j);
    }
}
