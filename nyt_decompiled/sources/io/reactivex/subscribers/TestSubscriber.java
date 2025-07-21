package io.reactivex.subscribers;

import defpackage.hb8;
import defpackage.kz4;
import defpackage.va8;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observers.BaseTestConsumer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public class TestSubscriber<T> extends BaseTestConsumer<T, TestSubscriber<T>> implements FlowableSubscriber<T>, hb8, Disposable {
    private volatile boolean cancelled;
    private final va8 downstream;
    private final AtomicLong missedRequested;
    private QueueSubscription<T> qs;
    private final AtomicReference<hb8> upstream;

    enum EmptySubscriber implements FlowableSubscriber<Object> {
        INSTANCE;

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onComplete() {
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onError(Throwable th) {
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onSubscribe(hb8 hb8Var) {
        }
    }

    public TestSubscriber() {
        this(EmptySubscriber.INSTANCE, Long.MAX_VALUE);
    }

    public static <T> TestSubscriber<T> create() {
        return new TestSubscriber<>();
    }

    static String fusionModeToString(int i) {
        if (i == 0) {
            return "NONE";
        }
        if (i == 1) {
            return "SYNC";
        }
        if (i == 2) {
            return "ASYNC";
        }
        return "Unknown(" + i + ")";
    }

    final TestSubscriber<T> assertFuseable() {
        if (this.qs != null) {
            return this;
        }
        throw new AssertionError("Upstream is not fuseable.");
    }

    final TestSubscriber<T> assertFusionMode(int i) {
        int i2 = this.establishedFusionMode;
        if (i2 == i) {
            return this;
        }
        if (this.qs == null) {
            throw fail("Upstream is not fuseable");
        }
        throw new AssertionError("Fusion mode different. Expected: " + fusionModeToString(i) + ", actual: " + fusionModeToString(i2));
    }

    final TestSubscriber<T> assertNotFuseable() {
        if (this.qs == null) {
            return this;
        }
        throw new AssertionError("Upstream is fuseable.");
    }

    public final TestSubscriber<T> assertOf(Consumer<? super TestSubscriber<T>> consumer) {
        try {
            consumer.accept(this);
            return this;
        } catch (Throwable th) {
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    @Override // defpackage.hb8
    public final void cancel() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        SubscriptionHelper.cancel(this.upstream);
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        cancel();
    }

    public final boolean hasSubscription() {
        return this.upstream.get() != null;
    }

    public final boolean isCancelled() {
        return this.cancelled;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return this.cancelled;
    }

    @Override // io.reactivex.FlowableSubscriber, defpackage.va8
    public void onComplete() {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            this.completions++;
            this.downstream.onComplete();
        } finally {
            this.done.countDown();
        }
    }

    @Override // io.reactivex.FlowableSubscriber, defpackage.va8
    public void onError(Throwable th) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new NullPointerException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            this.errors.add(th);
            if (th == null) {
                this.errors.add(new IllegalStateException("onError received a null Throwable"));
            }
            this.downstream.onError(th);
            this.done.countDown();
        } catch (Throwable th2) {
            this.done.countDown();
            throw th2;
        }
    }

    @Override // io.reactivex.FlowableSubscriber, defpackage.va8
    public void onNext(T t) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.lastThread = Thread.currentThread();
        if (this.establishedFusionMode != 2) {
            this.values.add(t);
            if (t == null) {
                this.errors.add(new NullPointerException("onNext received a null value"));
            }
            this.downstream.onNext(t);
            return;
        }
        while (true) {
            try {
                T poll = this.qs.poll();
                if (poll == null) {
                    return;
                } else {
                    this.values.add(poll);
                }
            } catch (Throwable th) {
                this.errors.add(th);
                this.qs.cancel();
                return;
            }
        }
    }

    protected void onStart() {
    }

    @Override // io.reactivex.FlowableSubscriber, defpackage.va8
    public void onSubscribe(hb8 hb8Var) {
        this.lastThread = Thread.currentThread();
        if (hb8Var == null) {
            this.errors.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!kz4.a(this.upstream, null, hb8Var)) {
            hb8Var.cancel();
            if (this.upstream.get() != SubscriptionHelper.CANCELLED) {
                this.errors.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + hb8Var));
                return;
            }
            return;
        }
        int i = this.initialFusionMode;
        if (i != 0 && (hb8Var instanceof QueueSubscription)) {
            QueueSubscription<T> queueSubscription = (QueueSubscription) hb8Var;
            this.qs = queueSubscription;
            int requestFusion = queueSubscription.requestFusion(i);
            this.establishedFusionMode = requestFusion;
            if (requestFusion == 1) {
                this.checkSubscriptionOnce = true;
                this.lastThread = Thread.currentThread();
                while (true) {
                    try {
                        T poll = this.qs.poll();
                        if (poll == null) {
                            this.completions++;
                            return;
                        }
                        this.values.add(poll);
                    } catch (Throwable th) {
                        this.errors.add(th);
                        return;
                    }
                }
            }
        }
        this.downstream.onSubscribe(hb8Var);
        long andSet = this.missedRequested.getAndSet(0L);
        if (andSet != 0) {
            hb8Var.request(andSet);
        }
        onStart();
    }

    @Override // defpackage.hb8
    public final void request(long j) {
        SubscriptionHelper.deferredRequest(this.upstream, this.missedRequested, j);
    }

    public final TestSubscriber<T> requestMore(long j) {
        request(j);
        return this;
    }

    final TestSubscriber<T> setInitialFusionMode(int i) {
        this.initialFusionMode = i;
        return this;
    }

    public TestSubscriber(long j) {
        this(EmptySubscriber.INSTANCE, j);
    }

    public static <T> TestSubscriber<T> create(long j) {
        return new TestSubscriber<>(j);
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final TestSubscriber<T> assertNotSubscribed() {
        if (this.upstream.get() != null) {
            throw fail("Subscribed!");
        }
        if (this.errors.isEmpty()) {
            return this;
        }
        throw fail("Not subscribed but errors found");
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final TestSubscriber<T> assertSubscribed() {
        if (this.upstream.get() != null) {
            return this;
        }
        throw fail("Not subscribed!");
    }

    public TestSubscriber(va8 va8Var) {
        this(va8Var, Long.MAX_VALUE);
    }

    public static <T> TestSubscriber<T> create(va8 va8Var) {
        return new TestSubscriber<>(va8Var);
    }

    public TestSubscriber(va8 va8Var, long j) {
        if (j >= 0) {
            this.downstream = va8Var;
            this.upstream = new AtomicReference<>();
            this.missedRequested = new AtomicLong(j);
            return;
        }
        throw new IllegalArgumentException("Negative initial request not allowed");
    }
}
