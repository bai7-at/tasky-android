package io.reactivex.observers;

import defpackage.kz4;
import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public class TestObserver<T> extends BaseTestConsumer<T, TestObserver<T>> implements Observer<T>, Disposable, MaybeObserver<T>, SingleObserver<T>, CompletableObserver {
    private final Observer<? super T> downstream;
    private QueueDisposable<T> qd;
    private final AtomicReference<Disposable> upstream;

    enum EmptyObserver implements Observer<Object> {
        INSTANCE;

        @Override // io.reactivex.Observer
        public void onComplete() {
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
        }
    }

    public TestObserver() {
        this(EmptyObserver.INSTANCE);
    }

    public static <T> TestObserver<T> create() {
        return new TestObserver<>();
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

    final TestObserver<T> assertFuseable() {
        if (this.qd != null) {
            return this;
        }
        throw new AssertionError("Upstream is not fuseable.");
    }

    final TestObserver<T> assertFusionMode(int i) {
        int i2 = this.establishedFusionMode;
        if (i2 == i) {
            return this;
        }
        if (this.qd == null) {
            throw fail("Upstream is not fuseable");
        }
        throw new AssertionError("Fusion mode different. Expected: " + fusionModeToString(i) + ", actual: " + fusionModeToString(i2));
    }

    final TestObserver<T> assertNotFuseable() {
        if (this.qd == null) {
            return this;
        }
        throw new AssertionError("Upstream is fuseable.");
    }

    public final TestObserver<T> assertOf(Consumer<? super TestObserver<T>> consumer) {
        try {
            consumer.accept(this);
            return this;
        } catch (Throwable th) {
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    public final void cancel() {
        dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        DisposableHelper.dispose(this.upstream);
    }

    public final boolean hasSubscription() {
        return this.upstream.get() != null;
    }

    public final boolean isCancelled() {
        return isDisposed();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.upstream.get());
    }

    @Override // io.reactivex.Observer
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

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        if (!this.checkSubscriptionOnce) {
            this.checkSubscriptionOnce = true;
            if (this.upstream.get() == null) {
                this.errors.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.lastThread = Thread.currentThread();
            if (th == null) {
                this.errors.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.errors.add(th);
            }
            this.downstream.onError(th);
            this.done.countDown();
        } catch (Throwable th2) {
            this.done.countDown();
            throw th2;
        }
    }

    @Override // io.reactivex.Observer
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
                T poll = this.qd.poll();
                if (poll == null) {
                    return;
                } else {
                    this.values.add(poll);
                }
            } catch (Throwable th) {
                this.errors.add(th);
                this.qd.dispose();
                return;
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        this.lastThread = Thread.currentThread();
        if (disposable == null) {
            this.errors.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!kz4.a(this.upstream, null, disposable)) {
            disposable.dispose();
            if (this.upstream.get() != DisposableHelper.DISPOSED) {
                this.errors.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + disposable));
                return;
            }
            return;
        }
        int i = this.initialFusionMode;
        if (i != 0 && (disposable instanceof QueueDisposable)) {
            QueueDisposable<T> queueDisposable = (QueueDisposable) disposable;
            this.qd = queueDisposable;
            int requestFusion = queueDisposable.requestFusion(i);
            this.establishedFusionMode = requestFusion;
            if (requestFusion == 1) {
                this.checkSubscriptionOnce = true;
                this.lastThread = Thread.currentThread();
                while (true) {
                    try {
                        T poll = this.qd.poll();
                        if (poll == null) {
                            this.completions++;
                            this.upstream.lazySet(DisposableHelper.DISPOSED);
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
        this.downstream.onSubscribe(disposable);
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(T t) {
        onNext(t);
        onComplete();
    }

    final TestObserver<T> setInitialFusionMode(int i) {
        this.initialFusionMode = i;
        return this;
    }

    public TestObserver(Observer<? super T> observer) {
        this.upstream = new AtomicReference<>();
        this.downstream = observer;
    }

    public static <T> TestObserver<T> create(Observer<? super T> observer) {
        return new TestObserver<>(observer);
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final TestObserver<T> assertNotSubscribed() {
        if (this.upstream.get() != null) {
            throw fail("Subscribed!");
        }
        if (this.errors.isEmpty()) {
            return this;
        }
        throw fail("Not subscribed but errors found");
    }

    @Override // io.reactivex.observers.BaseTestConsumer
    public final TestObserver<T> assertSubscribed() {
        if (this.upstream.get() != null) {
            return this;
        }
        throw fail("Not subscribed!");
    }
}
