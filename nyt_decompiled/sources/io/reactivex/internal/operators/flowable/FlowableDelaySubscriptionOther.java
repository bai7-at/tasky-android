package io.reactivex.internal.operators.flowable;

import defpackage.g86;
import defpackage.hb8;
import defpackage.va8;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class FlowableDelaySubscriptionOther<T, U> extends Flowable<T> {
    final g86 main;
    final g86 other;

    static final class MainSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, hb8 {
        private static final long serialVersionUID = 2259811067697317255L;
        final va8 downstream;
        final g86 main;
        final MainSubscriber<T>.OtherSubscriber other = new OtherSubscriber();
        final AtomicReference<hb8> upstream = new AtomicReference<>();

        final class OtherSubscriber extends AtomicReference<hb8> implements FlowableSubscriber<Object> {
            private static final long serialVersionUID = -3892798459447644106L;

            OtherSubscriber() {
            }

            @Override // io.reactivex.FlowableSubscriber, defpackage.va8
            public void onComplete() {
                if (get() != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.next();
                }
            }

            @Override // io.reactivex.FlowableSubscriber, defpackage.va8
            public void onError(Throwable th) {
                if (get() != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.downstream.onError(th);
                } else {
                    RxJavaPlugins.onError(th);
                }
            }

            @Override // io.reactivex.FlowableSubscriber, defpackage.va8
            public void onNext(Object obj) {
                hb8 hb8Var = get();
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (hb8Var != subscriptionHelper) {
                    lazySet(subscriptionHelper);
                    hb8Var.cancel();
                    MainSubscriber.this.next();
                }
            }

            @Override // io.reactivex.FlowableSubscriber, defpackage.va8
            public void onSubscribe(hb8 hb8Var) {
                if (SubscriptionHelper.setOnce(this, hb8Var)) {
                    hb8Var.request(Long.MAX_VALUE);
                }
            }
        }

        MainSubscriber(va8 va8Var, g86 g86Var) {
            this.downstream = va8Var;
            this.main = g86Var;
        }

        @Override // defpackage.hb8
        public void cancel() {
            SubscriptionHelper.cancel(this.other);
            SubscriptionHelper.cancel(this.upstream);
        }

        void next() {
            this.main.subscribe(this);
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onSubscribe(hb8 hb8Var) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this, hb8Var);
        }

        @Override // defpackage.hb8
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                SubscriptionHelper.deferredRequest(this.upstream, this, j);
            }
        }
    }

    public FlowableDelaySubscriptionOther(g86 g86Var, g86 g86Var2) {
        this.main = g86Var;
        this.other = g86Var2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(va8 va8Var) {
        MainSubscriber mainSubscriber = new MainSubscriber(va8Var, this.main);
        va8Var.onSubscribe(mainSubscriber);
        this.other.subscribe(mainSubscriber.other);
    }
}
