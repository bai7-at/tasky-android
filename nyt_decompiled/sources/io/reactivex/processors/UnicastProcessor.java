package io.reactivex.processors;

import defpackage.hb8;
import defpackage.va8;
import io.reactivex.Flowable;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class UnicastProcessor<T> extends FlowableProcessor<T> {
    volatile boolean cancelled;
    final boolean delayError;
    volatile boolean done;
    final AtomicReference<va8> downstream;
    boolean enableOperatorFusion;
    Throwable error;
    final AtomicReference<Runnable> onTerminate;
    final AtomicBoolean once;
    final SpscLinkedArrayQueue<T> queue;
    final AtomicLong requested;
    final BasicIntQueueSubscription<T> wip;

    final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        UnicastQueueSubscription() {
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, defpackage.hb8
        public void cancel() {
            if (UnicastProcessor.this.cancelled) {
                return;
            }
            UnicastProcessor.this.cancelled = true;
            UnicastProcessor.this.doTerminate();
            UnicastProcessor.this.downstream.lazySet(null);
            if (UnicastProcessor.this.wip.getAndIncrement() == 0) {
                UnicastProcessor.this.downstream.lazySet(null);
                UnicastProcessor unicastProcessor = UnicastProcessor.this;
                if (unicastProcessor.enableOperatorFusion) {
                    return;
                }
                unicastProcessor.queue.clear();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            UnicastProcessor.this.queue.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return UnicastProcessor.this.queue.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            return UnicastProcessor.this.queue.poll();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, defpackage.hb8
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                BackpressureHelper.add(UnicastProcessor.this.requested, j);
                UnicastProcessor.this.drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            UnicastProcessor.this.enableOperatorFusion = true;
            return 2;
        }
    }

    UnicastProcessor(int i) {
        this(i, null, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create() {
        return new UnicastProcessor<>(Flowable.bufferSize());
    }

    boolean checkTerminated(boolean z, boolean z2, boolean z3, va8 va8Var, SpscLinkedArrayQueue<T> spscLinkedArrayQueue) {
        if (this.cancelled) {
            spscLinkedArrayQueue.clear();
            this.downstream.lazySet(null);
            return true;
        }
        if (!z2) {
            return false;
        }
        if (z && this.error != null) {
            spscLinkedArrayQueue.clear();
            this.downstream.lazySet(null);
            va8Var.onError(this.error);
            return true;
        }
        if (!z3) {
            return false;
        }
        Throwable th = this.error;
        this.downstream.lazySet(null);
        if (th != null) {
            va8Var.onError(th);
        } else {
            va8Var.onComplete();
        }
        return true;
    }

    void doTerminate() {
        Runnable andSet = this.onTerminate.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    void drain() {
        if (this.wip.getAndIncrement() != 0) {
            return;
        }
        va8 va8Var = this.downstream.get();
        int i = 1;
        while (va8Var == null) {
            i = this.wip.addAndGet(-i);
            if (i == 0) {
                return;
            } else {
                va8Var = this.downstream.get();
            }
        }
        if (this.enableOperatorFusion) {
            drainFused(va8Var);
        } else {
            drainRegular(va8Var);
        }
    }

    void drainFused(va8 va8Var) {
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        boolean z = this.delayError;
        int i = 1;
        while (!this.cancelled) {
            boolean z2 = this.done;
            if (!z && z2 && this.error != null) {
                spscLinkedArrayQueue.clear();
                this.downstream.lazySet(null);
                va8Var.onError(this.error);
                return;
            }
            va8Var.onNext(null);
            if (z2) {
                this.downstream.lazySet(null);
                Throwable th = this.error;
                if (th != null) {
                    va8Var.onError(th);
                    return;
                } else {
                    va8Var.onComplete();
                    return;
                }
            }
            i = this.wip.addAndGet(-i);
            if (i == 0) {
                return;
            }
        }
        this.downstream.lazySet(null);
    }

    void drainRegular(va8 va8Var) {
        long j;
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        boolean z = true;
        boolean z2 = !this.delayError;
        int i = 1;
        while (true) {
            long j2 = this.requested.get();
            long j3 = 0;
            while (true) {
                if (j2 == j3) {
                    j = j3;
                    break;
                }
                boolean z3 = this.done;
                T poll = spscLinkedArrayQueue.poll();
                boolean z4 = poll == null ? z : false;
                j = j3;
                if (checkTerminated(z2, z3, z4, va8Var, spscLinkedArrayQueue)) {
                    return;
                }
                if (z4) {
                    break;
                }
                va8Var.onNext(poll);
                j3 = 1 + j;
                z = true;
            }
            if (j2 == j3 && checkTerminated(z2, this.done, spscLinkedArrayQueue.isEmpty(), va8Var, spscLinkedArrayQueue)) {
                return;
            }
            if (j != 0 && j2 != Long.MAX_VALUE) {
                this.requested.addAndGet(-j);
            }
            i = this.wip.addAndGet(-i);
            if (i == 0) {
                return;
            } else {
                z = true;
            }
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        if (this.done) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.done && this.error == null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.downstream.get() != null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.done && this.error != null;
    }

    @Override // io.reactivex.processors.FlowableProcessor, defpackage.va8
    public void onComplete() {
        if (this.done || this.cancelled) {
            return;
        }
        this.done = true;
        doTerminate();
        drain();
    }

    @Override // io.reactivex.processors.FlowableProcessor, defpackage.va8
    public void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done || this.cancelled) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        this.done = true;
        doTerminate();
        drain();
    }

    @Override // io.reactivex.processors.FlowableProcessor, defpackage.va8
    public void onNext(T t) {
        ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done || this.cancelled) {
            return;
        }
        this.queue.offer(t);
        drain();
    }

    @Override // defpackage.va8
    public void onSubscribe(hb8 hb8Var) {
        if (this.done || this.cancelled) {
            hb8Var.cancel();
        } else {
            hb8Var.request(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(va8 va8Var) {
        if (this.once.get() || !this.once.compareAndSet(false, true)) {
            EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), va8Var);
            return;
        }
        va8Var.onSubscribe(this.wip);
        this.downstream.set(va8Var);
        if (this.cancelled) {
            this.downstream.lazySet(null);
        } else {
            drain();
        }
    }

    UnicastProcessor(int i, Runnable runnable) {
        this(i, runnable, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i) {
        return new UnicastProcessor<>(i);
    }

    UnicastProcessor(int i, Runnable runnable, boolean z) {
        this.queue = new SpscLinkedArrayQueue<>(ObjectHelper.verifyPositive(i, "capacityHint"));
        this.onTerminate = new AtomicReference<>(runnable);
        this.delayError = z;
        this.downstream = new AtomicReference<>();
        this.once = new AtomicBoolean();
        this.wip = new UnicastQueueSubscription();
        this.requested = new AtomicLong();
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(boolean z) {
        return new UnicastProcessor<>(Flowable.bufferSize(), null, z);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i, Runnable runnable) {
        ObjectHelper.requireNonNull(runnable, "onTerminate");
        return new UnicastProcessor<>(i, runnable);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i, Runnable runnable, boolean z) {
        ObjectHelper.requireNonNull(runnable, "onTerminate");
        return new UnicastProcessor<>(i, runnable, z);
    }
}
