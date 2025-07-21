package io.reactivex.internal.subscribers;

import defpackage.hb8;
import defpackage.kz4;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class FutureSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T>, Future<T>, hb8 {
    Throwable error;
    final AtomicReference<hb8> upstream;
    T value;

    public FutureSubscriber() {
        super(1);
        this.upstream = new AtomicReference<>();
    }

    @Override // defpackage.hb8
    public void cancel() {
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th = this.error;
        if (th == null) {
            return this.value;
        }
        throw new ExecutionException(th);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.upstream.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // io.reactivex.FlowableSubscriber, defpackage.va8
    public void onComplete() {
        hb8 hb8Var;
        if (this.value == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            hb8Var = this.upstream.get();
            if (hb8Var == this || hb8Var == SubscriptionHelper.CANCELLED) {
                return;
            }
        } while (!kz4.a(this.upstream, hb8Var, this));
        countDown();
    }

    @Override // io.reactivex.FlowableSubscriber, defpackage.va8
    public void onError(Throwable th) {
        hb8 hb8Var;
        do {
            hb8Var = this.upstream.get();
            if (hb8Var == this || hb8Var == SubscriptionHelper.CANCELLED) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
        } while (!kz4.a(this.upstream, hb8Var, this));
        countDown();
    }

    @Override // io.reactivex.FlowableSubscriber, defpackage.va8
    public void onNext(T t) {
        if (this.value == null) {
            this.value = t;
        } else {
            this.upstream.get().cancel();
            onError(new IndexOutOfBoundsException("More than one element received"));
        }
    }

    @Override // io.reactivex.FlowableSubscriber, defpackage.va8
    public void onSubscribe(hb8 hb8Var) {
        SubscriptionHelper.setOnce(this.upstream, hb8Var, Long.MAX_VALUE);
    }

    @Override // defpackage.hb8
    public void request(long j) {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        hb8 hb8Var;
        SubscriptionHelper subscriptionHelper;
        do {
            hb8Var = this.upstream.get();
            if (hb8Var == this || hb8Var == (subscriptionHelper = SubscriptionHelper.CANCELLED)) {
                return false;
            }
        } while (!kz4.a(this.upstream, hb8Var, subscriptionHelper));
        if (hb8Var != null) {
            hb8Var.cancel();
        }
        countDown();
        return true;
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            if (!await(j, timeUnit)) {
                throw new TimeoutException(ExceptionHelper.timeoutMessage(j, timeUnit));
            }
        }
        if (!isCancelled()) {
            Throwable th = this.error;
            if (th == null) {
                return this.value;
            }
            throw new ExecutionException(th);
        }
        throw new CancellationException();
    }
}
