package io.reactivex.internal.operators.flowable;

import defpackage.g86;
import defpackage.hb8;
import defpackage.va8;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class FlowableConcatArray<T> extends Flowable<T> {
    final boolean delayError;
    final g86[] sources;

    static final class ConcatArraySubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -8158322871608889516L;
        final boolean delayError;
        final va8 downstream;
        List<Throwable> errors;
        int index;
        long produced;
        final g86[] sources;
        final AtomicInteger wip;

        ConcatArraySubscriber(g86[] g86VarArr, boolean z, va8 va8Var) {
            super(false);
            this.downstream = va8Var;
            this.sources = g86VarArr;
            this.delayError = z;
            this.wip = new AtomicInteger();
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onComplete() {
            if (this.wip.getAndIncrement() == 0) {
                g86[] g86VarArr = this.sources;
                int length = g86VarArr.length;
                int i = this.index;
                while (i != length) {
                    g86 g86Var = g86VarArr[i];
                    if (g86Var == null) {
                        NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                        if (!this.delayError) {
                            this.downstream.onError(nullPointerException);
                            return;
                        }
                        List list = this.errors;
                        if (list == null) {
                            list = new ArrayList((length - i) + 1);
                            this.errors = list;
                        }
                        list.add(nullPointerException);
                        i++;
                    } else {
                        long j = this.produced;
                        if (j != 0) {
                            this.produced = 0L;
                            produced(j);
                        }
                        g86Var.subscribe(this);
                        i++;
                        this.index = i;
                        if (this.wip.decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
                List<Throwable> list2 = this.errors;
                if (list2 == null) {
                    this.downstream.onComplete();
                } else if (list2.size() == 1) {
                    this.downstream.onError(list2.get(0));
                } else {
                    this.downstream.onError(new CompositeException(list2));
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onError(Throwable th) {
            if (!this.delayError) {
                this.downstream.onError(th);
                return;
            }
            List list = this.errors;
            if (list == null) {
                list = new ArrayList((this.sources.length - this.index) + 1);
                this.errors = list;
            }
            list.add(th);
            onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onNext(T t) {
            this.produced++;
            this.downstream.onNext(t);
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onSubscribe(hb8 hb8Var) {
            setSubscription(hb8Var);
        }
    }

    public FlowableConcatArray(g86[] g86VarArr, boolean z) {
        this.sources = g86VarArr;
        this.delayError = z;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(va8 va8Var) {
        ConcatArraySubscriber concatArraySubscriber = new ConcatArraySubscriber(this.sources, this.delayError, va8Var);
        va8Var.onSubscribe(concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }
}
