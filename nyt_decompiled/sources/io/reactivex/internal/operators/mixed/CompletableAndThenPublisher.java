package io.reactivex.internal.operators.mixed;

import defpackage.g86;
import defpackage.hb8;
import defpackage.va8;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class CompletableAndThenPublisher<R> extends Flowable<R> {
    final g86 other;
    final CompletableSource source;

    public CompletableAndThenPublisher(CompletableSource completableSource, g86 g86Var) {
        this.source = completableSource;
        this.other = g86Var;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(va8 va8Var) {
        this.source.subscribe(new AndThenPublisherSubscriber(va8Var, this.other));
    }

    static final class AndThenPublisherSubscriber<R> extends AtomicReference<hb8> implements FlowableSubscriber<R>, CompletableObserver, hb8 {
        private static final long serialVersionUID = -8948264376121066672L;
        final va8 downstream;
        g86 other;
        final AtomicLong requested = new AtomicLong();
        Disposable upstream;

        AndThenPublisherSubscriber(va8 va8Var, g86 g86Var) {
            this.downstream = va8Var;
            this.other = g86Var;
        }

        @Override // defpackage.hb8
        public void cancel() {
            this.upstream.dispose();
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onComplete() {
            g86 g86Var = this.other;
            if (g86Var == null) {
                this.downstream.onComplete();
            } else {
                this.other = null;
                g86Var.subscribe(this);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onNext(R r) {
            this.downstream.onNext(r);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // defpackage.hb8
        public void request(long j) {
            SubscriptionHelper.deferredRequest(this, this.requested, j);
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onSubscribe(hb8 hb8Var) {
            SubscriptionHelper.deferredSetOnce(this, this.requested, hb8Var);
        }
    }
}
