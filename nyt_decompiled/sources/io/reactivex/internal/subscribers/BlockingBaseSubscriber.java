package io.reactivex.internal.subscribers;

import defpackage.hb8;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes5.dex */
public abstract class BlockingBaseSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T> {
    volatile boolean cancelled;
    Throwable error;
    hb8 upstream;
    T value;

    public BlockingBaseSubscriber() {
        super(1);
    }

    public final T blockingGet() {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e) {
                hb8 hb8Var = this.upstream;
                this.upstream = SubscriptionHelper.CANCELLED;
                if (hb8Var != null) {
                    hb8Var.cancel();
                }
                throw ExceptionHelper.wrapOrThrow(e);
            }
        }
        Throwable th = this.error;
        if (th == null) {
            return this.value;
        }
        throw ExceptionHelper.wrapOrThrow(th);
    }

    @Override // io.reactivex.FlowableSubscriber, defpackage.va8
    public final void onComplete() {
        countDown();
    }

    @Override // io.reactivex.FlowableSubscriber, defpackage.va8
    public abstract /* synthetic */ void onError(Throwable th);

    @Override // io.reactivex.FlowableSubscriber, defpackage.va8
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // io.reactivex.FlowableSubscriber, defpackage.va8
    public final void onSubscribe(hb8 hb8Var) {
        if (SubscriptionHelper.validate(this.upstream, hb8Var)) {
            this.upstream = hb8Var;
            if (this.cancelled) {
                return;
            }
            hb8Var.request(Long.MAX_VALUE);
            if (this.cancelled) {
                this.upstream = SubscriptionHelper.CANCELLED;
                hb8Var.cancel();
            }
        }
    }
}
