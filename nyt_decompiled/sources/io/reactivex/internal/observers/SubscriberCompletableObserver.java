package io.reactivex.internal.observers;

import defpackage.hb8;
import defpackage.va8;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class SubscriberCompletableObserver<T> implements CompletableObserver, hb8 {
    final va8 subscriber;
    Disposable upstream;

    public SubscriberCompletableObserver(va8 va8Var) {
        this.subscriber = va8Var;
    }

    @Override // defpackage.hb8
    public void cancel() {
        this.upstream.dispose();
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
        this.subscriber.onComplete();
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(Throwable th) {
        this.subscriber.onError(th);
    }

    @Override // io.reactivex.CompletableObserver
    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.upstream, disposable)) {
            this.upstream = disposable;
            this.subscriber.onSubscribe(this);
        }
    }

    @Override // defpackage.hb8
    public void request(long j) {
    }
}
