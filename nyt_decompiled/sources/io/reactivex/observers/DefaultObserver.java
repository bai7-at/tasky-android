package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EndConsumerHelper;

/* loaded from: classes5.dex */
public abstract class DefaultObserver<T> implements Observer<T> {
    private Disposable upstream;

    protected final void cancel() {
        Disposable disposable = this.upstream;
        this.upstream = DisposableHelper.DISPOSED;
        disposable.dispose();
    }

    protected void onStart() {
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(@NonNull Disposable disposable) {
        if (EndConsumerHelper.validate(this.upstream, disposable, getClass())) {
            this.upstream = disposable;
            onStart();
        }
    }
}
