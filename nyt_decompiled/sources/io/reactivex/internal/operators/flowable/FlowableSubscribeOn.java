package io.reactivex.internal.operators.flowable;

import defpackage.g86;
import defpackage.hb8;
import defpackage.va8;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class FlowableSubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean nonScheduledRequests;
    final Scheduler scheduler;

    static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements FlowableSubscriber<T>, hb8, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        final va8 downstream;
        final boolean nonScheduledRequests;
        g86 source;
        final Scheduler.Worker worker;
        final AtomicReference<hb8> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        static final class Request implements Runnable {
            final long n;
            final hb8 upstream;

            Request(hb8 hb8Var, long j) {
                this.upstream = hb8Var;
                this.n = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.upstream.request(this.n);
            }
        }

        SubscribeOnSubscriber(va8 va8Var, Scheduler.Worker worker, g86 g86Var, boolean z) {
            this.downstream = va8Var;
            this.worker = worker;
            this.source = g86Var;
            this.nonScheduledRequests = !z;
        }

        @Override // defpackage.hb8
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onSubscribe(hb8 hb8Var) {
            if (SubscriptionHelper.setOnce(this.upstream, hb8Var)) {
                long andSet = this.requested.getAndSet(0L);
                if (andSet != 0) {
                    requestUpstream(andSet, hb8Var);
                }
            }
        }

        @Override // defpackage.hb8
        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                hb8 hb8Var = this.upstream.get();
                if (hb8Var != null) {
                    requestUpstream(j, hb8Var);
                    return;
                }
                BackpressureHelper.add(this.requested, j);
                hb8 hb8Var2 = this.upstream.get();
                if (hb8Var2 != null) {
                    long andSet = this.requested.getAndSet(0L);
                    if (andSet != 0) {
                        requestUpstream(andSet, hb8Var2);
                    }
                }
            }
        }

        void requestUpstream(long j, hb8 hb8Var) {
            if (this.nonScheduledRequests || Thread.currentThread() == get()) {
                hb8Var.request(j);
            } else {
                this.worker.schedule(new Request(hb8Var, j));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            g86 g86Var = this.source;
            this.source = null;
            g86Var.subscribe(this);
        }
    }

    public FlowableSubscribeOn(Flowable<T> flowable, Scheduler scheduler, boolean z) {
        super(flowable);
        this.scheduler = scheduler;
        this.nonScheduledRequests = z;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(va8 va8Var) {
        Scheduler.Worker createWorker = this.scheduler.createWorker();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(va8Var, createWorker, this.source, this.nonScheduledRequests);
        va8Var.onSubscribe(subscribeOnSubscriber);
        createWorker.schedule(subscribeOnSubscriber);
    }
}
