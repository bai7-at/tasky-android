package io.reactivex.internal.operators.flowable;

import defpackage.hb8;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class FlowableToListSingle<T, U extends Collection<? super T>> extends Single<U> implements FuseToFlowable<U> {
    final Callable<U> collectionSupplier;
    final Flowable<T> source;

    static final class ToListSubscriber<T, U extends Collection<? super T>> implements FlowableSubscriber<T>, Disposable {
        final SingleObserver<? super U> downstream;
        hb8 upstream;
        U value;

        ToListSubscriber(SingleObserver<? super U> singleObserver, U u) {
            this.downstream = singleObserver;
            this.value = u;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.cancel();
            this.upstream = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onComplete() {
            this.upstream = SubscriptionHelper.CANCELLED;
            this.downstream.onSuccess(this.value);
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onError(Throwable th) {
            this.value = null;
            this.upstream = SubscriptionHelper.CANCELLED;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onNext(T t) {
            this.value.add(t);
        }

        @Override // io.reactivex.FlowableSubscriber, defpackage.va8
        public void onSubscribe(hb8 hb8Var) {
            if (SubscriptionHelper.validate(this.upstream, hb8Var)) {
                this.upstream = hb8Var;
                this.downstream.onSubscribe(this);
                hb8Var.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableToListSingle(Flowable<T> flowable) {
        this(flowable, ArrayListSupplier.asCallable());
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<U> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableToList(this.source, this.collectionSupplier));
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(SingleObserver<? super U> singleObserver) {
        try {
            this.source.subscribe((FlowableSubscriber) new ToListSubscriber(singleObserver, (Collection) ObjectHelper.requireNonNull(this.collectionSupplier.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptyDisposable.error(th, singleObserver);
        }
    }

    public FlowableToListSingle(Flowable<T> flowable, Callable<U> callable) {
        this.source = flowable;
        this.collectionSupplier = callable;
    }
}
