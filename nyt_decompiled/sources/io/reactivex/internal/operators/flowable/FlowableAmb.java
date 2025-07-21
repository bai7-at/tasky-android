package io.reactivex.internal.operators.flowable;

import defpackage.g86;
import defpackage.hb8;
import defpackage.va8;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class FlowableAmb<T> extends Flowable<T> {
    final g86[] sources;
    final Iterable<? extends g86> sourcesIterable;

    static final class AmbCoordinator<T> implements hb8 {
        final va8 downstream;
        final AmbInnerSubscriber<T>[] subscribers;
        final AtomicInteger winner = new AtomicInteger();

        AmbCoordinator(va8 va8Var, int i) {
            this.downstream = va8Var;
            this.subscribers = new AmbInnerSubscriber[i];
        }

        @Override // defpackage.hb8
        public void cancel() {
            if (this.winner.get() != -1) {
                this.winner.lazySet(-1);
                for (AmbInnerSubscriber<T> ambInnerSubscriber : this.subscribers) {
                    ambInnerSubscriber.cancel();
                }
            }
        }

        @Override // defpackage.hb8
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                int i = this.winner.get();
                if (i > 0) {
                    this.subscribers[i - 1].request(j);
                    return;
                }
                if (i == 0) {
                    for (AmbInnerSubscriber<T> ambInnerSubscriber : this.subscribers) {
                        ambInnerSubscriber.request(j);
                    }
                }
            }
        }

        public void subscribe(g86[] g86VarArr) {
            AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.subscribers;
            int length = ambInnerSubscriberArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                ambInnerSubscriberArr[i] = new AmbInnerSubscriber<>(this, i2, this.downstream);
                i = i2;
            }
            this.winner.lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i3 = 0; i3 < length && this.winner.get() == 0; i3++) {
                g86VarArr[i3].subscribe(ambInnerSubscriberArr[i3]);
            }
        }

        public boolean win(int i) {
            int i2 = 0;
            if (this.winner.get() != 0 || !this.winner.compareAndSet(0, i)) {
                return false;
            }
            AmbInnerSubscriber<T>[] ambInnerSubscriberArr = this.subscribers;
            int length = ambInnerSubscriberArr.length;
            while (i2 < length) {
                int i3 = i2 + 1;
                if (i3 != i) {
                    ambInnerSubscriberArr[i2].cancel();
                }
                i2 = i3;
            }
            return true;
        }
    }

    static final class AmbInnerSubscriber<T> extends AtomicReference<hb8> implements FlowableSubscriber<T>, hb8 {
        private static final long serialVersionUID = -1185974347409665484L;
        final va8 downstream;
        final int index;
        final AtomicLong missedRequested = new AtomicLong();
        final AmbCoordinator<T> parent;
        boolean won;

        AmbInnerSubscriber(AmbCoordinator<T> ambCoordinator, int i, va8 va8Var) {
            this.parent = ambCoordinator;
            this.index = i;
            this.downstream = va8Var;
        }

        @Override // defpackage.hb8
        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onComplete() {
            if (this.won) {
                this.downstream.onComplete();
            } else if (!this.parent.win(this.index)) {
                get().cancel();
            } else {
                this.won = true;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onError(Throwable th) {
            if (this.won) {
                this.downstream.onError(th);
            } else if (this.parent.win(this.index)) {
                this.won = true;
                this.downstream.onError(th);
            } else {
                get().cancel();
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onNext(T t) {
            if (this.won) {
                this.downstream.onNext(t);
            } else if (!this.parent.win(this.index)) {
                get().cancel();
            } else {
                this.won = true;
                this.downstream.onNext(t);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onSubscribe(hb8 hb8Var) {
            SubscriptionHelper.deferredSetOnce(this, this.missedRequested, hb8Var);
        }

        @Override // defpackage.hb8
        public void request(long j) {
            SubscriptionHelper.deferredRequest(this, this.missedRequested, j);
        }
    }

    public FlowableAmb(g86[] g86VarArr, Iterable<? extends g86> iterable) {
        this.sources = g86VarArr;
        this.sourcesIterable = iterable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(va8 va8Var) {
        int length;
        g86[] g86VarArr = this.sources;
        if (g86VarArr == null) {
            g86VarArr = new g86[8];
            try {
                length = 0;
                for (g86 g86Var : this.sourcesIterable) {
                    if (g86Var == null) {
                        EmptySubscription.error(new NullPointerException("One of the sources is null"), va8Var);
                        return;
                    }
                    if (length == g86VarArr.length) {
                        g86[] g86VarArr2 = new g86[(length >> 2) + length];
                        System.arraycopy(g86VarArr, 0, g86VarArr2, 0, length);
                        g86VarArr = g86VarArr2;
                    }
                    int i = length + 1;
                    g86VarArr[length] = g86Var;
                    length = i;
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                EmptySubscription.error(th, va8Var);
                return;
            }
        } else {
            length = g86VarArr.length;
        }
        if (length == 0) {
            EmptySubscription.complete(va8Var);
        } else if (length == 1) {
            g86VarArr[0].subscribe(va8Var);
        } else {
            new AmbCoordinator(va8Var, length).subscribe(g86VarArr);
        }
    }
}
