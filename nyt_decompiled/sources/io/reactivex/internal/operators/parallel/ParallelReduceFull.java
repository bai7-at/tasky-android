package io.reactivex.internal.operators.parallel;

import defpackage.hb8;
import defpackage.kz4;
import defpackage.va8;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ParallelReduceFull<T> extends Flowable<T> {
    final BiFunction<T, T, T> reducer;
    final ParallelFlowable<? extends T> source;

    static final class ParallelReduceFullInnerSubscriber<T> extends AtomicReference<hb8> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7954444275102466525L;
        boolean done;
        final ParallelReduceFullMainSubscriber<T> parent;
        final BiFunction<T, T, T> reducer;
        T value;

        ParallelReduceFullInnerSubscriber(ParallelReduceFullMainSubscriber<T> parallelReduceFullMainSubscriber, BiFunction<T, T, T> biFunction) {
            this.parent = parallelReduceFullMainSubscriber;
            this.reducer = biFunction;
        }

        void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.parent.innerComplete(this.value);
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.parent.innerError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            T t2 = this.value;
            if (t2 == null) {
                this.value = t;
                return;
            }
            try {
                this.value = (T) ObjectHelper.requireNonNull(this.reducer.apply(t2, t), "The reducer returned a null value");
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                get().cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onSubscribe(hb8 hb8Var) {
            SubscriptionHelper.setOnce(this, hb8Var, Long.MAX_VALUE);
        }
    }

    static final class ParallelReduceFullMainSubscriber<T> extends DeferredScalarSubscription<T> {
        private static final long serialVersionUID = -5370107872170712765L;
        final AtomicReference<SlotPair<T>> current;
        final AtomicReference<Throwable> error;
        final BiFunction<T, T, T> reducer;
        final AtomicInteger remaining;
        final ParallelReduceFullInnerSubscriber<T>[] subscribers;

        ParallelReduceFullMainSubscriber(va8 va8Var, int i, BiFunction<T, T, T> biFunction) {
            super(va8Var);
            this.current = new AtomicReference<>();
            this.remaining = new AtomicInteger();
            this.error = new AtomicReference<>();
            ParallelReduceFullInnerSubscriber<T>[] parallelReduceFullInnerSubscriberArr = new ParallelReduceFullInnerSubscriber[i];
            for (int i2 = 0; i2 < i; i2++) {
                parallelReduceFullInnerSubscriberArr[i2] = new ParallelReduceFullInnerSubscriber<>(this, biFunction);
            }
            this.subscribers = parallelReduceFullInnerSubscriberArr;
            this.reducer = biFunction;
            this.remaining.lazySet(i);
        }

        SlotPair<T> addValue(T t) {
            SlotPair<T> slotPair;
            int tryAcquireSlot;
            while (true) {
                slotPair = this.current.get();
                if (slotPair == null) {
                    slotPair = new SlotPair<>();
                    if (!kz4.a(this.current, null, slotPair)) {
                        continue;
                    }
                }
                tryAcquireSlot = slotPair.tryAcquireSlot();
                if (tryAcquireSlot >= 0) {
                    break;
                }
                kz4.a(this.current, slotPair, null);
            }
            if (tryAcquireSlot == 0) {
                slotPair.first = t;
            } else {
                slotPair.second = t;
            }
            if (!slotPair.releaseSlot()) {
                return null;
            }
            kz4.a(this.current, slotPair, null);
            return slotPair;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, defpackage.hb8
        public void cancel() {
            for (ParallelReduceFullInnerSubscriber<T> parallelReduceFullInnerSubscriber : this.subscribers) {
                parallelReduceFullInnerSubscriber.cancel();
            }
        }

        void innerComplete(T t) {
            if (t != null) {
                while (true) {
                    SlotPair<T> addValue = addValue(t);
                    if (addValue == null) {
                        break;
                    }
                    try {
                        t = (T) ObjectHelper.requireNonNull(this.reducer.apply(addValue.first, addValue.second), "The reducer returned a null value");
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        innerError(th);
                        return;
                    }
                }
            }
            if (this.remaining.decrementAndGet() == 0) {
                SlotPair<T> slotPair = this.current.get();
                this.current.lazySet(null);
                if (slotPair != null) {
                    complete(slotPair.first);
                } else {
                    this.downstream.onComplete();
                }
            }
        }

        void innerError(Throwable th) {
            if (kz4.a(this.error, null, th)) {
                cancel();
                this.downstream.onError(th);
            } else if (th != this.error.get()) {
                RxJavaPlugins.onError(th);
            }
        }
    }

    static final class SlotPair<T> extends AtomicInteger {
        private static final long serialVersionUID = 473971317683868662L;
        T first;
        final AtomicInteger releaseIndex = new AtomicInteger();
        T second;

        SlotPair() {
        }

        boolean releaseSlot() {
            return this.releaseIndex.incrementAndGet() == 2;
        }

        int tryAcquireSlot() {
            int i;
            do {
                i = get();
                if (i >= 2) {
                    return -1;
                }
            } while (!compareAndSet(i, i + 1));
            return i;
        }
    }

    public ParallelReduceFull(ParallelFlowable<? extends T> parallelFlowable, BiFunction<T, T, T> biFunction) {
        this.source = parallelFlowable;
        this.reducer = biFunction;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(va8 va8Var) {
        ParallelReduceFullMainSubscriber parallelReduceFullMainSubscriber = new ParallelReduceFullMainSubscriber(va8Var, this.source.parallelism(), this.reducer);
        va8Var.onSubscribe(parallelReduceFullMainSubscriber);
        this.source.subscribe(parallelReduceFullMainSubscriber.subscribers);
    }
}
